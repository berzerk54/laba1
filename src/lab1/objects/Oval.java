package lab1.objects;

import java.awt.*;

import static lab1.TheGame.SCALE;

public class Oval extends Shape {

    public Oval(int x, int y) {
        super(x, y);
    }

    public void paint(Graphics g) {
        g.setColor(Color.orange);
        g.fillOval(this.posX , this.posY , SCALE - 8, SCALE - 8);
    }
}