import java.awt.*;
import java.util.Vector;
import java.awt.geom.*;

public class Dibujo extends Canvas {

    Punto punto1, punto2;
    Vector<Point> puntosGraficar;

    public Dibujo() {

    }

    
    public void asignaPuntos(Punto p1, Punto p2) {
        punto1 = p1;
        punto2 = p2;
    }

    public void asignaPuntos(Vector<Point> vectorPuntos) {
        puntosGraficar = vectorPuntos;
    }

    public void paint(Graphics gc) {
        int i;
        Graphics2D g2d = (Graphics2D) gc;
        // Dibujo de los ejes cartesianos
        gc.translate(200, 200);
        gc.setColor(Color.black);
        g2d.draw(new Line2D.Float( -200, 0, 200, 0));
        g2d.draw(new Line2D.Float(0, -200, 0, 200));


        // Graficos 
        Color color = new Color(0x0f, 0x62, 0x92);
        gc.setColor(color);

        if (puntosGraficar != null) {
            for(i = 0; i < puntosGraficar.size() - 1; i++ ) {
                g2d.draw( new Line2D.Float(puntosGraficar.get(i), puntosGraficar.get(i + 1) ));
            }

            g2d.draw( new Line2D.Float(puntosGraficar.get(i), puntosGraficar.get(0) ));
        }
        

    }
}
