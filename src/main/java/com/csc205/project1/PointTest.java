package com.csc205.project1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {



    @org.junit.jupiter.api.Test
    void distance() {
        Point a = new Point(1.0, 1.0);  // Point a = (x1,y1) = (1,1)
        Point b = new Point(1.0, 3.0);  // Point b = (x2,y2) = (1,3)
        double expected = 2.0;                // Distance between a & b should be 2.0
        double actual = a.distance(b);        // Calculate distance
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void shiftX() {
        Point a = new Point(1.0, 1.0);  // Point a = (x1,y1) = (1,1)
        double expected = 3.0;                // Going to shift on x-axis by 2. New x coord should be 3.0
        a.shiftX(2.0);                     // Shift on x-axis by 2.0
        double actual = a.getX();             // Get new x coordinate
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void shiftY() {
        Point a = new Point(1.0, 1.0);  // Point a = (x1,y1) = (1,1)
        double expected = 3.0;                // Going to shift on y-axis by 2. New x coord should be 3.0
        a.shiftY(2.0);                     // Shift on y-axis by 2.0
        double actual = a.getY();             // Get new y coordinate
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void rotateX() {                          // VERIFY CORRECT X-COORDINATE AFTER rotate()
        Point a = new Point(1.0, 1.0);  // Point a = (x1,y1) = (1,1)
        double expected = -1.0;               // Will rotate by 180 degrees, new x/y coords should be (-1,-1)
        a.rotate(Math.PI);                    // Rotate by 180 degrees
        double actual = a.getX();             // Get the new x-coordinate
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void rotateY() {                          // VERIFY CORRECT Y-COORDINATE AFTER rotate()
        Point a = new Point(1.0, 1.0);  // Point a = (x1,y1) = (1,1)
        double expected = -1.0;               // Will rotate by 180 degrees, new x/y coords should be (-1,-1)
        a.rotate(Math.PI);                  // Rotate by 180 degrees
        double actual = a.getY();             // Get the new y-coordinate
        assertEquals(expected,actual);
    }
}