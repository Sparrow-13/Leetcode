class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        var diff = arr[1] - arr[0];
        for(int i =1 ;i<arr.length - 1;i++){
            if(diff != arr[i+1] - arr[i]){
                return false;
            }
        }
        return true;
    }
}