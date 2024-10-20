import java.util.Scanner;

public class AddDigits {
    public static int addDigits(int num) {

       while(num/10!=0){
           int sum=0;
           while(num/10!=0){
           int digit=num%10;
           sum+=digit;
           num/=10;
       }
           sum+=num;
           num=sum;
       }
       return num;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        System.out.println(addDigits(num));
    }
}
