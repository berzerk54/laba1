package lab1.objects;

import lab1.TheGame;

import java.awt.*;
import java.util.Random;

import static lab1.TheGame.*;

public class TPoint extends Shape {
    Random rand = new Random();
    float r = rand.nextFloat();
    float g = rand.nextFloat();
    float b = rand.nextFloat();
    Color randomColor = new Color(r,g,b);
    public TPoint(int x, int y) {
        super(x, y);
    }

    public void paint(Graphics g) {
        g.setColor(randomColor);
        g.fillOval(this.posX , this.posY , 4, 4);
    }
}
