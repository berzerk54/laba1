package lab1.objects;

import java.awt.*;

public abstract class Shape {
    protected int posX;
    protected int posY;

    public Shape(int x, int y) {

        this.posX = x;
        this.posY = y;
    }


    public abstract void paint(Graphics g);


    public abstract void move(int dx, int dy);

    public abstract void c_move(int dx, int dy);

}

/*public void move(int dx,int dy){
  public void move(int dx, int dy) {
        this.posX = (this.posX + dx + W_WIDTH) % W_WIDTH;
        this.posY = (this.posY + dy + W_HEIGHT) % W_HEIGHT;
    }
 */