package utils;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class ImageConverter {
    public static BufferedImage convertToGrayscale(BufferedImage image) {
        
        BufferedImage grayImage = new BufferedImage(
            image.getWidth(), 
            image.getHeight(), 
            BufferedImage.TYPE_BYTE_GRAY);
        Graphics g = grayImage.getGraphics();
        g.drawImage(image, 0, 0, null);
        g.dispose();
        
        return grayImage; 
    }
}
