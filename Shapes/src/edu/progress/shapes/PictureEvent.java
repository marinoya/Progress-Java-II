package edu.progress.shapes;

import java.util.EventObject;

public class PictureEvent extends EventObject {

    private Shape shape;

//    като полета поставяме променливи които да пояснят събитието
//    например да пазят някакви стойности от мемента в който то се е случило
    public PictureEvent(Object source) {
        super(source);
    }


    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        if(shape != null) {
            this.shape = shape;
        }
    }
}
