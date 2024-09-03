import java.util.*;
public class btrees11 {
    //two sum 4 input as a bst
    public boolean findtarget(TreeNode root,int k){
HashSet<Integer> set = new HashSet<>();
return helper(root,k,set);
    } 
    private boolean helper(TreeNode node,int k,HashSet<Integer> set){
        if (node==null) {
            return false;
            
        }
        if (set.contains(k-node.val)) {
            return true;
        }
        set.add(node.val);
        return helper(node.left, k, set) || helper(node.right, k, set);
    }
    
}
