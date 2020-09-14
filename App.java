import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class App {

    private Canvas miVentana;
    private Random aleatorio;

    private int ancho = 800;
    private int alto = 600;

    private ArrayList<Circulo> circulos;
    private ArrayList<Rectangulo> rectangulos;
    private ArrayList<Triangulo> triangulos;

    public App() {
        aleatorio = new Random();
        circulos = new ArrayList<>();
        rectangulos = new ArrayList<>();
        triangulos = new ArrayList<>();
        miVentana = new Canvas("Hola Ventana", ancho, alto);
        miVentana.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        App miAplicacion = new App();
        miAplicacion.ejecutar();
        //miAplicacion.imagenes();
        miAplicacion.funcionTriangulos();
    }

    public void ejecutar() {

        // PelotaRebotandoHorizontal();
        // PelotaRebotandoVertical();
        // rebotarPelota();
        // rebotaRec();
        //CrearFigurasGeometricas();        
        //GraficarCirculosColeccionados();
        // GraficarRectangulosColeccionados();

        funcionCirculos();
        //funcionRectangulos();

        //funcionTriangulos(); 
      

    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }



    // Colocar imagenes en la ventana

    public void imagenes() {
        Dibujo dibujo = new Dibujo();
        miVentana.dibujarImagen(dibujo.getImagen(), dibujo.getAncho(), dibujo.getAlto());
    }


    // Primeros ejemplos

    public void primerosEjemplos() {
        Canvas miVentana = new Canvas("Hola Ventana", 800, 600);
        miVentana.setVisible(true);

        Circulo circulo1 = new Circulo(1000);
        circulo1.getPosicion().setX(50);
        circulo1.getPosicion().setY(50);

        Rectangulo rectangulo1 = new Rectangulo(300, 300);
        rectangulo1.getPosicion().setX(150);
        rectangulo1.getPosicion().setY(150);
    }

    // Aumentar tamaño

    public void aumentarTamaño() {
        Canvas miVentana = new Canvas("Hola Ventana", 800, 600);
        miVentana.setVisible(true);

        Circulo circulo1 = new Circulo(1000);
        circulo1.getPosicion().setX(50);
        circulo1.getPosicion().setY(50);

        Rectangulo rectangulo1 = new Rectangulo(300, 300);
        rectangulo1.getPosicion().setX(150);
        rectangulo1.getPosicion().setY(150);

        for (int radio = 50; radio < 200; radio++) {
            miVentana.setColorDeLapiz(circulo1.getColor());
            miVentana.borrarCirculo(circulo1.getPosicion().getX(), circulo1.getPosicion().getY(), circulo1.getRadio());
            circulo1.setRadio(circulo1.getRadio() + 10);
            miVentana.rellenarCirculo(circulo1.getPosicion().getX(), circulo1.getPosicion().getY(), circulo1.getRadio());
            miVentana.espera(250);
        }
    }

    // Disminuir tamaño

    public void disminuirTamaño() {
        Canvas miVentana = new Canvas("Hola Ventana", 800, 600);
        miVentana.setVisible(true);

        Circulo circulo1 = new Circulo(1000);
        circulo1.getPosicion().setX(50);
        circulo1.getPosicion().setY(50);

        Rectangulo rectangulo1 = new Rectangulo(300, 300);
        rectangulo1.getPosicion().setX(150);
        rectangulo1.getPosicion().setY(150);

        for (int i = 1; i < 15; i++) {
            miVentana.setColorDeLapiz(circulo1.getColor());
            miVentana.borrarRectangulo(rectangulo1.getPosicion().getX(), rectangulo1.getPosicion().getY(), rectangulo1.getLado1(),
                    rectangulo1.getLado2());
            rectangulo1.setLado1(rectangulo1.getLado1() - 20);
            rectangulo1.setLado2(rectangulo1.getLado2() - 20);
            miVentana.rellenarRectangulo(rectangulo1.getPosicion().getX(), rectangulo1.getPosicion().getY(), rectangulo1.getLado1(),
                    rectangulo1.getLado2());
            miVentana.espera(250);
        }
    }

    // Mover hacia la derecha

    public void moverDerecha() {
        Canvas miVentana = new Canvas("Hola Ventana", 800, 600);
        miVentana.setVisible(true);

        Circulo circulo1 = new Circulo(1000);
        circulo1.getPosicion().setX(50);
        circulo1.getPosicion().setY(50);

        Rectangulo rectangulo1 = new Rectangulo(300, 300);
        rectangulo1.getPosicion().setX(150);
        rectangulo1.getPosicion().setY(150);

        int repe = 0;
        while (repe < 10) {
            miVentana.setColorDeLapiz(circulo1.getColor());
            miVentana.borrarCirculo(circulo1.getPosicion().getX(), circulo1.getPosicion().getY(), circulo1.getDiametro());
            circulo1.getPosicion().setX(circulo1.getPosicion().getX() + 30);
            miVentana.rellenarCirculo(circulo1.getPosicion().getX(), circulo1.getPosicion().getY(), circulo1.getDiametro());
            repe = repe + 1;
            miVentana.espera(200);
        }
    }

    // Mover hacia abajo

    public void moverAbajo() {
        Canvas miVentana = new Canvas("Hola Ventana", 800, 600);
        miVentana.setVisible(true);

        Circulo circulo1 = new Circulo(1000);
        circulo1.getPosicion().setX(50);
        circulo1.getPosicion().setY(50);

        Rectangulo rectangulo1 = new Rectangulo(300, 300);
        rectangulo1.getPosicion().setX(150);
        rectangulo1.getPosicion().setY(150);

        int rep = 0;
        while (rep < 10) {
            miVentana.espera(500);
            miVentana.setColorDeLapiz(Color.MAGENTA);
            miVentana.borrarRectangulo(rectangulo1.getPosicion().getX(), rectangulo1.getPosicion().getY(), rectangulo1.getLado1(),
                    rectangulo1.getLado2());
            rectangulo1.getPosicion().setY(rectangulo1.getPosicion().getY() + 40);
            miVentana.rellenarRectangulo(rectangulo1.getPosicion().getX(), rectangulo1.getPosicion().getY(), rectangulo1.getLado1(),
                    rectangulo1.getLado2());
            rep = rep + 1;
        }
    }

    // Rebotar la pelota en horizontal

    public void PelotaRebotandoHorizontal() {
        int desplazamiento = 10;
        Circulo circulo = new Circulo(20);
        circulo.getPosicion().setX(150);
        circulo.getPosicion().setY(350);
        miVentana.setColorDeLapiz(circulo.getColor());
        miVentana.rellenarCirculo(circulo.getPosicion().getX(), circulo.getPosicion().getY(), circulo.getDiametro());
        miVentana.espera(5000);
        for (int repeticiones = 0; repeticiones < 600; repeticiones++) {
            miVentana.borrarCirculo(circulo.getPosicion().getX(), circulo.getPosicion().getY(), circulo.getDiametro());
            // Verifica rebote en los bordes
            if ((circulo.getPosicion().getX() + circulo.getDiametro() >= getAncho()) || (circulo.getPosicion().getX() <= 0)) {
                desplazamiento = -desplazamiento;
            }
            circulo.getPosicion().setX(circulo.getPosicion().getX() + desplazamiento);
            miVentana.rellenarCirculo(circulo.getPosicion().getX(), circulo.getPosicion().getY(), circulo.getDiametro());
            miVentana.espera(75);
        }
    }

    // Rebotar la pelota en vertical

    public void PelotaRebotandoVertical() {
        int desplazamiento = 10;
        Circulo circulo = new Circulo(20);
        circulo.getPosicion().setX(150);
        circulo.getPosicion().setY(350);
        miVentana.setColorDeLapiz(circulo.getColor());
        miVentana.rellenarCirculo(circulo.getPosicion().getX(), circulo.getPosicion().getY(), circulo.getDiametro());
        miVentana.espera(5000);
        for (int repeticiones = 0; repeticiones < 600; repeticiones++) {
            miVentana.borrarCirculo(circulo.getPosicion().getX(), circulo.getPosicion().getY(), circulo.getDiametro());
            // Verifica rebote en los bordes
            if ((circulo.getPosicion().getY() + circulo.getDiametro() >= getAlto()) || (circulo.getPosicion().getY() <= 0)) {
                desplazamiento = -desplazamiento;
            }
            circulo.getPosicion().setY(circulo.getPosicion().getY() + desplazamiento);
            miVentana.rellenarCirculo(circulo.getPosicion().getX(), circulo.getPosicion().getY(), circulo.getDiametro());
            miVentana.espera(75);
        }
    }

    // Rebotar la pelota vertical y horizontal

    public void rebotarPelota() {
        int desplazamiento = 10;
        int desplazamientoH = 10;
        Circulo circulo = new Circulo(20);
        circulo.getPosicion().setX(150);
        circulo.getPosicion().setY(350);
        miVentana.setColorDeLapiz(circulo.getColor());
        miVentana.rellenarCirculo(circulo.getPosicion().getX(), circulo.getPosicion().getY(), circulo.getDiametro());
        miVentana.espera(2000);

        for (int repeticiones = 0; repeticiones < 600; repeticiones++) {
            miVentana.borrarCirculo(circulo.getPosicion().getX(), circulo.getPosicion().getY(), circulo.getDiametro());
            // Verifica rebote en los bordes
            if ((circulo.getPosicion().getX() + circulo.getDiametro() >= getAncho()) || (circulo.getPosicion().getX() <= 0)) {
                desplazamientoH = -desplazamientoH;
            }
            if ((circulo.getPosicion().getY() + circulo.getDiametro() >= getAlto()) || (circulo.getPosicion().getY() <= 0)) {
                desplazamiento = -desplazamiento;
            }
            circulo.getPosicion().setX(circulo.getPosicion().getX() + desplazamientoH);
            circulo.getPosicion().setY(circulo.getPosicion().getY() + desplazamiento);
            miVentana.rellenarCirculo(circulo.getPosicion().getX(), circulo.getPosicion().getY(), circulo.getDiametro());
            miVentana.espera(75);
        }
    }

    // Rebotar rectángulo

    public void rebotaRec() {
        int desplazamiento = 10;
        int desplazamientoH = 10;
        Rectangulo rectangulo = new Rectangulo(30, 30);
        rectangulo.getPosicion().setX(150);
        rectangulo.getPosicion().setY(350);
        miVentana.setColorDeLapiz(rectangulo.getColor());
        miVentana.rellenarRectangulo(rectangulo.getPosicion().getX(), rectangulo.getPosicion().getY(), rectangulo.getLado1(),
                rectangulo.getLado2());
        miVentana.espera(2000);

        for (int repeticiones = 0; repeticiones < 600; repeticiones++) {
            miVentana.borrarRectangulo(rectangulo.getPosicion().getX(), rectangulo.getPosicion().getY(), rectangulo.getLado1(),
                    rectangulo.getLado2());
            // Verifica rebote en los bordes
            if ((rectangulo.getPosicion().getX() + rectangulo.getLado1() >= getAncho()) || (rectangulo.getPosicion().getX() <= 0)) {
                desplazamientoH = -desplazamientoH;
            }
            if ((rectangulo.getPosicion().getY() + rectangulo.getLado1() >= getAlto()) || (rectangulo.getPosicion().getY() <= 0)) {
                desplazamiento = -desplazamiento;
            }
            rectangulo.getPosicion().setX(rectangulo.getPosicion().getX() + desplazamientoH);
            rectangulo.getPosicion().setY(rectangulo.getPosicion().getY() + desplazamiento);
            miVentana.rellenarRectangulo(rectangulo.getPosicion().getX(), rectangulo.getPosicion().getY(), rectangulo.getLado1(),
                    rectangulo.getLado2());
            miVentana.espera(75);
        }
    }

    // Crear figuras geométricas

    public void CrearFigurasGeometricas() {
        System.out.println("Hay " + circulos.size() + " circulos creados");

        Circulo circulo = new Circulo(100);
        circulo.getPosicion().setX(150);
        circulo.getPosicion().setY(150);
        circulos.add(circulo);
        System.out.println("Hay " + circulos.size() + " circulos creados");

        circulo = new Circulo(50);
        circulo.getPosicion().setX(300);
        circulo.getPosicion().setY(250);
        circulos.add(circulo);
        System.out.println("Hay " + circulos.size() + " circulos creados");

        circulo = new Circulo(150);
        circulo.getPosicion().setX(400);
        circulo.getPosicion().setY(350);
        circulos.add(circulo);
        System.out.println("Hay " + circulos.size() + " circulos creados");

        // Rectangulos

        Rectangulo rectangulo = new Rectangulo(100, 100);
        rectangulo.getPosicion().setX(150);
        rectangulo.getPosicion().setY(150);
        rectangulos.add(rectangulo);

        rectangulo = new Rectangulo(50, 50);
        rectangulo.getPosicion().setX(300);
        rectangulo.getPosicion().setY(250);
        rectangulos.add(rectangulo);

        rectangulo = new Rectangulo(150, 150);
        rectangulo.getPosicion().setX(400);
        rectangulo.getPosicion().setY(350);
        rectangulos.add(rectangulo);
    }


    // --- --- --- --- --- --- //

    // Funciones para circulos

    // Graficar circulos coleccionados

    public void GraficarCirculosColeccionados() {
        for (Circulo c : circulos) {
            miVentana.setColorDeLapiz(c.getColor());
            miVentana.rellenarCirculo(c.getPosicion().getX(), c.getPosicion().getY(), c.getDiametro());
        }
    }

    // Actualizar posición de circulos

    public void ActualizarPosicionCirculos() {
        for (Circulo c : circulos) {
            c.actualizarPosicion();
        }
    }

    // Borrar circulos coleccionador

    public void BorrarCirculosColeccionados() {
        for (Circulo c : circulos) {
            miVentana.borrarCirculo(c.getPosicion().getX(), c.getPosicion().getY(), c.getDiametro());
        }
    }

    // Funcion circulos - reune varias funciones para dibujar circulos

    public void funcionCirculos() {
        ArrayList<Circulo> enRango;
        CrearFigurasAleatorias(30);
        enRango = CirculosConRadioEnRango(40, 70);
        PintarCirculos(enRango, Color.BLUE);
        enRango = CirculosConRadioEnRango(70, 100);
        PintarCirculos(enRango, Color.RED);
        miVentana.espera(100);
        GraficarCirculosColeccionados();

        for (int i = 0; i < 100; i++) {
            miVentana.espera(500);
            BorrarCirculosColeccionados();
            ActualizarPosicionCirculos();
            if (i == 15) {
                PintarCirculos(circulos, Color.MAGENTA);
            }
            GraficarCirculosColeccionados();
        }
    }

    public ArrayList<Circulo> CirculosConRadioEnRango(int min, int max) {
        ArrayList<Circulo> lista = new ArrayList<>();
        for (Circulo c : circulos) {
            if ((min <= c.getRadio()) && (c.getRadio() <= max)) {
                lista.add(c);
            }
        }
        return lista;
    }

    public ArrayList<Circulo> CirculosEnUnArea() {
        return null;
    }

    public void PintarCirculos(ArrayList<Circulo> lista, Color color) {
        for (Circulo c : lista) {
            c.setColor(color);
        }
    }

    public void CrearFigurasAleatorias(int cantidad) {
        for (int c = 0; c < cantidad; c++) {
            Circulo circulo = new Circulo(aleatorio.nextInt(91) + 10);
            circulo.getPosicion().setX(aleatorio.nextInt(getAncho()));
            circulo.getPosicion().setY(aleatorio.nextInt(getAlto()));
            circulo.getPosicion().setDespX(aleatorio.nextInt(31) - 15);
            circulo.getPosicion().setDespY(aleatorio.nextInt(31) - 15);
            circulos.add(circulo);
        }
    }

    // --- --- --- --- --- --- //

    // Funciones para rectangulos

    // Graficar rectángulos coleccionados

    public void GraficarRectangulosColeccionados() {
        for (Rectangulo r : rectangulos) {
            miVentana.setColorDeLapiz(r.getColor());
            miVentana.rellenarRectangulo(r.getPosicion().getX(), r.getPosicion().getY(), r.getLado1(), r.getLado2());
        }
    }

    // Actualizar posición de rectangulos

    public void ActualizarPosicionRectangulos() {
        for (Rectangulo r : rectangulos) {
            r.actualizarPosicion();
        }
    }

    // Borrar rectangulos coleccionador

    public void BorrarRectangulosColeccionados() {
        for (Rectangulo r : rectangulos) {
            miVentana.borrarRectangulo(r.getPosicion().getX(), r.getPosicion().getY(), r.getLado1(), r.getLado2());
        }
    }

    // Funcion Rectangulos

    public void funcionRectangulos() {

        ArrayList<Rectangulo> enRango;

        CrearRectangulosAleatorios(30);

        enRango = RectangulosConSuperficieEnRango(40, 70);

        PintarRectangulos(enRango, Color.BLUE);

        enRango = RectangulosConSuperficieEnRango(70, 100);

        PintarRectangulos(enRango, Color.RED);

        miVentana.espera(1500);

        GraficarRectangulosColeccionados();

        for (int i = 0; i < 100; i++) {
            miVentana.espera(500);
            BorrarRectangulosColeccionados();
            ActualizarPosicionRectangulos();
            if (i == 15) {
                PintarCirculos(circulos, Color.MAGENTA);
            }
            GraficarRectangulosColeccionados();
        }
    }

    public ArrayList<Rectangulo> RectangulosConSuperficieEnRango(int min, int max) {
        ArrayList<Rectangulo> lista = new ArrayList<>();
        for (Rectangulo r : rectangulos) {
            if ((min <= r.getLado1()) && (r.getLado2() <= max)) {
                lista.add(r);
            }
        }
        return lista;
    }

    public ArrayList<Rectangulo> RectangulosEnUnArea() {
        return null;
    }

    public void PintarRectangulos(ArrayList<Rectangulo> lista, Color color) {
        for (Rectangulo r : lista) {
            r.setColor(color);
        }
    }

    public void CrearRectangulosAleatorios(int cantidad) {
        for (int r = 0; r < cantidad; r++) {
            Rectangulo rectangulo = new Rectangulo(aleatorio.nextInt(91) + 10, aleatorio.nextInt(91) + 10);
            rectangulo.getPosicion().setX(aleatorio.nextInt(getAncho()));
            rectangulo.getPosicion().setY(aleatorio.nextInt(getAlto()));
            rectangulo.getPosicion().setDespX(aleatorio.nextInt(31) - 15);
            rectangulo.getPosicion().setDespY(aleatorio.nextInt(31) - 15);
            rectangulos.add(rectangulo);
        }
    }


    // --- --- --- --- --- --- //
  
    // Funciones para triangulos 

    // Graficar triángulos coleccionados

    public void GraficarTriangulosColeccionados() {
        for (Triangulo t : triangulos) {
            miVentana.setColorDeLapiz(t.getColor());
            miVentana.rellenarTriangulo(t.getPosicion().getX(), t.getPosicion().getY(), t.getBase(), t.getAltura());
        }
    }

    // Actualizar posición de triangulos

    public void ActualizarPosicionTriangulos() {
        for (Triangulo t : triangulos) {
            t.actualizarPosicion();
        }
    }

    // Borrar triangulos coleccionador

    public void BorrarTriangulosColeccionados() {
        for (Triangulo t : triangulos) {
            miVentana.borrarTriangulo(t.getPosicion().getX(), t.getPosicion().getY(), t.getBase(), t.getAltura());
        }
    }

    // Funcion triangulos

    public void funcionTriangulos() {

        ArrayList<Triangulo> enRango;

        CrearTriangulosAleatorios(30);

        enRango = TriangulosConSuperficieEnRango(40, 70);

        PintarTriangulos(enRango, Color.BLUE);

        enRango = TriangulosConSuperficieEnRango(70, 100);

        PintarTriangulos(enRango, Color.RED);

        miVentana.espera(300);

        GraficarTriangulosColeccionados();

        for (int i = 0; i < 100; i++) {
            miVentana.espera(500);
            BorrarTriangulosColeccionados();
            ActualizarPosicionTriangulos();
            if (i == 15) {
                PintarTriangulos(triangulos, Color.MAGENTA);
            }
            GraficarTriangulosColeccionados();
        }
    }

    public ArrayList<Triangulo> TriangulosConSuperficieEnRango(int min, int max) {
        ArrayList<Triangulo> lista = new ArrayList<>();
        for (Triangulo t : triangulos) {
            if ((min <= t.getBase()) && (t.getAltura() <= max)) {
                lista.add(t);
            }
        }
        return lista;
    }

    public ArrayList<Triangulo> TriangulosEnUnArea() {
        return null;
    }

    public void PintarTriangulos(ArrayList<Triangulo> lista, Color color) {
        for (Triangulo t : lista) {
            t.setColor(color);
        }
    }

    public void CrearTriangulosAleatorios(int cantidad) {
        for (int t = 0; t < cantidad; t++) {
            Triangulo triangulo = new Triangulo(aleatorio.nextInt(91) + 10, aleatorio.nextInt(91) + 10);
            triangulo.getPosicion().setX(aleatorio.nextInt(getAncho()));
            triangulo.getPosicion().setY(aleatorio.nextInt(getAlto()));
            triangulo.getPosicion().setDespX(aleatorio.nextInt(31) - 15);
            triangulo.getPosicion().setDespY(aleatorio.nextInt(31) - 15);
            triangulos.add(triangulo);
        }
    }





















}
