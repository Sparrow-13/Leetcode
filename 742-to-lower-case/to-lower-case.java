class Solution {
    public String toLowerCase(String s) {
        var arr = s.toCharArray();
        var str = new StringBuilder();
        for(var c : arr){
            if(c>=65 && c <=90){
                c += 32;
                str.append(c);
                continue;
            }
            str.append(c);

        }
        return str.toString();
    }
}