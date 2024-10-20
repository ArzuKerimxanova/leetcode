package array;

public class FindNumberswithEvenNumberofDigits {
    public static int findNumbers(int[] nums) {
        int sum=0;
        for(int num:nums){
            int count=0;
            while(num>0){
                num/=10;
                count++;
            }
            if(count%2==0){
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
}
