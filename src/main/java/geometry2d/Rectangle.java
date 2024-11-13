package geometry2d;

import exceptions.InvalidSizeException;
import geometry3d.Cylinder;

import java.io.IOException;
import java.util.logging.*;

public class Rectangle implements Figure {
    private double length;
    private double width;
    private static final Logger LOGGER = Logger.getLogger(Cylinder.class.getName());
    static {
        LOGGER.setLevel(Level.INFO);
        LOGGER.addHandler(CustomFileHandler.getHandler());
    }

    public Rectangle(double length, double width) throws InvalidSizeException {
        LOGGER.info("Created new Rectangle");
        setLength(length);
        setWidth(width);
    }

    @Override
    public double area() {
        LOGGER.info("Calculating rectangle area");
        return (length * width);
    }

    @Override
    public double perimeter() {
        LOGGER.info("Calculating rectangle perimeter");
        return (2 * length + 2 * width);
    }

    @Override
    public String toString(){
        return ("[Figure: rectangle, width: "+width+", length: "+length
                +", area: "+area()+", perimeter: "+perimeter()+"]");
    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    public void setLength(double length) throws InvalidSizeException {
        if(length <=0) throw new InvalidSizeException("Length of rectangle ("+ length +") is <= 0");
        else{
            LOGGER.log(Level.INFO, "Setting rectangle length to {0}",length);
            this.length = length;
        }
    }
    public void setWidth(double width) throws InvalidSizeException {
        if(width<=0) throw new InvalidSizeException("Width of rectangle ("+width+") is <= 0");
        else{
            LOGGER.log(Level.INFO, "Setting rectangle width to {0}",width);
            this.width = width;
        }
    }
}
