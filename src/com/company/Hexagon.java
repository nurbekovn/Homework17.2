package com.company;

public class Hexagon extends AbstractShape{
    int a=5;
    int b=6;
    @Override
    public double getPerimeter() {
        System.out.println(a*b+" = hexagon's perimeter");
        return a*b;
    }
}