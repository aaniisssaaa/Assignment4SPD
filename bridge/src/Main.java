package bridge.src;

public class Main {
    public static void main(String[] args) {
        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();

        Shape circleVector = new Circle(vector, 5);
        Shape squareRaster = new Square(raster, 3);

        circleVector.draw();
        squareRaster.draw();
    }
}
