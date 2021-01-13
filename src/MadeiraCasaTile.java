public class MadeiraCasaTile extends Tile{
    public MadeiraCasaTile(int id) {
        super(Assets.blocoMadeira, id);
    }

    @Override
    public boolean isSolid(){
        return false;
    }
}