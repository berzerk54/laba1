package lab1.objects;

import lab1.TheGame;

import java.awt.*;

public abstract class Shape {
    protected int posX;
    protected int posY;

    public Shape(int x, int y) {

        this.posX = x;
        this.posY = y;
    }


    public abstract void paint(Graphics g);


    public void c_move(int dx, int dy) {
        if (TheGame.direction == 0) {
            this.posY = this.posY - dy;

        }
        if (TheGame.direction == 2) {
            this.posY = this.posY + dy;

        }
        if (TheGame.direction == 1) {
            this.posX = this.posX + dx;//right

        }
        if (TheGame.direction == 3) {
            this.posX = this.posX - dx;//left

        }
    }


    public void move(int dx, int dy) {
        this.posX = this.posX + dx;
        this.posY = this.posY + dy;
    }
}