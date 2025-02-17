/*
Time Complexity - O(2^n) - Exponential
Space Complexity - O(2^n) - Exponential
*/

class Solution {
     List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums) {
        
        result = new ArrayList<>();
        helper(nums,0,new ArrayList<>());
        return result;
        
    }
    
    private void helper(int[] nums, int i, List<Integer> path)
    {
     
        //base
        if(i == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        
        //logic
        //not chose
        helper(nums,i+1,path);
            
        //choose
        // action
        path.add(nums[i]);
        //recurse
        helper(nums,i+1,path);
        // backtrack
        path.remove(path.size()-1);
    }
}
