class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> maps = new HashMap<>();
        for(int i=0;i < nums.length;i++){
            int result = target - nums[i];
            if(maps.containsKey(result)){
                return new int[]{maps.get(result),i};
            }
            maps.put(nums[i],i);
        }
        return new int[0];
    }
}