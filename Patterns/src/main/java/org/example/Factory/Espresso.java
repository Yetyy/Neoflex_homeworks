package org.example.Factory;

// Подкласс Espresso
class Espresso extends Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Espresso...");
    }
}