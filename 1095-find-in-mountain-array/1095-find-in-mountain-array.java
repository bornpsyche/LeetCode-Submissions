/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        int start = 0;
        int end = mountainArr.length() - 1;
        while(start < end) {
            int mid = start + (end - start)/2;
            if(mountainArr.get(mid) > mountainArr.get(mid+1)) 
                end = mid;
            else
                start = mid + 1;
        }
        //return start;
        int start1 = 0;
        int end1 = start;
        while(start1 <= end1) {
            int mid = start1 + (end1 - start1)/2;
            
            if(mountainArr.get(mid) == target) return mid;
            if(mountainArr.get(mid) > target) 
                end1 = mid - 1;
            else
                start1 = mid + 1;
        }
        int start2 = start;
        int end2 = mountainArr.length() - 1;
        while(start2 <= end2) {
            int mid = start2 + (end2 - start2)/2;
            
            if(mountainArr.get(mid) == target) return mid;
            
            if(mountainArr.get(mid) < target) 
                end2 = mid - 1;
            else
                start2 = mid + 1;
        }
        return -1;
    }
}