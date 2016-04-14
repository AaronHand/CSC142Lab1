package com.ahand;

import uwcse.graphics.*;

public class Main {

    private static GWindow window;


    public static void main(String[] args) {
	// write your code here
        window = new GWindow(400,400);
        TrafficLight light = new TrafficLight(window);
        light.setGreen();
        try {
            Thread.sleep(1000);
            light.setYellow();
            Thread.sleep(2000);
            light.setRed();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}
