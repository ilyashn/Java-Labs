package com.itmo;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Integer[] intArr = {10, 20, 15};
        Float[] floatArr = new Float[5];
        Random r = new Random();
        float fMin = 10;
        float fMax = 20;
        for (int i = 0; i < floatArr.length; i++) {
            floatArr[i] = fMin + r.nextFloat() * (fMax - fMin);
        }

        WorkArray<Integer> integerWorkArray = new WorkArray<>(intArr);
        WorkArray<Float> floatWorkArray = new WorkArray<>(floatArr);

        System.out.println(integerWorkArray.sum());
        System.out.println(floatWorkArray.sum());

        String line = "Конфеты 'Маска';45;120";
        String[] lineFields = line.split(";");

        String name = lineFields[0];
        float price = Float.parseFloat(lineFields[1]);
        short expires = Short.parseShort(lineFields[2]);
        FoodItem foodItem = new FoodItem(name, price, expires);
        foodItem.printAll();
    }
}
