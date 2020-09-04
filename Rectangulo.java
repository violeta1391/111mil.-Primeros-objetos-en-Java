import java.awt.Color;

public class Rectangulo {

    private Color color ;
    private int lado1;
    private int lado2;
    private int x;
    private int y;
    private int despX;
    private int despY;

  
    public Rectangulo(int lado1, int lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
        determinarColor();
    }

    // Determina el color del rectangulo segun la superficie

    private void determinarColor() {
        if (getSuperficie() < 100) {
            setColor(Color.BLUE);
        }
        else if (getSuperficie() < 200) {
            setColor(Color.GREEN);
        }
        else if (getSuperficie() < 300) {
            setColor(Color.YELLOW);
        }
        else if (getSuperficie() < 400) {
            setColor(Color.ORANGE);
        }
        else if (getSuperficie() < 500) {
            setColor(Color.RED);
        }
        else {
            setColor(Color.MAGENTA);
        }
    }


    public int getSuperficie() {
        return lado1 * lado2;        
    }

   
    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    /**
     * Actualizar posicion del objeto
     */
    
    public void actualizarPosicion () {
        setX( getX() + getDespX() );
        setY( getY() + getDespY() );
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









}

