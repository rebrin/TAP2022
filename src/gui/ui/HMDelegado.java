package gui.ui;

import javax.swing.*;
import java.awt.*;

public class HMDelegado {
    JFrame Ventana;
    JButton Boton;
    JTextField TfNombre;

    public HMDelegado(){
        //construir la GUI
        Ventana=new JFrame("Delegado");
        Boton=new JButton("saludar");
        TfNombre=new JTextField(25);
        //dar layout a nuestro contenedor
        Ventana.setLayout(new FlowLayout());
        //añadimos los elementos
        Ventana.add(TfNombre);
        Ventana.add(Boton);
        Boton.addActionListener(new BotonHandler(TfNombre));
        //damos tam, default close, size
        Ventana.setSize(400,200);
        //Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setVisible(true);

    }

    public static void main(String[] args) {
        new HMDelegado();
    }
}
