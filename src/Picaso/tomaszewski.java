package Picaso;

import javax.swing.*;
import java.awt.*;

class rysowanie extends JPanel {
    public void paintComponent(Graphics g) {
        Graphics2D rys = (Graphics2D) g;

        rys.drawLine(190,20,246,88); //1
        rys.drawLine(164, 38, 204, 81); //2
        rys.drawLine(204, 81, 194, 97); //3
        rys.drawLine(194, 97, 188, 100); //3.1
        rys.drawLine(188, 100, 178, 118); //4
        rys.drawLine(192, 118, 133, 118); //5
        rys.drawLine(155, 118, 171, 91); //6
        rys.drawLine(171, 91, 161, 67); //7
        rys.drawLine(161, 67, 160, 55); //8
        rys.drawLine(160, 55, 166, 45); //8.1
        rys.drawLine(133, 118, 173, 233); //9
        rys.drawLine(173, 233, 232, 226); //10
        rys.drawLine(187, 230, 204, 81); //11
        rys.drawLine(160, 198, 150, 204); //12
        rys.drawLine(150, 204, 172, 312); //13
        rys.drawLine(172, 316, 162, 305); //14
        rys.drawLine(149, 315, 162, 305); //15
        rys.drawLine(149, 315, 160, 327); //16
        rys.drawLine(160, 327, 172, 316); //17
        rys.drawLine(172, 316, 197, 305); //18
        rys.drawLine(197, 305, 216, 306); //19
        rys.drawLine(216, 306, 246, 316); //20
        rys.drawLine(266, 340, 246, 316); //21
        rys.drawLine(266, 340, 271, 352); //22
        rys.drawLine(244, 95, 224, 227); //23
        rys.drawLine(271, 352, 290, 347); //24
        rys.drawLine(264, 230, 290, 347); //25
        rys.drawLine(179, 246, 264, 230); //26
        rys.drawLine(232, 237, 232, 226); //27
        rys.drawLine(199, 123, 212, 140); //28
        rys.drawLine(212, 140, 226, 139); //29
        rys.drawLine(226, 139, 234, 133); //30
        rys.drawLine(236, 140, 252, 156); //31
        rys.drawLine(252, 156, 272, 149); //32
        rys.drawLine(252, 156, 245, 172); //33
        rys.drawLine(245, 172, 252, 188); //34
        rys.drawLine(252, 188, 246, 214); //35
        rys.drawLine(246, 214, 234, 226); //36
        rys.drawLine(146, 453, 72, 393); //37
        rys.drawLine(274, 149, 286, 183); //38
        rys.drawLine(286, 183, 265, 191); //39
        rys.drawLine(265, 191, 303, 312); //40
        rys.drawLine(303, 312, 287, 325); //41
        rys.drawLine(261, 332, 123, 357); //42
        rys.drawLine(174, 347, 183, 388); //43
        rys.drawLine(183, 388, 260, 373); //44
        rys.drawLine(253, 350, 260, 373); //45
        rys.drawLine(266, 340, 226, 368); //46
        rys.drawLine(226, 368, 205, 342); //47
        rys.drawLine(123, 357, 110, 263); //48
        rys.drawLine(110, 263, 161, 251); //49
        rys.drawLine(194, 387, 163, 482); //50
        rys.drawLine(163, 482, 201, 577); //51
        rys.drawLine(201, 577, 191, 587); //52
        rys.drawLine(191, 587, 194, 591); //53
        rys.drawLine(194, 591, 222, 567); //54
        rys.drawLine(222, 567, 188, 483); //55
        rys.drawLine(188, 483, 224, 380); //56
        rys.drawLine(203, 439, 263, 430); //57
        rys.drawLine(263, 430, 269, 552); //58
        rys.drawLine(269, 552, 315, 547); //59
        rys.drawLine(315, 547, 316, 539); //60
        rys.drawLine(297, 540, 290, 395); //61
        rys.drawLine(290, 395, 224, 406); //62
        rys.drawLine(145, 151, 112, 133); //63
        rys.drawLine(112, 133, 63, 241); //64
        rys.drawLine(63, 241, 101, 267); //65
        rys.drawLine(89, 258, 70, 260); //66
        rys.drawLine(70, 260, 70, 323); //67
        rys.drawLine(70, 323, 89, 333); //68
        rys.drawLine(113, 231, 63, 421); //69
        rys.drawLine(24, 421, 94, 420); //70
        rys.drawLine(316, 539, 297, 540); //71
        rys.drawLine(146, 453, 134, 490); //72
        rys.drawLine(134, 490, 144, 534); //73
        rys.drawLine(144, 534, 140, 555); //74
        rys.drawLine(140, 555, 145, 571); //75
        rys.drawLine(39, 416, 56, 293); //76
        rys.drawLine(56, 293, 57, 207); //77
        rys.drawLine(57, 207, 80, 177); //78
        rys.drawLine(91, 176, 80, 177); //79
        rys.drawLine(67, 225, 76, 198); //80
    }
}

public class tomaszewski extends JFrame {
    private rysowanie rysunek = new rysowanie();

    public tomaszewski() {
        this.setSize(400, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(rysunek);
        this.setVisible(true);
    }

    public static void main(String[] args) {

        new tomaszewski();
    }
}


