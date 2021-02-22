package lab1.objects;

import lab1.TheGame;

import java.awt.*;
import java.util.Random;

public class Triangle extends Shape {


    Random rand = new Random();
    float r = rand.nextFloat();
    float g = rand.nextFloat();
    float b = rand.nextFloat();
    Color randomColor = new Color(r, g, b);

    public Triangle(int x, int y) {
        super(x, y);
    }

    public void move(int dx, int dy) {
        this.posX = (this.posX++) + dx;
        this.posY = (this.posY++) + dy;
    }

    public void c_move(int dx, int dy) {
        if (TheGame.direction == 0) {
            this.posY = this.posY - dy;
            dx = 0;
        }
        if (TheGame.direction == 2) {
            this.posY = this.posY + dy;
            dx = 0;
        }
        if (TheGame.direction == 1) {
            this.posX = this.posX + dx;//right
            dy = 0;
        }
        if (TheGame.direction == 3) {
            this.posX = this.posX - dx;//left
            dy = 0;
        }
    }

    public void paint(Graphics g) {
        int x1 = this.posX - 20;
        int x2 = this.posX;
        int x3 = this.posX + 20;
        int y1 = this.posY + 20;
        int y2 = this.posY - 20;
        int y3 = this.posY + 20;
        int arrX[] = {x1, x2, x3};
        int arrY[] = {y1, y2, y3};
        g.setColor(randomColor);
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x1, y1, x3, y3);
        g.fillPolygon(arrX, arrY, 3);
    }

}