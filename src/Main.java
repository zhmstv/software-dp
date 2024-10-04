public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Одиночка - создание кофейни
        CoffeeShop coffeeShop = CoffeeShop.getInstance();

        // Фабричный метод - создание кофе
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee espresso = coffeeFactory.createCoffee("Espresso");
        Coffee cappuccino = coffeeFactory.createCoffee("Cappuccino");

        // Абстрактная фабрика - создание ингредиентов
        CoffeeIngredientFactory cappuccinoFactory = new CappuccinoIngredientFactory();
        Milk milkForCappuccino = cappuccinoFactory.createMilk();
        Syrup syrupForCappuccino = cappuccinoFactory.createSyrup();

        // Создание заказа с использованием строителя
        CoffeeOrderBuilder orderBuilder = new CoffeeOrderBuilder();
        CoffeeOrder cappuccinoOrder = orderBuilder
                .setCoffee(cappuccino)
                .setMilk(milkForCappuccino)
                .setSyrup(syrupForCappuccino)
                .build();

        // Клонирование заказа (прототип)
        CoffeeOrder clonedOrder = cappuccinoOrder.clone();

        // Оформление заказа в кофейне
        coffeeShop.placeOrder(cappuccino); // передаем кофе, созданное через фабрику
        System.out.println("Детали заказа:");
        cappuccinoOrder.showOrderDetails(); // выводим детали заказа

        System.out.println("\nПовторный заказ:");
        clonedOrder.showOrderDetails(); // выводим детали клонированного заказа
    }
}
