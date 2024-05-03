import javax.swing.*;
import java.awt.*;

public class PrgressBar {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0,100);
    public PrgressBar() {
        bar.setValue(100);
        bar.setForeground(Color.GREEN);
        bar.setBackground(Color.RED);
        bar.setFont(new Font("MV Boli",Font.BOLD,30));
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        frame.add(bar);
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        fill();
    }

    public  void fill()  {
        int count = 100 ;
        while(count>=0){

            bar.setValue(count);
            bar.getString();
            if(count==30)
            {bar.setString("Critical");}
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            count--;
        }
        bar.setString("You Died!");
    }
}
