

import javax.swing.*;
import java.awt.*;

class picasso extends JPanel {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;


        g2.setColor(new Color(247,246,238));
        g2.fillRect(45,0,700,600);

        int[] x15 = {100,120,500,535};
        int[] y15 = {600,0,0,600};
        g2.setColor(new Color(58,31,26));
        g2.fillPolygon(x15,y15,4);

        int[] x = {360,390,420};
        int[] y = {560,390,560};
       g2.setColor(new Color(86,96,118));
        g2.fillPolygon(x,y,3);

       int[] x1 = {360,310,330,380};
       int[] y1 = {560,560,450,450};
       g2.setColor(new Color(37,22,16));
       g2.fillPolygon(x1,y1,4);

       int[] x2 = {250,310,330};
       int[] y2 = {420,560,450};
       g2.setColor(new Color(5,3,3));
       g2.fillPolygon(x2,y2,3);

       int[] x3 = {251,380,390};
       int[] y3 = {422,450,390};
       g2.setColor(new Color(25,45,100));
       g2.fillPolygon(x3,y3,3);



       int[] x4 = {395,430,419};
       int[] y4 = {430,430,550};
       g2.setColor(new Color(155,97,35));
       g2.fillPolygon(x4,y4,3);

       int[] x5 = {490,490,390,395};
       int[] y5 = {430,345,390,430};
       g2.setColor(new Color(111,75,60));
       g2.fillPolygon(x5,y5,4);

       int[] x6 = {420,427,490,490,520,500};
       int[] y6 = {560,430,430,360,360,560};
       g2.setColor(new Color(21,21,23));
       g2.fillPolygon(x6,y6,6);

       int[] x7 = {310,300,365,365,320,350,390,390};
       int[] y7 = {408,250,225,245,265,370,370,389};
       g2.setColor(new Color(27,14,9));
       g2.fillPolygon(x7,y7,8);

       int[] x8 = {305,250,310};
       int[] y8 = {320,315,410};
       g2.setColor(new Color(118,75,32));
       g2.fillPolygon(x8,y8,3);



       int[] x9 = {350,320,370,385,390};
       int[] y9 = {370,266,243,350,370};
       g2.setColor(new Color(98,107,122));
       g2.fillPolygon(x9,y9,5);



       int[] x10 = {390,400,440,490};
       int[] y10 = {370,220,220,345};
       g2.setColor(new Color(182,140,77));
       g2.fillPolygon(x10,y10,4);





       int[] x11 = {250,210,330,365,300,305};
       int[] y11 = {315,230,180,225,250,320};
       g2.setColor(new Color(0,1,0));
       g2.fillPolygon(x11,y11,6);


       int[] x12 = {390,390,485};
       int[] y12 = {370,390,347};
       g2.setColor(new Color(19,19,19));
       g2.fillPolygon(x12,y12,3);


       int[] x13 = {400,390,360};
       int[] y13 = {180,350,180};
       g2.setColor(new Color(37,39,40));
       g2.fillPolygon(x13,y13,3);

        g2.setColor(new Color(154,145,129));
        g2.fillOval(355,230,80,130);
        g2.setColor(new Color(186,156,89));
        g2.fillOval(380,280,25,25);

       int[] x14 = {360,330,370,395};
       int[] y14 = {250,180,180,250};
       g2.setColor(new Color(170,148,99));
       g2.fillPolygon(x14,y14,4);


       int[] x16 = {535,500,600,600};
       int[] y16 = {600,0,0,600};
       g2.setColor(new Color(148,140,120));
       g2.fillPolygon(x16,y16,4);
       g2.setColor(Color.BLACK);
       g2.drawLine(600,0,600,600);

       int[] x17 = {60,80,120,100};
       int[] y17 = {600,0,0,600};
       g2.setColor(new Color(82,76,58));
       g2.fillPolygon(x17,y17,4);
       g2.setColor(Color.BLACK);
       g2.drawLine(80,0,60,600);

       g2.setColor(new Color(189,168,141));
       g2.drawLine(335,190,370,185);
       g2.setColor(new Color(120,92,68));
       g2.drawLine(335,192,370,187);
       g2.setColor(new Color(189,168,141));
       g2.drawLine(345,210,379,205);
       g2.setColor(new Color(120,92,68));
       g2.drawLine(345,213,379,207);
       g2.setColor(new Color(189,168,141));
       g2.drawLine(353,230,386,226);
       g2.setColor(new Color(120,92,68));
       g2.drawLine(353,232,388,229);
       g2.setColor(new Color(120,92,68));
       g2.drawLine(358,247,392,245);








    }
}

class rysunek1 extends JFrame {
    private picasso rysowanie = new picasso();

    public rysunek1() {
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(rysowanie);
        this.setVisible(true);
    }

    public static void main(String[] args) {

        new rysunek1();

    }
}
