import java.util.Vector;
public class Customer extends User {
    private Address address;
    private double accountBalance;
    private Vector<Product> cart;

    public Customer(){

    }
    public Customer(int userId, String name, double accountBalance){
        super(userId,name);
        this.accountBalance=accountBalance;
        super.accountType="Customer";
        address=new Address();
        cart= new Vector<Product>();
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public Vector<Product> getCart() {
        return cart;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public void addProduct(Product p) {
        if((accountBalance>=p.getProductCost()) && (p.getQuantity()>0)){
            cart.add(p);
            accountBalance-=p.getProductCost();
            p.setQuantity(p.getQuantity()-1);
        }
        else{
            System.out.println("Unable to add product: "+p.getProductName()+" due to " +
                                "insufficient account balance or sold out");
        }
    }

    @Override
    public void removeProduct(Product p) {
        if(cart.contains(p)){
            cart.remove(p);
            accountBalance+=p.getProductCost();
            p.setQuantity(p.getQuantity()+1);
        }
        else{
            System.out.println("Product: "+ p.getProductName() + "was not added to cart");
        }

    }

    @Override
    public void printInfo() {
        System.out.println("    Customer Information");
        System.out.println("********************************");
        super.printInfo();
        System.out.println("Address: " + address.getFullAddress());

    }


}
