import java.util.HashMap;
class TwoSumProblem{
    public int[] twoSum(int[] nums, int target) {
           int n = nums.length;
           int num,moreNeeded;
           HashMap<Integer,Integer>map = new HashMap<>();
           for(int i=0;i<n;i++){
                num=nums[i];
                moreNeeded = target - num;
                if(map.containsKey(moreNeeded)){
                    return new int[]{map.get(moreNeeded),i};
                }
                else
                map.put(num,i);
           }
           return new int[]{-1,-1};
           }
}