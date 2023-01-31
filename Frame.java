//imports graphics class we need
import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private Panel p = null;
    public Frame()
    {
        super("Jeff Smith's Drawing");

        p = new Panel();
        p.setLayout(new FlowLayout());
        setContentPane(p);

        // Configures the frame's height and width
        setSize(850, 650);
        setVisible(true);
    }
}
