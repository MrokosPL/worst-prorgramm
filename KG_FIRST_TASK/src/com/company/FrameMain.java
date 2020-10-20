package com.company;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;
import javax.swing.*;

public class FrameMain extends JFrame {

    public FrameMain() {
        setSize(new Dimension(1920, 1080));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setBackground(Color.white);

        JPanel p = new JPanel() {
            @Override
            public void paintComponent(Graphics g){
                Graphics2D g2 = (Graphics2D) g;
                Shape ear1 = new Line2D.Double(370, 315, 440, 230);
                Shape ear1_2 = new QuadCurve2D.Double(440, 230, 420, 270, 440, 300 );
                Shape ear2 = new Line2D.Double(670, 315, 600, 230);
                Shape ear2_2 = new QuadCurve2D.Double(600, 230, 620, 270, 600, 300 );
                Shape torso1 = new QuadCurve2D.Double(440, 300,500 ,280 ,600,300);
                Shape torso2 = new QuadCurve2D.Double(370, 315, 320, 355,320,550);
                Shape torso3 = new QuadCurve2D.Double(670, 315, 720, 355, 720, 550);
                Shape arm = new QuadCurve2D.Double(600, 550, 500, 470, 720, 550 );
                Shape eye1 = new Ellipse2D.Double(400, 320, 90,90);
                Shape eye2 = new Ellipse2D.Double(560, 320, 90,90);
                Shape ulip = new QuadCurve2D.Double(490, 430, 525, 470, 560, 430);
                Shape dlip = new QuadCurve2D.Double(490, 430, 525, 600, 560, 430);
                Shape nose1 = new Line2D.Double(525, 420, 515, 405);
                Shape nose2 = new Line2D.Double(525, 420, 535, 405);
                Shape microh1 = new Line2D.Double(580, 510, 570, 490);
                Shape microh2 = new Line2D.Double(600, 513, 590, 480);
                Shape micro = new Ellipse2D.Double(560, 460, 30, 30);
                Shape table = new Line2D.Double(0, 550, 1920,550);



                g2.setColor(Color.black);
                g2.draw(table);
                g2.draw(ear1);
                g2.draw(ear1_2);
                g2.draw(ear2);
                g2.draw(ear2_2);
                g2.draw(torso1);
                g2.draw(torso2);
                g2.draw(torso3);
                g2.draw(ulip);
                g2.draw(dlip);
                g2.draw(nose1);
                g2.draw(nose2);
                g2.draw(arm);
                g2.draw(microh1);
                g2.draw(microh2);
                g2.draw(micro);
                g2.draw(eye1);
                g2.draw(eye2);
                g2.fillOval(630,350,10,10);
                g2.fillOval(420,350,10,10);
                g2.fill(dlip);
                g2.setColor(Color.WHITE);
                g2.fill(ulip);


            }
        };
        setTitle("Cat");
        this.getContentPane().add(p);
    }

}

