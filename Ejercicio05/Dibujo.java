import java.awt.*;
import java.util.Vector;

public class Dibujo extends Canvas {

    Punto punto1, punto2;
    Vector<Punto> puntosGraficar;

    public Dibujo() {

    }

    
    public void asignaPuntos(Punto p1, Punto p2) {
        punto1 = p1;
        punto2 = p2;
    }

    public void asignaPuntos(Vector<Punto> vectorPuntos) {
        puntosGraficar = vectorPuntos;
    }

    public void paint(Graphics gc) {
        int i;
        // Dibujo de los ejes cartesianos
        gc.translate(200, 200);
        gc.setColor(Color.black);
        gc.drawLine(-200, 0, 200, 0);
        gc.drawLine(0, -200 , 0, 200);

        // Graficos 
        Color color = new Color(0x0f, 0x62, 0x92);
        gc.setColor(color);

        if (puntosGraficar != null) {
            for(i = 0; i < puntosGraficar.size() - 1; i++ ) {
                gc.drawLine(puntosGraficar.get(i).getX(), puntosGraficar.get(i).getY(),
                            puntosGraficar.get(i + 1).getX(), puntosGraficar.get(i + 1).getY());
            }

            gc.drawLine(puntosGraficar.get(i).getX(), puntosGraficar.get(i).getY(),
                            puntosGraficar.get(0).getX(), puntosGraficar.get(0).getY());
        }
        

    }
}
