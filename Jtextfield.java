package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Jtextfield extends JTextField implements KeyListener{
    private JPanel jPanel = new JPanel();
    static JLabel jLabel = new JLabel("Ihre Name: ");
    private Jpanel jp = new Jpanel();

    public void gameBoard() {
        this.foreAndBackground();
    }

    public void foreAndBackground(){
        setColumns(15);
        setForeground(Color.black);
        setBackground(Color.yellow);
    }
    public Jtextfield(){}
    public Jtextfield(Jpanel jp){
        this.jp = jp;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //System.out.println("The key Typed was: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP) {
            jp.moveUp();
        }

        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            jp.moveDown();
        }

        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            jp.moveLeft();
        }

        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            jp.moveRight();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println("The key Released was: " + e.getKeyChar());
    }

}
