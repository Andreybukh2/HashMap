package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task03 {
    public static void main(String[] args) throws IOException {

        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("Москва", "Ивановы");
        stringStringMap.put("Киев", "Петровы");
        stringStringMap.put("Лондон", "Абрамовичи");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String readLine = bufferedReader.readLine();
        System.out.println(stringStringMap.get(readLine));
    }
}
