package org.example.Proxy;

// Интерфейс для подключения к базе данных
interface DatabaseConnection {
    void connect(String dbName);
}