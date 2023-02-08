import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Archivos extends Frame {
    private Dibujo dibujo;
    private BufferedReader entrada;
    private String c, cad1, cad2;
    private StringTokenizer token;
    private Vector<Point> vectorPuntos;

    public Archivos() {
        super("Lector de Archivos");
        dibujo = new Dibujo();
        add(dibujo, "Center");
        vectorPuntos = new Vector<Point>();

        // Apertura del archivo
        
        try {
           entrada = new BufferedReader(new FileReader("Coordenadas.txt")); 

           while( (c = entrada.readLine() )  != null ) {
                token = new StringTokenizer(c, ",");
                cad1 = token.nextToken();
                cad2 = token.nextToken();

                vectorPuntos.add(new Point( Integer.parseInt(cad1), Integer.parseInt(cad2) ));
           }
           entrada.close();
        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
        } finally {
            if (entrada != null) {
                //entrada.close();
            }
        }

        dibujo.asignaPuntos(vectorPuntos);

        addWindowListener(new CloseWin());
        setVisible(true);
        setSize(400,400);


    }

    private class CloseWin extends WindowAdapter {
        public void windowClosing( WindowEvent e) {
            setVisible(false);
            dispose();
        }
        
    }

    public static void main(String[] args) {
        Archivos archivos = new Archivos();
    }

    
}