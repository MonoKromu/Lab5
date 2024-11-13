package geometry2d;

import exceptions.InvalidSizeException;
import geometry3d.Cylinder;

import java.io.IOException;
import java.util.logging.*;

public class Circle implements Figure{
    private double radius;
    private static final Logger LOGGER = Logger.getLogger(Cylinder.class.getName());
    static {
        LOGGER.setLevel(Level.SEVERE);
        LOGGER.addHandler(CustomFileHandler.getHandler());
    }

    public Circle(double radius) throws InvalidSizeException {
        LOGGER.severe("Created new Circle");
        setRadius(radius);
    }

    @Override
    public double area() {
        LOGGER.severe("Calculating circle area");
        return (Math.PI * radius * radius);
    }

    @Override
    public double perimeter() {
        LOGGER.severe("Calculating circle perimeter");
        return(2 * Math.PI * radius);
    }

    @Override
    public String toString(){
        return ("[Figure: circle, radius: "+radius+", area: "+area()+", perimeter: "+perimeter()+"]");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws InvalidSizeException {
        if(radius<=0) throw new InvalidSizeException("Radius of circle ("+radius+") is <= 0");
        else{
            LOGGER.log(Level.SEVERE, "Setting cylinder radius to {0}",radius);
            this.radius = radius;
        }
    }
}
