package lab1.objects;


import java.awt.*;
import java.util.Random;

import static lab1.TheGame.W_HEIGHT;
import static lab1.TheGame.W_WIDTH;


public class TPoint extends Shape {
    Random rand = new Random();
    float r = rand.nextFloat();
    float g = rand.nextFloat();
    float b = rand.nextFloat();
    Color randomColor = new Color(r, g, b);

    public TPoint(int x, int y) {
        super(x, y);
    }

    public void paint(Graphics g) {
        g.setColor(randomColor);
        g.fillOval(this.posX, this.posY, 4, 4);
    }


    public static TPoint getRandomInstance() {

        int x = (int) (Math.random() * W_WIDTH);
        int y = (int) (Math.random() * W_HEIGHT);

        return new TPoint(x, y);
    }


}
