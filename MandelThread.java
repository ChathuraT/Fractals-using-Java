
/**
 * Created by Gamage C.T.N.
 * E/13/107
 * CO 225 Project
 */

import java.awt.*;
import java.util.*;

//This class is used for thread implementation of the Mandelbrot set

public class MandelThread extends Thread {

    protected int a, b, inputIterations;
    protected MapMe point;
    public Map<Coordinates, Color> coordColor = new HashMap<Coordinates, Color>();

    public MandelThread(int a, int b, MapMe point, int inputIterations) {

        this.a = a;
        this.b = b;
        this.point = point;
        this.inputIterations = inputIterations;

    }


    @Override
    public void run() {

        for (int i = this.a; i < this.b; i++) {
            for (int j = 0; j < 800; j++) {
                Mandelbrot m = new Mandelbrot(point.xPoint(i), point.yPoint(j), inputIterations);
                if (m.calculate()) {
                    coordColor.put(new Coordinates(i, j), Color.black);
                } else {
                    coordColor.put(new Coordinates(i, j), ColorMe.getColor(m.iterations));
                }
            }
        }

    }

}
