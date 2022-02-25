package gui.ui;

import javax.swing.*;
import java.awt.*;

public class LogginGridbag {

    JFrame Ventana;
    JLabel img;
    JLabel usuario;
    JLabel password;
    JTextField TFUsuario;
    JPasswordField TFPass;
    JButton boton;
    GridBagLayout gbl;
    GridBagConstraints constraints;
    /***----*/

    public LogginGridbag(){
        Ventana=new JFrame("Loggin");

        img=new JLabel();
        img.setIcon(new ImageIcon(getClass()
                .getResource("login.png")));
        usuario=new JLabel("Usuario:");
        password=new JLabel("Password:");
        TFUsuario=new JTextField(20);
        TFPass=new JPasswordField(20);
        boton=new JButton("loggin");
        /**-------construir nuestro gridbag*/
        gbl=new GridBagLayout();
        Ventana.setLayout(gbl);
        constraints=new GridBagConstraints();
        /**------image icon------------*/
        constraints.gridx=0;
        constraints.gridy=0;
        constraints.gridwidth=2;
//        constraints.weightx=0.1;
//        constraints.weighty=0.1;
        constraints.fill=GridBagConstraints.NONE;
        Ventana.add(img,constraints);
        /**------usuario------------*/
        constraints=new GridBagConstraints();//limpiar
        constraints.gridx=0;
        constraints.gridy=1;
        Ventana.add(usuario,constraints);
        /**------TF usuario------------*/
        constraints=new GridBagConstraints();//limpiar
        constraints.gridx=1;
        constraints.gridy=1;
        Ventana.add(TFUsuario,constraints);
        /**------password---------*/
        constraints=new GridBagConstraints();//limpiar
        constraints.gridx=0;
        constraints.gridy=2;
        Ventana.add(password,constraints);
        /**------TF Pass------------*/
        constraints=new GridBagConstraints();//limpiar
        constraints.gridx=1;
        constraints.gridy=2;
        Ventana.add(TFPass,constraints);
        /**------TF boton------------*/
        constraints=new GridBagConstraints();//limpiar
        constraints.gridx=1;
        constraints.gridy=3;
        constraints.anchor=GridBagConstraints.LINE_END;
        Ventana.add(boton,constraints);

        /**-----inicialización -----*/
        Ventana.setSize(500,500);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setVisible(true);
    }


    public static void main(String[] args) {
        new LogginGridbag();
    }
}
