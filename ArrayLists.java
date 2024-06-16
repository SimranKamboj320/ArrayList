import java.util.ArrayList;
public class ArrayLists{
    public static void main(String args[]){
        //ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();

        //add operation -- O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1, 9); //-- O(n)
        System.out.println(list);

        //get operation -- O(1)
        int element = list.get(2);
        System.out.println(element);

        //delete operation -- O(n)
        list.remove(1);
        System.out.println(list);

        //set operation -- O(n)
        list.set(1, 10);
        System.out.println(list);

        //Contains opeartion -- O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(2));
    }
}