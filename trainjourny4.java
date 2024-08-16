/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class trainjourny4 {
    public static void main(String[] args) {
        int totalDistance = 10000;
        double speedMetersPerSecond = 225.5;

        // Convert speed to km/h
        double speedKmPerHr = speedMetersPerSecond * 3.6;

        // Calculate travel time in hours
        double travelTimeHours = totalDistance / speedKmPerHr;

        // Starting time in hours (09:00 hrs)
        double startTimeHours = 9.00;

        // Calculate the arrival time
        double arrivalTimeHours = startTimeHours + travelTimeHours;

        // If arrival time is more than 24 hours, adjust it
        if (arrivalTimeHours >= 24) {
            arrivalTimeHours -= 24;
        }

        System.out.println("The approximate arrival time is: " + arrivalTimeHours + " hours.");
    }
}

    

