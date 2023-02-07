 /**
  *  Ejercicio 03: 
  * - Agregamos la función captura datos como puente con el objeto Dibujo
  * - Creamos la interfaz de usuario para la captura de datos
  * - El objeto Dibujo dubuja la información capturada en la UI
  * - Creamos la clase listener para responder a botón graficar
  *
  */
  
 import java.awt.*;
 import java.awt.event.*;
 import java.awt.geom.*;

 public class Ventana extends Frame {
 
    private Dibujo dibujo;
    Panel panelDatos, panelPunto1, panelPunto2;
    TextField punto1x, punto1y, punto2x, punto2y;
    Label lblPunto1, lblPunto2;
    Button btnGraficar;

    public Ventana() {
        super("Gráficos en java");
        panelDatos = new Panel();
        panelDatos.setLayout(new GridLayout(10,1) );
        panelPunto1 = new Panel();
        panelPunto1.setLayout(new GridLayout(1,2) );
        panelPunto2 = new Panel();
        panelPunto2.setLayout(new GridLayout(1,2) );

        lblPunto1 = new Label("Punto 1");
        lblPunto2 = new Label("Punto 2");

        punto1x = new TextField("0");
        punto1y = new TextField("0");
        punto2x = new TextField("0");
        punto2y = new TextField("0");

        btnGraficar = new Button("Graficar:");

        dibujo = new Dibujo();

        panelPunto1.add(punto1x); panelPunto1.add(punto1y);
        panelPunto2.add(punto2x); panelPunto2.add(punto2y);

        panelDatos.add(lblPunto1);
        panelDatos.add(panelPunto1);
        panelDatos.add(lblPunto2);
        panelDatos.add(panelPunto2);
        panelDatos.add(btnGraficar);

        setLayout(new BorderLayout() );
        add(panelDatos, "West");
        add(dibujo, "Center");

        btnGraficar.addActionListener(new BotonGraficar());;


        add(dibujo);

        addWindowListener( new CloseWin() );
        setSize(400, 400);
        setVisible(true);
    }

    private class BotonGraficar implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int x1 = Integer.parseInt( punto1x. getText() );
            int y1 = Integer.parseInt( punto1y. getText() );
            int x2 = Integer.parseInt( punto2x. getText() );
            int y2 = Integer.parseInt( punto2y. getText() );

            dibujo.asignaPuntos(x1, y1, x2, y2);
            dibujo.repaint();
        }
        
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
