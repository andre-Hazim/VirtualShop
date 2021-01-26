public class Main {
    public static void main(String[] args) {
        Product ball = new Product("ball", 1, 3.40);
        Product triangle = new Product("triangle", 2, 3.70);
        Product computer = new Product("Computer", 3, 100);
        Inventory inventory = new Inventory();

        inventory.addStock(ball, 3);
        inventory.addStock(ball, 3);
        inventory.addStock(triangle, 3);
        inventory.removeStock(1,7);
        inventory.addStock(computer,1);

        inventory.productInfo(1);
        inventory.productInfo(2);
        inventory.productInfo(3);
    }
}
