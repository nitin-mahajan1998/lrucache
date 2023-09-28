package src.lruCache;

import java.util.LinkedList;
import java.util.List;

import src.lruCache.execptions.NotFoundException;

public class LinkedListCache<K, V> implements Cache<K, V> {

    private final int SIZE;
    List<KeyValuePair<K, V>> cache;

    public LinkedListCache(int size) {
        this.SIZE = size;
        cache = new LinkedList<>();
    }

    @Override
    public V get(K key) throws NotFoundException {
        for(KeyValuePair<K, V> keyValuePair : cache) {
            if (keyValuePair.key.equals(key)) {
                return keyValuePair.value;
            }
        }
        throw new NotFoundException("HIGH", "The element that you were looking for does not exists.", "500");
    }

    @Override
    public void put(K key V value) {
        if(cache.size() == SIZE) {
            cache.remove(0);
        } 
        cache.add(new KeyValuePair<K,V>(key, value));
    }

}