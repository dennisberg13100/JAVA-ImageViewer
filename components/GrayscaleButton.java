package components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import utils.ImageConverter;

public class GrayscaleButton extends JButton implements ActionListener {
    private BufferedImage image; 
    private BufferedImage grayImage; 
    private JLabel label; 

    public GrayscaleButton(BufferedImage image, JLabel label) {
        super("Grayscale");
        this.image = image; 
        this.grayImage = ImageConverter.convertToGrayscale(image);
        this.label = label;
        setFocusPainted(false); 
        setBounds(0,0,110,30);
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(getText().equals("Grayscale")) {
            label.setIcon(new ImageIcon(grayImage));
            setText("Color");
        } else {
            label.setIcon(new ImageIcon(image));
            setText("Grayscale");
        }
    }  
}
