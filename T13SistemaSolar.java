
package com.mycompany.t13sistemasolar;

import Ventanas.Ventana1;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class T13SistemaSolar {

    public static void main(String[] args) {
        EventQueue.invokeLater(() ->{
                Ventana1 v= new Ventana1();
                v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                v.setVisible(true);
            });
    }
}
