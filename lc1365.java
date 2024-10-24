import java.util.Arrays;

public class lc1365{
    class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
        
            int count[] = new int[102];
            for (int num : nums) {
                count[num + 1]++;
            }
    
            for (int i = 1; i < count.length; i++) {
                count[i] += count[i - 1];
            }
            int n = nums.length;
    
            int result[] = new int[n];
             for (int i = 0; i < n; ++i) {
                result[i] = count[nums[i]]; 
            }
            return result;
        }
    }
}