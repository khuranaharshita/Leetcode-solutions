class MaximumCountofPositiveIntegerandNegativeInteger {
    public int maximumCount(int[] nums) {
        int negative=0,positive=0;
        for(int i=0;i<nums.length;i++)
        {
            if (nums[i]>0) {positive++;}
            if (nums[i]<0) {negative++;}
        }
        return Math.max(positive,negative);
        
    }
}
