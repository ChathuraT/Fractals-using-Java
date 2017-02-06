

/**
 * Created by Gamage C.T.N.
 * E/13/107
 * CO 225 Project
 */

// This class simulates a point in Mandelbrot se

public class Mandelbrot extends FractalSet {

    public Mandelbrot(double real, double imaginary, int inputIterations) {
        super.c = new Complex(real, imaginary);
        super.inputIterations = inputIterations;
    }

}
