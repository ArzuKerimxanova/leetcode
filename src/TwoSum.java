import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                return new int[] {i,j};
            }
        }}

        return new int[] {};
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Olcusunu daxil edin: ");
        int size= scanner.nextInt();
        int[] nums=new int[size];

        for(int i=0;i<nums.length;i++){
            nums[i]= scanner.nextInt();
        }

        for(int i:nums){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Eded daxil edin:");
        int target=scanner.nextInt();
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}
