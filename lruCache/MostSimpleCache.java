package src.lruCache;

import java.util.*;

public class MostSimpleCache {
import src.lruCache.execptions.NotFoundException;
import src.lruCache.interfaces.Cache;

    public static void main(String args[]) {
        Map<Integer, Integer> cache = new HashMap<>();
        getElement(1, cache);//1 => 10
        getElement(1, cache);
        getElement(1, cache);
        // System.out.println(timeConsumingMethod(1));
        // System.out.println(timeConsumingMethod(1));
        // System.out.println(timeConsumingMethod(1));
public class MostSimpleCache<K, V> implements Cache<K, V> {

    Map<K, V> cache;

    public MostSimpleCache() {
        this.cache = new HashMap<>();
    }

    public static void getElement(int i, Map<Integer, Integer> cache) {
        if(cache.containsKey(i)) {
            System.out.println(cache.get(i));
        } else {
            int ans = timeConsumingMethod(i);
            cache.put(i, ans);
            System.out.println(ans);
        }
    @Override
    public V get(K key) throws NotFoundException{
        return cache.get(key);
    }

    public static int timeConsumingMethod(int i) {
        try {
            System.out.println("I am starting the heavy work");
            Thread.sleep(5000);
            System.out.println("I am ending the heavy work");
            return i * 10;
        } catch (Exception e) {
            System.out.println(e.toString());
            return -1;
        }
    @Override
    public void put(K key, V value) {
        cache.put(key, value);
    }
//1, 1, 1
}