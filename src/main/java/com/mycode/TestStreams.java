package com.mycode;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStreams {


    public static void main(String[] args) {

        IntStream.rangeClosed(1,10).forEach(System.out::println);

        int n =5;
        int sum = IntStream.range(1,n).filter(x -> x%3==0 || x%5==0).sum();
        System.out.println(sum);

    }


}
