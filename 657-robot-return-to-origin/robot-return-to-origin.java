class Solution {
    public boolean judgeCircle(String moves) {
        var x = 0;
        var y = 0;
        var arr = moves.toCharArray();
        for(var c : arr){
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