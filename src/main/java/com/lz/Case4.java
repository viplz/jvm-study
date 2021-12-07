package com.lz;

/**
 * @author lian-zhang
 * @version 1.0
 * @ClassName Case4.java
 * @Description TODO
 * @createTime 2021年11月15日 23:12:57
 */
public class Case4 {

    public static void main(String[] args) {
        Case4 cc = new Case4();
        cc.m1();
    }

    public void m1 () {
        for (int i = 0; i < 5; i++) {
            Case4 c1 = new Case4();
            System.out.println(c1.toString());
        }
    }
}
