package pl.kmiecik;

import java.util.HashMap;
import java.util.Map;

public class CharCounter {
    public static void main(String[] args) {
        String str = "football";
        Map<Character, Integer> myMap = new HashMap<Character, Integer>();
        for (char ch : str.toCharArray()) {
            if (myMap.get(ch) == null) {
                myMap.put(ch, 1);
            } else {
                myMap.put(ch, myMap.get(ch) + 1);
            }
        }
        myMap.forEach((key, value) -> {
            System.out.println(key + " accured " + value + " times");
        });
    }
}
