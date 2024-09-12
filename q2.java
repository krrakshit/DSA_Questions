import java.util.Arrays;
import java.util.Comparator;

public class q2 {
    // maximum length of pair chain
    // ou are given an array of n pairs pairs where pairs[i] = [lefti, righti] and lefti < righti

    class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int Chainnend = pairs[0][1];

        for (int i = 1;i< pairs.length;i++){
            if (pairs[i][0] > Chainnend){
                chainLen++;
                Chainnend = pairs[i][1];
            }
        }
        return chainLen;
    }
}
}
