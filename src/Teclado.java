import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Teclado implements KeyListener {

    private boolean[] teclas;
    public boolean cima,esquerda,direita;

    public Teclado(){
        teclas = new boolean[256];
    }

    public void tick(){
        cima = teclas[KeyEvent.VK_SPACE];
        esquerda = teclas[KeyEvent.VK_A];
        direita = teclas[KeyEvent.VK_D];
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        teclas[e.getKeyCode()] = true;

    }

    @Override
    public void keyReleased(KeyEvent e) {
        teclas[e.getKeyCode()] = false;
    }
}
