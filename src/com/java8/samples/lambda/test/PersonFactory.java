package com.java8.samples.lambda.test;

/**
 * @author liuch
 * @date 2020/1/5 - 23:20
 */
@FunctionalInterface
public interface PersonFactory<P extends Person> {
    P create(String firstName,String lastName);
}
