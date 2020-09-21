import java.awt.Color;

public class Triangulo extends FiguraGeometrica {
    private int base;
    private int altura;

    private int ladoA;
    private int ladoB;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        determinarColor();
    }

    public Triangulo() {
    }

    public Triangulo(int base, int altura, Color color, int ladoA, int ladoB) {
        this.base = base;
        this.altura = altura;

        this.ladoA = ladoA;
        this.ladoB = ladoB;
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

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
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

    public double getSuperficie() {
        return base * altura;
    }

    public double getPerimetro() {
        return base + ladoA + ladoB;
    }

}