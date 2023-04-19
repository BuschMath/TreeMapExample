/*In this example, we use a TreeMap, which is a sorted map 
    implementation of the Map interface, to store key-value 
    pairs where the keys are strings and the values are 
    integers representing scores. The TreeMap automatically 
    maintains the keys in sorted order, allowing us to 
    retrieve and iterate over the key-value pairs in a 
    sorted manner. Note that TreeMap uses the natural 
    ordering of the keys, or you can provide a custom 
    comparator for sorting based on a specific criterion if needed. */
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a new TreeMap instance
        TreeMap<String, Integer> scores = new TreeMap<>();

        // Add key-value pairs to the map
        scores.put("Alice", 95);
        scores.put("Bob", 87);
        scores.put("Charlie", 92);
        scores.put("Dave", 88);

        // Retrieve values based on keys
        int aliceScore = scores.get("Alice");
        int bobScore = scores.get("Bob");
        int charlieScore = scores.get("Charlie");
        int daveScore = scores.get("Dave");

        // Print the retrieved values
        System.out.println("Alice's score: " + aliceScore);
        System.out.println("Bob's score: " + bobScore);
        System.out.println("Charlie's score: " + charlieScore);
        System.out.println("Dave's score: " + daveScore);

        // Check if a key is present in the map
        boolean hasKey = scores.containsKey("Eve");
        System.out.println("Does Eve have a score? " + hasKey);

        // Remove a key-value pair from the map
        scores.remove("Bob");

        // Check if a key-value pair was removed
        boolean removed = !(scores.containsKey("Bob"));
        System.out.println("Was Bob's score removed? " + removed);

        // Print the size of the map
        int size = scores.size();
        System.out.println("Size of the map: " + size);

        // Iterate over the keys and values in the map
        for (String key : scores.keySet()) {
            int value = scores.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
