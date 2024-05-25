package frameProj;
import java.awt.*;
import javax.swing.*;

public class project1 {
    private static void createAndShowGUI(){
        JFrame frame = new JFrame("DeezNuts!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setName("FrameDemo");

        //JLabel emptyLabel = new JLabel("");
        //emptyLabel.setPreferredSize(new Dimension(200,200));
        //frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        JLabel secondLabel = new JLabel("Heyyyyyy");
        secondLabel.setPreferredSize(new Dimension(300,300));
        frame.getContentPane().add(secondLabel,BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main (String[] args){

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                createAndShowGUI();
                createAndShowGUI();
            }
        });
    }
}