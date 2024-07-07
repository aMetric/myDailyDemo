package com.coderwhs.day20240625;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Author whs
 * @Date 2024/6/25 12:36
 * @description:
 */
public class HeapOOM {
    static class OOMObject{

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true){
            list.add(new OOMObject());
            System.out.println(UUID.randomUUID());
        }
    }
}
