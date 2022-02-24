package gui.ui;

import javax.swing.*;
import java.awt.*;

public class GridEjemplo {
    JFrame Ventana;
    JButton [] arregloBoton;
    JLabel Resultado;
    JPanel panelBotones;



    //constructor
    public GridEjemplo(){
        //inicialización
        int botones=20;
        Ventana=new JFrame("GridLayout");
        arregloBoton=new JButton[botones];
        for(int i=0;i<botones;i++) {
            arregloBoton[i] = new JButton("boton"+(i+1));
        }
        panelBotones=new JPanel();
        //añadir elementos
        GridLayout gl=new GridLayout(4,5);
        gl.setHgap(10);
        gl.setVgap(10);
        panelBotones.setLayout(gl);
        for (int i = 0; i < arregloBoton.length; i++) {
            panelBotones.add(arregloBoton[i]);
        }
        Resultado=new JLabel("Resultado");
        Resultado.setFont(new Font("Arial", 0, 32));
        Resultado.setBorder(BorderFactory.createLineBorder(Color.RED));
        Resultado.setBackground(Color.CYAN);
        Resultado.setOpaque(true);
        Ventana.add(Resultado,BorderLayout.NORTH);
        Ventana.add(panelBotones,BorderLayout.CENTER);

        //visualizar el contenedor
        Ventana.setSize(600,450);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new GridEjemplo();
    }
}
