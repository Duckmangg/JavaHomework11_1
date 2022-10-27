package ru.netology;
import ru.netology.domain.PurchaseItem;


public class CartManager {

    private PurchaseItem[] items = new PurchaseItem[0];
    public void add(PurchaseItem item){

        int length = items.length + 1;
        PurchaseItem[] tmp = new PurchaseItem[length];

        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;

    }
    public PurchaseItem[] findAll() { return items; }
    public PurchaseItem[] findLast(){
        PurchaseItem[] items = findAll();
        PurchaseItem[] result = new PurchaseItem[items.length];
        if (items.length < 10){
            for (int i = 0; i < result.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
        } else{
            for (int i = 0; i < 10; i++) {
                int index = 10 - i - 1;
                result[i] = items[index];
            }
        }
        return result;
    }
    public PurchaseItem[] findLast(int numberOfRecent){
        PurchaseItem[] items = findAll();
        PurchaseItem[] result = new PurchaseItem[items.length];
        if (items.length < numberOfRecent){
            for (int i = 0; i < result.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
        } else{
            for (int i = 0; i < numberOfRecent; i++) {
                int index = numberOfRecent - i - 1;
                result[i] = items[index];
            }
        }
        return result;
    }
}