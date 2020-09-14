import java.awt.Color;

public class Circulo extends FiguraGeometrica {

    private static final int MAX_RADIO = 1000;

    private int radio = 10;

    public Circulo (int radio) {
        setRadio(radio);
        determinarColor();
    }

    // Determina el color del circulo segun el radio

    private void determinarColor() {
        if (getRadio() < 100) {
            setColor(Color.BLUE);
        } else if (getRadio() < 200) {
            setColor(Color.GREEN);
        } else if (getRadio() < 300) {
            setColor(Color.YELLOW);
        } else if (getRadio() < 400) {
            setColor(Color.ORANGE);
        } else if (getRadio() < 500) {
            setColor(Color.RED);
        } else {
            setColor(Color.MAGENTA);
        }
    }

    public double getPerimetro() {
        return 3.1416 * 2 * radio;
    }

    public double getSuperficie() {
        return 3.1416 * radio * radio;
    }

    public int getRadio() {
        return radio;
    }

    public int getDiametro() {
        return radio * 2;
    }

    public void setRadio(int radio) {
        if ((0 < radio) && (radio < MAX_RADIO)) {
            this.radio = radio;
            determinarColor();
        }
    }
}

