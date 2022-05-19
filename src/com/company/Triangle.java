package com.company;

public class Triangle extends AbstractShape{
    int a=10;
    int b=20;
    int c=30;

    @Override
    public double getPerimeter() {
        System.out.println(a+b+c+" = triangle's perimeter");
        return a+b+c;
    }
}
