
public class Posicion {

    private int x;
    private int y;
    private int despX;
    private int despY;

    public Posicion (int x, int y) {
        this.x = x;
        this.y= y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDespX() {
        return despX;
    }

    public void setDespX(int despX) {
        this.despX = despX;
    }

    public int getDespY() {
        return despY;
    }

    public void setDespY(int despY) {
        this.despY = despY;
    }


    public void NuevaPosicion (){
        setX( getX() + getDespX() );
        setY( getY() + getDespY() );
    }



}
