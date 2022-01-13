class Solution {
    public int search(int[] nums, int target) {
		// int pivot = findPivot(nums);
		// int ans=0;
		// if(pivot == -1) ans = binarySearch(nums, target, 0, nums.length-1);
		// else {
		// 	ans = binarySearch(nums, target, 0, pivot);
		// 	if(ans == -1) 
		// 		 ans = binarySearch(nums, target, pivot, nums.length-1);
		// }
		// return ans;
        int pivot = findPivot(nums);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0 , nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }
    
    static int findPivot(int[] nums) {
// 		int start = 0;
// 		int end = nums.length - 1;

// 		while(start < end) {
// 			int mid = start + (end - start)/2;

// 			if(nums[mid] > nums[mid+1])
// 				return mid;
// 			else if (mid>start && nums[mid] < nums[mid-1]) 
// 				return mid-1;
// 			else if(start >= mid)
// 				end = mid-1;
// 			else if(start<mid)
// 				start = mid+1;
// 		}
// 		return -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
	}
	static int binarySearch(int[] nums, int target, int start, int end) {
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(nums[mid] < target) 
				start = mid + 1;
			else if (nums[mid] > target) 
				end = mid - 1;
			else 
				return mid;
		}
		return -1;
	}
}