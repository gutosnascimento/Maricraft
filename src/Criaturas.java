public abstract class Criaturas extends Entidade{

    public  static final int VIDA_BASE = 3;
    public static final float VELOCIDADE_BASAE = 3.0f;
    public static final int LARGURA_PADRAO = 48, ALTURA_PADRAO = 48;

    protected int vida;
    protected float velocidade;
    protected float xMov, yMov;
    protected boolean caindo = true;
    protected boolean pulando = false;
    protected float gravidade = 3.5f;
    protected float alturaPulo = 140;

    public Criaturas(Handler handler, float x, float y, int largura, int altura) {
        super(handler, x, y, largura, altura);
        vida = VIDA_BASE;
        velocidade = VELOCIDADE_BASAE;
    }

    public void move(){
        movX();
        movY();
    }

    public void movX(){
        if(xMov > 0){//Direita
            int tx = (int) (x + xMov + hitbox.x + hitbox.width) /Tile.TILELARGURA;
            if(!colisaoTile(tx, (int) (y + hitbox.y) / Tile.TILEALTURA) && !colisaoTile(tx, (int) (y + hitbox.y + hitbox.height) / Tile.TILEALTURA)){
                x += xMov;
            }else{
                x = tx * Tile.TILELARGURA - hitbox.x - hitbox.width -1;
            }

        }else if(xMov < 0){//Esquerda
            int tx = (int) (x + xMov + hitbox.x) /Tile.TILELARGURA;
            if(!colisaoTile(tx, (int) (y + hitbox.y) / Tile.TILEALTURA) && !colisaoTile(tx, (int) (y + hitbox.y + hitbox.height) / Tile.TILEALTURA)){
                x += xMov;
            }else{
                x = tx * Tile.TILELARGURA + Tile.TILELARGURA - hitbox.x;
            }
        }
    }

    public void movY(){
        if(yMov < 0){//Cima
            int ty = (int) (y + yMov + hitbox.y) / Tile.TILEALTURA;
            if(!colisaoTile((int) (x + hitbox.x) / Tile.TILELARGURA, ty) && !colisaoTile((int) (x + hitbox.x + hitbox.width) / Tile.TILELARGURA, ty)){
                y += yMov;
            }else{
                y = ty *Tile.TILEALTURA + Tile.TILEALTURA - hitbox.y;
            }
        }else if(yMov > 0){//Baixo
            int ty = (int) (y + yMov + hitbox.y + hitbox.height) / Tile.TILEALTURA;
            if(!colisaoTile((int) (x + hitbox.x) / Tile.TILELARGURA, ty) && !colisaoTile((int) (x + hitbox.x + hitbox.width) / Tile.TILELARGURA, ty)){
                y += yMov;
            }else{
                y = ty * Tile.TILEALTURA - hitbox.y - hitbox.height -1;
            }
        }
    }

    protected boolean colisaoTile(int x, int y){
        return handler.getWorld().getTile(x,y).isSolid();
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void gravidade(){
        if(caindo){
            yMov += gravidade;
        }
    }

    public void pulo(){
         if(yMov > 0){//Baixo
            int ty = (int) (y + yMov + hitbox.y + hitbox.height) / Tile.TILEALTURA;
            if(!colisaoTile((int) (x + hitbox.x) / Tile.TILELARGURA, ty) && !colisaoTile((int) (x + hitbox.x + hitbox.width) / Tile.TILELARGURA, ty)){
                pulando = true;
            }else{
                pulando = false;
            }
        }
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public float getxMov() {
        return xMov;
    }

    public void setxMov(float xMov) {
        this.xMov = xMov;
    }

    public float getyMov() {
        return yMov;
    }

    public void setyMov(float yMov) {
        this.yMov = yMov;
    }

}
