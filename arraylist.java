import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        System.err.println("Enter 5 numbers: ");
        for (int i=0;i<5;i++){
           list.add(ab.nextInt());
        }
        System.out.println(list);
        list.add(12);
        System.out.println(list.contains(56));
        System.out.println(list.set(0, 100));
        
    }
}
