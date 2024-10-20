import java.util.Scanner;

public class CountPrimes {
    public static int countPrimes(int n){
        int count=0;
        for(int i=2;i<=n;i++){
            for(int j=2;j<=i;j++){
                if(i%j!=0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //int n= scanner.nextInt();
        System.out.println(countPrimes(10));
    }
}
