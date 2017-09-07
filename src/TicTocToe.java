import java.awt.Graphics;
import javax.swing.JApplet;

public class TicTocToe extends JApplet {

    public void paint(Graphics canvas) {

        canvas.drawLine(50, 50, 50, 350);
        canvas.drawLine(150, 50, 150, 350);
        canvas.drawLine(250, 50, 250, 350);
        canvas.drawLine(350, 50, 350, 350);
        canvas.drawLine(50, 50, 350, 50);

        canvas.drawLine(50, 150, 350, 150);
        canvas.drawLine(50, 250, 350, 250);
        canvas.drawLine(50, 350, 350, 350);

        canvas.drawLine(75, 75, 125, 125);
        canvas.drawLine(125, 75, 75, 125);

        canvas.drawLine(175, 75, 225, 125);
        canvas.drawLine(225, 75, 175, 125);

        canvas.drawLine(175, 175, 225, 225);
        canvas.drawLine(225, 175, 175, 225);



        canvas.drawLine(275, 75, 325, 125);
        canvas.drawLine(325, 75, 275, 125);


        canvas.drawLine(175, 275, 225, 325);
        canvas.drawLine(225, 275, 175, 325);



        canvas.drawOval(75, 175, 50, 50);
        canvas.drawOval(75, 275, 50, 50);

        canvas.drawOval(275, 175, 50, 50);
        canvas.drawOval(275, 275, 50, 50);

    }
}