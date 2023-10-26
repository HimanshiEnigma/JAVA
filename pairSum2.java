import java.util.ArrayList;
public class untitled13 {
    public static  boolean pairSum2(ArrayList<Integer>List,int target){
        int bp=-1;
        int n=List.size();
        for(int i=0;i<List.size();i++){
            if(List.get(i)>List.get(i+1)){
                bp=i;
                break;

            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            //case 1
            if(List.get(lp)+List.get(rp)==target){
                return true;
            }
            //case 2
            if(List.get(lp)+List.get(rp)<target){
                lp=(lp+1)%n;
            }else {
                //case 3
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        System.out.println(pairSum2(list,target));

    }
}
