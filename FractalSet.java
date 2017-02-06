

/**
 * Created by Gamage C.T.N.
 * E/13/107
 * CO 225 Project
 */

//The Parent class of Mandelbrot and Julia sets

public class FractalSet {

    protected Complex c = new Complex(0, 0);
    protected Complex z = new Complex(0, 0);
    protected int inputIterations = 1000;
    protected static int iterations = 0;

// this method calculates whether the given point is in the fractal set or not

    public Boolean calculate() {

        for (iterations = 0; iterations < inputIterations; iterations++) {
            if (Double.isInfinite(ComplexOperations.absolute(z)))
                break;
            z = ComplexOperations.add(c, ComplexOperations.power(z));
            this.iterations++;
        }

        if (ComplexOperations.absolute(z) > 2) {
            return false;
        } else {
            return true;
        }
    }
}