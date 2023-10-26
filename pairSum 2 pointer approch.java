import java.util.ArrayList;
public class untitled13{
    public static boolean pairSum1(ArrayList<Integer>List,int target){
        int lp=0;
        int rp=List.size()-1;
         while(lp!=rp){
             //case 1
             if(List.get(lp)+List.get(rp)==target){
                 return true;
             }
             //case 2
             if(List.get(lp)+List.get(rp)<target){
                 lp++;
                 return true;
             } else{
                 //case 3
                 rp--;
             }

         }
         return false;
    }
