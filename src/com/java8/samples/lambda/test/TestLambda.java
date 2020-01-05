package com.java8.samples.lambda.test;

/**
 * @author liuch
 * @date 2020/1/5 - 21:47
 */
public class TestLambda {
    public static void main(String[] args) {
        TestLambda testLambda = new TestLambda();
        //不需要参数
        //Lambda1 lambda1 = () -> 5;
        Lambda1 lambda1 = () -> {return  5;};
        System.out.println("不需要参数，有返回值:" + testLambda.operate(lambda1)); //5

        //一个参数
        Lambda2 lambda2 = (message) -> System.out.println(message);
        //Lambda2 lambda2 = message -> System.out.println(message); //one arg
        lambda2.oneArg("one arg");

        //二个参数
        //Lambda3 lambda3 = (m1,m2) -> m1 + m2;
        Lambda3 lambda3 = (String m1, String m2) -> m1 + m2;
        System.out.println(lambda3.twoArgAndReturn("two ", "args"));//two args


    }
    interface  Lambda3{
        String twoArgAndReturn(String message1,String message2);
    }
    interface  Lambda2{
        void oneArg(String message);
    }

    interface Lambda1{
        int noArgsAndReturn();
    }
    private int operate(Lambda1 lambda1){
        return  lambda1.noArgsAndReturn();
    }
}
