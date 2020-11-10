package com.company;

import com.company.Blackhole;

import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Drawing extends Canvas {

    public int c = 30;
    public int G = 6;

    Blackhole m87 = new Blackhole(100,100, 40, 40);


    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Drawing();
        canvas.setSize(700, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        m87.paintBlackhole(g);
        //g.fillOval(200, 200, 40, 40);
    }
}
