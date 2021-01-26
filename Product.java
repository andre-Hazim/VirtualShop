//Andre Hazim 101141843
public class Product {
    private String name;
    private int id;
    private double price;

    public Product(){
        name = "";
        id = 0;
        price = 0.0;
    }
    public Product(String iName, int iId, double iPrice){
        name = iName;
        id = iId;
        price = iPrice;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getPrice(){
        return price;
    }
}
