
/**
 * Created by Gamage C.T.N.
 * E/13/107
 * CO 225 Project
 */

// This class will draw the image according to the given set of inputs

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.*;

public class Picture {

    private double a = -1, b = 1, c = -1, d = 1;
    private int inputIterations = 1000;
    private String set;
    private Complex z = new Complex(-0.4, 0.6);

    // Constructors depending upon the user inputs

    public Picture(String set) {
        this.set = set;

    }

    public Picture(String set, double a, double b) {
        this.set = set;
        this.z.real = a;
        this.z.imaginary = b;

    }

    public Picture(String set, double a, double b, double c, double d) {
        this.set = set;
        this.a = a;
        this.b = b;

    }

    public Picture(String set, double a, double b, double c, double d, int inputIterations) {
        this.set = set;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.inputIterations = inputIterations;

    }


    static void printer(Graphics2D f, Map<Coordinates, Color> coordColor) {

        //This method accepts a set of x,y coordinates and corresponding colors and will print the set of points in the canvas
        
        for (Map.Entry<Coordinates, Color> entry : coordColor.entrySet()) {
            f.setColor(entry.getValue());
            f.draw(new Line2D.Double(entry.getKey().x, entry.getKey().y, entry.getKey().x, entry.getKey().y));
        }
    }

    public void draw(Graphics2D f) throws InterruptedException {

        //  This method will create 4 threads depending on the Fractal Set and do the calculations

        if (set.equals("Mandelbrot")) {
            MapMe point = new MapMe(a, b, c, d);

            for (int i = 1; i <= 4; i++) {
                MandelThread t = new MandelThread(100 * (i * 2 - 2), 100 * (i * 2), point, inputIterations);
                t.start();
                t.join();
                printer(f, t.coordColor);
            }

        } else if (set.equals("Julia")) {
            MapMe point = new MapMe(-1, 1, -1, 1);

            for (int i = 1; i <= 4; i++) {
                JuliaThread t = new JuliaThread(100 * (i * 2 - 2), 100 * (i * 2), point, inputIterations, z);
                t.start();
                t.join();
                printer(f, t.coordColor);
            }

        }


    }


}
