import java.awt.*;

public abstract class Entidade {

    protected Handler handler;
    protected float x, y;
    protected int largura, altura;
    protected Rectangle hitbox;

    public Entidade(Handler handler, float x, float y, int largura, int altura) {
        this.handler = handler;
        this.x = x;
        this.y = y;
        this.largura = largura;
        this.altura = altura;

        hitbox = new Rectangle(0,0, largura, altura);
    }

    public abstract void tick();

    public abstract void render(Graphics g);

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
