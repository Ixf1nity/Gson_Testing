package me.infinity.gsontesting;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

  public static void main(String[] args) {
    Gson gson = new Gson();
    Map<UUID, Data> dataMap = new ConcurrentHashMap<>();
    dataMap.put(UUID.randomUUID(), new Data("infy", 14));
    System.out.println(gson.toJson(dataMap));

  }
}