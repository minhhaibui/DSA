package DSA_Generic;

public class Dictionary <K,V> {
    private K Key;
    private V Value;

    public Dictionary(K key, V value){
        this.Key=key;
        this.Value=value;
    }

    public K getKey() {
        return Key;
    }

    public V getValue() {
        return Value;
    }

    public void setKey(K key) {
        Key = key;
    }

    public void setValue(V value) {
        Value = value;
    }

    @Override
    public String toString() {
        return "{" +
                Key +
                " : " + Value +
                '}';
    }
}
