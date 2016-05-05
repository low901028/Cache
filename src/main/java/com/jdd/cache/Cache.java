package com.jdd.cache;

/**
 * Created by Administrator on 2016/5/5.
 */
public interface Cache<K, V> {
    V get(K key);

    void put(K key, V value);

    boolean remove(K key);

    long size();
}
