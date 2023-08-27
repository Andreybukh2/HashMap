package org.example;

import java.util.HashMap;
import java.util.Map;

public class Task04 {
    public static void main(String[] args) throws Exception
    {
        Map<String, String> map = new HashMap<>();
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "бахчевые");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        System.out.println(map);

        for (Map.Entry<String, String> concatenate : map.entrySet())
        {
            String key = concatenate.getKey();
            String value = concatenate.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
