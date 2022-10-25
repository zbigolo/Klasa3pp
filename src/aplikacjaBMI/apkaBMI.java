package aplikacjaBMI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class apkaBMI {

    JLabel dane,lwzrost, lwaga, data;
    JTextArea wynikbmi;
    JTextField txwzrost, txwaga;
    JButton obliczbmi;


    public JPanel createContentPane () {
        JPanel myPanel = new JPanel();

        myPanel.setBackground(new Color(255,153,51));

        dane = new JLabel("Zbigniew Gołębiewski");
        dane.setBounds(75,20,150,25);
        dane.setHorizontalAlignment(SwingConstants.CENTER);
        dane.setOpaque(true);
        dane.setBackground(new Color(153,255,153));
        dane.setVisible(true);

        lwaga = new JLabel("waga (w kg): ");
        lwaga.setBounds(10,70,100,25);
        lwaga.setVisible(true);

        txwaga = new JTextField();
        txwaga.setBounds(110,70,150,25);
        txwaga.setVisible(true);

        lwzrost = new JLabel("wzrost (w cm): ");
        lwzrost.setBounds(10,120,100,25);
        lwzrost.setVisible(true);

        txwzrost = new JTextField();
        txwzrost.setBounds(110,120,150,25);
        txwzrost.setVisible(true);

        data = new JLabel("Grójec, 03.10.2022");
        data.setBounds(75,500,150,25);
        data.setFont(new Font("Arial",Font.BOLD,14));
        data.setVisible(true);

        obliczbmi = new JButton("Oblicz BMI");
        obliczbmi.setBounds(100,180,100,25);
        obliczbmi.setFont(new Font("Times New ROman",Font.BOLD,12));
        obliczbmi.setBackground(Color.black);
        obliczbmi.setForeground(Color.white);
        obliczbmi.setVisible(true);

        wynikbmi = new JTextArea("\t     Wynik");
        wynikbmi.setBounds(30,220,240,60);
        wynikbmi.setVisible(true);

        obliczbmi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                String tmp = wynikbmi.getText();
                wynikbmi.setText("");

                int waga = Integer.parseInt(txwaga.getText());
                int wzrost = Integer.parseInt(txwzrost.getText());

                obliczBMI myBMI = new obliczBMI(waga,wzrost);
                String wynik = myBMI.calculateBMI(waga,wzrost);

                tmp = (tmp + "\n \n   " + wynik);
                wynikbmi.setText(tmp);
            }
        });

        myPanel.add(dane); myPanel.add(lwaga); myPanel.add(lwzrost);
        myPanel.add(txwaga); myPanel.add(txwzrost);
        myPanel.add(obliczbmi); myPanel.add(wynikbmi);
        myPanel.add(data);
        return myPanel;
    }

    public apkaBMI () {
        JFrame myWindow = new JFrame("Aplikacja BMI");
        myWindow.setContentPane(createContentPane());
        myWindow.setSize(300, 600);
        myWindow.setLayout(null);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main (String[] args) {
        new apkaBMI();
    }
}
