public class OrderingApplication {
    public static void main(String[] args) {
        Product a=new Product(1,"shampoo",30.25);
        Product b=new Product(2,"soap",4.75);
        Seller g=new Seller(1,"me");
        g.addProduct(a);
        g.addProduct(b);
        g.updateQuantity(a,10);
        g.updateQuantity(b,5);
        Address ad1 = new Address("No 2 Jalan Mawar Skudai Johor Bahru");
        Customer me=new Customer(1,"yasser",90.0);
        me.setAddress(ad1);
        me.addProduct(a);
        me.addProduct(a);
        me.addProduct(b);
        Order o= new Order();
        o.setCustomer(me);
        o.setSeller(g);
        o.setCart(me.getCart());
        o.printOrder();


    }
}
