import java.awt.image.BufferedImage;

public class Sprite {
    private BufferedImage sprite;

    public Sprite(BufferedImage sprite){
        this.sprite = sprite;
    }

    public BufferedImage corteSprite(int x, int y, int largura, int altura){
        return sprite.getSubimage(x, y, largura, altura);
    }
}
