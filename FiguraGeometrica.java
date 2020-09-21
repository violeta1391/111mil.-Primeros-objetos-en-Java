import java.awt.Color;

public abstract class FiguraGeometrica {
    private Color color ;

    private Posicion pos;          

    public FiguraGeometrica() {
        pos = new Posicion(0, 0);        
    }
    
    public FiguraGeometrica(int x, int y) {
        pos = new Posicion(x, y);        
    }

    public FiguraGeometrica (int x, int y, Color color) {
        this.color = color;
        pos = new Posicion(x, y);
    }

    public FiguraGeometrica (Posicion pos, Color color) {
        this.color = color;
        this.pos = pos;
    }

    public void actualizarPosicion() {
        pos.NuevaPosicion();
    }


    public abstract double getSuperficie ();
    public abstract double getPerimetro ();

    
    
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
