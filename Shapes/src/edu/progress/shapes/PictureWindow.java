package edu.progress.shapes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PictureWindow extends JFrame {

    public PictureWindow(){

        this(Picture.EMPTY_PICTURE, "");
    }

    public PictureWindow(Picture p, String title){

        super(title);

        p.addPictureListener(new PictureEventListener() {
            @Override
            public void shapeAdded(PictureEvent e) {
                //PictureWindow.this.invalidate();
                //PictureWindow.this.repaint();
                invalidate();
                repaint();
            }

            @Override
            public void shapeRemoved(PictureEvent e) {
                invalidate();
                repaint();
            }
        });


        Dimension d = new Dimension(700, 600);
        setMinimumSize(d);
        setPreferredSize(d);
        setMaximumSize(d);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(new PictureView(p), BorderLayout.CENTER);

        JPanel pnlButtons = new JPanel();
        pnlButtons.setLayout(new BoxLayout(pnlButtons, BoxLayout.Y_AXIS));
        JButton btnAddCircle = new JButton("Add Circle");
        pnlButtons.add(btnAddCircle);
        btnAddCircle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p.add(new Circle(300,50,50,7));
//                invalidate();
//                repaint();
            }
        });

        JButton btnAddRectangle = new JButton("Add Rectangle");
        pnlButtons.add(btnAddRectangle);
        btnAddRectangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p.add(new Rectangle(300,2, 30,1, 2));

            }

        });

        getContentPane().add(pnlButtons, BorderLayout.EAST);

        //адваме текстово пано което да слага SVG кода на текущите фигури и когато се появят нови фигури
        //da se adne kato pole na klasa picture window
        JTextArea textArea = new JTextArea("SVG code string");
        getContentPane().add(textArea, BorderLayout.WEST);
        textArea.setText("Mana mana");


        setVisible(true);

    }

}
