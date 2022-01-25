package com.lz.memoryleak;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lian-zhang
 * @version 1.0
 * @ClassName ChangeHashCode.java
 * @Description 内存泄漏————重写过hashCode方法。如果对象在使用过程中被重新修改字段内容
 * @createTime 2022年01月22日 20:39:18
 */
public class ChangeHashCode {

    public static void main(String[] args) {
        Set<Point> set = new HashSet<>();
        Point p = new Point();
        p.setX(10);
        set.add(p);
        p.setX(30);
        System.out.println("remove point result is " + set.remove(p));
        set.add(p);
        System.out.println("the size of set is " + set.size());

    }

}

class Point {

    private int x;

    @Override
    public int hashCode() {
        final int prime = 30;
        int result = 1;
        result = prime * result + x ;

        return result;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
