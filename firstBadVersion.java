/*

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, 
which causes all the following ones to be bad.

*/

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int left=0;
        int right=n;
        
        while(left<right){
            int mid = left + (right - left)/2;
            
            if(isBadVersion(mid)){
                right = mid;
            }
            else
                left = mid+1;
        }
        
        if(left==right && isBadVersion(left)){
            return left;
        }
        
        return -1;
        
    }
}