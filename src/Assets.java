import java.awt.image.BufferedImage;

public class Assets {
    public static final int largura=80, altura=80;

    public static BufferedImage player, blocoGrama,blocoTerra,blocoPedra, blocoAr,blocoDiamante, blocoCarvao, blocoRedstone, blocoMadeira,blocoMadeiraPorta, morreu, gameOver, venceu;

    public static void init(){
        Sprite spritePlayer = new Sprite(ImageLoader.carregarImgaem("/textures/players.png"));
        Sprite spriteBlocos = new Sprite(ImageLoader.carregarImgaem("/textures/blocos.png"));
        Sprite spriteTextos = new Sprite(ImageLoader.carregarImgaem("/textos/textos.png"));


        player = spritePlayer.corteSprite(20,54,70,100);
        morreu = spriteTextos.corteSprite(0,0,517,68);
        gameOver = spriteTextos.corteSprite(0,69,517,68);
        venceu = spriteTextos.corteSprite(0,137,517,136);
        blocoGrama = spriteBlocos.corteSprite(0,0,largura,altura);
        blocoTerra = spriteBlocos.corteSprite(largura,0,largura,altura);
        blocoPedra = spriteBlocos.corteSprite(largura*2,0,largura,altura);
        blocoAr = spriteBlocos.corteSprite(largura*3,0,largura,altura);
        blocoDiamante = spriteBlocos.corteSprite(largura*4,altura,largura,altura);
        blocoCarvao = spriteBlocos.corteSprite(largura,altura*2,largura, altura);
        blocoRedstone = spriteBlocos.corteSprite(largura*5,altura,largura,altura);
        blocoMadeira = spriteBlocos.corteSprite(0,altura*2, largura, altura);
        blocoMadeiraPorta = spriteBlocos.corteSprite(largura*5, 0, largura, altura);
    }
}
