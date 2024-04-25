package dibujo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.util.logging.*;

import base.Poligono; 

public class Dibujar extends JPanel {

	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 600;
    private static final int HEIGHT = 600;

    private Dibujo dibujo;
    private Poligono poligono;
    //private int numSides; // Number of sides of the polygon
    private int[] xPoints; // X coordinates of the polygon vertices
    private int[] yPoints; // Y coordinates of the polygon vertices

    public Dibujar(Poligono poligono) {
        this.poligono = poligono;
        calcularVertices();
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    private void calcularVertices() {
        xPoints = new int[poligono.getLados()];
        yPoints = new int[poligono.getLados()];

        double angleIncrement = 2 * Math.PI / poligono.getLados();
        int radius = 200; // Radius of the polygon

        for (int i = 0; i < poligono.getLados(); i++) {
            xPoints[i] = (int) (300 + radius * Math.cos(i * angleIncrement));
            yPoints[i] = (int) (300 + radius * Math.sin(i * angleIncrement));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the polygon
        g.setColor(Color.BLUE);
        g.drawPolygon(xPoints, yPoints, poligono.getLados());
    }

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un nombre para el pol�gono: ");
        String nombre = scanner.next();
        Poligono poligono = new Poligono(nombre);
        System.out.println();
        System.out.print("Introduce el n�mero de lados del pol�gono: ");
        int lados = scanner.nextInt();
        poligono.setLados(lados);
        scanner.close();
        
        Logger logger = Logger.getLogger("DibujarLog");
        FileHandler filehandler;
        try {
        	filehandler = new FileHandler(nombre+"_log.txt");
        	logger.addHandler(filehandler);
        } catch (IOException e){
        	logger.log(Level.SEVERE,"error al configurar el archivo de registro", e);
        }

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Regular Polygon Drawer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new Dibujar(poligono));
            frame.pack();
            frame.setLocationRelativeTo(null); // Center the frame
            frame.setVisible(true);
        });
    }
}
