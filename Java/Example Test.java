// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int min = 1;
        int max = 100000;
        boolean[] value = new boolean[max+1];
        if (A.length <= 0) return min;

        for (int i = 0; i < A.length; i++){
            if (A[i] < max+1) value[A[i]] = true;
        }
        for (int i = 1; i < max; i++){
            if (value[i] && min == i){
                min++;
            } else if (!value[i]){
                break;
            }
        }
        if (min > max) return max;
        return min;
    }
}
