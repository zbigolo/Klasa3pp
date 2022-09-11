package P03_ObiektyRamki;

import javax.swing.*;
import java.awt.*;


public class Sample_01_JLabel {

    public JPanel myContentPane () {
        JPanel myPanel = new JPanel(null);

        return myPanel;
    }

    public Sample_01_JLabel() {
        JFrame myWindow = new JFrame("Moje pierwsze okno");
        myWindow.setContentPane(myContentPane());
        myWindow.setSize(800, 600);
        myWindow.setLayout(null);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main (String[] args) {
         new Sample_01_JLabel();

    }
}
