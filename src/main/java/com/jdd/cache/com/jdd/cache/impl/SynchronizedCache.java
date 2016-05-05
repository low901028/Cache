package com.jdd.cache.com.jdd.cache.impl;

import com.jdd.cache.Cache;

/**
 * Synchronized Cache
 */
public class SynchronizedCache<K,V> implements Cache<K,V> {
    private final Cache<K,V> underlying;

    public SynchronizedCache(Cache<K,V> underlying){
        this.underlying = underlying;
    }

    public V get(K key) {
        return underlying.get(key);
    }

    public void put(K key, V value) {
        underlying.put(key,value);
    }

    public boolean remove(K key) {
        return underlying.remove(key);
    }

    public long size() {
        return underlying.size();
    }
}
