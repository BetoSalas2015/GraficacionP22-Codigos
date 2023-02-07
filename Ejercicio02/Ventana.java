 /**
  *  Ejercicio 02: 
  * - Separación de la tarea de dibujo en la clase dibujo
  *
  */
  
 import java.awt.*;
 import java.awt.event.*;
 import java.awt.geom.*;

 public class Ventana extends Frame {
 
    private Dibujo dibujo;

    public Ventana() {
        super("Gráficos en java");

        dibujo = new Dibujo();

        setLayout(new GridLayout(2,1));
        add(dibujo);

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


    public static void main(String[] args) {
        Ventana ventana = new Ventana();
    }
 }
