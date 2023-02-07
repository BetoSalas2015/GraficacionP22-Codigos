import java.awt.*;

public class Dibujo extends Canvas {

    int x1, y1, x2, y2;

    public Dibujo() {

    }
    
    public void asignaPuntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        
    }

    public void paint(Graphics gc) {
        //gc.translate(200, 200);
        Color color = new Color(0x0f, 0x62, 0x92);
        gc.setColor(color);

        gc.drawLine(x1, y1, x2, y2);

    }
}
