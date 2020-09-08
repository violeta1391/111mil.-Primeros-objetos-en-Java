import java.awt.Color;

public class Triangulo extends FiguraGeometrica {
    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        determinarColor();
    }

    public Triangulo() {
    }

    public Triangulo(int base, int altura, Color color) {
        this.base = base;
        this.altura = altura;
        setColor(color);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    // Determina el color del rectangulo segun la superficie

    private void determinarColor() {
        if (getSuperficie() < 100) {
            setColor(Color.BLUE);
        } else if (getSuperficie() < 200) {
            setColor(Color.GREEN);
        } else if (getSuperficie() < 300) {
            setColor(Color.YELLOW);
        } else if (getSuperficie() < 400) {
            setColor(Color.ORANGE);
        } else if (getSuperficie() < 500) {
            setColor(Color.RED);
        } else {
            setColor(Color.MAGENTA);
        }
    }

    public int getSuperficie() {
        return base * altura;
    }

}