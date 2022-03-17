package Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Squere implements Shape {
    double x,y;
    Squere(double x,double y){
        this.x=x;
        this.y=y;
    }
    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(Color.GREEN);
        gr.setLineWidth(5);
        gr.setStroke(Color.GOLD);
        gr.fillRect(200, 100, 100, 100);
        gr.strokeRect(200, 100, 100, 100);
    }
}
