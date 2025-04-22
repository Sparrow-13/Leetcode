class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        var trend = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] - nums[i-1] == 0 ){
                continue;
            }
            trend = (nums[i] - nums[i-1]) > 0 ? 1 : -1;
            break;
        }
        
        for (int i = 1; i < nums.length; i++) {
            var num =  nums[i] - nums[i - 1];
            num *= trend;
            if (num < 0) {
                return false;
            }
        }
        return true;
    }
}