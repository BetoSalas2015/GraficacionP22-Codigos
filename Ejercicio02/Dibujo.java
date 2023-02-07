import java.awt.*;
import java.awt.geom.*;

public class Dibujo extends Canvas {

    public Dibujo() {
        
    }
    

    public void paint(Graphics gc) {
        //gc.translate(200, 200);
        Color color = new Color(0x0f, 0x62, 0x92);
        gc.setColor(color);
        gc.setColor(color);
        gc.drawString("Saludos Programas!!!!", 100, 100);
        gc.drawLine(0,0, 230, 200);
        gc.setColor(color.red);
        gc.fillOval(75,63, 100, 100);
    }
}
