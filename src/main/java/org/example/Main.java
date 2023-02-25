package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("Первый","Вася");
        hashMap.put("Пятый","Кеша");
        hashMap.put("Третий","Петя");
        hashMap.putIfAbsent("Четвертый","Катя");
        hashMap.forEach((k,v)-> System.out.println(k+": "+v));
        System.out.println("-".repeat(15));
        for(String v: hashMap.values()){
            System.out.println(v+" ! !");
        }
        System.out.println("-".repeat(15));
        for(String k: hashMap.keySet()){
            System.out.println(k+": "+hashMap.get(k));
        }
        for(String key: hashMap.keySet()) {
            hashMap.compute(key, (k, v) -> "<" + v + ">");
            System.out.println(hashMap.get(key));
        }
        System.out.println(hashMap);
        System.out.println("-".repeat(15));
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("Первый","Оля");
        hashMap2.put("Четвертый","Маша");
        hashMap2.put("Пятый","Марина");
        hashMap2.put("Шестой","Елена");
        for(String k: hashMap2.keySet()){
            //hashMap2.merge(k,hashMap.getOrDefault(k,"No"),String::concat);
            hashMap2.merge(k,hashMap.getOrDefault(k,"No"),(key,val)-> key + " + "+val);
            System.out.println(hashMap2.get(k));
        }
    }
}