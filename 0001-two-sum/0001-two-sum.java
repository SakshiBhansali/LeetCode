class Solution {
    public int[] twoSum(int[] nums, int target) {
           // Create a HashMap to store numbers and their corresponding indices
        Map<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Calculate complement
            
            // If complement is found in the map, return the pair of indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // If not, add the current number and its index to the map
            map.put(nums[i], i);
        }
        
        // If no pair is found, return an empty array (or throw an exception if preferred)
        return new int[] {};
    }

    
}
