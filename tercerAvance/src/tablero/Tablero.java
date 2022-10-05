/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablero;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author edw_v
 */
public class Tablero extends JPanel implements Graphic{
    
    private int numCasillas;
    //El tablero contiene una lista<Graphic> que son las aspas y el centro.
    private List<Graphic> listaGraficos;
    
    public Tablero(int numCasillas){
        this.numCasillas = numCasillas;
        listaGraficos = new ArrayList<>();
        listaGraficos.add(new Centro());
        listaGraficos.add(new Aspa(480, 360, 7, "superior"));
        listaGraficos.add(new Aspa(480, 510, 7, "inferior"));
        listaGraficos.add(new Aspa(380, 460, 7, "izquierda"));
        listaGraficos.add(new Aspa(530, 460, 7, "derecha"));
    }
    
    public void paint(Graphics g){
        dibujar(g);
    }
    
    @Override
    public void dibujar(Graphics g) {
        for(Graphic grafico : listaGraficos){
            grafico.dibujar(g);
        }
    }
    
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Tablero");
        
        Tablero objeto = new Tablero(7);
        ventana.add(objeto);
        ventana.setSize(1900, 1000);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
