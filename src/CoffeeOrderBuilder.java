public class CoffeeOrderBuilder {
    private Coffee coffee;
    private Milk milk;
    private Syrup syrup;

    public CoffeeOrderBuilder setCoffee(Coffee coffee) {
        this.coffee = coffee;
        return this;
    }

    public CoffeeOrderBuilder setMilk(Milk milk) {
        this.milk = milk;
        return this;
    }

    public CoffeeOrderBuilder setSyrup(Syrup syrup) {
        this.syrup = syrup;
        return this;
    }

    public CoffeeOrder build() {
        return new CoffeeOrder(coffee, milk, syrup);
    }
}
