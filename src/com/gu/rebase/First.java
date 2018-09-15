package com.gu.rebase;

public class First {
    @FunctionalInterface
    public interface FunctionParamInterface {
        int apply() throws Exception;
    }


    public static void main(String[] args) {

        System.out.println("Hello merge!");
        System.out.println("Does the commit message disappear?");

        int a = 1;
        int b = 2;
        try {
            System.out.println(((FunctionParamInterface) () -> a + b).apply());
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Hello change!");
    }
}
