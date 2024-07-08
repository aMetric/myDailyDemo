package com.coderwhs.stepByStep.day20240617.Composition;

/**
 * @Author wuhs
 * @Date 2024/6/17 14:43
 * @Description
 */
public class Main {
  public static void main(String[] args) {
    Shape redCircle = new Circle(new RedColor());
    redCircle.draw();

    Shape blueRectangle = new Rectangle(new BlueColor());
    blueRectangle.draw();
  }
}
