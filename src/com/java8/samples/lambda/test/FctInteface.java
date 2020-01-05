package com.java8.samples.lambda.test;

/**
 * @author liuch
 * @date 2020/1/5 - 22:39
 */
@FunctionalInterface
public interface FctInteface<T,F> {
    /**
     *  A so called functional interface must contain exactly one abstract method declaration
     *  Each lambda expression of that type will be matched to this abstract method
     * @param from
     * @return
     */
    T convert(F from);
}
