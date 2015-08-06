package com.nuiofrd;

/**
 * Created by Brenden Bunker.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ScreenGenerator extends JFrame implements KeyListener {

    //Intro Components
    JLabel display, blank, blank1, blank2, blank3;
    JButton one, two, three, four, five, six, seven, eight, nine, zero, clear, plus, minus, multiply, divide, equals;

    //intro Vars
    double inputInt, currentSingleTotal, currentOverallTotal;
    int operation;
    String stringOut;
    boolean completeClear;

    public ScreenGenerator() {

        setLayout(new GridLayout(5, 4));

        //Intro Ints
        completeClear = false;
        inputInt = 0;
        currentOverallTotal = 0;
        currentSingleTotal = 0;
        operation = 0;
        stringOut = "";

        //make Actions
        OneClick oneAL = new OneClick();
        TwoClick twoAL = new TwoClick();
        ThreeClick threeAL = new ThreeClick();
        FourClick fourAL = new FourClick();
        FiveClick fiveAL = new FiveClick();
        SixClick sixAL = new SixClick();
        SevenClick sevenAL = new SevenClick();
        EightClick eightAL = new EightClick();
        NineClick nineAL = new NineClick();
        ZeroClick zeroAL = new ZeroClick();
        ClearClick clearAL = new ClearClick();
        PlusClick plusAL = new PlusClick();
        MinusClick minusAL = new MinusClick();
        MultiplyClick multiplyAL = new MultiplyClick();
        DivideClick divideAL = new DivideClick();
        EqualsClick equalsAL = new EqualsClick();

        //make buttons
        one = new JButton("1");
        one.addActionListener(oneAL);
        two = new JButton("2");
        two.addActionListener(twoAL);
        three = new JButton("3");
        three.addActionListener(threeAL);
        four = new JButton("4");
        four.addActionListener(fourAL);
        five = new JButton("5");
        five.addActionListener(fiveAL);
        six = new JButton("6");
        six.addActionListener(sixAL);
        seven = new JButton("7");
        seven.addActionListener(sevenAL);
        eight = new JButton("8");
        eight.addActionListener(eightAL);
        nine = new JButton("9");
        nine.addActionListener(nineAL);
        zero = new JButton("0");
        zero.addActionListener(zeroAL);
        clear = new JButton("C");
        clear.addActionListener(clearAL);
        multiply = new JButton("*");
        multiply.addActionListener(multiplyAL);
        divide = new JButton("/");
        divide.addActionListener(divideAL);
        plus = new JButton("+");
        plus.addActionListener(plusAL);
        minus = new JButton("-");
        minus.addActionListener(minusAL);
        equals = new JButton("=");
        equals.addActionListener(equalsAL);


        //make labels
        display = new JLabel("");
        blank = new JLabel("");
        blank1 = new JLabel("");
        blank2 = new JLabel("");
        blank3 = new JLabel("");

        //addCompnetsToDisplay
        add(blank1);
        add(blank2);
        add(display);
        add(clear);
        add(seven);
        add(eight);
        add(nine);
        add(divide);
        add(four);
        add(five);
        add(six);
        add(multiply);
        add(one);
        add(two);
        add(three);
        add(minus);
        add(zero);
        add(equals);
        add(blank);
        add(plus);


        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_0 || e.getKeyCode() == KeyEvent.VK_NUMPAD0) numberClick(0);
        else if (e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_NUMPAD1) numberClick(1);
        else if (e.getKeyCode() == KeyEvent.VK_2 || e.getKeyCode() == KeyEvent.VK_NUMPAD2) numberClick(2);
        else if (e.getKeyCode() == KeyEvent.VK_3 || e.getKeyCode() == KeyEvent.VK_NUMPAD3) numberClick(3);
        else if (e.getKeyCode() == KeyEvent.VK_4 || e.getKeyCode() == KeyEvent.VK_NUMPAD4) numberClick(4);
        else if (e.getKeyCode() == KeyEvent.VK_5 || e.getKeyCode() == KeyEvent.VK_NUMPAD5) numberClick(5);
        else if (e.getKeyCode() == KeyEvent.VK_6 || e.getKeyCode() == KeyEvent.VK_NUMPAD6) numberClick(6);
        else if (e.getKeyCode() == KeyEvent.VK_7 || e.getKeyCode() == KeyEvent.VK_NUMPAD7) numberClick(7);
        else if (e.getKeyCode() == KeyEvent.VK_8 || e.getKeyCode() == KeyEvent.VK_NUMPAD8) numberClick(8);
        else if (e.getKeyCode() == KeyEvent.VK_9 || e.getKeyCode() == KeyEvent.VK_NUMPAD9) numberClick(9);
        else if (e.getKeyCode() == KeyEvent.VK_ENTER) operationClick(0);
        else if (e.getKeyCode() == KeyEvent.VK_ADD) operationClick(1);
        else if (e.getKeyCode() == KeyEvent.VK_SUBTRACT) operationClick(2);
        else if (e.getKeyCode() == KeyEvent.VK_MULTIPLY) operationClick(3);
        else if (e.getKeyCode() == KeyEvent.VK_DIVIDE) operationClick(4);
        else if (e.getKeyCode() == KeyEvent.VK_DECIMAL) operationClear();
    }

    public class OneClick implements  ActionListener {
        public void actionPerformed(ActionEvent oneAL) {
            numberClick(1);
        }
    }
    public class TwoClick implements  ActionListener {
        public void actionPerformed(ActionEvent twoAL) {
            numberClick(2);
        }
    }
    public class ThreeClick implements  ActionListener {
        public void actionPerformed(ActionEvent oneAL) {
            numberClick(3);
        }
    }
    public class FourClick implements  ActionListener {
        public void actionPerformed(ActionEvent fourAL) {
            numberClick(4);
        }
    }
    public class FiveClick implements  ActionListener {
        public void actionPerformed(ActionEvent fiveAL) {
            numberClick(5);
        }
    }
    public class SixClick implements  ActionListener {
        public void actionPerformed(ActionEvent sixAL) {
            numberClick(6);
        }
    }
    public class SevenClick implements  ActionListener {
        public void actionPerformed(ActionEvent sevenAL) {
            numberClick(7);
        }
    }
    public class EightClick implements  ActionListener {
        public void actionPerformed(ActionEvent eightAL) {
            numberClick(8);
        }
    }
    public class NineClick implements  ActionListener {
        public void actionPerformed(ActionEvent nineAL) {
            numberClick(9);
        }
    }
    public class ZeroClick implements  ActionListener {
        public void actionPerformed(ActionEvent zeroAL) {
            numberClick(0);
        }
    }
    public class PlusClick implements ActionListener {
        public void actionPerformed(ActionEvent plusAL) {
            operationClick(1);
        }
    }
    public class MinusClick implements ActionListener {
        public void actionPerformed(ActionEvent minusAL) {
            operationClick(2);
        }
    }
    public class MultiplyClick implements ActionListener {
        public void actionPerformed(ActionEvent multiplyAL) {

            operationClick(3);

        }
    }
    public class DivideClick implements ActionListener {
        public void actionPerformed(ActionEvent divideAL) {
            operationClick(4);
        }
    }
    public class EqualsClick implements ActionListener {
        public void actionPerformed(ActionEvent EqualsAL) {
            operationClick(0);
        }
    }
    public class ClearClick implements ActionListener {
        public void actionPerformed(ActionEvent clearAL) {
            operationClear();
        }
    }


    public void operationClear(){

        if(!completeClear) {
            inputInt = 0;
            currentSingleTotal = 0;
            clear.setText("CC");
            completeClear = true;
        }else {
            inputInt = 0;
            currentOverallTotal = 0;
            currentSingleTotal = 0;
            operation = 0;
            completeClear = false;
            clear.setText("C");
        }

        stringOut = "" + currentOverallTotal;
        display.setText(stringOut);
    }

    public void operationClick(int symbolNum) {

        switch (operation) {
            case 0:
                currentOverallTotal = currentSingleTotal;
                break;
            case 1:
                currentOverallTotal = currentOverallTotal + currentSingleTotal;
                break;
            case 2:
                currentOverallTotal = currentOverallTotal - currentSingleTotal;
                break;
            case 3:
                currentOverallTotal = currentOverallTotal * currentSingleTotal;
                break;
            case 4:
                currentOverallTotal = currentOverallTotal / currentSingleTotal;
                break;

            case 5:
                break;
        }

        operation = symbolNum;

        currentSingleTotal = 0;
        inputInt = 0;

        stringOut = "" + currentOverallTotal;
        display.setText(stringOut);

        completeClear = false;
        clear.setText("C");
    }

    public void numberClick(int numClicked) {

        inputInt = numClicked;
        currentSingleTotal= (currentSingleTotal*10)+inputInt;

        String strTotal = "" + currentSingleTotal;
        display.setText(strTotal);

        completeClear = false;
        clear.setText("C");
    }
}
