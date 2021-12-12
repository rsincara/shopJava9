package com.mylab.shop.services;

import com.mylab.shop.models.Purchase;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

public class PurchasesService {
    static ArrayList<Purchase> purchases = new ArrayList<>();

    public static void push(Purchase purchase) {
        purchases.add(purchase);
    }

    public static void createNew(String text) {
        push(new Purchase((long) purchases.size(), text, new Date()));
    }

    public static ArrayList<Purchase> getAllPurchases() {
        return purchases;
    }

    public static Purchase getById(Long purchaseId) {
        Optional<Purchase> foundPurchase = purchases.stream().filter(purchase -> purchase.getId().equals(purchaseId)).findFirst();
        if(foundPurchase.isEmpty()) {
            return null;
        }
        return foundPurchase.get();
    }

    public static void removeById(Long id) {
        purchases.remove(getById(id));
    }

    public static void setIsBought(Long id) {
       int foundItemIndex = purchases.indexOf(getById(id));
       purchases.get(foundItemIndex).setBought();
    }
}
