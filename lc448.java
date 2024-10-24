import java.util.*;
public class lc448 {
    public static void main(String[] args) {
        int nums[] = {3,2,5,6,9,1};
        int n = nums.length;
        boolean[] present = new boolean[n + 1];

        for (int num : nums) {
            present[num] = true;
        }

        List<Integer> missing = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                missing.add(i);
            }
        }

       System.out.println(missing);
    }
    
}
