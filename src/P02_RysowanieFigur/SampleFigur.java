package P02_RysowanieFigur;

import javax.swing.*;
import java.awt.*;

class panelSampleFigur extends JPanel {
    public void paintComponent(Graphics g) {
      Graphics2D g2 = (Graphics2D) g;

      g2.drawLine(20,50,100,400);

      g2.setColor(Color.yellow);
      g2.drawOval(30,20,90,150);

      g2.setColor(new Color(100,210,48));
      g2.fillOval(100,200,90,150);

      g2.fillOval(200,100,45,45);

      g2.setColor(Color.red);
      g2.drawRect(300,200,100,40);

      int[] x = {100,150,120};
      int[] y = {200,300,200};
     // g2.drawPolygon(x,y,3);
      g2.fillPolygon(x,y,3);


    }
}

public class SampleFigur extends JFrame {
    private panelSampleFigur rysowanie = new panelSampleFigur();

    public SampleFigur() {
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(rysowanie);
        this.setVisible(true);
    }

    public static void main(String[] args) {

        new SampleFigur();
    }
}
