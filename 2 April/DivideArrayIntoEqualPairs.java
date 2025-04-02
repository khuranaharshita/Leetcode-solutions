class DivideArrayIntoEqualPairs {
    public boolean divideArray(int[] nums) {

        Map<Integer, Integer> frequencyMap=new HashMap<>();
        for(int i: nums)
        {
            frequencyMap.put(i,frequencyMap.getOrDefault(i,0)+1);
        }

        for(int i:frequencyMap.values())
        {
            if(i%2!=0){return false;}
        }
        return true;
    }
}
