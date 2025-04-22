class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        int len = moves.length();
        for(int i = 0;i<len;i++){
            char c = moves.charAt(i);
            if(c == 'U'){
                y+=1;
            }
            else if(c == 'D'){
                y -= 1;
            }
            else if(c == 'L'){
                x-=1;
            }
            else{
                x+= 1;
            }
        }
        return x == 0 && y==0;
    }
}