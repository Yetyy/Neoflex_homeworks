package org.example.Factory;

public class Main {
    public static void main(String[] args) {
        // Создаем фабрику
        CoffeeFactory factory = new CoffeeFactory();

        // Создаем объект Espresso и вызываем метод prepare
        Coffee espresso = factory.createCoffee("espresso");
        espresso.prepare();

        // Создаем объект Americano и вызываем метод prepare
        Coffee americano = factory.createCoffee("americano");
        americano.prepare();
    }
}
