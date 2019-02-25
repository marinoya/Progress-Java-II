package edu.progress.shapes;

import javax.swing.event.EventListenerList;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Picture {

    private List <Shape> shapes;
    private EventListenerList listeners = new EventListenerList();
    public static final Picture EMPTY_PICTURE = new Picture();

    public Picture(Shape ... shapes) {
        this.shapes = new ArrayList<Shape>();
        for (Shape s : shapes) {
            this.shapes.add(s);
        }
    }

    public void addPictureListener(PictureEventListener listener){
        listeners.add(PictureEventListener.class, listener);
    }

    public void removePictureListener (PictureEventListener listener){
        listeners.remove(PictureEventListener.class, listener);
    }

    private void fireShapeAdded(PictureEvent e){
        Object[] l = (Object[])listeners.getListenerList();
        for (int i = 0; i <l.length ; i+=2) {
            if (l[i] == PictureEventListener.class){
                ((PictureEventListener)l[i+1]).shapeAdded(e);
            }
        }
    }

//    private void fireShapeRemoved(PictureEvent e){
//        Object
//    }




    public void draw(Graphics2D g){
        for (Shape s: shapes) {
            s.draw(g);
        }
    }

    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("<html><body><svg width=\"400\" height=\"400\">");
        for (Shape s : shapes) {
            s.draw(b);
        }
        b.append("</svg></body></html>");
        return b.toString();
    }

    public void add(Shape shape){
        shapes.add(shape);
        PictureEvent e =  new PictureEvent(this);
        e.setShape(shape);
        fireShapeAdded(e);
    }




}
