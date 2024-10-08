package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import object.OBJ_Key;

public class UI {

	GamePanel gp;
	Font arial_30;
	BufferedImage keyImage;
	
	public UI(GamePanel gp) {
		this.gp = gp;
		
		arial_30 = new Font("Arial", Font.PLAIN, 30);
		OBJ_Key key = new OBJ_Key();
		keyImage = key.image;
	}
	public void draw(Graphics2D g2) {
		
		g2.setFont(arial_30);
		g2.setColor(Color.white);
		g2.drawImage(keyImage, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);
		g2.drawString("x"+ gp.player.hasKey, 74, 60);
	}
}
