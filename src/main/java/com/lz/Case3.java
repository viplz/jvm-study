package com.lz;

class Case3 {

    private static int aa = 4;

    public static void main(String[] args) {

    }

    public static int getAa() {

        int bb = 5;

        int cc = 6;

        return aa;
    }

    public void test1(){
        int a=0;
        {
            int b=0;
            b = a+3;
        }
        int c = a+1;
    }
}
