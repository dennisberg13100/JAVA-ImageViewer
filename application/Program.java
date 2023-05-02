package application;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import components.GrayscaleButton;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Viewer"); 
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(); 
        panel.setLayout(null); 

        BufferedImage image = null; 
        try {
            image = ImageIO.read(new File("/hdd/programing/java/image_viewer/assets/images.jpeg"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ImageIcon icon = new ImageIcon(image);
        JLabel label = new JLabel(icon); 

        int marginLeft = (600 - image.getWidth()) / 2;
        int marginTop = (400 - image.getHeight()) /2;
        label.setBounds(marginLeft ,marginTop , image.getWidth(), image.getHeight());

        GrayscaleButton grayscaleButton = new GrayscaleButton(image, label);
        
        panel.add(grayscaleButton);
        panel.add(label); 
        frame.add(panel); 
        frame.setVisible(true);

    }
}