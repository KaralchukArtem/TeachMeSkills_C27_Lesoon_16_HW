package com.teachmeskills.lesson16.service;

import com.teachmeskills.lesson16.model.Client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class ShowClientService {

    public static void showKeyValueMap(Map<String, Client> map) {
        System.out.println("\nShow Key Value Map -> ");
        for (Map.Entry<String, Client> e : map.entrySet()) {
            System.out.println("Key = " + e.getKey() + " -> Value = " + e.getValue());
        }
    }

    public static void showKeyValueIterator(Map<String, Client> map) {
        System.out.println("\nShow Key Value Iterator -> ");
        Iterator<Map.Entry<String, Client>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Client> entry = iterator.next();
            String key = entry.getKey();
            Client value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }

    public static void showKeys(Map<String, Client> map) {
        System.out.println("\nShow Keys -> ");
        for (String key : map.keySet()) {
            System.out.println("Key: " + key);
        }
    }

    public static void showValue(Map<String, Client> map) {
        System.out.println("\nShow Value -> ");
        ArrayList<Client> values = new ArrayList<>(map.values());
        for (Client agr : values) {
            System.out.println(agr);
        }
    }
}
