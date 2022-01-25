package com.lz.classloader;

import java.io.*;

public class CustomerClassLoader extends ClassLoader{

    private String byteCodePath;

    public CustomerClassLoader(String byteCodePath) {
        this.byteCodePath = byteCodePath;
    }

    public CustomerClassLoader(ClassLoader parent, String byteCodePath) {
        super(parent);
        this.byteCodePath = byteCodePath;
    }

    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        //获取字节码完整路径
        String fileName = byteCodePath + className + ".class";
        ByteArrayOutputStream baos = null;
        BufferedInputStream bis = null;
        try {
            //获取输入流
            bis = new BufferedInputStream(new FileInputStream(fileName));
            //获取输出流
            baos = new ByteArrayOutputStream();
            int len;
            byte[] data = new byte[1024];
            //读取数据并写出
            while ((len = bis.read(data)) != -1) {
                baos.write(data, 0, len);
            }
            //获取内存中完整的字节数组的数据
            byte[] byteCodes = baos.toByteArray();
            //将字节数组的数据转换为Class的实例
            Class clazz = defineClass(null, byteCodes, 0, byteCodes.length);

            return clazz;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (baos != null)
                    baos.close();
                if (bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
