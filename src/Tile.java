import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile {

    public static Tile[] tiles = new Tile[256];
    public static Tile gramaTile = new GramaTile(0);
    public static Tile arTile = new ArTile(1);
    public static Tile terraTile = new TerraTile(2);
    public static Tile pedraTile = new PedraTile(3);
    public static Tile madeiraTile = new MadeiraTile(4);
    public static Tile madeiraCasaTile = new MadeiraCasaTile(5);
    public static Tile madeiraPortaTila = new MadeiraPortaTile(6);


    public static final int TILELARGURA = 32, TILEALTURA = 32;

    protected BufferedImage texture;
    protected final int id;

    public Tile(BufferedImage textura, int id){
        this.texture = textura;
        this.id = id;

        tiles[id] = this;
    }

    public void tick(){

    }

    public void render(Graphics g, int x, int y){
        g.drawImage(texture, x, y, TILELARGURA,TILEALTURA, null);
    }

    public boolean isSolid(){
        return true;
    }

    public int getId(){
        return id;
    }
}
