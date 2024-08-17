package main;

import object.OBJ_Boots;
import object.OBJ_Chest;
import object.OBJ_Door;
import object.OBJ_Key;

public class AssetSetter {
	
	GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}
	
	public void setObject() {
		
		gp.obj[0] = new OBJ_Key(); 
		gp.obj[0].worldX = 6 * gp.tileSize;
		gp.obj[0].worldY = 10 * gp.tileSize;
		
		//gp.obj[1] = new OBJ_Key();
		//gp.obj[1].worldX = 15 * gp.tileSize;
		//gp.obj[1].worldY = 10 * gp.tileSize;
		
		//gp.obj[2] = new OBJ_Key();
		//gp.obj[2].worldX = 16 * gp.tileSize;
		//gp.obj[2].worldY = 10 * gp.tileSize;
		
		//gp.obj[3] = new OBJ_Door(); 
		//gp.obj[3].worldX = 50 * gp.tileSize;
		//gp.obj[3].worldY = 10 * gp.tileSize;
		
		//gp.obj[4] = new OBJ_Door(); 
		//gp.obj[4].worldX = 4 * gp.tileSize;
		//gp.obj[4].worldY = 10 * gp.tileSize;
		
		gp.obj[5] = new OBJ_Door(); 
		gp.obj[5].worldX = 13 * gp.tileSize;
		gp.obj[5].worldY = 10 * gp.tileSize;
		
		gp.obj[6] = new OBJ_Chest(); 
		gp.obj[6].worldX = 4 * gp.tileSize;
		gp.obj[6].worldY = 10 * gp.tileSize;
		
		//gp.obj[7] = new OBJ_Chest(); 
		//gp.obj[7].worldX = 20 * gp.tileSize;
		//gp.obj[7].worldY = 20 * gp.tileSize;
		
		//gp.obj[8] = new OBJ_Chest(); 
		//gp.obj[8].worldX = 25 * gp.tileSize;
		//gp.obj[8].worldY = 28 * gp.tileSize;
		
		gp.obj[9] = new OBJ_Boots(); 
		gp.obj[9].worldX = 4 * gp.tileSize;
		gp.obj[9].worldY = 12 * gp.tileSize;
	}

}


