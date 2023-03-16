package drawing;

import drawing.formatting.Formatter;
import drawing.formatting.JPEGFormatter;
import drawing.formatting.PNGFormatter;
// import drawing.shapes.Line;
import drawing.shapes.Shape;
import drawing.writing.JPEGWriter;
import drawing.writing.PNGWriter;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

/**
 * Refactor Exercise 3: (Mis-)Shaped
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Drawing {

    public final List<Shape> shapes;

    public Drawing(List<Shape> shapes) {
        this.shapes = shapes;
    }

    /**
     * Draw shapes to a file with given file format.
     *
     * @param format   file format
     * @param filename file name
     */
    public void draw(String format, String filename) {
        String outName = filename + "." + format;
        // TODO: Do you notice any issues here?
        if (format.equals("jpeg")) {
            this.write(new JPEGWriter(outName), new JPEGFormatter());
        } else if (format.equals("png")) {
            this.write(new PNGWriter(outName), new PNGFormatter());
        } else {
            throw new IllegalArgumentException("Format not recognized: " + format);
        }
    }

    private void write(Writer writer, Formatter formatter) {
        try {
            for (Shape shape : this.shapes) {
                // Moved the misplaced call to 'toLines' to the Shape's 'draw' method.
                // We could even just "inline" Shape.draw here and remove it from the interface. That takes away a
                // "default method" (which isn't ideal) and simplify dependencies for Shapes.
                shape.draw(writer, formatter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

