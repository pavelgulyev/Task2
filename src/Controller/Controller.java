package Controller;

import Model.Pentagon;
import Model.Shape;
import Model.ShapeFactory;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    @FXML
    Canvas can;
    @FXML
    TextField value1;
    ArrayList<Shape> a = new ArrayList<Shape>();
    public void addPikcher() {
        a.add(new Pentagon());
        GraphicsContext gr = can.getGraphicsContext2D();

        if(checkWithRegExp(value1.getText())==false || value1.getText().equals("")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Предупреждение: ");
            alert.setHeaderText(null);
            alert.setContentText("Введено нечисло или число не из диапазона от 0 до 5!");
            alert.showAndWait();
            return;
        }else {
            int numberOfSides = Integer.parseInt(value1.getText());
            ShapeFactory shapeFactory = new ShapeFactory();
            Shape shape1 = shapeFactory.createShape(numberOfSides, 0, 0);
            clear();
            shape1.draw(gr);
        }
    }
        private void clear(){
            can.getGraphicsContext2D().clearRect(0, 0, can.getWidth(), can.getHeight());
        }
    private boolean checkWithRegExp(String text) {
        String regex="[0-5]"; // шаблон строки из одного цифровых символов;
        return  Pattern.matches(regex, text);
    }

    public void click(MouseEvent mouseEvent) {
        GraphicsContext gr = can.getGraphicsContext2D();
        if(checkWithRegExp(value1.getText())==false || value1.getText().equals("")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Предупреждение: ");
            alert.setHeaderText(null);
            alert.setContentText("Введено нечисло или число не из диапазона от 0       до 5!");
            alert.showAndWait();
        }else {
            int numberOfSides = Integer.parseInt(value1.getText());
            ShapeFactory shapeFactory = new ShapeFactory();
            Shape shape1 = shapeFactory.createShape(numberOfSides, mouseEvent.getX(), mouseEvent.getY());
            clear();
            shape1.draw(gr);
        }
    }
}
