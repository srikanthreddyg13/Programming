/*

Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
You are given a target value to search. If found in the array return its index, otherwise return -1

*/

class Solution {
    public int search(int[] nums, int target) {
        return find(nums, 0, nums.length-1, target); 
    }
    
    public int find(int arr[], int l, int h, int key) 
    { 
        if (l > h)  
            return -1; 
        
        int mid = (l+h)/2; 
        if (arr[mid] == key) 
            return mid; 
        
        if (arr[l] <= arr[mid]) 
        { 
            
            if (key >= arr[l] && key <= arr[mid]) 
               return find(arr, l, mid-1, key); 
            
            return find(arr, mid+1, h, key); 
        } 
        
        if (key >= arr[mid] && key <= arr[h]) 
            return find(arr, mid+1, h, key); 
        
        return find(arr, l, mid-1, key); 
    } 
}