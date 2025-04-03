class MaximumTripletValue2 {
    public long maximumTripletValue(int[] nums) {
        int len=nums.length;
    if (len < 3) return 0;

        int[] leftMaxi=new int[len];
        int[] rightMaxk=new int[len];
        int result=0;
        int j; 
        long res=0;
        leftMaxi[0]=0;
        rightMaxk[len-1]=0;
        for(j=1;j<len;j++)
        {
            leftMaxi[j]=Math.max(leftMaxi[j-1],nums[j-1]);

        }

        for(j=len-2;j>=0;j--)
        {
            rightMaxk[j]=Math.max(rightMaxk[j+1],nums[j+1]);
        }

        for(j=1;j<len;j++)
        {
            res=Math.max(res, ((long)(leftMaxi[j]-nums[j])*rightMaxk[j]));
        }

        return res;
        
    }
}
