import java.util.*;
public class Greedy {
    public static void main(String[] args) {
        int value[] = {60,100,120};
        int weight[] = {10,20,30};
        int w= 50;

        double ratio[][]= new double[value.length][2];
        //0th col => idx; 1st col => ratio
        for(int i = 0; i< value.length; i++){
            ratio [i][0]  = i;
        ratio [i][1]  = (double) weight[i];

        }
         //lambda function
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        //end time basis sorted
         int capacity=w;
         int finalValue=0;
         for(int i = ratio.length-1; i >= 0; i--){//descending order
             int idx = (int)ratio[i][0];
             if(capacity >= weight[idx]){
                 finalValue += value[idx];
                 capacity -= weight[idx];
             } else{
                 //include fractional item
                 finalValue += (ratio[i][1]*capacity);
                 capacity=0;
                 break;
             }
         }
        System.out.println("final value = " + finalValue);
            }
        }
