import java.util.*;

public class btrees05 {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    
        
    }
    public static void printpath(ArrayList<Integer> path){
        for(int i = 0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    public static void root2leaf(Node root, ArrayList<Integer> path){
        if (root == null) {
            return;
            
        }

        path.add(root.data);
        if (root.left == null && root.right == null){
            printpath(path);
        } {
            
        }
        root2leaf(root.left, path);
        root2leaf(root.right, path);
        path.remove(path.size()-1);


    }
    // root to leaf path
    public static void main(String[] args) {
        
    }
    
}
