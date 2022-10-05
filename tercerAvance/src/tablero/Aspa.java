/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tablero;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edw_v
 */
public class Aspa implements Graphic{

    private int x;
    private int y;
    private int numCasillas;
    private String tipoAspa;
    private List<Graphic> listaCasillas;
    
    public Aspa(int x, int y, int numCasillas, String tipoAspa){
        this.x = x;
        this.y = y;
        this.numCasillas = numCasillas;
        this.tipoAspa = tipoAspa;
        listaCasillas = new ArrayList<Graphic>();
    }
    
    public void paint(Graphics g){
        dibujar(g);
    }
    
    @Override
    public void dibujar(Graphics g) {
        if(tipoAspa.equals("superior")){
            aspaSuperior(g);
        }
        if(tipoAspa.equals("inferior")){
            aspaInferior(g);
        }
        if(tipoAspa.equals("izquierda")){
            aspaIzquierda(g);
        }
        if(tipoAspa.equals("derecha")){
            aspaDerecha(g);
        }
    }
    
    public void aspaSuperior(Graphics g){
        listaCasillas = new ArrayList<Graphic>();
        
        for (int i = 0; i < numCasillas - 3; i++) {
            for (int j = 0; j < 2; j++) {
                listaCasillas.add(new CasillaNormal(x, y));
                x -= 50;
            }
            x = 480;
            y -= 50;
        }
        
        for (Graphic casilla : listaCasillas) {
            casilla.dibujar(g);
        }
    }
    
    public void aspaInferior(Graphics g){
        listaCasillas = new ArrayList<Graphic>();
        
        for (int i = 0; i < numCasillas - 3; i++) {
            for (int j = 0; j < 2; j++) {
                listaCasillas.add(new CasillaNormal(x, y));
                x -= 50;
            }
            x = 480;
            y += 50;
        }
        
        for (Graphic casilla : listaCasillas) {
            casilla.dibujar(g);
        }
    }
    
    public void aspaIzquierda(Graphics g){
        listaCasillas = new ArrayList<Graphic>();
        
        for (int i = 0; i < numCasillas - 3; i++) {
            for (int j = 0; j < 2; j++) {
                listaCasillas.add(new CasillaNormal(x, y));
                y -= 50;
            }
            y = 460;
            x -= 50;
        }
        
        for (Graphic casilla : listaCasillas) {
            casilla.dibujar(g);
        }
    }

    public void aspaDerecha(Graphics g){
        listaCasillas = new ArrayList<Graphic>();
        
        for (int i = 0; i < numCasillas - 3; i++) {
            for (int j = 0; j < 2; j++) {
                listaCasillas.add(new CasillaNormal(x, y));
                y -= 50;
            }
            y = 460;
            x += 50;
        }
        
        for (Graphic casilla : listaCasillas) {
            casilla.dibujar(g);
        }
    }
}
