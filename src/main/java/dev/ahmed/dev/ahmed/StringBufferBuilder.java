package dev.ahmed.dev.ahmed;

import org.junit.Test;

import java.lang.reflect.GenericDeclaration;



/**
 * @author Ahmed Bughra
 * @create 2022-11-08  9:55 PM
 *
 * Use of stringBuffer and stringBuilder
 */

public class StringBufferBuilder {
    /**
     * String           : unchangeable
     * String buffer    : changeable , thread sage
     * String builder   : changeable , effective
     *
     *
     * 1. String
     *      String str = new String(); ---> new char[0]
     *      String str1 = new String("abc"); ---> new char[]{'a', 'b', 'c'}
     *
     * 2. StringBuffer
     *      StringBuffer sb = new StringBuffer(); ---> new char[16]
     *      sb.append('a'); ---> value[0] = 'a';
     *      sb.append('b'); ---> value[1] = 'b';
     *      StringBuffer sb1 = new StringBuffer("abc"); ---> char[] value = new char["abc".length+16]
     *
     * Question : System.out.println(sb1.length());
     *  Recommend to
     *              StringBuffer(int capacity) StringBuilder(int capacity)
     *
     *
     * 3. StringBuilder
     *
     *
     *
     */

    @Test
    public void test1() {
        StringBuffer sb1 = new StringBuffer("hello world");
        sb1.setCharAt(0, 'm');
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb2.length());


        /** StringBuffer methods:
         *      append(xxx)
         *      delete(int start, int end)
         *      replace(int start, int end, String str)
         *      insert(int offset, xxx)
         *      reverse()
         *      public int indexOf(String sty)
         *      public String substring(int start, int end)
         *      public int length()
         *      public char charAt(int n)
         *      public void setCharAt(int n, char ch)
         */

    }

    @Test
    public void test2() {
        long startTime = 0L;
        long endTime = 0L;
        String text = "";

        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");

        startTime = System.currentTimeMillis();
        for (int i = 0; i <20000;i++){
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer time" + (endTime - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i <20000;i++){
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder time: "+(endTime - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i <20000;i++){
            text = text+i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String time: "+(endTime - startTime));



    }
        @Test
        public void test4() {
            StringBuffer sb3= new StringBuffer("abc");
            sb3.append(1);
            sb3.append("a");
            sb3.delete(2,4);
            sb3.replace(2,4,"hello");
            sb3.insert(2,false);
            sb3.reverse();
            sb3.substring(1,3);
            System.out.println(sb3);

        }

}
