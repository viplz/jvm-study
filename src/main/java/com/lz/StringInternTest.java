package com.lz;

/**
 * @author lian-zhang
 * @version 1.0
 * @ClassName StringInternTest.java
 * @Description TODO
 * @createTime 2021年12月23日 22:31:20
 */
public class StringInternTest {

    public static void main(String[] args) {

        //此步骤并未在字符串常量池中创建"ab"，仅在堆空间中new了一份
        String s1 = new String("a") + new String("b");
        //此步骤：
        // ① 在jdk6中，若字符串常量池中没有该字符串，则存放该字符串到字符串常量池，若字符串池中已存在，则复制一份字符串对象到常量池中并返回常量池中的地址
        // ② 在jdk7、8中，若字符串常量池中没有该字符串，则存放该字符串到字符串常量池，若字符串池中已存在，则复制一份字符串对象的引用到常量池中并返回常量池中的引用地址
        s1.intern();
        //在字符串常量池中尝试存放一个“ab”
        String s2 = "ab";
        //jdk6：false; jdk7/8：true
        System.out.println(s1 == s2);

    }
}
