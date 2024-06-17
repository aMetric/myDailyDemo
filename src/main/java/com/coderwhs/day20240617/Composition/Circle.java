package com.coderwhs.day20240617.Composition;

class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Drawing a circle with ");
        color.applyColor();
    }
}
