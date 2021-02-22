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


//    public static Shape getRandomInstance() {
//        int x = (int) (Math.random() * 700);
//        int y = (int) (Math.random() * 700);
//
//        return new TPoint(x, y);
//
//       /* if ((TheGame.score % 5 == 0) && TheGame.score != 0) return new Orange(x, y);
//        else return new Apple(x, y);*/
//    }


    public abstract void paint(Graphics g);

//    public boolean isCollision(int x, int y) {
//        return (this.posX == x && this.posY == y);
//    }

    public void move(int dx, int dy) {
        this.posX = (this.posX + dx + W_WIDTH) % W_WIDTH;
        this.posY = (this.posY + dy + W_HEIGHT) % W_HEIGHT;
    }

}
