package com.company;

import java.awt.*;

public class Blackhole extends Drawing{

    public int m;
    public int x;
    public int y;
    public int c;
    public final int rs =2*6*m/c*c;
    public int width;
    public int height;

    public Blackhole (int x, int y, int m) {
        //, int width, int height
        this.x=x;
        this.y=y;
        this.m=m;

        //this.rs=(2*G*this.mass/c*c);
        //this.width=width;
        //this.height=height;
    }

    public void paintBlackhole(Graphics g) {
        int rs =2*6*m/30*30;
        g.setColor(Color.black);
        g.fillOval(x, y, rs*2, rs*2);
        System.out.println(rs);
    }
}
