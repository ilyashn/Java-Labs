package com.itmo.client;

import com.itmo.exceptions.CatalogLoadException;
import com.itmo.exceptions.ItemAlreadyExistsException;
import com.itmo.stockList.FoodItem;
import com.itmo.warehouse.ItemCatalog;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class CatalogFileLoader implements CatalogLoader {
    private String filename;
    public CatalogFileLoader(String filename) {
        this.filename = filename;
    }

    @Override
    public void load(ItemCatalog catalog) throws CatalogLoadException {
        File f = new File(filename);
        FileInputStream fileInputStream;
        String line;

        try {
            fileInputStream = new FileInputStream(f);
            Scanner s = new Scanner(fileInputStream);

            while(s.hasNextLine()){
                line = s.nextLine();
                if (line.length() == 0)
                    break;

                String[] fields = line.split(";");
                String name = fields[0];
                float price = Float.parseFloat(fields[1]);
                short expires = Short.parseShort(fields[2]);

                FoodItem item = new FoodItem(name,price,null, new Date(),expires);
                catalog.addItem(item);
            }
        } catch (FileNotFoundException | ItemAlreadyExistsException ex) {
            ex.printStackTrace();
            throw new CatalogLoadException(ex);
        }

    }
}
