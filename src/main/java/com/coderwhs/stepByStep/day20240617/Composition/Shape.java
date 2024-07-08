package com.coderwhs.stepByStep.day20240617.Composition;

abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}
