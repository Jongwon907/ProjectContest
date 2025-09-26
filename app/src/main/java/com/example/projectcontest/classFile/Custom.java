package com.example.projectcontest.classFile;

public enum Custom {
    Maid(500),
    Tung(1000);
    final int price;
    Custom(int price){
        this.price = price;
    }
}
