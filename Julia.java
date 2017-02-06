

/**
 * Created by User on 01-Sep-16.
 */

// This class simulates a point in Julia set

public class Julia extends FractalSet {

    public Julia(double real, double imaginary, Complex c, int inputIterations) {
        super.c = c;
        super.z = new Complex(real, imaginary);
        super.inputIterations = inputIterations;
    }

}
