package main;

import object.obj_Box;

public class AssetSetter {

    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {
        gp.obj[0] = new obj_Box();
        gp.obj[0].worldX = 500;
        gp.obj[0].worldY = 500;

        gp.obj[1] = new obj_Box(); // box #2 -- change to basket
        gp.obj[1].worldX = 400;
        gp.obj[1].worldY = 400;
    }
    
}
