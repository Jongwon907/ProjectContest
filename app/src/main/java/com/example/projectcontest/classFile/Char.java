package com.example.projectcontest.classFile;

public class Char {
    private Stats stats;
    private static int UserAmount;

    public Char(){
        stats = new Stats();
        UserAmount = 0;
    }

    public static int getAmount(){
        return UserAmount;
    }

}
