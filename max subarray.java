import java.util.*;
public class untitled12{
    public static void maxSubarraySum(int num[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++) {
            int start = i;
            for (int j = 0; j < num.length; j++) {
                int end = j;
                for (int k = 0; k <= end; k++) {
                    currSum += num[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
            System.out.println("max sum="+maxSum);
    }

    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        maxSubarraySum(num);
    }

