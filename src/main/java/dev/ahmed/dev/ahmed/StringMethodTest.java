package dev.ahmed.dev.ahmed;

import org.junit.Test;

import javax.xml.transform.sax.SAXResult;
import java.util.Locale;

/**
 * @author Ahmed Bughra
 * @create 2022-11-04  1:53 AM
 */
public class StringMethodTest {
    @Test
    public void test2() {
        String s1 = "hello world";
        String s2 = "hello World";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3 = "hello";
        String s4 = "World";
        System.out.println(s3.concat(s4)); // we can use + ]

        String s5 = "hello";
        String s6 = new String("hello");
        System.out.println(s5.compareTo(s6)); // string sequence

        String s7 = "helloworld";
        String s8 = s7.substring(2);
        System.out.println(s7);
        System.out.println(s8);
        String s9 = s7.substring(2, 5); // from beginIndex to endIndex (not including)
                                        //  [a,b)
        System.out.println(s9);
    }


    @Test
    public void test1() {
        String s1= "helloworld";

        System.out.println(s1.length());
        System.out.println(s1.charAt(0));

        System.out.println(s1.isEmpty());

        String s2= s1.toLowerCase();
        System.out.println(s1); // s1 will not be changed. should be the old s1
        System.out.println(s2); // changed with lower case s1

        String s3= "  he   llo   world   ";
        String s4 = s3.trim();
        System.out.println("---"+s3+"----");
        System.out.println("---"+s4+"----");

    }

}