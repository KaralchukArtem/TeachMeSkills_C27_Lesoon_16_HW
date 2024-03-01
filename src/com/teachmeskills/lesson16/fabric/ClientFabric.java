package com.teachmeskills.lesson16.fabric;

import com.teachmeskills.lesson16.consts.PassportID;
import com.teachmeskills.lesson16.entity.Client;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ClientFabric implements PassportID {
    public static Map<String, Client> fillClient() {
        Map<String, Client> map = new HashMap<>();
        Client c1 = new Client("Tema", 23, new Date());
        Client c2 = new Client("Tema2", 27, new Date());
        Client c3 = new Client("Tema3", 29, new Date());

        c1.setOrder(OrderFabric.fillOrdersFirst());
        c2.setOrder(OrderFabric.fillOrdersSecond());
        c3.setOrder(OrderFabric.fillOrdersThird());

        map.put(PASSPORT_ID1, c1);
        map.put(PASSPORT_ID2, c2);
        map.put(PASSPORT_ID3, c3);

        return map;
    }
}
