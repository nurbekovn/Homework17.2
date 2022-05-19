package com.company;

public class Square  extends AbstractShape{
    int a = 2;
    int b = 3;
    int c = 4;
    int d = 5;
    @Override
    public double getPerimeter() {
        System.out.println(a+b+c+d+" = square's perimeter");
        return a+b+c+d;
    }
}
