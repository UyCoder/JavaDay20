package dev.ahmed.dev.ahmed;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author Ahmed Bughra
 * @create 2022-11-06  11:48 AM
 */
public class StringTest1 {
    // pasr string to primitive data types

    @Test
    public void test1(){
        // String to int
        System.out.println("String to int" +
                "=========================");
        String str1 = "123";
        int i1 = Integer.parseInt(str1);
        System.out.println(i1);

        // int to string
        System.out.println("int to string" +
                "=========================");
        String str2 = String.valueOf(i1);
        System.out.println(str2);
        String str3 = String.valueOf(i1)+12;
        System.out.println(str3);

        // String to char
        System.out.println("String to char" +
                "=========================");
        String str4 = "ahmedBughra";
        char[] c1 = str4.toCharArray();
        for (int i = 0; i <c1.length; i++) {
            System.out.println(c1[i]);
        }

        // char to String
        System.out.println("char to String" +
                "=========================");
        char[] c2 = new char[]{'a', 'b', 'c', 'd', 'e'};
        String str5 =new String(c2); // use constructor
        System.out.println(str5);

    }

    @Test
    public void test2() throws UnsupportedEncodingException {

        /** encode : String --> byte[]      use string.getBytes()
         * decode : byte[] --> String       use string constructor
         */

        // String to byte (encode)
        System.out.println("String to byte" +
                "=========================");
        String str1 = "abc123程序"; // use utf-8.  in ASCII one uyghur letter is 2 bit
        byte[] c1 = str1.getBytes();
        System.out.println(Arrays.toString(c1));

        byte[] c2 = str1.getBytes("UTF-16");
        System.out.println(c2);

        // byte to string (decode)
        String str2 = new String(c1);
        System.out.println(str2);

        String str3 = new String(c2);
        System.out.println(str3); // could not decode correctly

        String str4 = new String(c2,"UTF-16"); // charset should be the same both decode and encode
        System.out.println(str4); //






    }

}
