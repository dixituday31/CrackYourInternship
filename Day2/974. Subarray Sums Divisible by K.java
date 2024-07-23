package Day2;
import java.util.HashMap;
class Solution {
    public int subarraysDivByK(int[] nums, int K) {
        HashMap<Integer, Integer> summap = new HashMap<Integer, Integer>();
        summap.put(0,1);
        int Sum = 0;
        int count = 0 ;
        for(int i=0;i<nums.length;i++){
            Sum += nums[i];
            int r = Sum % K;
            if(r < 0) {
                r +=K;
            }
            if(summap.containsKey(r)) {
                count += summap.get(r);      
            }
             summap.put(r, summap.getOrDefault(r,0)+1);  
        }
        return count;
    }            
}