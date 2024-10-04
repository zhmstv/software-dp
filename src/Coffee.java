public interface Coffee {
    String getDescription();
}

class Espresso implements Coffee {
    @Override
    public String getDescription() {
        return "Эспрессо";
    }
}

class Cappuccino implements Coffee {
    @Override
    public String getDescription() {
        return "Капучино";
    }
}

class CoffeeFactory {
    public Coffee createCoffee(String type) {
        switch (type) {
            case "Espresso":
                return new Espresso();
            case "Cappuccino":
                return new Cappuccino();
            default:
                throw new IllegalArgumentException("Неизвестный тип кофе");
        }
    }
}
