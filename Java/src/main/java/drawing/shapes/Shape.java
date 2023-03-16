package drawing.shapes;

import drawing.formatting.Formatter;

import java.io.IOException;
import java.io.Writer;

/**
 * Refactor Exercise 3: (Mis-)Shaped
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public interface Shape {

    /**
     * Converts shape into lines.
     *
     * @return lines of this shape.
     */
    Line[] toLines();

    /**
     * Draws lines to file.
     */
    default void draw(Writer writer, Formatter formatter) throws IOException {
        Line[] lines = this.toLines();
        try {
            for (Line line : lines) {
                writer.write(formatter.format(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
