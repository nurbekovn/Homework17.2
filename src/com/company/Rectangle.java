package com.company;

public class Rectangle extends AbstractShape{
    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;
    @Override
    public double getPerimeter() {
        System.out.println(a+b+c+d+" = rectangle's perimeter");
        return a+b+c+d;
    }
}
