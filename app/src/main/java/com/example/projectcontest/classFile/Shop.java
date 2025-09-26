package com.example.projectcontest.classFile;

import java.lang.Character;
import java.util.HashMap;
import java.util.Map;

public class Shop {
    Map<Custom,Boolean> customs;
    public Shop(){
        customs = new HashMap<>();
    }

    public void init(){
        for(var custom:Custom.values()) customs.put(custom,false);
    }
    public void buy(Custom custom){
        if(Char.getAmount() < custom.price) System.out.println("소유한 금액이 부족합니다.");
        else if(!customs.get(custom)) customs.put(custom,true);
        else System.out.println("이미 소유한 코스튬 입니다.");
    }
}