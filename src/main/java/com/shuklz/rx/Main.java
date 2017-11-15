package com.shuklz.rx;

import com.shuklz.generics.OrderedPair;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

public class Main {
    public static void main(String[] args) {
        OrderedPair orderedPair = new OrderedPair<>(1, "One");

        System.out.println(orderedPair.getValue());

        Observable.just(orderedPair).subscribe(orderedPairConsumer -> System.out.println(orderedPairConsumer.getValue()));
    }
}
