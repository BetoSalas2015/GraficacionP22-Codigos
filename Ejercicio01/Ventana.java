 /**
  *  Ejercicio 01: 
  * - Creación de la clase Ventana. 
  * - Programación de los eventos de Cierre de ventana
  * - Programación de métodos graficos
  *
  */
  
 import java.awt.*;
 import java.awt.event.*;
 import java.awt.geom.*;

 public class Ventana extends Frame {
 
    public Ventana() {
        super("Dibujo");
        addWindowListener( new CloseWin() );
        setSize(400, 400);
        setVisible(true);
    }

    private class CloseWin extends WindowAdapter {
        public void windowClosing( WindowEvent e) {
            setVisible(false);
            dispose();
        }
        
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


    public static void main(String[] args) {
        Ventana ventana = new Ventana();
    }
 }
