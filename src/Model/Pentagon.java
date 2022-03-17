package Model;

import javafx.scene.canvas.GraphicsContext;

public class Pentagon implements Shape{
    static int n = 5; //кол-во граней
    static int R = 50; //радиус
    static int X = 250, Y = 250;//координаты центра
    static int x[] = new int [n];//координаты точек
    static int y[] = new int [n];//
    static int x1, y1, x2, y2;
    static int j = n;
    @Override
    public void draw(GraphicsContext gr) {
        double a, b,  z = 0 ;  int i = 0; double angle = 360.0 / n ;
        //цикл создающий массив из точек
        while(i < n){
            a = Math.cos( z/180*Math.PI);
            b = Math.sin( z/180*Math.PI);
            x[i] = X + (int)(Math.round(a) * R);
            y[i] = Y - (int)(Math.round(b) * R);
            z = z + angle;
            i++;
        }
        System.out.println();

        int x1, x2, y1, y2;

        int j = n-1;		//цикл передающий координаты для прорисовки грани
        while(j >= 0){

            if(j > 0){
                x1 = x[j]; x2 = x[j-1];
                y1 = y[j]; y2 = y[j-1];
                gr.strokeLine(x1, y1, x2, y2);
                j--;
            }
            else{
                x1 = x[j]; x2 = x[n-1];
                y1 = y[j]; y2 = y[n-1];
                gr.strokeLine(x1, y1, x2, y2);
                j--;

            }

        }
    }
}
