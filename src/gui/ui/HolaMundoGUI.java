package gui.ui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HolaMundoGUI {
    JFrame ventana;
    JButton boton;

    public HolaMundoGUI(){
        ventana=new JFrame("Hola mundo");
        boton=new JButton("da click");
        //layout el acomodo
        ventana.setLayout(new FlowLayout());
        //añado los componentes (boton)
        ventana.add(boton);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hola mundo!!!");
                JOptionPane.showMessageDialog(null,"Hola mundo");
            }
        });
        //hacer visible la ventana
        ventana.setSize(400,400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new HolaMundoGUI();
    }

}
