/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // Create a HashMap to store counts of elements in array 'a'
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num1 : a) {
            map.put(num1, map.getOrDefault(num1, 0) + 1);
        }

        // Create a list to store the intersection elements
        ArrayList<Integer> list = new ArrayList<>();
        for (int num2 : b) {
            if (map.containsKey(num2) && map.get(num2) > 0) {
                list.add(num2); // Add to the result list
                map.put(num2, - 1); // Decrease the count in the map
            }
        }

        return list;
    }
}
