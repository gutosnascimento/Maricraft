import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MenuState extends State{
    private int largura = 80, altura = 72;
    public MenuState(Handler handler) {
        super(handler);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        if(handler.getPlayer().ganhou){

            g.drawImage(Assets.blocoDiamante,0,0, 80,72,null);
            g.drawImage(Assets.blocoDiamante,largura,0,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*2,0,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*3,0,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*4,0,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*5,0,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*6,0,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*7,0,80,72,null);

            g.drawImage(Assets.blocoDiamante,0,altura,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura,altura,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*2,altura,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*3,altura,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*4,altura,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*5,altura,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*6,altura,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*7,altura,80,72,null);

            g.drawImage(Assets.blocoDiamante,0,altura*2,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura,altura*2,80,72,null);
            g.drawImage(Assets.blocoPedra,largura*2,altura*2,80,72,null);
            g.drawImage(Assets.blocoPedra,largura*3,altura*2,80,72,null);
            g.drawImage(Assets.blocoPedra,largura*4,altura*2,80,72,null);
            g.drawImage(Assets.blocoPedra,largura*5,altura*2,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*6,altura*2,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*7,altura*2,80,72,null);

            g.drawImage(Assets.blocoDiamante,0,altura*3,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura,altura*3,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*2,altura*3,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*3,altura*3,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*4,altura*3,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*5,altura*3,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*6,altura*3,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*7,altura*3,80,72,null);

            g.drawImage(Assets.blocoDiamante,0,altura*4,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura,altura*4,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*2,altura*4,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*3,altura*4,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*4,altura*4,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*5,altura*4,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*6,altura*4,80,72,null);
            g.drawImage(Assets.blocoDiamante,largura*7,altura*4,80,72,null);

            g.drawImage(Assets.venceu, 198,145,258,72,null);

        }else {

            if (handler.getPlayer().getVida() == 0) {
                g.drawImage(Assets.blocoRedstone,0,0,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura,0,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*2,0,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*3,0,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*4,0,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*5,0,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*6,0,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*7,0,80,72,null);

                g.drawImage(Assets.blocoRedstone,0,altura,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura,altura,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*2,altura,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*3,altura,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*4,altura,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*5,altura,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*6,altura,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*7,altura,80,72,null);

                g.drawImage(Assets.blocoRedstone,0,altura*2,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura,altura*2,80,72,null);
                g.drawImage(Assets.blocoPedra,largura*2,altura*2,80,72,null);
                g.drawImage(Assets.blocoPedra,largura*3,altura*2,80,72,null);
                g.drawImage(Assets.blocoPedra,largura*4,altura*2,80,72,null);
                g.drawImage(Assets.blocoPedra,largura*5,altura*2,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*6,altura*2,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*7,altura*2,80,72,null);

                g.drawImage(Assets.blocoRedstone,0,altura*3,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura,altura*3,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*2,altura*3,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*3,altura*3,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*4,altura*3,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*5,altura*3,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*6,altura*3,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*7,altura*3,80,72,null);

                g.drawImage(Assets.blocoRedstone,0,altura*4,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura,altura*4,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*2,altura*4,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*3,altura*4,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*4,altura*4,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*5,altura*4,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*6,altura*4,80,72,null);
                g.drawImage(Assets.blocoRedstone,largura*7,altura*4,80,72,null);

                g.drawImage(Assets.gameOver, 235, 165, 258,36, null);

            } else {

                g.drawImage(Assets.blocoAr,0,0,80,72,null);
                g.drawImage(Assets.blocoAr,largura,0,80,72,null);
                g.drawImage(Assets.blocoAr,largura*2,0,80,72,null);
                g.drawImage(Assets.blocoAr,largura*3,0,80,72,null);
                g.drawImage(Assets.blocoAr,largura*4,0,80,72,null);
                g.drawImage(Assets.blocoAr,largura*5,0,80,72,null);
                g.drawImage(Assets.blocoAr,largura*6,0,80,72,null);
                g.drawImage(Assets.blocoAr,largura*7,0,80,72,null);

                g.drawImage(Assets.blocoAr,0,altura,80,72,null);
                g.drawImage(Assets.blocoAr,largura,altura,80,72,null);
                g.drawImage(Assets.blocoAr,largura*2,altura,80,72,null);
                g.drawImage(Assets.blocoAr,largura*3,altura,80,72,null);
                g.drawImage(Assets.blocoAr,largura*4,altura,80,72,null);
                g.drawImage(Assets.blocoAr,largura*5,altura,80,72,null);
                g.drawImage(Assets.blocoAr,largura*6,altura,80,72,null);
                g.drawImage(Assets.blocoAr,largura*7,altura,80,72,null);

                g.drawImage(Assets.blocoAr,0,altura*2,80,72,null);
                g.drawImage(Assets.blocoAr,largura,altura*2,80,72,null);
                g.drawImage(Assets.blocoAr,largura*2,altura*2,80,72,null);
                g.drawImage(Assets.blocoAr,largura*3,altura*2,80,72,null);
                g.drawImage(Assets.blocoAr,largura*4,altura*2,80,72,null);
                g.drawImage(Assets.blocoAr,largura*5,altura*2,80,72,null);
                g.drawImage(Assets.blocoAr,largura*6,altura*2,80,72,null);
                g.drawImage(Assets.blocoAr,largura*7,altura*2,80,72,null);

                g.drawImage(Assets.blocoAr,0,altura*3,80,72,null);
                g.drawImage(Assets.blocoAr,largura,altura*3,80,72,null);
                g.drawImage(Assets.blocoAr,largura*2,altura*3,80,72,null);
                g.drawImage(Assets.blocoAr,largura*3,altura*3,80,72,null);
                g.drawImage(Assets.blocoAr,largura*4,altura*3,80,72,null);
                g.drawImage(Assets.blocoAr,largura*5,altura*3,80,72,null);
                g.drawImage(Assets.blocoAr,largura*6,altura*3,80,72,null);
                g.drawImage(Assets.blocoAr,largura*7,altura*3,80,72,null);

                g.drawImage(Assets.blocoAr,0,altura*4,80,72,null);
                g.drawImage(Assets.blocoAr,largura,altura*4,80,72,null);
                g.drawImage(Assets.blocoAr,largura*2,altura*4,80,72,null);
                g.drawImage(Assets.blocoAr,largura*3,altura*4,80,72,null);
                g.drawImage(Assets.blocoAr,largura*4,altura*4,80,72,null);
                g.drawImage(Assets.blocoAr,largura*5,altura*4,80,72,null);
                g.drawImage(Assets.blocoAr,largura*6,altura*4,80,72,null);
                g.drawImage(Assets.blocoAr,largura*7,altura*4,80,72,null);

                handler.getPlayer().x = 100;
                handler.getPlayer().y = 371;
                handler.getGame().setNovoState(handler.getGame().getGameState());

            }
        }
    }
}
