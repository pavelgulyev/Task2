package Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle implements Shape {
    @Override
    public void draw(GraphicsContext gr) {
        gr.setLineWidth(5);
        gr.setStroke(Color.GOLD);
        gr.strokeLine(100, 300, 300, 300);
        gr.strokeLine(300, 300, 500, 100);
        gr.strokeLine(500, 100, 100, 300);
    }
}
