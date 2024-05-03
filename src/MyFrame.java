import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon icon ;

MyFrame(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setLayout(null);
    this.addKeyListener(this);
    this.getContentPane().setBackground(Color.BLACK);
    icon = new ImageIcon("rocket.png");
    label = new JLabel();
    label.setBounds(0,0,100,100);
    label.setIcon(icon);
    this.add(label);

    this.setVisible(true);
}
    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
       switch(e.getKeyCode()){
           case  39: label.setLocation(label.getX()+10, label.getY());
        break;
           case  37:label.setLocation(label.getX()-10, label.getY());
        break;
           case  38:label.setLocation(label.getX(), label.getY()-10);
        break;
           case  40:label.setLocation(label.getX(), label.getY()+10);
        break;
    }
}

    public void keyReleased(KeyEvent e) {

    }
}
