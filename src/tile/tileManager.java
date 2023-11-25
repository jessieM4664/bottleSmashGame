package tile;

import java.awt.Graphics2D;

import javax.imageio.ImageIO;

import main.GamePanel;

public class tileManager {
    GamePanel gp;
    Tile[] tile;

    public tileManager(GamePanel gp) {
        this.gp = gp;
        tile = new Tile[10];
        getTileImage();
    }

    public void getTileImage() {
        try {
            tile[0] = new Tile();
            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/bg1.PNG"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//
    public void draw(Graphics2D g2) {
        g2.drawImage(tile[0].image, 0, 0, 864, 576, null); // screen background demensions
    }
}
