package src.lruCache;

import src.lruCache.execptions.NotFoundException;
import src.lruCache.interfaces.Cache;

//k = Integer, v= String
public class SimpleArrayCache<K,V> {
    
public SimpleArrayCache(int i) {
    }

public class SimpleArrayCache<K, V> implements Cache<K, V> {

    public final Integer size;
    final KeyValuePair<K, V>[] cache;
    private int count;
    public SimpleArrayCache(int size) {
        this.size = size;
        cache = new KeyValuePair[size];
        this.count = 0;
    }


    public V get(K key) {
        for(int i = 0; i<count; i++) {
            if(cache[i].key.equals(key)) {
    @Override
    public V get(K key) throws NotFoundException{
        for (int i = 0; i < count; i++) {
            if (cache[i].key.equals(key)) {
                return (V) cache[i].value;
            }
        }
        return null;
    }


    @Override
    public void put(K key, V value) {
        if(count == size) {
            //Left shift operation
            for(int i = 1; i<size-1; i++) {
                cache[i-1] = cache[i];
        // TODO Auto-generated method stub
        if (count == size) {
            // Left shift operation
            for (int i = 1; i < size - 1; i++) {
                cache[i - 1] = cache[i];
            }
            cache[size-1] = new KeyValuePair<K, V>(key, value);
            cache[size - 1] = new KeyValuePair<K, V>(key, value);
        } else {
            cache[count] = new KeyValuePair<K, V>(key, value);
            count++;
        }
    }


}

class KeyValuePair<K, V> {
    public K key;
    public V value;

    public KeyValuePair(K k, V v) {
        this.key = k;
        this.value = v;
    }
}