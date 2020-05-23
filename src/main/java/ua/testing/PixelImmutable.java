package ua.testing;

/**
 * <h1>Pixel (Immutable Objects)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-18
 */
public final class PixelImmutable {
    private final Xcoordinate x;
    private final Ycoordinate y;

    public PixelImmutable(Xcoordinate x, Ycoordinate y) {
        Xcoordinate cloneX = new Xcoordinate();
        cloneX.setX(x.getX());
        this.x = cloneX;

        Ycoordinate cloneY = new Ycoordinate();
        cloneY.setY(y.getY());
        this.y = cloneY;
    }

    public Xcoordinate getX() {
        Xcoordinate cloneX = new Xcoordinate();
        cloneX.setX(this.x.getX());
        return cloneX;
    }

    public Ycoordinate getY() {
        Ycoordinate cloneY = new Ycoordinate();
        cloneY.setY(this.y.getY());
        return cloneY;
    }

    public PixelImmutable setX(Xcoordinate x) {
        return new PixelImmutable(x, this.y);
    }

    public PixelImmutable setY(Ycoordinate y) {
        return new PixelImmutable(this.x, y);
    }
}
