package P02_RysowanieFigur;

import javax.swing.*;
import java.awt.*;

class panelSampleFigur extends JPanel{
    public void paintComponent(Graphics g) {

    }
}

public class SampleFigur extends JFrame {
    private panelSampleFigur rysowanie = new panelSampleFigur();

    public SampleFigur() {
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(rysowanie);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new SampleFigur();
    }
}
