public class CoffeeOrder implements Cloneable {
    private Coffee coffee;
    private Milk milk;
    private Syrup syrup;

    public CoffeeOrder(Coffee coffee, Milk milk, Syrup syrup) {
        this.coffee = coffee;
        this.milk = milk;
        this.syrup = syrup;
    }

    public void showOrderDetails() {
        System.out.println("Кофе: " + coffee.getDescription() +
                ", Молоко: " + milk.getMilkType() +
                ", Сироп: " + syrup.getSyrupType());
    }

    @Override
    protected CoffeeOrder clone() throws CloneNotSupportedException {
        return (CoffeeOrder) super.clone();
    }
}
