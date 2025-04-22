class Solution {
    public int romanToInt(String s) {
        var arr = s.toCharArray();

        var map = new HashMap<Character , Integer>();
        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('L' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);
        var sum = 0;
        for(int i = 0;i<arr.length;i++){
			var first = map.get(arr[i]);
			if(i + 1 == arr.length){
				return sum + first;
			}
			var second = map.get(arr[i+1]);
			if(first < second){
				sum += second - first;
				i++;continue;
			}
			sum += first;
		}
        return sum;
    }
}