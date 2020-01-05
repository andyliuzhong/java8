package com.java8.samples.lambda.test;

/**
 * @author liuch
 * @date 2020/1/5 - 22:38
 */
public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        //functionInterface
        FunctionalInterfaceTest functionalInterfaceTest = new FunctionalInterfaceTest();
        FctInteface<Integer,String> fctInteface = (from) -> Integer.valueOf(from);
        System.out.println("result is: " + functionalInterfaceTest.fctTest(fctInteface,"123"));//123

        Integer integer = functionalInterfaceTest.fctTest((from) -> Integer.valueOf(from), "123");
        System.out.println("result is: " + integer);//123

        //static method references
        FctInteface<Integer,String> staticMethodReference = Integer::valueOf;
        System.out.println("static method references:" + staticMethodReference.convert("456"));//456

        //Object method references
        Something something = new Something();
        FctInteface<String,String> objmMthodReference = something::startWith;
        System.out.println("object method references:" + objmMthodReference.convert("Java"));//J
    }
    private Integer fctTest(FctInteface<Integer,String> fctInteface,String mes){
        return fctInteface.convert(mes);
    }

}
class Something{
    String startWith(String s){
        return String.valueOf(s.charAt(0));
    }
}
