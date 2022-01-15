package project;

import javax.swing.*;

public class Dashboard extends JFrame{
    static int x = 480, y = 480;
    static Dashboard frame = new Dashboard();
    static Jpanel jpanel = new Jpanel();
    static Jtextfield jtextfield = new Jtextfield();

    public static void main(String[] args) {
        jtextfield.gameBoard();
        frame.draw();
    }

    public void draw() {
        this.valueForDashBoard();
        this.addListenerKey();
        setVisible(true);
    }

    public void valueForDashBoard(){
        setSize(x, y);
        setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }

    private void addListenerKey() {
        addKeyListener(new Jtextfield(jpanel));
        getContentPane().add(jpanel);
    }
}


