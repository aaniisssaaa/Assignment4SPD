package bridge.src;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.printf("Drawing a circle of radius %.2f as pixels\n", radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.printf("Drawing a square of side %.2f as pixels\n", side);
    }
}
