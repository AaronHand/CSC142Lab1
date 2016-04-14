package com.ahand;

import uwcse.graphics.Pen;

/**
 * Created by Aaron Hand on 4/11/16.
 * Project: CSC142Lab1
 */
public class SquareShape {
    Pen pen;

    public SquareShape() {
        pen = new Pen();
        pen.down();
        for(int i=0;i<40;i++) {
            pen.turn(9);
            for (int j = 0; j < 4; j++) {
                pen.move(100);
                pen.turn(90);
            }
        }
    }
}
