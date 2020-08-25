import java.awt.Color;
import java.util.ArrayList;

public class App {

    private Canvas miVentana;
    private int ancho = 800;
    private int alto = 600;

    private ArrayList<Circulo> circulos;
    private ArrayList<Rectangulo> rectangulos;

    public App() {
        miVentana = new Canvas("Hola Ventana", ancho, alto);
        miVentana.setVisible(true);

        circulos = new ArrayList<>();
        rectangulos = new ArrayList<>();
    }

    public static void main(String[] args) throws Exception {
        App miAplicacion = new App();
        miAplicacion.ejecutar();
    }

    public void ejecutar() {
        //PelotaRebotandoHorizontal();
        //PelotaRebotandoVertical();
        //rebotarPelota();
        //rebotaRec();

        CrearFigurasGeometricas();
        //GraficarCirculosColeccionados();
        GraficarRectangulosColeccionados();
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
            miVentana.borrarRectangulo(rectangulo1.getX(), rectangulo1.getY(), rectangulo1.getLado1(), rectangulo1.getLado2());
            rectangulo1.setLado1(rectangulo1.getLado1() - 20);
            rectangulo1.setLado2(rectangulo1.getLado2() - 20);
            miVentana.rellenarRectangulo(rectangulo1.getX(), rectangulo1.getY(), rectangulo1.getLado1(), rectangulo1.getLado2());
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

    public void PelotaRebotandoHorizontal() {
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
        int desplazamientoH = 10;
        Circulo circulo = new Circulo(20);
        circulo.setX(150);
        circulo.setY(350);
        miVentana.setColorDeLapiz(circulo.getColor());
        miVentana.rellenarCirculo(circulo.getX(), circulo.getY(), circulo.getDiametro());
        miVentana.espera(2000);

        for (int repeticiones = 0; repeticiones < 600; repeticiones++) {
            miVentana.borrarCirculo(circulo.getX(), circulo.getY(), circulo.getDiametro());
            // Verifica rebote en los bordes
            if ((circulo.getX() + circulo.getDiametro() >= getAncho()) || (circulo.getX() <= 0)) {
                desplazamientoH = -desplazamientoH;
            } if ((circulo.getY() + circulo.getDiametro() >= getAlto()) || (circulo.getY() <= 0)) {
                desplazamiento = -desplazamiento;            
            }
            circulo.setX(circulo.getX() + desplazamientoH);
            circulo.setY(circulo.getY() + desplazamiento);
            miVentana.rellenarCirculo(circulo.getX(), circulo.getY(), circulo.getDiametro());
            miVentana.espera(75);
        }
    }


    public void rebotaRec() {
        int desplazamiento = 10;
        int desplazamientoH = 10;
        Rectangulo rectangulo = new Rectangulo(30, 30);
        rectangulo.setX(150);
        rectangulo.setY(350);
        miVentana.setColorDeLapiz(rectangulo.getColor());
        miVentana.rellenarRectangulo(rectangulo.getX(), rectangulo.getY(), rectangulo.getLado1(), rectangulo.getLado2());
        miVentana.espera(2000);

        for (int repeticiones = 0; repeticiones < 600; repeticiones++) {
            miVentana.borrarRectangulo(rectangulo.getX(), rectangulo.getY(), rectangulo.getLado1(), rectangulo.getLado2());
            // Verifica rebote en los bordes
            if ((rectangulo.getX() + rectangulo.getLado1() >= getAncho()) || (rectangulo.getX() <= 0)) {
                desplazamientoH = -desplazamientoH;
            } if ((rectangulo.getY() + rectangulo.getLado1() >= getAlto()) || (rectangulo.getY() <= 0)) {
                desplazamiento = -desplazamiento;            
            }
            rectangulo.setX(rectangulo.getX() + desplazamientoH);
            rectangulo.setY(rectangulo.getY() + desplazamiento);
            miVentana.rellenarRectangulo(rectangulo.getX(), rectangulo.getY(), rectangulo.getLado1(), rectangulo.getLado2());
            miVentana.espera(75);
        }
    }


    public void CrearFigurasGeometricas () {
        System.out.println("Hay " + circulos.size() + " circulos creados");

        Circulo circulo = new Circulo (100);
        circulo.setX(150);
        circulo.setY(150);
        circulos.add(circulo);
        System.out.println("Hay " + circulos.size() + " circulos creados");

        circulo = new Circulo (50);
        circulo.setX(300);
        circulo.setY(250);
        circulos.add(circulo);
        System.out.println("Hay " + circulos.size() + " circulos creados");

        circulo = new Circulo (150);
        circulo.setX(400);
        circulo.setY(350);
        circulos.add(circulo);
        System.out.println("Hay " + circulos.size() + " circulos creados");


        //Rectangulos 

        Rectangulo rectangulo = new Rectangulo(100, 100);
        rectangulo.setX(150);
        rectangulo.setY(150);
        rectangulos.add(rectangulo);

        rectangulo = new Rectangulo(50, 50);
        rectangulo.setX(300);
        rectangulo.setY(250);
        rectangulos.add(rectangulo);

        rectangulo = new Rectangulo(150, 150);
        rectangulo.setX(400);
        rectangulo.setY(350);
        rectangulos.add(rectangulo);        
    }
 
    public void GraficarCirculosColeccionados () {
        for (Circulo c : circulos) {
            miVentana.setColorDeLapiz(c.getColor());
            miVentana.rellenarCirculo(c.getX(), c.getY(), c.getDiametro());
        }
    }

    public void GraficarRectangulosColeccionados () {
        for (Rectangulo r : rectangulos) {
            miVentana.setColorDeLapiz(r.getColor());
            miVentana.rellenarRectangulo(r.getX(), r.getY(), r.getLado1(), r.getLado2());
        }
    }
  








}
