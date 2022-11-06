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
    public void test4(){
        String s1 = "hello";
        String s2 = s1.replace('h','y');
        String s3 = s1.replace("he", "y");
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("***************");
        String str = "12hello34world5java7891mysql456";
        String string = str.replaceAll("\\d+",","); // "\\d+" means positive number
        String stri1 = string.replaceAll("^,|,$" ,""); //"^,|,$" means suffix or prefix is ,

        System.out.println(string);
        System.out.println(stri1);

        str = "12345";
        boolean matches = str.matches("\\d+");
        System.out.println(matches);
        String tel = "0571-4534893";
        boolean result = tel.matches("0571-\\d{7,8}");
        System.out.println(result);

        System.out.println("***************");
        str = "hello|world|java";
        String[] strs = str.split("\\|");
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
        System.out.println();
        String str2 = "hello.world.java";
        String[] strs2 = str2.split("\\.");
        for (int i = 0; i < strs2.length; i++){
            System.out.println(strs2[i]);
        }


    }

    @Test
    public void test3() {
        String str1= "hello world";
        boolean b1=str1.endsWith("ld");
        boolean b2=str1.endsWith("0");
        System.out.println(b1);
        System.out.println(b2);

        boolean b3 = str1.startsWith("h");
        System.out.println(b3);

        boolean b4 = str1.startsWith("ell",1);
        System.out.println(b4);

        String str2 = "world";
        System.out.println(str1.contains(str2));

        System.out.println(str1.indexOf(str2));
        System.out.println(str1.indexOf("llo"));

        System.out.println(str1.indexOf("lo",5));

        String str3 = "hellorworld";
        System.out.println(str3.lastIndexOf("or")); // search from the last character

        System.out.println(str3.lastIndexOf("or",4));

    }

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
