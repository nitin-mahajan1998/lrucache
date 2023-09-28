package src.lruCache.interfaces;

import src.lruCache.execptions.NotFoundException;

public interface Cache<T, V> {
    public V get(T key) throws NotFoundException;

    public void put(T key, V value);
}