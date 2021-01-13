public class ArTile extends Tile{

    public ArTile(int id) {
        super(Assets.blocoAr, id);
    }

    @Override
    public boolean isSolid(){
        return false;
    }
}
