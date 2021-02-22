package lab1.objects;

import java.awt.*;
import java.util.Random;

public class Rectangle extends Shape {


    Random rand = new Random();
    float r = rand.nextFloat();
    float g = rand.nextFloat();
    float b = rand.nextFloat();
    Color randomColor = new Color(r, g, b);

    public Rectangle(int x, int y) {
        super(x, y);
    }


    public void paint(Graphics g) {
        int x1 = this.posX - 20;
        int x2 = this.posX + 20;

        int y1 = this.posY - 20;
        int y2 = this.posY + 20;
        g.setColor(randomColor);
        g.drawRect(x1, y1, 40, 40);
        g.fillRect(x1, y1, 40, 40);
    }

}