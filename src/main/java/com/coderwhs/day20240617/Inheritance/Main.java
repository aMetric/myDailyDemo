package com.coderwhs.day20240617.Inheritance;

/**
 * @Author wuhs
 * @Date 2024/6/17 14:43
 * @Description
 */
public class Main {
  public static void main(String[] args) {
    Shape redCircle = new RedCircle();
    redCircle.draw();

    Shape blueRectangle = new BlueRectangle();
    blueRectangle.draw();
  }
}
