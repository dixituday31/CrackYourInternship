class Solution {
    public void sortColors(int[] nums) {
       
    for(int i=0;i<nums.length;i++){
        int k = nums[i];
        
        int j = i - 1;
        while (j >= 0 && nums[j] > k) {
         nums[j + 1] = nums[j];
            j = j - 1;
        }
        nums[j + 1] = k;
    }
    }

}