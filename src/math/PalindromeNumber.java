package math;

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int num=x;

        long reverse=0;
        while(x!=0){
            long reminder=x%10;
            reverse=(reverse*10)+reminder;
            x/=10;
        }

        if( num==reverse){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x= scanner.nextInt();
        System.out.println(isPalindrome(x));
    }
}
