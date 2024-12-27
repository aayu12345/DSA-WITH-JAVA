/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


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
