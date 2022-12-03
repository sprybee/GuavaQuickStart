package com.fusang.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.TimeUnit;

public class GuavaCache {
    public static void main(String[] args) {
        LoadingCache<String, String> build = CacheBuilder
                .newBuilder()
                .expireAfterWrite(10, TimeUnit.SECONDS)
                .maximumSize(2)
                .removalListener(notification -> {
                    System.out.println(notification.getKey() + " was removed");
                })
                .build(new CacheLoader<String, String>() {
            @Override
            public String load(String key) throws Exception {
                return "cache" + key;
            }
        });
        build.put("a", "a");
        build.put("b", "a");
    }
}
