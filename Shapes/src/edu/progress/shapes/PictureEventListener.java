package edu.progress.shapes;

import edu.progress.shapes.PictureEvent;

import java.util.EventListener;

public interface PictureEventListener extends EventListener {

    public void shapeAdded(PictureEvent e);



    public void shapeRemoved(PictureEvent e);

}
