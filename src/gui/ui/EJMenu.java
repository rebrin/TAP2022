package gui.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EJMenu {
    JFrame Ventana;
    JMenuBar barra;
    JMenu MFile;
    JMenu MEdit;
    JMenu MHelp;
    JMenuItem MINew;
    JMenuItem MISave;
    JMenuItem MILoad;
    JMenuItem MIQuick;

    public  EJMenu(){
        Ventana=new JFrame("menu");
        MINew=new JMenuItem("New");
        MISave=new JMenuItem("Save");
        MILoad=new JMenuItem("Load");
        MIQuick=new JMenuItem("Quick");
        MINew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        null,"accion");
            }
        });
        MEdit=new JMenu("Editar");
        MHelp=new JMenu("Ayuda");
        MFile=new JMenu("Archivo");
        /**-----------añadimos menu items al menu-------*/
        MFile.add(MINew);
        MFile.add(MILoad);
        MFile.add(MISave);
        MFile.add(MIQuick);
        /**---------añadimos menus a la barra-------*/
        barra=new JMenuBar();
        barra.add(MFile);
        barra.add(MEdit);
        barra.add(MHelp);
        /**----añadimos la barra al contenedor--------*/
        Ventana.setJMenuBar(barra);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setSize(400,300);
        Ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new EJMenu();
    }
}
