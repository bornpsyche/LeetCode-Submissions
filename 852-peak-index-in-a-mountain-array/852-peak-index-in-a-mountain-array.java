class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
		int end = arr.length - 1;
		//int max = arr[0];

		while(start < end) {
			int mid = start + (end - start)/2;

			if(arr[mid] < arr[mid+1]){
				//max = arr[mid]
				start = mid + 1;
			}
			else if (arr[mid] > arr[mid+1]) {
				//max = arr[mid];
				end = mid;
			// else 
				// return mid;}
			}
		}
		return start;
    }
}