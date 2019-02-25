package edu.progress.shapes;

import javax.swing.*;
import java.awt.*;

public class Rectangle extends Shape {
    int height;
    int width;

    public Rectangle(int x, int y, int height, int width, int contourWidth) {
        super(x, y, contourWidth);
        this.height = height;
        this.width = width;
    }

    public Rectangle(int x, int y, int height, int width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height>0){
            this.height = height;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width>0){
            this.width = width;
        }
    }

    @Override
    public String toString() {
        return String.format("Rectangle{ top left corner at: %s, height= %d, width= %d}", super.toString(),getHeight(),getWidth());
    }

    @Override
    public void draw(StringBuilder builder) {

        builder.append(String.format("<rect x=\"%d\" y=\"%d\" width=\"%d\" height=\"%d\"\n\"/>",getX(), getY(), getWidth(), getHeight() ));
    }

    @Override
    public void draw(Graphics2D g) {
        g.setStroke(new BasicStroke(getContourWidth()));
        g.drawRect(getX(), getY(),getWidth(),getHeight());
    }
}
