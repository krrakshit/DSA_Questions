import java.util.*;
public class btrees10 {
    // kth smallest element
    public int kthsmallest(TreeNode root,int k){
PriorityQueue<Integer> minheap = new PriorityQueue<>();
helper(root,minheap,k);

// remove k elements
for(int i = 0;i<k;i++){
    
}
    }
    private void helper(TreeNode node,PriorityQueue<Integer> minheap,int k){
        if (node==null) {
            return;
            
        }
        helper(node.left, minheap, k);

        minheap.offer(node.val);
        helper(node.right, minheap, k);

    }
    
}
