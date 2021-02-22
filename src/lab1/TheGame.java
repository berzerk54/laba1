package lab1;

//import com.sibsutis.oop.Objects.Apple;
import lab1.objects.Shape;
import lab1.objects.Oval;
import lab1.objects.Snake;
import lab1.objects.TPoint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TheGame extends JPanel implements ActionListener {
    public static JFrame jFrame;
    public static final int SCALE = 32;
    public static final int WIDTH = 20;
    public static final int HEIGHT = 20;
    public static final int SHIFT = 10;
    public static final int W_HEIGHT = 700;
    public static final int W_WIDTH = 700;
    public static int SPEED = 10;
    public boolean numbered = false;


    Snake s = new Snake(5, 6, 5, 5);
    Shape oval = new Oval(100,100);
    Shape fruit = null;
    Shape[] fruits = new TPoint[100];
    Timer timer = new Timer(1000 / SPEED, this);



    public TheGame() {
        for (int i = 0; i < fruits.length; i++) {
            fruit = TPoint.getRandomInstance();
            fruits[i] =  fruit;

        }
        timer.start();
        addKeyListener(new KeyBoard());
        setFocusable(true);

    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, W_WIDTH, W_HEIGHT);


        /*  for (int x = 0; x < WIDTH * SCALE + SHIFT; x += SCALE) {
            g.setColor(Color.darkGray);
            g.drawLine(x + SHIFT, 0 + SHIFT, x + SHIFT, (WIDTH * SCALE) + SHIFT);
        }
        for (int y = 0; y < WIDTH * SCALE + SHIFT; y += SCALE) {
            g.setColor(Color.darkGray);
            g.drawLine(0 + SHIFT, y + SHIFT, (HEIGHT * SCALE) + SHIFT, y + SHIFT);
        }*/

        Font f = new Font("Arial", Font.BOLD, 14);
        g.setColor(Color.yellow);
        g.setFont(f);

        for (int i = 0; i < fruits.length; i++) {

            fruits[i].paint(g);
            System.out.println(fruits[i]);
        }

        oval.paint(g);



        for (int l = 1; l < s.length; l++) {
            g.setColor(Color.black);
            g.fillRect((s.snakeX[l] * SCALE + 2) + SHIFT, (s.snakeY[l] * SCALE + 2) + SHIFT, SCALE - 4, SCALE - 4);
            if (numbered==true) {
                g.setColor(Color.white);
                g.drawString(String.valueOf((int) (Math.random() * 9)), (s.snakeX[l] * SCALE + 2) + SHIFT + 8, (s.snakeY[l] * SCALE + 2) + SHIFT + 20);
            }
            g.setColor(Color.white);
            g.fillRect((s.snakeX[0] * SCALE + 2) + SHIFT, (s.snakeY[0] * SCALE + 2) + SHIFT, SCALE - 4, SCALE - 4);
        }





    }

    public static void main(String[] args) {
        jFrame = new JFrame("The Snake Game-9000");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(700, 700);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.add(new TheGame());
        jFrame.setVisible(true);
    }





    @Override
    public void actionPerformed(ActionEvent e) {
        s.move();

       /* if (fruit.isCollision(s.snakeX[0], s.snakeY[0])) {

            score++;
            fruit = Fruit.getRandomInstance();
            s.length++;
        }*/

        /*for (int l = 1; l < s.length; l++) {
            if (fruit.isCollision(s.snakeX[l], s.snakeY[l])) {
                fruit = Fruit.getRandomInstance();
            }
            if ((s.snakeX[0] == s.snakeX[l]) && (s.snakeY[0] == s.snakeY[l])) {
                timer.stop();
                //gameOver();
            }
        }
*/
        //if (s.length == 399) fatSnake();

        repaint();
    }

    public class KeyBoard extends KeyAdapter {
        public void keyPressed(KeyEvent event) {
            int key = event.getKeyCode();
            if (key == KeyEvent.VK_UP && s.direction != 2) s.direction = 0;
            if (key == KeyEvent.VK_DOWN && s.direction != 0) s.direction = 2;
            if (key == KeyEvent.VK_RIGHT && s.direction != 3) s.direction = 1;
            if (key == KeyEvent.VK_LEFT && s.direction != 1) s.direction = 3;
            if (key == KeyEvent.VK_ESCAPE) System.exit(0);
        }
    }
}



