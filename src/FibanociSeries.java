

import java.util.Scanner;

public class FibanociSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int k = 0,a = 1,b = 1;
        System.out.print(k + " " + a + " " + b + " ");

        while(k<=n){
            k = a+b;
            System.out.print(k + " ");
            a = b;
            b = k;
        }
    }

}