public class lc209 {
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
          int ans = Integer.MAX_VALUE;
          int s = 0;
           for (int l = 0, r = 0; r < nums.length; ++r) {
          s += nums[r];
          while (s >= target) {
            ans = Math.min(ans, r - l + 1);
            s -= nums[l++];
          }
        }
         return ans == Integer.MAX_VALUE ? 0 : ans;
        }
    }
}
