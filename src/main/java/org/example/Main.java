package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("1","Вася");
        hashMap.put("5","Кеша");
        hashMap.put("3","Петя");
        hashMap.putIfAbsent("4","Миша");
        hashMap.put("9","Коля");
        hashMap.put("7","Jon");
        hashMap.put("8","Micle");
        // переберем и выведем в консоль
        hashMap.forEach((k,v)-> System.out.println(k+": "+v));
        System.out.println("-".repeat(15));
        // добавим символ !
        for(String k: hashMap.keySet()){
            hashMap.compute(k,(key,v)-> v + " !");
            System.out.println(hashMap.get(k));
        }
        System.out.println("-".repeat(15));

        for(String key: hashMap.keySet()) {
            hashMap.compute(key, (k, v) -> "<" + v + ">");
            System.out.println(hashMap.get(key));
        }
        System.out.println(hashMap);
        System.out.println("-".repeat(15));

        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("1","Оля");
        hashMap2.put("4","Маша");
        hashMap2.put("5","Марина");
        hashMap2.put("6","Елена");
        hashMap2.put("8","Marry");
        for(String k: hashMap2.keySet()){
            //hashMap2.merge(k,hashMap.getOrDefault(k,"No"),String::concat);
            hashMap2.merge(k,hashMap.getOrDefault(k,"??"),(key,val)-> key + " + "+val);
            System.out.println(hashMap2.get(k).replace("<","").replace(">",""));
        }
    }
}