package project;

import javax.swing.*;
import java.awt.*;

public class Jpanel extends JPanel {
    private int moveRange = 10;
    //private final Rectangle target = new Rectangle(200, 150, 60, 30);
    public final Rectangle mover = new Rectangle(200, 200, 15, 15);

    @Override
    public void paint(Graphics g) {
//        g.setColor(Color.BLUE);
//        g.fillRect(target.x, target.y, target.width, target.height);

        g.setColor(Color.RED);
        g.fillRect(mover.x, mover.y, mover.width, mover.height);
    }

    public void moveLeft() {
        mover.x -= moveRange;
        this.repaint();
    }

    public void moveRight() {
        mover.x += moveRange;
        this.repaint();
    }

    public void moveUp() {
        mover.y -= moveRange;
        this.repaint();
    }

    public void moveDown() {
        mover.y += moveRange;
        this.repaint();
    }

}
