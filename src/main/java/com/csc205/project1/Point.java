package com.csc205.project1;
/* FileName: Point.java          Project: project-1-initial-main
 *   Author: James Bewley        Class: CSC205AA Obj. Oriented Programming
 *     Date: Feb 03, 2022        Class#: 32551
 *  Purpose: 
 */
 
 
public class Point {

    //--- Class Attributes ---//
    private double x;
    private double y;


    //----- Constructors -----//
    public  Point(){                    // Default Constructor:
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y) {  // Overloaded Constructor: Set both x and y to custom values.
        this.x = x;
        this.y = y;
    }

    public double distance(Point p2) {
        // Get Coordinates for points:
        double x1 = this.x;          // x coordinate for point-a.
        double y1 = this.y;          // y coordinate for point-a.
        double x2 = p2.x;            // x coordinate for point-b.
        double y2 = p2.y;            // y coordinate for point-b.

        // Calculate distance between (x1,y1) and (x2,y2):
        double dist = Math.hypot((x2 - x1), (y2 - y1));

        return dist;
    }

    // X-Coordinate Getter/Setter:

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    // Y-Coordinate Getter/Setter:

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Other Methods:

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void shiftX(double n) {
        this.x += n;
    }

    public void shiftY(double n) {
        this.y += n;
    }

    // Rotate the point by a specified angle around the origin.
    /* FIXME: rotate()
              Expected output for rotation:
                    Rotated a 1.5707963267948966: Point{x = -0.9999999999999998, y = -0.9999999999999997}
                    Shifted b 4.47213595499958 away from original position: Point{x = 10.0, y = 3.0}
              Actual output for rotation:
                    Rotated a 1.5707963267948966: Point{x=-0.9999999999999998, y=3.0}
                    Shifted b 4.47213595499958 away from original position: Point{x=10.0, y=3.0}
    */
    public void rotate(double angle) {
        // Calculate terms:
        double xCosine = this.x * Math.cos(angle);  // Get the term 'x cos(θ)'
        double yCosine = this.y * Math.cos(angle);  // Get the term 'y cos(θ)'
        double xSine = this.x * Math.sin(angle);    // Get the term 'x sin(θ)'
        double ySine = this.y * Math.sin(angle);    // Get the term 'y cos(θ)'

        // Calculate the rotated point:
        this.x = xCosine - ySine;       // x' = x cos(θ) - y sin(θ)
        this.y = xSine + yCosine;       // y' = x sin(θ) + y cos(θ)
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
