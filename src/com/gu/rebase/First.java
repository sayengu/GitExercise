package com.gu.rebase;

public class First {
    @FunctionalInterface
    public interface FunctionParamInterface {
        int apply() throws Exception;
    }


    public static void main(String[] args) {

        System.out.println("git rebase!");
        for (int i = 0; i < 10; i++) {
            System.out.println("now i=" + i);
        }

        int a = 1;
        int b = 2;
        try {
            System.out.println(((FunctionParamInterface) () -> a + b).apply());
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Hello change!");
        System.out.println("this line will not be conflict");

        System.out.println("git branch!");

    }
}
