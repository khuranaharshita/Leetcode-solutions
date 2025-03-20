class reverseInteger {
    public int reverse(int x) {
        int INT_MIN = Integer.MIN_VALUE; 
        int INT_MAX = Integer.MAX_VALUE; 
        int sign = (x < 0) ? -1 : 1;
        x = Math.abs(x);
        
        int rev = 0;
        
        while (x != 0) {
            int num = x % 10; 
            x /= 10; 
            if (rev > (INT_MAX - num) / 10) {
                return 0; 
            }
            rev = rev * 10 + num; 
        }        
        rev *= sign;
        if (rev < INT_MIN || rev > INT_MAX) {
            return 0;
        }
        
        return rev;
    }
}
 
