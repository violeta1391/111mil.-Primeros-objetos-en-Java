import java.awt.Color;

public class App {
    public static void main(String[] args) throws Exception {
        
        Canvas miVentana = new Canvas("Hola Ventana", 800, 600);
        miVentana.setVisible(true);
        
        Circulo circulo1 = new Circulo(100);
        circulo1.setX(50);
        circulo1.setY(50);

        Rectangulo rectangulo1 = new Rectangulo(300, 300);
        rectangulo1.setX(150);
        rectangulo1.setY(150);

        


        /*

        // Dibujar un circulo azul y un rectangulo rojo
        
        miVentana.setColorDeLapiz(Color.BLUE);
        miVentana.rellenarCirculo(circulo1.getX(), circulo1.getY(), circulo1.getRadio());
        miVentana.setColorDeLapiz(Color.RED);
        miVentana.rellenarRectangulo(rectangulo1.getX(), rectangulo1.getY(), rectangulo1.getLado1(), rectangulo1.getLado2());


        // FOR // 
        
        // Aumentar el tamaño del circulo 
        
        for (int radio = 50; radio < 200; radio++) {
            miVentana.borrarCirculo(circulo1.getX(), circulo1.getY(), circulo1.getRadio());
            circulo1.setRadio(circulo1.getRadio() + 10);            
            miVentana.rellenarCirculo(circulo1.getX(), circulo1.getY(), circulo1.getRadio());
            miVentana.espera(250);
        }

        // Disminuir el tamaño del rectangulo  

        for (int i = 1; i < 15; i++) {
            miVentana.setColorDeLapiz(Color.ORANGE);
            miVentana.borrarRectangulo(rectangulo1.getX(), rectangulo1.getY(), rectangulo1.getLado1(), rectangulo1.getLado2());
            rectangulo1.setLado1(rectangulo1.getLado1() - 20);     
            rectangulo1.setLado2(rectangulo1.getLado2() - 20);       
            miVentana.rellenarRectangulo(rectangulo1.getX(), rectangulo1.getY(), rectangulo1.getLado1(), rectangulo1.getLado2());
            miVentana.espera(250);
            
        }


        // WHILE //

        // Mover el circulo a la derecha 

        int repe = 0;
        while (repe < 10) {
        miVentana.setColorDeLapiz(Color.PINK);
        miVentana.borrarCirculo(circulo1.getX(), circulo1.getY(), circulo1.getDiametro());
        circulo1.setX( circulo1.getX() + 30 );
        miVentana.rellenarCirculo(circulo1.getX(), circulo1.getY(), circulo1.getDiametro());
        repe = repe + 1;
        miVentana.espera(200);
        }

        // Mover el rectangulo hacia abajo

        int rep = 0;
        while (rep < 10) {
        miVentana.espera(500);
        miVentana.setColorDeLapiz(Color.MAGENTA);
        miVentana.borrarRectangulo(rectangulo1.getX(), rectangulo1.getY(), rectangulo1.getLado1(), rectangulo1.getLado2());
        rectangulo1.setY( rectangulo1.getY() + 40 );
        miVentana.rellenarRectangulo(rectangulo1.getX(), rectangulo1.getY(), rectangulo1.getLado1(), rectangulo1.getLado2());
        rep = rep + 1;
        }

        */    

    }
}
