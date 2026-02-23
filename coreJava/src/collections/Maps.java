package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Krish", 21);
        map.put("Riddhi", 19);
        map.put("Siddhi", 29);
        map.put("Namma", 144);

        System.out.println(map.get("Riddhi")); //if key not found returns null
        System.out.println(map.getOrDefault("Krish", 0)); //if key not found returns defaultValue
        System.out.println(map.containsKey("Siddhi"));

        map.remove("Namma");

        // Traverse a map
        //Convert map to set

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        for(Map.Entry<String, Integer> entry: entrySet)
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        Set<String> keySets = map.keySet();
        for(String key: keySets)
            System.out.println(key + " -> " + map.get(key));
    }
}
