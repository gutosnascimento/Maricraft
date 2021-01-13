import java.awt.*;

public class GameState extends State{

    private Player player;
    private World world;

    public GameState(Handler handler){
        super(handler);
        world = new World(handler,"res\\worlds\\world1.txt");
        handler.setWorld(world);
        player = new Player(handler,100,371);
    }

    @Override
    public void tick() {
        world.tick();
        player.tick();
    }

    @Override
    public void render(Graphics g) {
        world.render(g);
        player.render(g);
        switch (player.getVida()){
            case 3:
                g.drawImage(Assets.player, 2,2,24,24,null);
                g.drawImage(Assets.player, 28,2,24,24,null);
                g.drawImage(Assets.player, 54,2,24,24,null);
                break;
            case 2:
                g.drawImage(Assets.player, 2,2,24,24,null);
                g.drawImage(Assets.player, 28,2,24,24,null);
                break;
            case 1:
                g.drawImage(Assets.player, 2,2,24,24,null);
                break;
        }
    }

    public Player getPlayer() {
        return player;
    }
}
