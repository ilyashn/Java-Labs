package com.itmo.client;

import com.itmo.stockList.Category;
import com.itmo.stockList.FoodItem;
import com.itmo.stockList.GenericItem;
import com.itmo.warehouse.ItemCatalog;

import java.util.Date;

public class CatalogStubLoader implements CatalogLoader {
    @Override
    public void load(ItemCatalog catalog) {
        GenericItem item1 = new GenericItem("Sony TV",23000, Category.GENERAL);
        FoodItem item2 = new FoodItem("Bread",12,null,new Date(),(short)10);
        catalog.addItem(item1);
        catalog.addItem(item2);

    }
}
