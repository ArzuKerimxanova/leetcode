package math;

public class NumberOfCommonFactors {
    public static int commonFactors(int a, int b) {
        int count=0;
        for(int i=1;i<=Math.max(a,b);i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(commonFactors(25,30));
    }
}
