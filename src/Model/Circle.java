package Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle implements Shape{
    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(Color.GREEN);
        gr.setLineWidth(5);
        gr.setStroke(Color.GOLD);
        gr.fillOval(200, 100, 100, 100);
        gr.strokeOval(200, 100, 100, 100);
    }
}
