package com.lz.memoryleak;

/**
 * @author lian-zhang
 * @version 1.0
 * @ClassName Outer.java
 * @Description TODO
 * @createTime 2022年01月22日 21:11:22
 */
public class Outer {
    private static int a = 10;
    private static int getA(){
        return a;
    }

    private static void setA(int a){
        Outer.a = a;
    }

    static class Inner{
        public static void callOuterMethod(){
            Outer.setA(20);
            System.out.println(getA());
        }
    }

    public static void main(String[] args) {
        Outer.Inner.callOuterMethod();
    }
}