import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelpButton extends JButton {

public HelpButton(JFrame f) {

    this.setIcon(new ImageIcon(this.getClass().getResource("/images/help-placeholder.jpg")));
    this.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            HelpWindow helpWindow = new HelpWindow(f);

        }
    });



}

}
