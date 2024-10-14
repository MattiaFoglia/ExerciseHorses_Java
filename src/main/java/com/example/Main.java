package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Horse> arH = new ArrayList<Horse>();
        ArrayList<String> arS = new ArrayList<String>();

        for(int i = 0; i < 20; i++){
            Horse cav = new Horse(arS);
            arH.add(cav);
        }
        for(int i = 0; i < arH.size(); i++){
            arH.get(i).start();
        }
        for(int i = 0; i < arH.size(); i++){
            arH.get(i).join();
        }
        for(int i = 0; i < arS.size(); i++){
            System.out.println((i+1) + ":" + arS.get(i));
        }



    }
}