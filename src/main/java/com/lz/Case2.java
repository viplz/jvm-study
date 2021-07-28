package com.lz;

import sun.misc.Launcher;
import sun.security.ec.CurveDB;

import java.net.URL;

public class Case2 {

    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);

        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);

        System.out.println("------");
        ClassLoader classLoader = Case2.class.getClassLoader();
        System.out.println(classLoader);

        System.out.println(classLoader.getParent());

        System.out.println("------");
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(contextClassLoader);

        System.out.println("------");
        System.out.println("引导类加载器加载的api的路径");
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL url: urLs ) {
            System.out.println(url);
        }
        System.out.println("------");
        System.out.println("扩展类加载器加载的api的路径");
        String extDirs = System.getProperty("java.ext.dirs");
        for (String url:extDirs.split(";")) {
            System.out.println(url);
        }
        ClassLoader extCL = CurveDB.class.getClassLoader();
        System.out.println(extCL);
    }
}
