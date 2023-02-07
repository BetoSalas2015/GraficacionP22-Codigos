 /**
  *  Ejercicio 05: 
  * - Se crea un vector con varios puntos a graficar
  * - se grafican todos los puntos como figura cerrada.
  *
  */
  
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Vector;

 public class Ventana extends Frame {
 
    private Dibujo dibujo;
    Panel panelDatos, panelPunto1, panelPunto2;
    TextField punto1x, punto1y, punto2x, punto2y;
    Label lblPunto1, lblPunto2;
    Button btnGraficar, btnAgregar;
    Vector<Punto> vectorPuntos;

    public Ventana() {
        super("Gráficos en java");
        panelDatos = new Panel();
        panelDatos.setLayout(new GridLayout(10,1) );
        panelPunto1 = new Panel();
        panelPunto1.setLayout(new GridLayout(1,2) );
        //panelPunto2 = new Panel();
        //panelPunto2.setLayout(new GridLayout(1,2) );

        lblPunto1 = new Label("Punto 1");
        //lblPunto2 = new Label("Punto 2");

        punto1x = new TextField("0");
        punto1y = new TextField("0");
        //punto2x = new TextField("0");
        //punto2y = new TextField("0");

        btnGraficar = new Button("Graficar:");
        btnAgregar = new Button("Agregar Punto:");

        dibujo = new Dibujo();

        panelPunto1.add(punto1x); panelPunto1.add(punto1y);
        //panelPunto2.add(punto2x); panelPunto2.add(punto2y);

        panelDatos.add(lblPunto1);
        panelDatos.add(panelPunto1);
        //panelDatos.add(lblPunto2);
        //panelDatos.add(panelPunto2);
        
        panelDatos.add(btnAgregar);
        panelDatos.add(btnGraficar);

        setLayout(new BorderLayout() );
        add(panelDatos, "West");
        add(dibujo, "Center");

        btnGraficar.addActionListener(new BotonGraficar());
        btnAgregar.addActionListener( new BotonAgregar() );
        
        vectorPuntos = new Vector<Punto>();


        add(dibujo);

        addWindowListener( new CloseWin() );
        setSize(500, 450);
        setVisible(true);
    }

    private class BotonGraficar implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            dibujo.asignaPuntos(vectorPuntos);
            dibujo.repaint();
        }
        
    }
    
    private class BotonAgregar implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            vectorPuntos.add(new Punto(Integer.parseInt(punto1x.getText()), Integer.parseInt(punto1y.getText())));
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
