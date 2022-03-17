package Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Straight implements Shape {
    @Override
    public void draw(GraphicsContext gr) {
        gr.setLineWidth(5);
        gr.setStroke(Color.GOLD);
        gr.strokeLine(300, 300, 10, 10);
    }
}
