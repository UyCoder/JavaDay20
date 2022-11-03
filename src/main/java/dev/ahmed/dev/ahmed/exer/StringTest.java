package dev.ahmed.dev.ahmed.exer;

/**
 * @author Ahmed Bughra
 * @create 2022-10-30  12:08 PM
 *
 * interview question========
 * Conclusion:
 *      String is final so it can not be replaced ,
 *      char can be replaced
 *
 *
 */
public class StringTest {
    String str = new String("good");
    char[] ch = {'t','e','s','t'};

    public void chage(String str, char ch[]){
        str = "test ok";
        ch[0] = 'b';
    }
    public static void main(String[] args){
        StringTest ex = new StringTest();
        ex.chage(ex.str,ex.ch);
        System.out.println(ex.str);
        System.out.println(ex.ch);
    }
}
