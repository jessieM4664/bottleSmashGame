package object;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import main.GamePanel;

public class SuperObject {
    public BufferedImage image;
    public String name;
    public int worldX, worldY;

    public void draw(Graphics2D g2, GamePanel gp) {
        g2.drawImage(image, 300, 16, gp.tileSize, gp.tileSize, null);
    }
}
