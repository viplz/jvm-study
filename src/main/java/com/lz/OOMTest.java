package com.lz;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lian-zhang
 * @version 1.0
 * @ClassName OOMTest.java
 * @Description TODO
 * @createTime 2022年01月20日 23:37:04
 */
public class OOMTest {

    public static void main(String[] args) {

        List<byte[]> list = new ArrayList<byte[]>();

        for (int i = 0; i < 1000; i++) {
            byte[] bytes = new byte[1024 * 100];
            list.add(bytes);
            try {
                Thread.sleep(60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
