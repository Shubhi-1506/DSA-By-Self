import java.util.HashMap;
class highestfreqinarr {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1, 3, 2, 2};
        int maxCount = 0;
        int mostFrequent = arr[0];

    HashMap<Integer, Integer> freqMap = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
        freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        if (freqMap.get(arr[i]) > maxCount) {
            maxCount = freqMap.get(arr[i]);
            mostFrequent = arr[i];
        }   


        System.out.println("The most frequent element is: " + mostFrequent);
    }
}}