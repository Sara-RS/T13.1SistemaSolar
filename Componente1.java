package Componentes;

import java.awt.Graphics;
import javax.swing.JComponent;
public class Componente1 extends JComponent{
    @Override
    public void paintComponent(Graphics g){
        g.drawString("¡Este es el Sistema Solar!",320, 80);
        //sol
        g.drawOval(100, 220, 49, 49);
        
        g.drawOval(60, 180, 130, 130);
        g.drawOval(20, 140, 210, 210);
        g.drawOval(-20, 100, 290, 290);
        g.drawOval(-60, 60, 370, 370);
        g.drawOval(-100, 20, 450, 450);
        g.drawOval(-140, -20, 530, 530);
        g.drawOval(-180, -60, 610, 610);
        g.drawOval(-220, -100, 690, 690);
        g.drawOval(-260, -140,770, 770);
        //planetas
        g.drawOval(184, 238, 12, 12);
        g.drawOval(222, 236, 16, 16);
        g.drawOval(260, 234, 20, 20);
        g.drawOval(300, 234, 20, 20);
        g.drawOval(334, 228, 31, 31);
        g.drawOval(377, 231, 26, 26);
        g.drawOval(420, 234, 20, 20);
        g.drawOval(462, 236, 16, 16);
        g.drawOval(504, 238, 11, 11);
        //anillos de saturno
        g.drawOval(371, 240, 40, 6);
        g.drawOval(369, 238, 44, 10);
        
    }
}
