package Model;

public class ShapeFactory {
    public Shape createShape(int numberOfSides, double x, double y){
        if(numberOfSides==5){
            return new Pentagon();
        }
        else if(numberOfSides==4){
            return new Squere(x, y);
        }
        else if(numberOfSides==3){
            return new Triangle();
        }
        else if(numberOfSides==2){
            return new Angle();
        }
        else if (numberOfSides==1){
            return new Straight();
        }
        else if(numberOfSides==0){
            return new Circle();
        }else{
            return null;
        }
    }
}
