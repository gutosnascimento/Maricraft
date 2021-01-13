import java.awt.*;

public class World {
    private Handler handler;
    private int largura, altura;
    private int spawnX, spawnY;
    private int[][] tiles;

    public World(Handler handler, String path) {
        this.handler= handler;
        carregarMundo(path);
    }

    public void tick(){

    }

    public void render(Graphics g){
        int xStart = (int) Math.max(0, handler.getCamera().getDeslocX() / Tile.TILELARGURA);
        int xEnd = (int) Math.min(largura, (handler.getCamera().getDeslocX() + handler.getLargura()) / Tile.TILELARGURA +1);
        int yStart = (int) Math.max(0, handler.getCamera().getDeslocY() / Tile.TILEALTURA);;
        int yEnd = (int) Math.min(altura, (handler.getCamera().getDeslocY() + handler.getAltura()) / Tile.TILEALTURA +1);;


        for(int y = yStart;y < yEnd;y++){
            for(int x=xStart;x < xEnd;x++) {
                getTile(x, y).render(g, (int) (x*Tile.TILELARGURA - handler.getCamera().getDeslocX()), (int) (y*Tile.TILEALTURA - handler.getCamera().getDeslocY()));
            }
        }
    }

    public Tile getTile(int x, int y){
        if(x < 0 || y < 0 || x >= largura || y >= altura)
            return Tile.gramaTile;
        Tile t = Tile.tiles[tiles[x][y]];
        if(t == null)
            return Tile.gramaTile;
        return t;
    }

    private void carregarMundo(String path){
        String file = Utils.carregaArquivoComoString(path);
        String[] tokens = file.split("\\s+");
        largura = Utils.parseInt(tokens[0]);
        altura = Utils.parseInt(tokens[1]);
        spawnX = Utils.parseInt(tokens[2]);
        spawnY = Utils.parseInt(tokens[3]);

        tiles = new int[largura][altura];
        for(int y = 0;y < altura;y++){
            for(int x = 0;x < largura;x++){
                tiles[x][y] = Utils.parseInt(tokens[(x + y * largura)+4]);
            }
        }
    }

    public int getLargura(){
        return largura;
    }

    public int getAltura(){
        return altura;
    }

}
