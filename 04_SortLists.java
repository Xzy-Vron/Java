
import java.util.*;
public class SortLists {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Sort integers: enter count:");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        System.out.println("Enter integers:");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        Arrays.sort(arr);
        System.out.println("Sorted integers: " + Arrays.toString(arr));

        System.out.println("Sort names: enter count:");
        int m = sc.nextInt(); sc.nextLine();
        String[] names = new String[m];
        System.out.println("Enter names:");
        for(int i=0;i<m;i++) names[i]=sc.nextLine();
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted names: " + Arrays.toString(names));
        sc.close();
    }
}
