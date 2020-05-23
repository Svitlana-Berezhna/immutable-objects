package ua.testing;

/**
 * <h1>Pixel (Immutable Objects)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-18
 */
public class Main {
    public static void main(String s[]) {
        Xcoordinate x = new Xcoordinate();
        x.setX(3.);
        Ycoordinate y = new Ycoordinate();
        y.setY(4.);
        PixelImmutable pixel = new PixelImmutable(x, y);
        System.out.println(pixel.getX().getX());
        System.out.println(pixel.getY().getY());
        pixel.getX().setX(5.);
        pixel.getY().setY(6.);
        System.out.println(pixel.getX().getX());
        System.out.println(pixel.getY().getY());
    }
}
