/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablero;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author edw_v
 */
public class CasillaNormal implements Graphic {

    //Coordenadas de los ejes en donde se va a dibujar la casilla.
    private int x;
    private int y;

    /**
     * Constructor que inicializa los atributos de la clase al valor de sus
     * parámetros.
     *
     * @param x coordenada en el eje de las X en donde se va a iniciar el dibujo
     * de la casilla.
     * @param y coordenada en el eje de las Y en donde se va a iniciar el dibujo
     * de la casilla.
     */
    public CasillaNormal(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Método que dibuja una casilla en el JPanel. Utiliza Graphics2D para
     * aumentar el grosor y el color de las líneas.
     *
     * @param g instancia de tipo Graphics para poder dibujar en el JPanel.
     */
    @Override
    public void dibujar(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(1.5f));
        g2.setColor(Color.black);
        g2.drawRect(x, y, 50, 50);
    }
}
