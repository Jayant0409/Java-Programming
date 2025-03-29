// Given an array nums with n objects colored red, white, or blue, sort them in-place so that
// objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.


class Solution {
    public void sortColors(int[] nums) {
       
        //     BRUTE FORCE
   /*     int cnt0 =0;
        int cnt1=0;
        int cnt2=0;
          for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            cnt0++;
            else if(nums[i]==1)
            cnt1++;
            else
            cnt2++;
        }
          for(int i=0;i<cnt0;i++){
            nums[i]=0;
          }
          for(int i=cnt0;i<cnt0+cnt1;i++){
            nums[i]=1;
          }
          for(int i=cnt0+cnt1;i<cnt0+cnt1+cnt2;i++){
            nums[i]=2;
          }
          for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
          }
            */

            
        
//       OPTIMAL SOLUTION
            int low=0;
        int mid=0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1)
                mid++;
             else{
                swap(nums,mid,high);
                high--;
            }

        } 
    }
    public static void swap(int ar[],int i,int j){
        int temp=0;
        temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
    
}