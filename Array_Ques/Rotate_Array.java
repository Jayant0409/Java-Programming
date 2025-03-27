
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class Rotate_Array {

    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        
      ArrayList<Integer> list=new ArrayList<>();
      for(int num:nums){
             list.add(num);
      }
         Collections.reverse(list);
         Collections.reverse(list.subList(0,k));
         Collections.reverse(list.subList(k,list.size()));
         for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
         }   
        
    }
}
