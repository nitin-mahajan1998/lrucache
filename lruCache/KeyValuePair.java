
package src.lruCache;

class KeyValuePair<K, V> {
    public K key;
    public V value;

    public KeyValuePair(K k, V v) {
        this.key = k;
        this.value = v;
    }
}