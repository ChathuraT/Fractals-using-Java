
/**
 * Created by Gamage C.T.N.
 * E/13/107
 * CO 225 Project
 */
//This is the main class which will run the program

import javax.swing.*;
import java.awt.*;

public class Fractal extends JPanel {

    private static int WIDTH = 800;
    private static int HEIGHT = 800;
    private static String[] arguments;

    public static void main(String[] args) {

        //Handling command line inputs

        if (args.length == 1 || args.length == 3 || args.length == 5 || args.length == 6) {
            if ((args[0].equals("Julia") && (args.length == 1 || args.length == 3)) || (args[0].equals("Mandelbrot") && (args.length == 1 || args.length == 5 || args.length == 6))) {

                arguments = args;

                JFrame frame = new JFrame("Fractals");

                frame.setContentPane(new Fractal());
                frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
                frame.setSize(WIDTH, HEIGHT);
                frame.pack();
                frame.setVisible(true);
            } else {
                System.out.println("Number of Input Arguments are Wrong");

            }

        } else {

            System.out.println("Number of Input Arguments are Wrong");

        }

    }

    @Override
    protected void paintComponent(Graphics g) {
        //Directing the program according to the inputs

        super.paintComponent(g);
        Graphics2D f = (Graphics2D) g;

        try {
            if (arguments.length == 1) {
                Picture picture = new Picture(arguments[0]);
                picture.draw(f);
            } else if (arguments.length == 3) {
                Picture picture = new Picture(arguments[0], Double.parseDouble(arguments[1]), Double.parseDouble(arguments[2]));
                picture.draw(f);
            } else if (arguments.length == 5) {
                Picture picture = new Picture(arguments[0], Double.parseDouble(arguments[1]), Double.parseDouble(arguments[2]), Double.parseDouble(arguments[3]), Double.parseDouble(arguments[4]));
                picture.draw(f);
            } else {
                Picture picture = new Picture(arguments[0], Double.parseDouble(arguments[1]), Double.parseDouble(arguments[2]), Double.parseDouble(arguments[3]), Double.parseDouble(arguments[4]), Math.abs(Integer.parseInt(arguments[5])));
                picture.draw(f);
            }
        } catch (Exception e) {
            System.out.println(e);

        }

    }

}
