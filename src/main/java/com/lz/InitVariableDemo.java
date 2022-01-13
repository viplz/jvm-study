package com.lz;

/**
 * @author lian-zhang
 * @version 1.0
 * @ClassName InitVariableDemo.java
 * @Description 成员变量（非静态）赋值过程： ① 默认初始化 ② 显式初始化 || 代码块中初始化 （具体看书写的先后顺序） ③ 构造器中初始化 ④ 对象创建后为成员变量显式赋值
 * @createTime 2022年01月13日 23:14:27
 */
public class InitVariableDemo {

    private int aa = 10;

    {
        bb = 22;
    }

    private int bb = 55;

    {
        aa = 20;
    }

    public InitVariableDemo(){
        this.aa = 30;
    }


    public static void main(String[] args) {
        InitVariableDemo obj = new InitVariableDemo();
        System.out.println("aa="+ obj.aa + " && bb=" + obj.bb);
    }
}
