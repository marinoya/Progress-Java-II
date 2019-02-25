package edu.progress.shapes;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Picture p = new Picture(
                new Circle(200,440,50, 8),
                new Circle(400,440,50, 8),
                new Rectangle(250,50,440,100)
        );
        //System.out.println(p.toString());

        PictureWindow pw = new PictureWindow(p,"Hello!");
        pw.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
