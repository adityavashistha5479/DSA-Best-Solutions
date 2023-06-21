class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        vector<int> v;
        int i = 0, j = 0;
        while(i < m && j < n) {
            if(nums1[i] <= nums2[j]) {
                v.push_back(nums1[i]);
                i++;
            }
            else {
                v.push_back(nums2[j]);
                j++;
            }
        }    

        if(i < m) {
            for(int i2 = i; i2 < m; i2++) 
                v.push_back(nums1[i2]);
        }    

        if(j < n) {
            for(int j2 = j; j2 < n; j2++) 
                v.push_back(nums2[j2]);
        }

        for(int k = 0; k < m + n; k++)
            nums1[k] = v[k];
    }
};
