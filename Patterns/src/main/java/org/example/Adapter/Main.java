package org.example.Adapter;

public class Main {
    public static void main(String[] args) {
        // Создаем карту памяти
        MemoryCard memoryCard = new MemoryCard();

        // Создаем адаптер для карты памяти
        MemoryCardAdapter adapter = new MemoryCardAdapter(memoryCard);

        // Создаем компьютер
        Computer computer = new Computer();

        // Читаем данные с карты памяти через адаптер
        computer.readFromUSB(adapter);
    }
}