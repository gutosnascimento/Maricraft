import java.awt.*;

public class Player extends Criaturas{
    public MenuState menuState = new MenuState(handler);
    public Boolean ganhou=false;
    public Player(Handler handler,float x, float y) {
        super(handler, x, y, Criaturas.LARGURA_PADRAO, Criaturas.ALTURA_PADRAO);

        hitbox.x = 4;
        hitbox.y = 4;
        hitbox.width = 40;
        hitbox.height = 40;
    }

    @Override
    public void tick(){
        getInput();
        gravidade();
        pulo();
        move();
        ganhou();
        perdeu();
        handler.getCamera().centralizaPlayer(this);
    }

    public void getInput(){
        xMov = 0;
        yMov = 0;

        if(handler.getTeclado().cima){
            if(pulando == false && yMov ==0){
                pulando = true;
                yMov -= alturaPulo;
            }
        }
        if(handler.getTeclado().esquerda){
            xMov = -velocidade;
        }
        if(handler.getTeclado().direita){
            xMov = velocidade;
        }
    }

    public void ganhou(){
        if(x> 3702){
            ganhou = true;
            handler.getGame().setNovoState(menuState);

        }
    }

    public void perdeu(){
        if(y>434){
            setVida(vida - 1);
            handler.getGame().setNovoState(menuState);
        }
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.player,(int)(x - handler.getCamera().getDeslocX()),(int)(y - handler.getCamera().getDeslocY()),largura,altura, null);
    }
}

