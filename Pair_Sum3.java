import java.util.ArrayList;

public class Pair_Sum3{
    // Two-pointer approach
    public static boolean Pair_sum3(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){//breaking point
                bp = i;
                break;
            }    
        }
        int lp = bp+1; //smallest
        int rp = bp; //largest

        while (lp != rp) { 
            // Case 1: Found the pair
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // Case 2: Sum is less than target
            else if (list.get(lp) + list.get(rp) < target) {
                lp=(lp+1)%n;
            }
            // Case 3: Sum is more than target
            else {
                //case 3 
                rp= (n+rp-1)%n;
            }
        }
        // If no pair found
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        //11, 15, 6, 8, 9, 10 - Sorted and rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;
        System.out.println(Pair_sum3(list, target)); // Output: true
    }
}
