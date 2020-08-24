import java.awt.Color;

public class App {

    private Canvas miVentana;
    private int ancho = 800;
    private int alto = 600;

    public App() {
        miVentana = new Canvas("Hola Ventana", ancho, alto);
        miVentana.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        App miAplicacion = new App();
        miAplicacion.ejecutar();
    }

    public void ejecutar() {
        //PelotaRebotando();
        //PelotaRebotandoVertical();
        rebotarPelota();
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void primerosEjemplos() {
        Canvas miVentana = new Canvas("Hola Ventana", 800, 600);
        miVentana.setVisible(true);

        Circulo circulo1 = new Circulo(1000);
        circulo1.setX(50);
        circulo1.setY(50);

        Rectangulo rectangulo1 = new Rectangulo(300, 300);
        rectangulo1.setX(150);
        rectangulo1.setY(150);
    }

    public void aumentarTamaño() {
        Canvas miVentana = new Canvas("Hola Ventana", 800, 600);
        miVentana.setVisible(true);

        Circulo circulo1 = new Circulo(1000);
        circulo1.setX(50);
        circulo1.setY(50);

        Rectangulo rectangulo1 = new Rectangulo(300, 300);
        rectangulo1.setX(150);
        rectangulo1.setY(150);

        for (int radio = 50; radio < 200; radio++) {
            miVentana.setColorDeLapiz(circulo1.getColor());
            miVentana.borrarCirculo(circulo1.getX(), circulo1.getY(), circulo1.getRadio());
            circulo1.setRadio(circulo1.getRadio() + 10);
            miVentana.rellenarCirculo(circulo1.getX(), circulo1.getY(), circulo1.getRadio());
            miVentana.espera(250);
        }
    }

    public void disminuirTamaño() {
        Canvas miVentana = new Canvas("Hola Ventana", 800, 600);
        miVentana.setVisible(true);

        Circulo circulo1 = new Circulo(1000);
        circulo1.setX(50);
        circulo1.setY(50);

        Rectangulo rectangulo1 = new Rectangulo(300, 300);
        rectangulo1.setX(150);
        rectangulo1.setY(150);

        for (int i = 1; i < 15; i++) {
            miVentana.setColorDeLapiz(circulo1.getColor());
            miVentana.borrarRectangulo(rectangulo1.getX(), rectangulo1.getY(), rectangulo1.getLado1(),
                    rectangulo1.getLado2());
            rectangulo1.setLado1(rectangulo1.getLado1() - 20);
            rectangulo1.setLado2(rectangulo1.getLado2() - 20);
            miVentana.rellenarRectangulo(rectangulo1.getX(), rectangulo1.getY(), rectangulo1.getLado1(),
                    rectangulo1.getLado2());
            miVentana.espera(250);
        }
    }

    public void moverDerecha() {
        Canvas miVentana = new Canvas("Hola Ventana", 800, 600);
        miVentana.setVisible(true);

        Circulo circulo1 = new Circulo(1000);
        circulo1.setX(50);
        circulo1.setY(50);

        Rectangulo rectangulo1 = new Rectangulo(300, 300);
        rectangulo1.setX(150);
        rectangulo1.setY(150);

        int repe = 0;
        while (repe < 10) {
            miVentana.setColorDeLapiz(circulo1.getColor());
            miVentana.borrarCirculo(circulo1.getX(), circulo1.getY(), circulo1.getDiametro());
            circulo1.setX(circulo1.getX() + 30);
            miVentana.rellenarCirculo(circulo1.getX(), circulo1.getY(), circulo1.getDiametro());
            repe = repe + 1;
            miVentana.espera(200);
        }
    }

    public void moverAbajo() {
        Canvas miVentana = new Canvas("Hola Ventana", 800, 600);
        miVentana.setVisible(true);

        Circulo circulo1 = new Circulo(1000);
        circulo1.setX(50);
        circulo1.setY(50);

        Rectangulo rectangulo1 = new Rectangulo(300, 300);
        rectangulo1.setX(150);
        rectangulo1.setY(150);

        int rep = 0;
        while (rep < 10) {
            miVentana.espera(500);
            miVentana.setColorDeLapiz(Color.MAGENTA);
            miVentana.borrarRectangulo(rectangulo1.getX(), rectangulo1.getY(), rectangulo1.getLado1(),
                    rectangulo1.getLado2());
            rectangulo1.setY(rectangulo1.getY() + 40);
            miVentana.rellenarRectangulo(rectangulo1.getX(), rectangulo1.getY(), rectangulo1.getLado1(),
                    rectangulo1.getLado2());
            rep = rep + 1;
        }
    }

    public void PelotaRebotando() {
        int desplazamiento = 10;
        Circulo circulo = new Circulo(20);
        circulo.setX(150);
        circulo.setY(350);
        miVentana.setColorDeLapiz(circulo.getColor());
        miVentana.rellenarCirculo(circulo.getX(), circulo.getY(), circulo.getDiametro());
        miVentana.espera(5000);
        for (int repeticiones = 0; repeticiones < 600; repeticiones++) {
            miVentana.borrarCirculo(circulo.getX(), circulo.getY(), circulo.getDiametro());
            // Verifica rebote en los bordes
            if ((circulo.getX() + circulo.getDiametro() >= getAncho()) || (circulo.getX() <= 0)) {
                desplazamiento = -desplazamiento;
            }
            circulo.setX(circulo.getX() + desplazamiento);
            miVentana.rellenarCirculo(circulo.getX(), circulo.getY(), circulo.getDiametro());
            miVentana.espera(75);
        }
    }

    public void PelotaRebotandoVertical() {
        int desplazamiento = 10;
        Circulo circulo = new Circulo(20);
        circulo.setX(150);
        circulo.setY(350);
        miVentana.setColorDeLapiz(circulo.getColor());
        miVentana.rellenarCirculo(circulo.getX(), circulo.getY(), circulo.getDiametro());
        miVentana.espera(5000);
        for (int repeticiones = 0; repeticiones < 600; repeticiones++) {
            miVentana.borrarCirculo(circulo.getX(), circulo.getY(), circulo.getDiametro());
            // Verifica rebote en los bordes
            if ((circulo.getY() + circulo.getDiametro() >= getAlto()) || (circulo.getY() <= 0)) {
                desplazamiento = -desplazamiento;
            }
            circulo.setY(circulo.getY() + desplazamiento);
            miVentana.rellenarCirculo(circulo.getX(), circulo.getY(), circulo.getDiametro());
            miVentana.espera(75);
        }
    }

    public void rebotarPelota() {
        int desplazamiento = 10;
        Circulo circulo = new Circulo(20);
        circulo.setX(150);
        circulo.setY(350);
        miVentana.setColorDeLapiz(circulo.getColor());
        miVentana.rellenarCirculo(circulo.getX(), circulo.getY(), circulo.getDiametro());
        miVentana.espera(3000);

        for (int repeticiones = 0; repeticiones < 600; repeticiones++) {
            miVentana.borrarCirculo(circulo.getX(), circulo.getY(), circulo.getDiametro());
            // Verifica rebote en los bordes
            if ((circulo.getX() + circulo.getDiametro() >= getAncho()) || (circulo.getX() <= 0)) {
                desplazamiento = -desplazamiento;
            } if ((circulo.getY() + circulo.getDiametro() >= getAlto()) || (circulo.getY() <= 0)) {
                desplazamiento = -desplazamiento;            
            }
            circulo.setX(circulo.getX() + desplazamiento);
            circulo.setY(circulo.getY() + desplazamiento);
            miVentana.rellenarCirculo(circulo.getX(), circulo.getY(), circulo.getDiametro());
            miVentana.espera(75);
        }
    }

}
