package com.coderwhs.stepByStep.day20240625;

/**
 * @Author whs
 * @Date 2024/6/25 19:57
 * @description:
 */
public class TestIntern {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = str1.intern();
        String str3 = "hello";
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
    }
}
