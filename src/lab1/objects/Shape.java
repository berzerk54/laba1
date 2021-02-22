package lab1.objects;

import java.awt.*;

import static lab1.TheGame.W_HEIGHT;
import static lab1.TheGame.W_WIDTH;

public abstract class Shape {
    protected int posX;
    protected int posY;

    public Shape(int x, int y) {

        this.posX = x;
        this.posY = y;
    }


    public abstract void paint(Graphics g);


    public void move(int dx, int dy) {
        this.posX = (this.posX + dx + W_WIDTH) % W_WIDTH;
        this.posY = (this.posY + dy + W_HEIGHT) % W_HEIGHT;
    }

}
