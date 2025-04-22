class Solution {
    public int calPoints(String[] operations) {
        var scores = new ArrayList<Integer>();
        var size  = 0;

        for (var x : operations) {
            if (x.equals("+")) {
                var first = scores.get(size - 2);
                var second = scores.get(size - 1);
                scores.add(first + second);
                size++;
            } else if (x.equals("D")) {
                var last = scores.get(size - 1);
                scores.add(last * 2);
                size++;
            }
            else if(x.equals("C")){
                scores.remove(size - 1);
                size--;
            }
            else{
                var num  = Integer.parseInt(x);
                scores.add(num);
                size++;

            }
        }

        var points = 0;
        for (int i : scores) {
            points += i;
        }
        return points;
    }
}