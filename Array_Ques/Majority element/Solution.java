// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. 
//  You may assume that the majority element always exists in the array.

 
class Solution {
    public int majorityElement(int[] nums) {

        // HASHMAPS
  /*      HashMap<Integer,Integer> map=new HashMap<>();
             int c=0,M=0;
       for(int i=0;i<nums.length;i++){
            int value = map.getOrDefault(nums[i],0);
            map.put(nums[i],value + 1);
       }
        
        for(Map.Entry<Integer,Integer> mpp : map.entrySet()) {
            if(mpp.getValue() > nums.length/2)
                return mpp.getKey();
            
        }
        return -1;

     */   


//     OPTIMAL SOLUTION
        int count =0;
        int cnt=0;
        int ele=0;
        for(int i=0;i<nums.length;i++){
            if(cnt == 0){
                cnt = 1;
                ele = nums[i];
            }
            else if(nums[i]==ele)
                cnt++;
            else
            cnt--; 
        }

        for(int i=0;i<nums.length;i++){
            if(ele==nums[i])
              count++;
        }
          if(count > nums.length/2)
             return ele;
           else
             return -1;
    }
}