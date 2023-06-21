class Solution {
public:
    int climbStairs(int n) {
        if(n <= 2)
            return n;

        int x = 1, y = 2;

        for(int i = 3; i < n; i++) {
            // ans = x + y, then x becomes y and y becomes ans
            // DP + Sliding window
            int temp = y;
            y += x;
            x = temp;
        }     

        return (x + y);           
    }
};
