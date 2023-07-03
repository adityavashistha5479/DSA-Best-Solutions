class Solution {
    public boolean isHappy(int n) {
        int slow = n, fast = n; // slow , fast

        do{
            slow = compute(slow); // slow computes only once
            fast = compute(compute(fast)); // fast computes 2 times
            
            if(slow == 1) return true; // if we found 1 then happy indeed !!!
        } while(slow != fast); // else at some point they will meet in the cycle
        
        return false; // it's a cycle , not happy at all !!!
               
    }

    public int compute(int n){
            int s = 0;
            while(n != 0){
                s += (n % 10) * (n % 10);
                n = n / 10;
            }

            return s;
        } 
}
