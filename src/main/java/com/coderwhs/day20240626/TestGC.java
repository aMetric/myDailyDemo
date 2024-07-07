package com.coderwhs.day20240626;

/**
 * @Author whs
 * @Date 2024/6/26 20:12
 * @description:
 */
public class TestGC {
    public Object instance = null;

    public static final int _1MB = 1024 * 1024;

    private byte[] bigSize = new byte[2 * _1MB];

    private static void testGc(){
        TestGC objA = new TestGC();
        TestGC objB = new TestGC();
        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;
        System.gc();
    }

    public static void main(String[] args) {
        testGc();
    }
}
