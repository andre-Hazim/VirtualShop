//Andre Hazim 101141843
import java.util.ArrayList;
public class Inventory {
    private ArrayList<Integer> quantity;
    private ArrayList<Product> products;

    public Inventory(){
        quantity = new ArrayList<Integer>();
        products = new ArrayList<Product>();
    }

    public int getStock(int iProductId){
        int stock = 0;
        if(products.isEmpty() == false) {
            int i = 0;
            while(products.get(i).getId() != iProductId && i<products.size()){
                i++;
            }
            stock = quantity.get(i);
        }
        return stock;

    }

    public void addStock(Product iProduct, int iStock){

        if(products.isEmpty()){

            products.add(iProduct);
            quantity.add(iStock);
        }
        else{
            int i = 0;
            if(i>=products.size()) {
                while (products.get(i).getId() != iProduct.getId()) {
                    i++;

                }
            }

            if(products.get(i).getId() == iProduct.getId()){
                int tempStock = quantity.get(i);
                tempStock += iStock;
                quantity.set(i, tempStock);
            }
            else{
                products.add(iProduct);
                quantity.add(iStock);
            }

        }
    }
    public void removeStock(int productID, int stockRemove){
        //This method removes a certain amount of stock from a product
        int i = 0;
        while(products.get(i).getId() != productID && i<products.size()){
            i++;
        }
        int tempStock = quantity.get(i);
        tempStock -= stockRemove;
        if(tempStock< 0){
            tempStock = 0;
        }
        quantity.set(i, tempStock);
    }
    public void productInfo(int productID){
        int i = 0;
        while(products.get(i).getId() != productID && i<products.size()){
            i++;
        }
        String productName = products.get(i).getName();
        int productStock = quantity.get(i);
        double productPrice = products.get(i).getPrice();
        System.out.println("Name: "+ productName +
                ", Stock: " + Integer.toString(productStock)+
                ", Price: " + Double.toString(productPrice));
    }
}

