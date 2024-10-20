package math;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int num=i;
            int count=0;
            int totalDigit=0;
            while(num>0){
                int digit=num%10;
                if(digit!=0 && i%digit==0){
                    count++;
                }
                totalDigit++;
                num/=10;
            }
            if(count==totalDigit){
                list.add(i);
            }
        }

        return list;
    }


    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1,22));
    }
}
