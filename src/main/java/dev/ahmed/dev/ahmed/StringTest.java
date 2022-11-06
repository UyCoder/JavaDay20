package dev.ahmed.dev.ahmed;

import jdk.jfr.StackTrace;
import org.junit.Test;


/**
 * @author Ahmed Bughra
 * @create 2022-10-29  1:15 PM
 */
public class StringTest {
    /**
     * conclusion：
     *  1. sum of variable and variable will be on variable pool.
     *  2. Any of them are object, it will be on stack
     */

    @Test
    public void test33(){
        String s1 = "javaEESpring";
        String s2 = "javEE";
        String s3 = s2 + "Spring";
        System.out.println(s1==s3);

        final String s4 = "javaEE";
        String s5 = s4 + "Spring";
        System.out.println(s1==s5);
    }


    @Test
    public void testString3(){
        String s1 = "javaEE";
        String s2 = "Spring";

        String s3 = "javaEESpring";
        String s4 = "javaEE"+"Spring";
        String s5 = s1+"Spring";
        String s6 = "javaEE"+s2;
        String s7 = s1+s2;

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s5 == s6);
        System.out.println(s3 == s7);
        System.out.println(s5 == s7);
        System.out.println(s6 == s7);

        String s8 = s5.intern(); // intern() will be rerun the value from variable pool if the value is the same
        System.out.println(s3 == s8);


    }



    /**
     * Sting example
     *      1. String s1 = "hello world";
     *      2. new declration
     *
     *  === How many object will be created below line in ram ?
     *          String s = new String("abc");
     *      Answer: 2 object will be created.
     *              one object will be created stack with new
     *              one object will be crated varibale pool with char[]
     */
    @Test
    public void testString2(){
        // example 1 of string creation // variable pool
        String s1 = "JavaEE";
        String s2 = "JavaEE";

        // example 2 of string creation // stack
        String s3 = new String("JavaEE");
        String s4 = new String("JavaEE");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s3==s4);

        System.out.println("************");
        Person p1 = new Person("John", 31);
        Person p2 = new Person("John", 31);

        System.out.println(p1==p2);
        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.age==p2.age);

    }

    /**
        String will be used with ""
        1. String class is final so can't be extended
        2. String class implements Serializable interface
                        implements Comparable interface
        3. String class has final char[] value
        4. String presents non-changeable char
               * any time value changes it will create a new string , not replace old string
        5. If the value of string is the same, variable pool will not create a new string object
     */
    @Test
    public void test1(){
        String s1= "abc"; // we don't need to new for creation
        String s2= "abc";

//        System.out.println(s1);
        System.out.println(s1==s2);
        System.out.println("***************");

        String s3="abc";
        s3 += "dfg";
        System.out.println(s3);
        System.out.println(s2);

        System.out.println("***************");

        String s4="abc";
        String s5 = s4.replace("abc", "dfg");
        System.out.println(s5);
        System.out.println(s4);


    }
}
