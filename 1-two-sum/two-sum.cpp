class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int n=nums.size();
        unordered_map<int,int>ind;
        for(int i=0;i<n;i++){
            int comp=target-nums[i];
            if(ind.find(comp)!=ind.end()){
                return {ind[comp],i};
            }
            ind[nums[i]]=i;
        }
            
            
       return {1,-1}; 
    }

};