package com.coderwhs.day20240617.Composition;

class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Drawing a rectangle with ");
        color.applyColor();
    }
}
