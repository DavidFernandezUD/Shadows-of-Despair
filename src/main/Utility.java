package main;

import java.awt.image.BufferedImage;
import java.awt.Graphics2D;

public class Utility {
    
    public BufferedImage scaleImage(BufferedImage original, int width, int height) {

        // TODO: Use this method to optimize object drawing too

        BufferedImage scaledImage = new BufferedImage(width, height, original.getType());
        Graphics2D g2 = scaledImage.createGraphics();
        g2.drawImage(original, 0, 0, width, height, null);
        g2.dispose();

        return scaledImage;
    }

}
