class Solution {
    public int singleNonDuplicate(int[] nums) {
        int result = 0;
        int low = 0, high = nums.length-1;
        while(low < high)
        {
            int mid = (low + high)/2;
            if(nums[mid] == nums[mid+1])
            {
                mid = mid -1;
            }
            if(((mid-low) + 1) % 2 != 0)
            {
                high = mid;
            }
            if((high-mid) % 2 != 0)
            {
                    low = mid+1;
            }
        }
        
        return nums[low];
       
    }