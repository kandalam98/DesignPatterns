package org.example.Strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> itemList = null;

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public ShoppingCart() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(Item item){
        itemList.add(item);
    }

    public String makePayment(PaymentStrategy paymentStrategy){
        return paymentStrategy.makePayment();
    }
}
