class Solution {
    public static String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase();
		var map = new HashMap<String , Integer>();
		for(var i : banned){
			paragraph = paragraph.replaceAll(i.toLowerCase() , " ");
		}

		var arr = paragraph.split("[\\s\\.\\,\\!\\?\\'\\;]+");
		var max = Integer.MIN_VALUE;
		var str = arr[0];
		for(var i : arr){
            if(i.isEmpty()){
                continue;
            }
			if(!map.containsKey(i)){
                if(max <= 1){
					max = 1 ;
					str = i;
				}
				map.put(i , 1);
			}
			else{
				var curr = map.get(i)+1;
				if(max <= curr){
					max = curr ;
					str = i;
				}
				map.put(i , curr);
			}
		}
		return str;
	}
}