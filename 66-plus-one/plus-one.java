class Solution {
    public static int[] plusOne(int[] digits) {
		var carry = 1;
		var n = digits.length - 1;
		while (n >= 0) {
			if ((digits[n] + carry) == 10) {
				carry = 1;
				digits[n] = 0;
				n--;
				continue;
			}
			carry = 0;
			digits[n]++;
			break;
		}
		if (carry == 1) {
			var arr = new int[digits.length + 1];
            arr[0] = 1;
            return arr;		}
		return digits;
	}
}