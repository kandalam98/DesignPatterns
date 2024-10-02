package org.example.Strategy;

public class Strategy {

    public void startStrategy(){
        System.out.println("******Strategy*******");
        Item item1 = new Item("item1",100);
        Item item2 = new Item("item2",200);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        System.out.println(shoppingCart.makePayment(new UpiPayment("upi@id")));
        System.out.println(shoppingCart.makePayment(new CardPayment("12121","xxx")));
    }
}
