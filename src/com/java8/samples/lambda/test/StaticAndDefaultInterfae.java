package com.java8.samples.lambda.test;

/**
 * @author liuch
 * @date 2020/1/5 - 22:16
 */
public class StaticAndDefaultInterfae {
    public static void main(String[] args) {
        SDInterface sdInterface = new SDInterface(){
            @Override
            public void say() {
                System.out.println("abstract method");
            }
        };
        sdInterface.say();//abstract method
        System.out.println(sdInterface.caculate(100));//10.0
        System.out.println(SDInterface.staticMethod("static method"));//static method
    }

    interface SDInterface{
        //abstract method
        void say();
        //static method
        static String staticMethod(String message){
            return message;
        }
        //default method
        default double  caculate(int a){
            return Math.sqrt(a);
        }
    }
}
