//imports graphics class we need
import javax.swing.*;
import java.awt.*;
public class Panel extends JPanel {

    public Panel( ) {
        setBackground(Color.gray);
    }

    public void paintComponent(Graphics drawing) {
        super.paintComponent(drawing);

        // Print title.
        drawing.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
        //Prints font info
            System.out.println(drawing.getFont());
        drawing.setColor(Color.white);
        Color w = Color.white;
            System.out.println(w);
            System.out.println(w.getRed());
        drawing.drawString("My Java Art", 250, 100);


        drawing.setFont(new Font("Comic Sans MS", Font.ITALIC, 35));
            //Prints font info
            System.out.println(drawing.getFont());
        drawing.setColor(Color.white);
            System.out.println(w);
            System.out.println(w.getRed());
        drawing.drawString("Jeffrey Smith: Tutorial2b", 190, 175);


        // Draw Olympic ovals.
        drawing.setColor(Color.blue);
        Color b = Color.blue;
        //Prints blue info
            System.out.println(b);
            System.out.println(b.getBlue());
        drawing.drawOval(60, 200, 200, 200);

        drawing.setColor(Color.yellow);
        //Prints yellow info
            Color y = Color.yellow;
            System.out.println(y);
        drawing.drawOval(170, 300, 200, 200);

        drawing.setColor(Color.black);
        //Prints black info
        Color bl = Color.black;
            System.out.println(bl);
        drawing.drawOval(280, 200, 200, 200);

        drawing.setColor(Color.green);
        //Prints green info
            Color g = Color.green;
            System.out.println(g);
            System.out.println(b.getGreen());
        drawing.drawOval(390, 300, 200, 200);

        drawing.setColor(Color.red);
        //Prints red info
        Color r = Color.red;
        System.out.println(r);
        System.out.println(r.getRed());
        drawing.drawOval(500, 200, 200, 200);




    }
}
