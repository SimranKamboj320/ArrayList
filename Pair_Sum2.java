import java.util.ArrayList;

public class Pair_Sum2 {
    // Two-pointer approach
    public static boolean Pair_sum2(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while (lp < rp) { // Use lp < rp instead of lp != rp
            // Case 1: Found the pair
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // Case 2: Sum is less than target, move lp to the right
            else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            }
            // Case 3: Sum is more than target, move rp to the left
            else {
                rp--;
            }
        }
        // If no pair found
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        int target = 5;
        System.out.println(Pair_sum2(list, target)); // Output: true
    }
}
