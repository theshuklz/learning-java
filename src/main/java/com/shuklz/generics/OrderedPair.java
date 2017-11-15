package com.shuklz.generics;

public class OrderedPair<V,K, I> implements Pair {
    private K key;
    private V value;
    private I something;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    public I getI(){
        return something;
    }

    @Override
    public V getValue() {
        return value;
    }
}
