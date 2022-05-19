package com.company;

public class Main {

    public static void main(String[] args) {
        AbstractShape circle = new Circle();
        AbstractShape hexagon = new Hexagon();
        AbstractShape rectangle = new Rectangle();
        AbstractShape square = new Square();
        AbstractShape triangle = new Triangle();

        AbstractShape [] array = {circle,hexagon,rectangle,square,triangle};
        for (AbstractShape shapes: array) {
            shapes.getPerimeter();
        }
    }
}
