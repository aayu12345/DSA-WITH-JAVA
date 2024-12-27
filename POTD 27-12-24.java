/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


Given an array arr[] and an integer target. You have to find numbers of pairs in array arr[] which sums up to given target.

Examples:

Input: arr[] = [1, 5, 7, -1, 5], target = 6 
Output: 3
Explanation: Pairs with sum 6 are (1, 5), (7, -1) and (1, 5). 
Input: arr[] = [1, 1, 1, 1], target = 2 
Output: 6
Explanation: Pairs with sum 2 are (1, 1), (1, 1), (1, 1), (1, 1), (1, 1), (1, 1).
Input: arr[] = [10, 12, 10, 15, -1], target = 125
Output: 0

	
Constraints:
1 <= arr.size() <= 105
-104 <= arr[i] <= 104
1 <= target <= 104

SOLUTION :


import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        
	
		
		int arr[]={1,1,1,1};
		
		System.out.println(countPairs(arr , 2));
	
		
	}
     public static int countPairs(int arr[], int target) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int compl = target - num;

            // Check if the complement exists in the map
            if (map.containsKey(compl)) {
                //count++;
                count += map.get(compl);
            }

            // Update the map with the current number
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}
