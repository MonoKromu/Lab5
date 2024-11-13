package geometry2d;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.XMLFormatter;

public class CustomFileHandler {
    private static final FileHandler h;
    static {
        try {
            h = new FileHandler("figures.log");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        h.setFormatter(new XMLFormatter());
        h.setLevel(Level.ALL);
    }
    public static FileHandler getHandler(){
        return h;
    }
}
