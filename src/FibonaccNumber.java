import java.util.Scanner;

public class FibonaccNumber {
    public static int fib(int n) {
       int f1=0, f2=1, sum=0;
       if(n==0 || n==1){
           return n;
       }
       else{
           for(int i=0;i<=n-1;i++){
               f1=f2;
               f2=sum;
               sum=f1+f2;
           }
       }
       return sum;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.println(fib(n));
    }
}
