package com.company;

public class Circle extends AbstractShape{
    int radius = 5;
    int diameter =7;
    @Override
    public double getPerimeter() {
        System.out.println(radius+diameter+" = circle's perimeter");
        return radius+diameter;
    }
}
