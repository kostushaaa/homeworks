package homework.lektionone.tasktwo;

import java.lang.Math;

public class Triangle {
    private double a;
    private double b;
    private double c;
    private double halfPerimeter;
    private double square;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.halfPerimeter = (a + b + c) / 2;
        countSquare();
    }

    public Triangle() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getHalfPerimeter() {
        return halfPerimeter;
    }

    public void setHalfPerimeter(double halfPerimeter) {
        this.halfPerimeter = halfPerimeter;
    }

    public double getSquare() {
        return square;
    }

    private void countSquare() {
        this.square = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }
}
