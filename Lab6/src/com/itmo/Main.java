package com.itmo;

import com.itmo.client.CatalogFileLoader;
import com.itmo.client.CatalogLoader;
import com.itmo.client.CatalogStubLoader;
import com.itmo.exceptions.CatalogLoadException;
import com.itmo.exceptions.ItemAlreadyExistsException;
import com.itmo.sync.Bank;
import com.itmo.sync.BankThread;
import com.itmo.warehouse.ItemCatalog;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.logging.FileHandler;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task1");
        task1();

        System.out.println("Task2");
        task2();

        System.out.println("Task3");
        task3();

        System.out.println("Task4");
        task4();
    }

    public static void task1() {
        ItemCatalog catalog = new ItemCatalog();
        CatalogLoader loader = new CatalogStubLoader();

        try {
            loader.load(catalog);
            catalog.addItem(catalog.findItemByID(1));
        } catch (CatalogLoadException | ItemAlreadyExistsException ex) {
            ex.printStackTrace();
        }
    }
    public static void task2() {
        Bank bankMain = new Bank();
        Thread threadOne = new BankThread(bankMain, 100, 2000);
        threadOne.setName("ThreadOne");
        threadOne.setPriority(Thread.MAX_PRIORITY);

        Thread threadTwo = new BankThread(bankMain, 50, 300);
        threadTwo.setName("ThreadTwo");
        threadTwo.setPriority(Thread.MAX_PRIORITY);

        threadOne.start();
        threadTwo.start();

        System.out.println(Thread.currentThread().getName());
    }

    public static void task3() {
        ItemCatalog catalog = new ItemCatalog();
        CatalogLoader catalogLoader = new CatalogFileLoader("file.txt");

        try {
            catalogLoader.load(catalog);
        } catch (CatalogLoadException ex) {
            ex.printStackTrace();
        }

        System.out.println(catalog);
    }

    public static void task4() {
        try {
            File file = new File("file1.txt");
            FileInputStream inputStream = new FileInputStream(file);
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            inputStream.close();
            String str = new String(buffer, Charset.forName("UTF-8"));
            System.out.println(str);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            File file = new File("file2.txt");
            FileInputStream inputStream = new FileInputStream(file);
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            inputStream.close();
            String string = new String(buffer, Charset.forName("Windows-1251"));
            System.out.println(string);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
