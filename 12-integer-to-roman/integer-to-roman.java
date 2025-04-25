class Solution {
    public String intToRoman(int num) {
       var map = new HashMap<Integer, String>();
		map.put(1, "I");
		map.put(5, "V");
		map.put(10, "X");
		map.put(50, "L");
		map.put(100, "C");
		map.put(500, "D");
		map.put(1000, "M");
		var digits = noOfDigits(num);
		var str = new StringBuilder();
		var currLow = 0;
		var currHigh = 0;
		var faceValue = 0;
		while (num > 0) {
			currLow = (int) (Math.pow(10, digits - 1));
			currHigh = (int) (Math.pow(10, digits));
			faceValue = num / currLow;
			if (faceValue == 9) {
				var high = faceValue * currHigh;
				str.append(map.get(currLow));
				str.append(map.get(currHigh));

			} else if (faceValue >= 5) {

				str.append(map.get(5 * currLow));
				var value = (faceValue - 5);
				while (value > 0) {
					str.append(map.get(currLow));
					value--;
				}
			} else if (faceValue == 4) {
				var value = 5 * currLow;
				str.append(map.get(currLow));
				str.append(map.get(value));
			} else {
				while (faceValue > 0) {
					str.append(map.get(currLow));
					faceValue--;
				}
			}

			num %= currLow;
			digits--;
		}
		return str.toString();

    }

    public static int noOfDigits(int n) {
        return (int) (Math.floor(Math.log10(n))) + 1;
    }
}