

/**
 * Created by Gamage C.T.N.
 * E/13/107
 * CO 225 Project
 */

//This class simulate  complex numbers

public class Complex {

    public double real, imaginary;

    public Complex() {
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return (real + "+" + imaginary + "i");
    }
}
