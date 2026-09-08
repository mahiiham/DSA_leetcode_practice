class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> quad= new ArrayList<>();
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
           
            for(int k=i+1;k<n-2;k++){
                if(k>i+1 && nums[k]==nums[k-1]){
                continue;
            }
                long sum =(long) target-(nums[i]+nums[k]);
                int left=k+1, right= n-1;
                while(left<right){
                    long csum= nums[left]+nums[right];
                    if(csum==sum){
                        quad.add(Arrays.asList(nums[i],nums[k],nums[left],nums[right]));
                        
                
                        while(left<right && nums[left+1]==nums[left]){
                            left++;
                        }
                        while(left<right && nums[right-1]==nums[right]){
                            right--;
                        }
                        left++;
                        right--;
                    }
                    else if(csum<sum){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
            
            
        }
         return quad;
    }
}