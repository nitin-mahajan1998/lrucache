package src.lruCache;

import src.lruCache.interfaces.Cache;


public class Main {
    public static void main(String[] args) {
        Cache<Integer, Integer> mostSimpleCache = new MostSimpleCache<>();
        Cache<Integer, String> simpleArrayCache = new SimpleArrayCache<Integer, String>(5);
        
    }
}