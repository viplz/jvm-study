package com.lz.classloader;

public class CustomerClassLoaderTest {

    public static void main(String[] args) {
        CustomerClassLoader loader = new CustomerClassLoader("D:/");
        try {
            Class clazz = loader.loadClass("Case1");
            System.out.println("加载此类的类加载器为："+clazz.getClassLoader().getClass().getName());
            System.out.println("加载此类父类的类加载器为："+clazz.getClassLoader().getParent().getClass().getName());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
