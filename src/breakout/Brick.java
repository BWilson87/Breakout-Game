package breakout;

import java.awt.Graphics;

public class Brick extends Sprite {

    private boolean broken = false;

    public Brick(int x, int y) {
        // TODO: Set x using the parameter
        this.x = x;
        // TODO: Set y using the parameter
        this.y = y;
        // TODO: Set the width and height of the brick using Settings.BRICK_WIDTH/HEIGHT
        this.width = Settings.BRICK_WIDTH;
        this.height = Settings.BRICK_HEIGHT;
    }

    public boolean isBroken() {
        return broken; // TODO: Return the correct variable
    }

    public void setBroken(boolean b) {
        // TODO: Set the broken variable using the parameter given
        broken = b;
    }

    public void paint(Graphics g) {
        if (!broken) {
            g.fillRect(x, y, Settings.BRICK_WIDTH, Settings.BRICK_HEIGHT);
        }
    }
}
