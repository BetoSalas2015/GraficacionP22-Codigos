import java.awt.*;

public class Dibujo extends Canvas {

    Punto punto1, punto2;

    public Dibujo() {

    }
    
    public void asignaPuntos(Punto p1, Punto p2) {
        punto1 = p1;
        punto2 = p2;
    }

    public void paint(Graphics gc) {
        //gc.translate(200, 200);
        Color color = new Color(0x0f, 0x62, 0x92);
        gc.setColor(color);

        if (punto1 != null && punto2 != null) {
            gc.drawLine(punto1.getX(), punto1.getY(), punto2.getX(), punto2.getY());
        }
        

    }
}
