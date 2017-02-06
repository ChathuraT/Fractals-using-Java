

/**
 * Created by Gamage C.T.N.
 * E/13/107
 * CO 225 Project
 */
// this class is used to map a given point to the complex plane
public class MapMe {

    static int X_WIDTH = 800;
    static int Y_WIDTH = 800;

    private double a, b, c, d;

    public MapMe(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double xPoint(double x) {
        double tmp;

        tmp = (b - a) * x / X_WIDTH;
        tmp = tmp + a;
        return tmp;
    }

    public double yPoint(double y) {
        double tmp;

        tmp = (d - c) * y / Y_WIDTH;
        tmp = (tmp - d) * (-1);
        return tmp;

    }

}
