/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        var low = 1;
        var high = n;
        var ans = n;
        while(low <= high){
            var mid = low + (high - low)/2;
            var badVersion = isBadVersion(mid);
            if(badVersion){
                ans = Math.min(mid , ans);
                high = mid - 1 ;
                continue;
            }
            low = mid + 1;
        }
        return ans;
    }
}