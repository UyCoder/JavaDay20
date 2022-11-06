package dev.ahmed.dev.ahmed;

import java.util.Scanner;

/**
 * @author Ahmed Bughra
 * @create 2022-11-06  12:22 PM
 */
public class ClassforTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        int maxScoer = 0;
        int[] scores = new int[number];

        System.out.println("Entered number = "+number);

        for (int i = 0; i < scores.length;i++){
            scores[i] = scanner.nextInt();
            if (maxScoer < scores[i]){
                maxScoer = scores[i];
            }
        }

        System.out.println("Maximum score is: "+maxScoer);

        char level = 0;
        for (int i = 0; i <scores.length; i++){
            if (maxScoer - scores[i] <= 10){
                level = 'A';
            } else if (maxScoer - scores[i] <= 20){
                level = 'B';
            } else if (maxScoer - scores[i] <= 30){
                level = 'C';
            } else {
                level = 'D';
            }
        }
        System.out.println(level);
    }
}
