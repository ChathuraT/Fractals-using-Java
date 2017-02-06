

/**
 * Created by Gamage C.T.N.
 * E/13/107
 * CO 225 Project
 */

//This class assigns colors to the points depending on the iterations for their divergence

import java.awt.*;

public class ColorMe {

    public static Color getColor(int iterations) {

        int r = 5, g = 1, b = 1;

        Color color = new Color((r * iterations) % 255, (g * iterations) % 255, (b * iterations) % 255);
        return color;

    }

}

