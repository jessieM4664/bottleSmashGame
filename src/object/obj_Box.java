package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class obj_Box extends SuperObject {
    public obj_Box() {
        name = "Box";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/objects/box.PNG"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
