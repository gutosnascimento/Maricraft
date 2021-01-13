public class MadeiraPortaTile extends Tile{
    public MadeiraPortaTile(int id) {
        super(Assets.blocoMadeiraPorta, id);
    }

    @Override
    public boolean isSolid(){
        return false;
    }
}