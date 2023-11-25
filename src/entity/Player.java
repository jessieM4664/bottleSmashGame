package entity;

import main.KeyHandler;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class Player extends Entity {
    GamePanel gp;
    KeyHandler keyH;
    public Player(GamePanel gp, KeyHandler keyH) {
        this.gp = gp;
        this.keyH = keyH;

        setDefaultValues();
        getPlayerImage();
    }

    public void setDefaultValues() {
        x = 350;// starting postion
        y = 475;// starting postion
        speed = 5;
        direction = "left";
    }

    public void getPlayerImage() {
        try {
            left1 = ImageIO.read(getClass().getResourceAsStream("/res/player/boy_left1.PNG"));
            left2 = ImageIO.read(getClass().getResourceAsStream("/res/player/boy_left2.PNG"));
            right1 = ImageIO.read(getClass().getResourceAsStream("/res/player/boy_right1.PNG"));
            right2 = ImageIO.read(getClass().getResourceAsStream("/res/player/boy_right2.PNG"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void update() {
        if (keyH.leftPressed == true || keyH.rightPressed == true) {
            if (keyH.upPressed == true) { // jump
                // add code for jumping
            } else if (keyH.downPressed == true) { // crouch
                // add code for crouching
            } else if (keyH.leftPressed == true && x - speed >= 0) {
                direction = "left";
                x -= speed;
            } else if (keyH.rightPressed == true && x + speed <= 810) {
                direction = "right";
                x += speed;
            }
            spriteCounter++;
            if (spriteCounter > 10) {
                if (spriteNum ==1) {
                    spriteNum = 2;
                } else if (spriteNum == 2) {
                    spriteNum = 1;
                }
                spriteCounter = 0;
            }
        }

    }

    public void draw(Graphics2D g2) {
        //g2.setColor(Color.white);
        //g2.fillRect(x, y, gp.tileSize, gp.tileSize);
        BufferedImage image = null;

        switch(direction) {
        case "left":
            if (spriteNum == 1) {
                image = left1;
            }
            if (spriteNum == 2) {
                image = left2;
            }
            break;
        case "right":
            if (spriteNum == 1) {
                image = right1;
            }
            if (spriteNum == 2) {
                image = right2;
            }
            break;
        }
        g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);
    }
}
