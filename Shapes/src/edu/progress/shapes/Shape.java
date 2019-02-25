package edu.progress.shapes;

import java.awt.*;

public abstract class Shape implements Drawable{

    private int x;

    private int y;

    private int contourWidth;

    public Shape(int x, int y){
        this.x = x;
        this.y = y;
        this.contourWidth=1;

    }

    public Shape(int x, int y, int contourWidth){
        this.x = x;
        this.y = y;
        this.contourWidth=contourWidth;

    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getContourWidth() {
        return contourWidth;
    }

    public void setContourWidth(int contourWidth) {
        this.contourWidth = contourWidth;
    }

    public String toString(){
        return String.format("(%d, %d)", x, y);
    }


}
