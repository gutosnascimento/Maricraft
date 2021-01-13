import java.awt.*;

public abstract class State {
    private static State atualState = null;

    public  static void setState(State state){
        atualState = state;
    }

    public static State getState(){
        return atualState;
    }

    protected Handler handler;

    public State(Handler handler){
        this.handler = handler;
    }

    public abstract void tick();

    public abstract void render(Graphics g);

}
