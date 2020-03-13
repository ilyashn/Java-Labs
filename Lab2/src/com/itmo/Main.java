package com.itmo;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        GenericItem genericItem1 = new GenericItem(1, "Headphones", 5000.0f, Category.GENERAL, null);
        GenericItem genericItem2 = new GenericItem(2, "Iphone", 10000000000.00f, Category.GENERAL, null);
        GenericItem genericItem3 = new GenericItem(3, "Great Xiaomi", 1.0f, Category.GENERAL, genericItem2);
        genericItem2.setAnalog(genericItem3);

        System.out.println("PrintAll method in 3 different genericItems: ");
        genericItem1.printAll();
        genericItem2.printAll();
        genericItem3.printAll();

        Date date = new Date();
        short expires = 10;
        short warrantyTime = 365;

        FoodItem foodItem1 = new FoodItem(4, "milk", 10.0f, null, Category.FOOD, date, expires);
        FoodItem foodItem2 = new FoodItem(5, "bread", 5.0f, foodItem1, Category.FOOD, date, expires);

        TechnicalItem technicalItem1 = new TechnicalItem(6, "technic", 1000.0f, null, Category.GENERAL, warrantyTime);

        GenericItem [] items = new GenericItem[] {foodItem1, foodItem2, technicalItem1};

        for (GenericItem item : items) {
            item.printAll();
        }

        System.out.println("Comparison foodItem1 and foodItem2: " + foodItem1.equals(foodItem2));

        FoodItem foodItem3 = foodItem2.clone();

        System.out.println("Comparison original and cloned objects: " + foodItem2.equals(foodItem3));

    }
}
