// Ингредиенты
public interface Milk {
    String getMilkType();
}

class WholeMilk implements Milk {
    @Override
    public String getMilkType() {
        return "Цельное молоко";
    }
}
class AlmondMilk implements Milk {
    @Override
    public String getMilkType() {
        return "Миндальное молоко";
    }
}

// Сиропы
interface Syrup {
    String getSyrupType();
}

class VanillaSyrup implements Syrup {
    @Override
    public String getSyrupType() {
        return "Ванильный сироп";
    }
}

class CaramelSyrup implements Syrup {
    @Override
    public String getSyrupType() {
        return "Карамельный сироп";
    }
}

// Абстрактная фабрика
interface CoffeeIngredientFactory {
    Milk createMilk();
    Syrup createSyrup();
}

// Конкретные фабрики
class CappuccinoIngredientFactory implements CoffeeIngredientFactory {
    @Override
    public Milk createMilk() {
        return new WholeMilk();
    }

    @Override
    public Syrup createSyrup() {
        return new VanillaSyrup();
    }
}

class LatteIngredientFactory implements CoffeeIngredientFactory {
    @Override
    public Milk createMilk() {
        return new AlmondMilk();
    }

    @Override
    public Syrup createSyrup() {
        return new CaramelSyrup();
    }
}
