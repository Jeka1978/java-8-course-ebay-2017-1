package day1.effectivelyFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Evegeny on 08/02/2017.
 */
public class MyFrame extends JFrame {
    public MyFrame() throws HeadlessException {
        JButton button = new JButton("click on me");
        this.add(button);
        button = null;


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                button.setText("already clicked");
            }
        });
    }
}
