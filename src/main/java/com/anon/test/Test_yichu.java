package com.anon.test;

/**
 * Created by lenovo on 2017/1/17.
 */
public class Test_yichu {
    public static void main(String[] args) throws Exception {
        long abs = Math.abs(-2147483648l);
        System.out.println(abs);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        double log = Math.pow(2,31);
        System.out.println(log);
        //if 二义性
        if(false)if(false) System.out.println("one");else System.out.println("two");else System.out.println("three");

        System.out.println((char)('a'+4));
        System.out.println('b');
        System.out.println((char)('b'+'c'));
        System.out.println(IntegerToBinaryString(8));
    }

    public static String IntegerToBinaryString(Integer var) throws Exception{
        String s = "";
        while (var>0){
            s =var%2+s;
            var = var/2;
        }
//        for (int n = var;n>0;n/=2)
//            s=n%2+s;
        return s;
    }
}
