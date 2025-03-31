class Solution {
    public int maxSubArray(int[] nums) {
      
        // Optimal Solution

            int n=nums.length;
            int maxSum=Integer.MIN_VALUE;
            int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];

            if(sum > maxSum){
            maxSum = sum;
            }

            if(sum<0)
            sum=0;
        

        }
        return maxSum;
        
    }
}