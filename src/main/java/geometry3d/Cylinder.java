package geometry3d;
import exceptions.InvalidSizeException;
import exceptions.NullBaseException;
import geometry2d.Figure;

import java.io.IOException;
import java.util.Objects;
import java.util.logging.*;

public class Cylinder {
    Figure base;
    double height;
    private static final Logger LOGGER = Logger.getLogger(Cylinder.class.getName());
    private static final Handler HANDLER;
    static {
        try {
            HANDLER = new FileHandler("cylinder.log");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        HANDLER.setFormatter(new SimpleFormatter());
        HANDLER.setLevel(Level.FINEST);
        LOGGER.setLevel(Level.FINEST);
        LOGGER.addHandler(HANDLER);
    }

    public Cylinder(Figure base, double height) throws InvalidSizeException, NullBaseException {
        LOGGER.finest("Created new Cylinder");
        setBase(base);
        setHeight(height);
    }

    public double volume(){
        LOGGER.finest("Calculating cylinder volume");
        return (base.area() * height);
    }

    public Figure getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }

    @Override
    public String toString(){
        return ("[Figure: cylinder, base: "+base+", height: "+height+", volume: "+volume()+"]");
    }

    public void setBase(Figure base) throws NullBaseException {
        if(Objects.isNull(base)) throw new NullBaseException("Base for cylinder is null");
        else{
            LOGGER.log(Level.FINEST,"Setting base for cylinder: {0}", base.getClass().getName());
            this.base = base;
        }
    }
    public void setHeight(double height) throws InvalidSizeException {
        if(height<=0) throw new InvalidSizeException("Height of cylinder ("+height+") is <= 0");
        else{
            LOGGER.log(Level.FINEST, "Setting cylinder height to {0}",height);
            this.height = height;
        }
    }
}
