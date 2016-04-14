package com.ahand;

/**
 * Created by Aaron Hand on 4/11/16.
 * Project: CSC142Lab1
 */
import java.awt.*;


import uwcse.graphics.*;
import uwcse.graphics.Rectangle;

/** A class to display and action a traffic light */
public class TrafficLight {

    // instance fields
    private GWindow window;
    private Oval red;
    private Oval yellow;
    private Oval green;
    private Rectangle background;

    private final int PADDING = 6;

    /**
     * Construct the traffic light
     */
    public TrafficLight(GWindow window) {
        this.window = window;
        reset(true);
    }

    public void reset(boolean newLight){
        if(!newLight) {
            window.remove(background);
            window.remove(red);
            window.remove(yellow);
            window.remove(green);
        }

        setBackground();

        red = new Oval(
                window.getWindowWidth()/2, 50,  //X,Y
                50, 50,                         //Width, height
                Color.RED,                      //color
                false);                         //fill?
        yellow = new Oval(
                window.getWindowWidth()/2, 100 + PADDING,
                50, 50,
                Color.YELLOW,
                false);

        green = new Oval(window.getWindowWidth()/2, 150 + PADDING * 2,
                50, 50,
                Color.GREEN,
                false);

        window.add(red);
        window.add(yellow);
        window.add(green);
    }

    public void setRed(){
        reset(false);
        window.remove(red);

        red = new Oval(
                window.getWindowWidth()/2, 50,
                50, 50,
                Color.RED,
                true);
        window.add(red);
    }

    public void setYellow(){
        reset(false);
        window.remove(yellow);

        yellow = new Oval(
                window.getWindowWidth()/2, 100 + PADDING,
                50, 50,
                Color.YELLOW,
                true);

        window.add(yellow);
    }

    public void setGreen(){
        reset(false);
        window.remove(green);

        green = new Oval(
                window.getWindowWidth()/2, 150 + PADDING * 2,
                50, 50,
                Color.GREEN,
                true);

        window.add(green);
    }

    public void setBackground(){


        /** Create a new rectangle of the given position, size, color, and
         filledness.
         @param x the x coordinate of the upper left corner
         @param y the y coordinate of the upper left corner
         @param width the width of the rectangle
         @param height the height of the rectangle
         @param c the color of the rectangle
         @param fill should it be filled?  */


        background = new Rectangle(
                window.getWindowWidth()/2 - 30,10,
                110,
                240,
                Color.BLACK,
                true
        );

        window.add(background);
    }
}