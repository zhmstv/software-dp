public class CoffeeShop {
    private static CoffeeShop instance;

    private CoffeeShop() {}

    public static CoffeeShop getInstance() {
        if (instance == null) {
            instance = new CoffeeShop();
        }
        return instance;
    }

    public void placeOrder(Coffee coffee) {
        System.out.println("Ваш заказ: " + coffee.getDescription());
    }
}
