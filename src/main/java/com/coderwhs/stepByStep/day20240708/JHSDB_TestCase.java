package com.coderwhs.stepByStep.day20240708;

import org.omg.CORBA.ObjectHolder;

/**
 * @Author whs
 * @Date 2024/7/8 20:11
 * @description:
 */
public class JHSDB_TestCase {
    public static void main(String[] args) {
        Test test = new Test();
        test.foo();
    }

    static class Test{
        static org.omg.CORBA.ObjectHolder staticObj = new org.omg.CORBA.ObjectHolder();
        org.omg.CORBA.ObjectHolder instanceObj = new org.omg.CORBA.ObjectHolder();

        void foo(){
            org.omg.CORBA.ObjectHolder localObj = new org.omg.CORBA.ObjectHolder();
            System.out.println("done");
        }
    }

    private static class ObjectHolder{

    }
}
