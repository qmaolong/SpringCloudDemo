package com.springcloud.normal;
import static java.lang.Long.*;
/**
 * Created by qmaolong on 2020/6/24
 */
public class Test {


    private static int i;
    private static int[] array = new int[2];
    public static void main(String[] args) {
        Integer i1 = -9;
        i1 >>= 1;
        System.out.println(i1);
        String v1 = Integer.toBinaryString(i1);
        System.out.println(v1);
        System.out.println(v1.length());

        Integer v3 = -8;
        Integer v4 = -1;
        System.out.println("v3=" + Integer.toUnsignedString(v3));
        System.out.println("v4=" + Integer.toUnsignedString(v4));
        System.out.println(~ v4);

        byte a = '1';
        a = -128;

        System.out.println("-----------------------");
        int id = 1;
        Long id1 = (Long.valueOf(id) << 20) + id;
        System.out.println(Long.toBinaryString(id1));
        Long id2 = id1^0x69c78963;
        System.out.println(id2.toString());
        Long id3 = id2&0xffffffff;
        System.out.println(Long.toBinaryString(id3));
        System.out.println(id3.toString());
        int b = 0x69c78963;
        System.out.println(b);
        System.out.println(0xffffffff - 1);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(array[1]);
    }
}
