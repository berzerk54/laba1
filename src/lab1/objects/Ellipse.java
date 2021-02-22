package lab1.objects;

import java.awt.*;

import static lab1.TheGame.SCALE;

public class Ellipse extends Shape {

    public Ellipse(int x, int y) {
        super(x, y);
    }


    public void paint(Graphics g) {
        g.setColor(Color.orange);
        g.fillOval(this.posX, this.posY-15, 45, 25);
    }

}