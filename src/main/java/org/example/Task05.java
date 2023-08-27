package org.example;

import java.util.HashMap;
import java.util.Map;

public class Task05 {
    public static void main(String[] args) throws Exception
    {
        Map<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("Sim", 5);
        stringObjectHashMap.put("Tom", 5.5);
        stringObjectHashMap.put("Arbus", false);
        stringObjectHashMap.put("Baby", null);
        stringObjectHashMap.put("Cat", "Cat");
        stringObjectHashMap.put("Eat", (long) 56);
        stringObjectHashMap.put("Food", '3');
        stringObjectHashMap.put("Gevey", '6');
        stringObjectHashMap.put("Hugs", 111111111111L);
        stringObjectHashMap.put("Comp", (double) 123);

        System.out.println(stringObjectHashMap);

        for (Map.Entry<String, Object> concatenate : stringObjectHashMap.entrySet())
        {
            String key = concatenate.getKey();
            Object value = concatenate.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
