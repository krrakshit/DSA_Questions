import java.util.*;
public class problems {

     static int dup(int arr[],List<Integer> list){
        for(int i = 0;i<arr.length;i++){
            if(list.contains(arr[i])){
                return arr[i];
            }
            else{
                list.add(arr[i]);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,11,5,2,8,2,9,1};
        List<Integer> list = new ArrayList<>();
            dup(arr, list);
        
    }
    
}
