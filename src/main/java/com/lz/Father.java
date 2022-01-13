package com.lz;

/**
 * @author lian-zhang
 * @version 1.0
 * @ClassName Father.java
 * @Description TODO
 * @createTime 2022年01月13日 23:01:36
 */
public class Father {
    int x = 10;

    public Father() {
        this.println();
        this.x = 20;
    }

    public void println(){
        System.out.println("Father.x="+this.x);
    }

}

class Son extends Father{
    int x = 30;

    public Son() {
        this.println();
        this.x=40;
    }

    public void println() {
        System.out.println("Son.x=" + x);
    }
}

class Test {
    public static void main(String[] args) {
        Father father = new Son();
        System.out.println(father.x);
    }
}