import javax.swing.*;
import java.awt.*;

public class EjGridbag {
    JFrame Ventana;
    GridBagLayout GBL;
    GridBagConstraints constraints;
    JButton Boton1;
    JButton Boton2;
    JButton Boton3;
    JButton Boton4;
    JButton Boton5;

    //constructor
    public EjGridbag(){
        Ventana=new JFrame("Gridabag");
        Boton1=new JButton("boton1");
        Boton2=new JButton("boton2");
        Boton3=new JButton("boton3");
        Boton4=new JButton("boton4");
        Boton5=new JButton("boton5");
        //--------griudbag
        GBL=new GridBagLayout();
        constraints=new GridBagConstraints();
        Ventana.setLayout(GBL);
        /**-Primer boton----------------*/
        constraints.gridx=0;
        constraints.gridy=0;
        constraints.weightx=0.1;
        constraints.fill=GridBagConstraints.BOTH;
        Ventana.add(Boton1,constraints);
        /**---------------boton 2*/
        constraints=new GridBagConstraints();
        constraints.gridx=1;
        constraints.gridy=0;
        constraints.weightx=0.1;
        constraints.fill=GridBagConstraints.BOTH;
        Ventana.add(Boton2,constraints);
        /**---------boton 3------*/
        constraints=new GridBagConstraints();
        constraints.gridx=0;
        constraints.gridy=3;
        constraints.weightx=0.1;
        constraints.fill=GridBagConstraints.HORIZONTAL;
        Ventana.add(Boton3,constraints);
        /***----------boton 4------------*/
        constraints=new GridBagConstraints();
        constraints.gridx=2;
        constraints.gridy=1;
        constraints.gridheight=3;
        constraints.weighty=0.1;
        constraints.weightx=0.1;
        constraints.fill=GridBagConstraints.BOTH;
        Ventana.add(Boton4,constraints);
        /***------------boton 5-------------*/
        constraints=new GridBagConstraints();
        constraints.gridx=1;
        constraints.gridy=4;
        constraints.gridwidth=2;
        constraints.weightx=0.1;
        constraints.ipady=20;
        constraints.fill=GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(10,0,0,0);
        constraints.anchor=GridBagConstraints.SOUTH;
        Ventana.add(Boton5,constraints);

        //ventana
        Ventana.setSize(400,300);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new EjGridbag();
    }
}
