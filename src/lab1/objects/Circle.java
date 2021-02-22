package lab1.objects;

import java.awt.*;

import static lab1.TheGame.SCALE;

public class Circle extends Shape {

    public Circle(int x, int y) {
        super(x, y);
    }


    public void paint(Graphics g) {
        g.setColor(Color.orange);
        g.fillOval(this.posX-20, this.posY-20, 40, 40);
    }

}