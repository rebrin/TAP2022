package gui.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ChiquiWord {
    JMenu Marchivo;
    JMenuBar barra;
    JMenuItem MIguarda;
    JMenuItem MIabrir;
    JMenuItem MISalir;
    JFrame Ventana;
    JTextArea AreaTexto;
    //objetos para almacenar y abrir
    Formatter form;
    Scanner s;
    String ruta="D:\\archivosTAP";
    String nomArch="res.txt";


    public ChiquiWord(){
        //construccion
        Ventana=new JFrame("ChiquiWord");
        AreaTexto=new JTextArea();
        barra=new JMenuBar();
        Marchivo=new JMenu("Archivo");
        MIabrir= new JMenuItem("Abrir");
        MIguarda= new JMenuItem("Guardar");
        MISalir= new JMenuItem("Salir");
        //construcción de interfaz
        Marchivo.add(MIabrir);
        Marchivo.add(MIguarda);
        Marchivo.add(MISalir);
        barra.add(Marchivo);
        Ventana.setJMenuBar(barra);
        Ventana.add(AreaTexto, BorderLayout.CENTER);
        //eventos de interfaz

        /**---------------------guardar----------*/
        MIguarda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    form=new Formatter(new File(ruta+"\\"+nomArch));
                    String textoGuardar=AreaTexto.getText();
                    form.format(textoGuardar);
                    form.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });

        MIabrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    s=new Scanner(new File(ruta+"\\"+nomArch));
                    String cad="";
                    while(s.hasNext()){
                         cad+=s.nextLine()+"\n";
                    }
                    AreaTexto.setText(cad);
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });

        Ventana.setSize(600,800);
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ChiquiWord();
    }
}
