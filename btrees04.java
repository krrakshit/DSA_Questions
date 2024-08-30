

public class btrees04 {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    
        
    }
    // validate bst

    public static boolean isvalidbst(Node root,Node min,Node max){
        if (root==null) {
            return true;
            
        }
        if (min != null && root.data <= min.data) {
            return false;
        }
        else if (max != null && root.data >= max.data){
            return false;
        } 
        return isvalidbst(root.left, min, root) && isvalidbst(root.right, root, max);

    }
    public static void main(String[] args) {
        

    }
}
