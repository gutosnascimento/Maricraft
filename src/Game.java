import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game implements Runnable{

    private Tela tela;
    public String titulo;
    private int largura, altura;

    public boolean executando = false;
    public Thread thread;

    private BufferStrategy bs;
    private Graphics g;

    private State gameStateAtual;
    private GameState gameState;

    private Teclado teclado;

    private Camera camera;

    private Handler handler;


    public Game (String titulo, int largura, int altura){
        this.titulo = titulo;
        this.largura = largura;
        this.altura = altura;
        teclado = new Teclado();
    }

    private void init(){
        tela = new Tela(titulo, largura, altura);
        tela.getFrame().addKeyListener(teclado);
        Assets.init();

        handler = new Handler(this);
        camera = new Camera(handler, 0,0);

        gameState = new GameState(handler);
        gameStateAtual = gameState;
        State.setState(gameStateAtual);
    }

    private void tick(){
        teclado.tick();

        if(State.getState() != null){
            State.getState().tick();
        }
    }

    private void render(){
        bs = tela.getCanvas().getBufferStrategy();

        if(bs == null){
            tela.getCanvas().createBufferStrategy(3);
            return;
        }

        g = bs.getDrawGraphics();
        g.clearRect(0,0, largura, altura);

        if(State.getState() != null){
            State.getState().render(g);
        }

        bs.show();
        g.dispose();
    }

    public void run(){
        init();

        int fps = 60;
        double timePerTick = 1000000000/fps;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        int ticks = 0;

        while(executando){
            now = System.nanoTime();
            delta += (now-lastTime) / timePerTick;
            timer += now - lastTime;
            lastTime = now;

            if(delta >= 1) {
                tick();
                render();
                ticks ++;
                delta --;
            }
        }

        stop();
    }

    public Teclado getTeclado(){
        return teclado;
    }

    public Camera getCamera(){
        return camera;
    }

    public int getLargura(){
        return largura;
    }

    public int getAltura(){
        return altura;
    }

    public GameState getGameState(){return gameState;}

    public void setNovoState(State novoState){
            State.setState(novoState);
    }

    public synchronized void start(){
        if(executando){
            return;
        }
        executando = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop(){
        if(!executando){
            return;
        }
        executando =  false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
