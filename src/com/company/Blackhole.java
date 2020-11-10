package com.company;

import java.awt.*;

public class Blackhole extends Canvas{
    public int x;
    public int y;
    public int width;
    public int height;

    public Blackhole (int x, int y, int width, int height) {
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }

    public void paintBlackhole(Graphics g) {
        g.setColor(Color.black);
        g.fillOval(x, y, width, height);
    }
}
