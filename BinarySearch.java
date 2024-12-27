

class Solution {
    public int binarysearch(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1; // To store the smallest index of k

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                result = mid; // Store the index
                high = mid - 1; // Continue searching in the left half
            } else if (arr[mid] > k) {
                high = mid - 1; // Search in the left half
            } else {
                low = mid + 1; // Search in the right half
            }
        }

        return result; // Return the smallest index of k or -1 if not found
    }
}
