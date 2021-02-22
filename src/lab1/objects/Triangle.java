package lab1.objects;

import java.awt.*;
import java.util.Random;

import static lab1.TheGame.SCALE;

public class Triangle extends Shape {

    int x1=this.posX-20;
    int x2=this.posX;
    int x3=this.posX+20;
    int y1=this.posY+20;
    int y2=this.posY-20;
    int y3=this.posY+20;
    int arrX[] = {x1,x2,x3};
    int arrY[] = {y1,y2,y3};
    Random rand = new Random();
    float r = rand.nextFloat();
    float g = rand.nextFloat();
    float b = rand.nextFloat();
    Color randomColor = new Color(r, g, b);

    public Triangle(int x, int y) {
        super(x, y);
    }


    public void paint(Graphics g) {
        g.setColor(randomColor);
        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x2,y2,x3,y3);
        g.drawLine(x1,y1,x3,y3);
        g.fillPolygon(arrX,arrY,3);
    }

}