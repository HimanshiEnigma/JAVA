import java.util.ArrayList;
public class untitled13 {
    //brute force
    public static boolean pairSum1(ArrayList<Integer>List,int target){
        for(int i=0;i< List.size();i++){
            for(int j=i+1;j<List.size();j++){
                if(List.get(i)+List.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<>();
        //1,2,3,4,5,6
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        int target=5;
        System.out.println(pairSum1(List,target));
    }
}
