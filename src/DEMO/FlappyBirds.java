package DEMO;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;





public class FlappyBirds extends GameScreen {
	FlappyBirds fl=new FlappyBirds();
	private BufferedImage birds;
	private Animation bird_anim;
	public FlappyBirds() {
		super(800,600);
		try {
			birds=ImageIO.read(new File("img/bird_sprite.png"));
		}
		catch(Exception ex) {
			ex.getStackTrace();
		}
		bird_anim=new Animation(100);
		AFrameOnImage f;
		f=new AFrameOnImage(0,0,60,60);
		bird_anim.AddFrame(f);

		f=new AFrameOnImage(60,0,60,60);
		bird_anim.AddFrame(f);

		f=new AFrameOnImage(120,0,60,60);
		bird_anim.AddFrame(f);

		f=new AFrameOnImage(60,0,60,60);
		bird_anim.AddFrame(f);
		
		
		
		BeginGame();
	}

	public static void main(String[] args) {
		FlappyBirds flb=new FlappyBirds();

	}

	@Override
	public void GAME_UPDATE(long deltaTime) {
		// TODO Auto-generated method stub
		bird_anim.Update_Me(deltaTime);
		
	}

	@Override
	public void GAME_PAINT(Graphics2D g2) {
		// TODO Auto-generated method stub
		bird_anim.PaintAnims(400, 300, birds, g2, 0, 0);
		
	}

	@Override
	public void KEY_ACTION(KeyEvent e, int Event) {
		// TODO Auto-generated method stub
		
	}

}
