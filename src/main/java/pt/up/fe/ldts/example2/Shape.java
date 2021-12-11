package pt.up.fe.ldts.example2;

abstract class Shape{
    private double x;
    private double y;


    protected Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    protected double getX() {
        return x;
    }

    protected double getY() {
        return y;
    }

    protected  abstract  void draw(GraphicFramework graphics);

    protected abstract double getArea();

    protected abstract double getPerimeter();

}
