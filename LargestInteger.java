class LargestInteger {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int j = nums.length-1;
        while(j>0 && nums[j] > 0){
            int i = 0;
            while(nums[i] < 0){
                if(nums[i] == -1*nums[j]){
                    return nums[j];
                }else if (nums[i] > -1*nums[j]){
                    break;
                }else{
                    i++;
                }
            }
            j--;
        }
        return -1;
    }
}
