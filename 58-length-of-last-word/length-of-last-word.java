class Solution {
    public int lengthOfLastWord(String s) {
        var words = s.trim().replaceAll("\\s+"," " ).split("\\s");
		return words[words.length - 1].length();
    }
}