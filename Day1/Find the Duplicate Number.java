class Solution {
    public int findDuplicate(int[] nums) {
    // Start  a and b pointer
    // until they meet
    int a = 0, b = 0;
    do {
      a = nums[a];
      b = nums[nums[b]];
    } while (a != b);

    // As soon as they meet move on both
    // pointers at same speed until they
    // meet again
    a = 0;
    while (a != b) {
      a = nums[a];
      b = nums[b];
    }
    return a;
  }
}