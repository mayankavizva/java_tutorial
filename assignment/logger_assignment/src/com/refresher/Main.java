package com.refresher;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static int sum(int a , int b){
        return a+b;
    }

    public static void main(String[] args) throws IOException {
        // write your code here
        Scanner scn=new Scanner(System.in);

        Log log1= new Log("log.txt");
        int a=scn.nextInt();
        log1.logger.info("first input " + a);
        int b=scn.nextInt();
        log1.logger.info("Second input "+b);
        int ans=a+b;
        log1.logger.info("result "+ans);
        System.out.println(ans);
    }
}
