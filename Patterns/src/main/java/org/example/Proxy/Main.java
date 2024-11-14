package org.example.Proxy;

public class Main {
    public static void main(String[] args) {
        // Создаем прокси для подключения к базе данных
        DatabaseConnection proxy = new DatabaseProxy("localhost:port");

        // Подключаемся к базе данных через прокси
        proxy.connect("myDatabase");
    }
}