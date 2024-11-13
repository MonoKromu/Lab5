package ru.mono;

import exceptions.InvalidSizeException;
import geometry2d.*;
import geometry3d.*;

public class Main {


    public static void main(String[] args) throws InvalidSizeException {
        try{
            Circle circle = new Circle(10);
            System.out.println(circle);
            Rectangle rectangle = new Rectangle(5, 5);
            Cylinder cylinder = new Cylinder(rectangle, 10);
            System.out.println(cylinder);
            Cylinder cylinder1 = new Cylinder(rectangle, 10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}