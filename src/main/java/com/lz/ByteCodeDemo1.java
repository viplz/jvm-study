package com.lz;

/**
 * @author lian-zhang
 * @version 1.0
 * @ClassName ByteCodeDemo1.java
 * @Description TODO
 * @createTime 2022年01月13日 22:28:04
 */
public class ByteCodeDemo1 {

    public static void main(String[] args) {

        Integer a = 5;
        int b = 5;
        System.out.println(a == b);

        Integer a1 = 10;
        Integer b1 = 10;
        System.out.println(a1 == b1);

        Integer a2 = 128;
        Integer b2 = 128;
        System.out.println(a2 == b2);

    }
}
