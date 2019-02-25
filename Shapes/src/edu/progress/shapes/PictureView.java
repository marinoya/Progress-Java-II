package edu.progress.shapes;

import javax.swing.*;
import java.awt.*;

public class PictureView extends JPanel{

    private Picture picture;

    public PictureView(Picture picture){
        setPicture(picture);
    }

    public void setPicture(Picture picture){
        if(picture != null){
            this.picture= picture;
        }else{
            this.picture =  Picture.EMPTY_PICTURE;
        }
    }
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        picture.draw(g2d);
    }

}
