package lab1;

import lab1.objects.*;
import lab1.objects.Rectangle;
import lab1.objects.Shape;

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
    public static final int W_HEIGHT = 700;
    public static final int W_WIDTH = 700;
    public static int SPEED = 10;


   // Snake s = new Snake(5, 6, 5, 5);
    Shape point = new TPoint(100,300);
    Shape line = new Line(200, 300);
    Shape trio = new Triangle(300,300);
    Shape rect = new Rectangle(400,300);
    Shape circle = new Circle(500, 300);
    Shape ellipse = new Ellipse(600, 300);
    int num;

    //Shape[] points = new TPoint[100];
    Timer timer = new Timer(1000 / SPEED, this);


    public TheGame() {
        /*for (int i = 0; i < points.length; i++) {
            points[i] = TPoint.getRandomInstance();
        }*/
        timer.start();
        addKeyListener(new KeyBoard());
        setFocusable(true);

    }

    private int xCount = 0;
    private int yCount = 5;

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, W_WIDTH, W_HEIGHT);


      /*  for (int i = 0; i < points.length; i++) {

            points[i].paint(g);
            System.out.println(points[i]);
        }*/

      //  circle.move((xCount++) % 10 - 5, (yCount++) % 10 - 5);

        switch (num) {

            case 1:   point.paint(g);
                point.move((xCount++) % 10 - 5, (yCount++) % 10 - 5);
            break;
            case 2:   circle.paint(g);
                circle.move((xCount++) % 10 - 5, (yCount++) % 10 - 5);

                break;
            case 3:   trio.paint(g);
                trio.move((xCount++) % 10 - 5, (yCount++) % 10 - 5);

                break;
            case 4:   line.paint(g);
                line.move((xCount++) % 10 - 5, (yCount++) % 10 - 5);
            break;
            case 5:   rect.paint(g);
                rect.move((xCount++) % 10 - 5, (yCount++) % 10 - 5);
            break;
            case 6:   ellipse.paint(g);
                ellipse.move((xCount++) % 10 - 5, (yCount++) % 10 - 5);
            break;
        }
     /*   for (int l = 1; l < s.length; l++) {
            g.setColor(Color.black);
            g.fillRect((s.snakeX[l] * SCALE + 2) + SHIFT, (s.snakeY[l] * SCALE + 2) + SHIFT, SCALE - 4, SCALE - 4);

            g.setColor(Color.white);
            g.fillRect((s.snakeX[0] * SCALE + 2) + SHIFT, (s.snakeY[0] * SCALE + 2) + SHIFT, SCALE - 4, SCALE - 4);
        }*/

    }

    public static void main(String[] args) {
        jFrame = new JFrame("Lab one");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(700, 700);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.add(new TheGame());
        jFrame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //s.move();

        repaint();
    }

    public class KeyBoard extends KeyAdapter {
        public void keyPressed(KeyEvent event) {
            int key = event.getKeyCode();
            switch (key){
                case KeyEvent.VK_1: num=1;
                    break;
                case KeyEvent.VK_2: num=2;
                    break;
                case KeyEvent.VK_3: num=3;
                    break;
                case KeyEvent.VK_4: num=4;
                    break;
                case KeyEvent.VK_5: num=5;
                    break;
                case KeyEvent.VK_6: num=6;
                    break;
            }
      /*      if (key == KeyEvent.VK_UP && s.direction != 2) s.direction = 0;
            if (key == KeyEvent.VK_DOWN && s.direction != 0) s.direction = 2;
            if (key == KeyEvent.VK_RIGHT && s.direction != 3) s.direction = 1;
            if (key == KeyEvent.VK_LEFT && s.direction != 1) s.direction = 3;
        */    if (key == KeyEvent.VK_ESCAPE) System.exit(0);
        }
    }
}

