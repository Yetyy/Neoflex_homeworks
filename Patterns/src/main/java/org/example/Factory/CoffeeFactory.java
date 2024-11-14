package org.example.Factory;

// Фабрика для создания объектов Coffee
class CoffeeFactory {
    // Метод для создания объекта Coffee в зависимости от типа
    public Coffee createCoffee(String type) {
        if (type.equalsIgnoreCase("espresso")) {
            return new Espresso();
        } else if (type.equalsIgnoreCase("americano")) {
            return new Americano();
        } else {
            throw new IllegalArgumentException("Unknown coffee type: " + type);
        }
    }
}