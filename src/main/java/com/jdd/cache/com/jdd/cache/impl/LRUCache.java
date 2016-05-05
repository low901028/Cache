package com.jdd.cache.com.jdd.cache.impl;

import com.jdd.cache.Cache;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LRU Cache
 */
public class LRUCache<K, V> implements Cache<K, V> {
    private final LinkedHashMap<K,V> cache;

    public LRUCache(final int maxSize){
        cache = new LinkedHashMap<K, V>(16,.75f,true){
            protected  boolean removeEldestEntity(Map.Entry eldest){
                return  size() > maxSize;
            }
        };
    }

    public  V get(K key){
        return  cache.get(key);
    }

    public void put(K key , V value){
        cache.put(key , value);
    }

    public boolean remove(K key){
        return  cache.remove(key) != null;
    }

    public long size(){
        return  cache.size();
    }
}
