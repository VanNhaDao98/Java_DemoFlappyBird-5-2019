package DEMO;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Birds {
	private BufferedImage bird;
	private static int x=300;
	private static int y=300;
	public void paint(Graphics2D g2) {
		try {
			bird=ImageIO.read(new File("img/bird_sprite.png"));
			g2.drawImage(bird, x,y,null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	


}
