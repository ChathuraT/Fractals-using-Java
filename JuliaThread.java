
/**
 * Created by Gamage C.T.N.
 * E/13/107
 * CO 225 Project
 */

//This class is used for thread implementation of the Julia set

import java.awt.*;

public class JuliaThread extends MandelThread {

    private Complex z;

    public JuliaThread(int a, int b, MapMe point, int inputIterations, Complex z) {
        super(a, b, point, inputIterations);
        this.z = z;

    }

    @Override
    public void run() {

        for (int i = super.a; i < super.b; i++) {
            for (int j = 0; j < 800; j++) {
                Julia m = new Julia(point.xPoint(i), point.yPoint(j), z, inputIterations);
                if (m.calculate()) {
                    coordColor.put(new Coordinates(i, j), Color.black);
                } else {
                    coordColor.put(new Coordinates(i, j), ColorMe.getColor(m.iterations));
                }
            }
        }

    }
}
