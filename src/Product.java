public class Product {
    private int productId;
    private String productName;
    private int quantity;
    private double productCost;

    public Product(int productId,String productName,double productCost)
    {
        this.productId=productId;
        this.productName=productName;
        this.productCost=productCost;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductId(){return productId;}
    public String getProductName(){return productName;}
    public int getQuantity(){return quantity;}
    public double getProductCost(){return productCost;}

    public void printInfo(){
        System.out.println("Product ID: " + productId);
        System.out.println("Product: " + productName);
        System.out.println("Price: " + productCost);
    }
}
