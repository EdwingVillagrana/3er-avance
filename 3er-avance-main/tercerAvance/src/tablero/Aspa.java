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
public class Aspa implements Graphic {

    private int x;
    private int y;
    private int numCasillas;
    private String tipoAspa;
    //Lista de casillas por las que se encuentra compuesta un aspa.
    private List<Graphic> listaCasillas;

    /**
     * Constructor que iguala el valor de los atributos de la clase al valor de
     * sus parámetros e inicializa la lista de casillas como un arraylist.
     *
     * @param x valor de la coordenada inicial del eje de las X por donde se
     * iniciará a dibujar toda el aspa.
     * @param y valor de la coordenada inicial del eje de las Y por donde se
     * iniciará a dibujar toda el aspa.
     * @param numCasillas cantidad de casillas que debe tener un lado del aspa.
     * @param tipoAspa variable que define el lado por donde se construirá el
     * aspa.
     */
    public Aspa(int x, int y, int numCasillas, String tipoAspa) {
        this.x = x;
        this.y = y;
        this.numCasillas = numCasillas;
        this.tipoAspa = tipoAspa;
        listaCasillas = new ArrayList<Graphic>();
    }

    /**
     * Método obligatorio que utiliza el panel para dibujar un componente.
     *
     * @param g instancia de tipo Graphics para poder dibujar en el JPanel.
     */
    public void paint(Graphics g) {
        dibujar(g);
    }

    /**
     * Método el cual define de que lado vamos a dibujar el aspa y manda a
     * llamar al método paint para pintar el aspa en el JPanel.
     *
     * @param g instancia de tipo Graphics para poder dibujar en el JPanel.
     */
    @Override
    public void dibujar(Graphics g) {
        if (tipoAspa.equals("superior")) {
            aspaSuperior(g);
        }
        if (tipoAspa.equals("inferior")) {
            aspaInferior(g);
        }
        if (tipoAspa.equals("izquierda")) {
            aspaIzquierda(g);
        }
        if (tipoAspa.equals("derecha")) {
            aspaDerecha(g);
        }
    }

    /**
     * Método que dibuja el aspa superior del tablero en el JPanel.
     *
     * @param g instancia de tipo Graphics para poder dibujar en el JPanel.
     */
    public void aspaSuperior(Graphics g) {
        listaCasillas = new ArrayList<Graphic>();

        /*Ciclo para realizar el dibujo del aspa. Como condicion se 
          tiene que i debe ser menor al número de casillas - 3 
          puesto que las últimas 3 casillas son casillas especiales.
         */
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

    /**
     * Método que dibuja el aspa inferior del tablero en el JPanel.
     *
     * @param g instancia de tipo Graphics para poder dibujar en el JPanel.
     */
    public void aspaInferior(Graphics g) {
        listaCasillas = new ArrayList<Graphic>();

        /*Ciclo para realizar el dibujo del aspa. Como condicion se 
          tiene que i debe ser menor al número de casillas - 3 
          puesto que las últimas 3 casillas son casillas especiales.
         */
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

    /**
     * Método que dibuja el aspa izquierda del tablero en el JPanel.
     *
     * @param g instancia de tipo Graphics para poder dibujar en el JPanel.
     */
    public void aspaIzquierda(Graphics g) {
        listaCasillas = new ArrayList<Graphic>();

        /*Ciclo para realizar el dibujo del aspa. Como condicion se 
          tiene que i debe ser menor al número de casillas - 3 
          puesto que las últimas 3 casillas son casillas especiales.
         */
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

    /**
     * Método que dibuja el aspa derecha del tablero en el JPanel.
     *
     * @param g instancia de tipo Graphics para poder dibujar en el JPanel.
     */
    public void aspaDerecha(Graphics g) {
        listaCasillas = new ArrayList<Graphic>();

        /*Ciclo para realizar el dibujo del aspa. Como condicion se 
          tiene que i debe ser menor al número de casillas - 3 
          puesto que las últimas 3 casillas son casillas especiales.
         */
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
