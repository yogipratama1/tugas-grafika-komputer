/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintang;

/**
 *
 * @author YOGI
 */
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import static java.lang.Math.sqrt;


public class Bintang extends JPanel {

    /**
     * @param args the command line arguments
     */
    
       protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            Graphics2D gd = (Graphics2D) g;
             // gd.drawLine(x, y, x2, y2);
              gd.drawLine(150, 15,120 , 75);
              gd.drawLine(120, 75, 30, 90);
              gd.drawLine(30, 90, 90, 120);
              gd.drawLine(90, 120, 75, 180);
              gd.drawLine(75, 180, 150, 150);
              gd.drawLine(150, 150, 225, 180);
              gd.drawLine(225, 180, 210, 120);
              gd.drawLine(210, 120, 270, 90);
              gd.drawLine(270, 90, 180, 75);
              gd.drawLine(180, 75, 150, 15); 
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
          
        Bintang g = new Bintang();
            JFrame jf = new JFrame();
            jf.add(g);
            jf.setSize(300, 300);
            jf.setLocationRelativeTo(null);
            jf.setVisible(true);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
