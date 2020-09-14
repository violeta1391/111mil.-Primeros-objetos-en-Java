import java.awt.Color;

public class FiguraGeometrica {
    private Color color ;

    private Posicion pos;          

    public FiguraGeometrica() {
        pos = new Posicion(0, 0);        
    }
    
    public FiguraGeometrica(int x, int y) {
        pos = new Posicion(x, y);        
    }

    public void actualizarPosicion() {
        pos.NuevaPosicion();
    }
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Posicion getPosicion() {
        return pos;
    }

    public void setPosicion(Posicion pos) {
        this.pos = pos;
    }



  
}
