package org.example.Factory;

// Подкласс Americano
class Americano extends Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Americano...");
    }
}