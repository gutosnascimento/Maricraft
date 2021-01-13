public class Camera {
    private Handler handler;

    private float deslocX, deslocY;

    public Camera(Handler handler, float deslocX, float deslocY) {
        this.handler = handler;
        this.deslocX = deslocX;
        this.deslocY = deslocY;

    }

    public void checaLimiteMapa(){
        if(deslocX < 0){
            deslocX = 0;
        }else if(deslocX > handler.getWorld().getLargura() * Tile.TILELARGURA - handler.getLargura()){
            deslocX = handler.getWorld().getLargura() * Tile.TILELARGURA - handler.getLargura();
        }

        if(deslocY < 0){
            deslocY = 0;
        }else if(deslocY > handler.getWorld().getAltura() * Tile.TILEALTURA - handler.getAltura()){
            deslocY = handler.getWorld().getAltura() * Tile.TILEALTURA - handler.getAltura();
        }
    }

    public void centralizaPlayer(Entidade e){
        deslocX = e.getX() - handler.getLargura() / 2 + e.getLargura() / 2;
        deslocY = e.getY() - handler.getAltura() /2 +e.getAltura() / 2;
        checaLimiteMapa();
    }

    public void move(float xAmt, float yAmt){
        deslocX += xAmt;
        deslocY += yAmt;
        checaLimiteMapa();
    }


    public float getDeslocX() {
        return deslocX;
    }

    public void setDeslocX(float deslocX) {
        this.deslocX = deslocX;
    }

    public float getDeslocY() {
        return deslocY;
    }

    public void setDeslocY(float deslocY) {
        this.deslocY = deslocY;
    }
}
