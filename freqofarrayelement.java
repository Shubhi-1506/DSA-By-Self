
import java.util.HashMap;

class freqofarrayelement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 1};
        int n = arr.length;
    HashMap<Integer, Integer> freqMap = new HashMap<>();
    for (int i = 0; i < n; i++) {
        freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
    }
    
    System.out.println("Element\tFrequency");
    for (HashMap.Entry<Integer, Integer> entry : freqMap.entrySet()) {
        System.out.println(entry.getKey() + "\t" + entry.getValue());
    }
}}