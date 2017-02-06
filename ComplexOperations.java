

/**
 * Created by Gamage C.T.N.
 * E/13/107
 * CO 225 Project
 */

//This defines the arithmetic on complex objects created by Complex class

public class ComplexOperations extends Complex {

    public static Complex add(Complex a, Complex b) {
        Complex sum = new Complex(a.real + b.real, a.imaginary + b.imaginary);
        return sum;
    }

    public static Complex power(Complex a) {
        Complex pow = new Complex((Math.pow(a.real, 2) - Math.pow(a.imaginary, 2)), (2 * a.real * a.imaginary));
        return pow;
    }

    public static double absolute(Complex a) {
        double abs = Math.sqrt(Math.pow(a.real, 2) + Math.pow(a.imaginary, 2));

        return abs;
    }
}
