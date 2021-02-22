package lab1.objects;

import lab1.TheGame;

import java.awt.*;
import java.util.Random;

import static lab1.TheGame.W_HEIGHT;
import static lab1.TheGame.W_WIDTH;

public class Rectangle extends Shape {


    Random rand = new Random();
    float r = rand.nextFloat();
    float g = rand.nextFloat();
    float b = rand.nextFloat();
    Color randomColor = new Color(r, g, b);

    public Rectangle(int x, int y) {
        super(x, y);
    }

    public void move(int dx, int dy) {
        this.posX = (this.posX + dx + W_WIDTH) % W_WIDTH;
        this.posY = (this.posY + dy + W_HEIGHT) % W_HEIGHT;
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
        int x2 = this.posX + 20;

        int y1 = this.posY - 20;
        int y2 = this.posY + 20;
        g.setColor(randomColor);
        g.drawRect(x1, y1, 40, 40);
        g.fillRect(x1, y1, 40, 40);
    }

}