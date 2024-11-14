package org.example.Proxy;

// Прокси-класс для подключения к базе данных
class DatabaseProxy implements DatabaseConnection {
    private Database realDatabase;
    private String url;

    public DatabaseProxy(String url) {
        this.url = url;
    }

    @Override
    public void connect(String dbName) {
        if (realDatabase == null) {
            realDatabase = new Database(url);
        }
        realDatabase.connect(dbName);
    }
}