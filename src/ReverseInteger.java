import java.util.Scanner;

public class ReverseInteger {
    public static int reverse(int number){
       int isare=(number<0)? -1:1;

       int reverse=0;
       number=Math.abs(number);
       while(number>0){
         int remainder=number%10;
         reverse=(reverse*10)+remainder;
         number/=10;
       }

       return reverse*isare;
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int number= scanner.nextInt();

        System.out.println(reverse(number));
    }
}
