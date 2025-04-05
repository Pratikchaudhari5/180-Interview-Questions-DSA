// ================== // BF // ============== //
class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            for(int j = i ; j<nums.length; j++){
                int sum = 0;
                for(int k = i; k<=j; k++){
                    sum += nums[k];
            max = Math.max(sum,max);
                }
            }
        }
        return max;
            }
}
//TC: O(n^3)
// ======================== // Better // ======================================= //
class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
             int sum = 0;
            for(int j = i ; j<nums.length; j++){
                 sum += nums[j];
            max = Math.max(sum,max);  
            }
        }
        return max;
            }
}
//TC: O(N^2)
// ======================== // Optimal // ======================================= //
class Solution {
    public int maxSubArray(int[] nums) {
       int max = Integer.MIN_VALUE;
       int sum = 0;
        for(int i = 0; i<nums.length; i++)
        {   
            sum += nums[i];
            if(sum > max){
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }
           
        }
        return max;
    }
}
//TC: O(N)
