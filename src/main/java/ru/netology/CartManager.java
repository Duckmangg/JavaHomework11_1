package ru.netology;

import ru.netology.domain.PurchasedItem;


public class CartManager {

    private PurchasedItem[] items = new PurchasedItem[0];
    private int itemLimit;

    public CartManager(int itemLimit) {
        this.itemLimit = itemLimit;
    }

    public CartManager() {
        this.itemLimit = 10;
    }

    public void add(PurchasedItem item) {

        int length = items.length + 1;
        PurchasedItem[] tmp = new PurchasedItem[length];

        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;

    }

    public PurchasedItem[] findAll() {
        return items;
    }

    public PurchasedItem[] findLast() {
        PurchasedItem[] items = findAll();
        int resultLength = Math.min(items.length, itemLimit);
        PurchasedItem[] result = new PurchasedItem[resultLength];
        if (items.length < itemLimit) {
            for (int i = 0; i < result.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
        } else {
            for (int i = 0; i < itemLimit; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
        }
        return result;
    }

   /* public PurchasedItem[] findLast(int numberOfRecent) {
        PurchasedItem[] items = findAll();
        int resultLength;
        if (items.length < numberOfRecent) {
            resultLength = items.length;
        } else {
            resultLength = numberOfRecent;
        }
        PurchasedItem[] result = new PurchasedItem[resultLength];
        if (items.length < numberOfRecent) {
            for (int i = 0; i < result.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
        } else {
            for (int i = 0; i < numberOfRecent; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
        }
        return result;
    }*/
}
