package com.teachmeskills.lesson16;

import static com.teachmeskills.lesson16.fabric.ClientFabric.fillClient;
import static com.teachmeskills.lesson16.service.ShowClientService.*;

public class Runner {

    public static void main(String[] args) {
        showKeyValueMap(fillClient());
        showKeyValueIterator(fillClient());
        showKeys(fillClient());
        showValue(fillClient());
    }
}
