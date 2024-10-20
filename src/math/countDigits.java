package math;

import java.util.Scanner;

public class countDigits {
    public static  int countDigits(int num) {
        int num1=num;
        int count=0;
       while (num>0){
           int digit=num%10;
           if(num1%digit==0){
               count++;
           }
           num/=10;
       }
       return count;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.println(countDigits(n));
    }
}
