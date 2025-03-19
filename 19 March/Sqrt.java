class Sqrt {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int left = 1, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2; 
            long squared = (long) mid * mid;       
            if (squared == x) {
                return mid; 
            } else if (squared < x) {
                left = mid + 1;
            } else {
                right = mid - 1; 
            }
        }        
        return right;
    }
}
