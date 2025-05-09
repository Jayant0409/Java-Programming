class Solution {
    public int longestSubarray(int[] arr, int k) {
    
        int n=arr.length;
        Map<Long , Integer> preSumMap =new HashMap<>();
        long sum=0;
        int maxLen=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            
            if(sum==k){
                maxLen = Math.max(maxLen,i+1);
            }
            long rem = sum-k;
            
            if(preSumMap.containsKey(rem)){
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen,len);
            }
            
            if(!preSumMap.containsKey(sum)){
                preSumMap.put(sum,i);
            }
        }
    return maxLen;
}
}
