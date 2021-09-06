package HomeWorkApp8;

import java.util.*;


public class Main extends Directory {
    public static void main(String[] args) {
        uniqueWordsInArray();
        phoneBook();
    }

    private static void uniqueWordsInArray() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Coffee", "Potato", "Alpha",
                "C#", "Cat", "Java",
                "Javascript", "Kent", "Coffee",
                "Cheese", "Beta", "Kotlin",
                "C#", "Beta", "Kotlin",
                "Cat", "Java", "Javascript", "C#"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }


}


