
class Solution {
public:
    int countPairs(vector<int>& nums, int target) {
        int c=0;
        int n=nums.size();
        int left=0, right=n-1;
        sort(nums.begin(),nums.end());
        while(left<right){
            int sum= nums[left] +nums[right];
            if(sum<target){
                c+=right-left; //if the sum left + right(which is the largest after sorting) is less than target then all the pairs for left +right is smaller after that thus its a shortcut
                left++;
               
            }
            else{
                right--;
            }
        }
    return c;    


        
    

        
    }
};