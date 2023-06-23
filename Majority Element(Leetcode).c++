class Solution {
public:
    int majorityElement(vector<int>& nums) {
        //MOORE'S VOTING ALGORITHM
        int majority, count = 0;

        for(int i = 0; i < nums.size(); i++)
        {
            if(count) {
                count += (nums[i] == majority ? 1 : -1);
            }
            else {
                majority = nums[i];
                count = 1;
            }
        }
        
        return majority;
    }
};
