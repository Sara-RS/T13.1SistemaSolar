package Ventanas;

import Componentes.Componente1;
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class Ventana1 extends JFrame{
    
    public Ventana1() throws HeadlessException {
        setSize(560,400);
        setTitle("El Sistema Solar");
        setLocation(200,100);
        setResizable(false);
        Componente1 c= new Componente1();
        add(c);
    }
}
