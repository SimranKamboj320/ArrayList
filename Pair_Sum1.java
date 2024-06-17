import java.util.ArrayList;
public class Pair_Sum1{
    //Brute Force
    public static boolean Pair_sum1(ArrayList<Integer> list, int target){
        for(int i=0; i<list.size(); i++){
            for(int j = i+1; j<list.size(); j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        int target = 6;
        System.out.println(Pair_sum1(list, target));
    }
}        