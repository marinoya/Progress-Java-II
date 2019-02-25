package edu.progress.shapes;

import java.awt.*;

public class Circle extends Shape{
    public Circle(int x, int y) {
        super(x, y);
    }
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if(radius>0){
            this.radius = radius;
        }
    }
    public Circle(int x, int y, int radius, int contourWidth){
        super(x,y, contourWidth);
        setRadius(radius);
    }
    public Circle(int x, int y, int radius){
        super(x,y);
        setRadius(radius);
    }
    public String toString(){
        return String.format("Circle: center %s, radius %d", super.toString(), getRadius());
    }

    public void draw(StringBuilder builder){
        builder.append(String.format("<circle cx=\"%d\" cy=\"%d\" r=\"%d\"/>", getX(),getY(), radius));
    }

    @Override
    public void draw(Graphics2D g) {
        int R = 2*getRadius();
        g.setStroke(new BasicStroke(getContourWidth()));
        g.drawOval(getX()-getRadius(),getY()-getRadius(), R, R);
    }
}
