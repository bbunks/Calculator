package com.nuiofrd;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        ScreenGenerator gui = new ScreenGenerator();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        int h = (int) height/2;
        int w = (int) width/4;

        gui.setSize(w,h);
        gui.setTitle("Calculator");
    }
}
