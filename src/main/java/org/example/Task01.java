package org.example;

import java.util.HashMap;


public class Task01 {
    public static void main(String[] args) {
        HashMap<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("Фамилия1", "Имя1");
        stringStringMap.put("Фамилия2", "Имя3");
        stringStringMap.put("Фамилия3", "Имя5");
        stringStringMap.put("Фамилия4", "Имя2");
        stringStringMap.put("Фамилия5", "Имя7");
        stringStringMap.put("Фамилия6", "Имя2");
        stringStringMap.put("Фамилия7", "Имя3");
        stringStringMap.put("Фамилия8", "Имя3");
        stringStringMap.put("Фамилия9", "Имя5");
        stringStringMap.put("Фамилия1", "Имя7");
        System.out.println(stringStringMap);
    }
}
