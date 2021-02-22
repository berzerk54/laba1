package lab1;

import lab1.objects.Rectangle;
import lab1.objects.Shape;
import lab1.objects.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TheGame extends JPanel implements ActionListener {

    public static JFrame jFrame;
    public static final int W_HEIGHT = 700;
    public static final int W_WIDTH = 700;
    public static int SPEED = 10;


    Shape point = new TPoint(W_WIDTH / 2, W_HEIGHT / 2);
    Shape line = new Line(W_WIDTH / 2, W_HEIGHT / 2);
    Shape trio = new Triangle(W_WIDTH / 2, W_HEIGHT / 2);
    Shape rect = new Rectangle(W_WIDTH / 2, W_HEIGHT / 2);
    Shape circle = new Circle(W_WIDTH / 2, W_HEIGHT / 2);
    Shape ellipse = new Ellipse(W_WIDTH / 2, W_HEIGHT / 2);

    int num;
    boolean control = false;
    public static int direction = 0;

    Timer timer = new Timer(1000 / SPEED, this);


    public TheGame() {

        timer.start();
        addKeyListener(new KeyBoard());
        setFocusable(true);

    }

    private int xCount = 0;
    private int yCount = 5;

    public void isControlled() {
        control = !control;
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, W_WIDTH, W_HEIGHT);


        switch (num) {

            case 1:
                point.paint(g);
                if (control == true)
                    point.c_move(3, 3);
                else
                    point.move((xCount++) % 10 - 5, (yCount++) % 10 - 5);

                break;
            case 2:
                line.paint(g);
                if (control == true)
                    line.c_move(3, 3);
                else
                    line.move((xCount++) % 10 - 5, (yCount++) % 10 - 5);
                break;
            case 3:
                trio.paint(g);
                if (control == true)
                    trio.c_move(3, 3);
                else
                    trio.move((xCount++) % 10 - 5, (yCount++) % 10 - 5);
                break;
            case 4:
                rect.paint(g);
                if (control == true)
                    rect.c_move(3, 3);
                else
                    rect.move((xCount++) % 10 - 5, (yCount++) % 10 - 5);

                break;
            case 5:
                circle.paint(g);
                if (control == true)
                    circle.c_move(3, 3);
                else
                    circle.move((xCount++) % 10 - 5, (yCount++) % 10 - 5);
                break;
            case 6:
                ellipse.paint(g);
                if (control == true)
                    ellipse.c_move(3, 3);
                else
                    ellipse.move((xCount++) % 10 - 5, (yCount++) % 10 - 5);
                break;
        }
        String hint = "f1-f6 - фигуры, space - переключение режимов движения, esc - выход";
        Font f = new Font("Arial", Font.BOLD, 14);
        g.setColor(Color.yellow);
        g.setFont(f);
        g.drawString(hint, 25, 650);

    }

    public static void main(String[] args) {
        jFrame = new JFrame("Lab two");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(700, 700);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.add(new TheGame());
        jFrame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        repaint();
    }

    public class KeyBoard extends KeyAdapter {
        public void keyPressed(KeyEvent event) {
            int key = event.getKeyCode();
            switch (key) {
                case KeyEvent.VK_F1:
                    num = 1;
                    break;
                case KeyEvent.VK_F2:
                    num = 2;
                    break;
                case KeyEvent.VK_F3:
                    num = 3;
                    break;
                case KeyEvent.VK_F4:
                    num = 4;
                    break;
                case KeyEvent.VK_F5:
                    num = 5;
                    break;
                case KeyEvent.VK_F6:
                    num = 6;
                    break;
            }
            if (key == KeyEvent.VK_SPACE) isControlled();
            if (key == KeyEvent.VK_UP && direction != 2 && (control == true)) direction = 0;
            if (key == KeyEvent.VK_DOWN && direction != 0 && (control == true)) direction = 2;
            if (key == KeyEvent.VK_RIGHT && direction != 3 && (control == true)) direction = 1;
            if (key == KeyEvent.VK_LEFT && direction != 1 && (control == true)) direction = 3;
            if (key == KeyEvent.VK_ESCAPE) System.exit(0);
        }
    }
}

