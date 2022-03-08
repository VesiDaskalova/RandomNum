package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        int secondNumber = 5;
        System.out.println(randomNum);

        if (randomNum > secondNumber){
            System.out.println("This is true");}
        if (randomNum < secondNumber){
            System.out.println("This is false");
        }

    }
}
