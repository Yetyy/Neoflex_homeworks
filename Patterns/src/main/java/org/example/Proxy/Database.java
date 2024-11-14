package org.example.Proxy;

// Класс, представляющий базу данных
class Database implements DatabaseConnection {
    private String url;

    public Database(String url) {
        this.url = url;
    }

    @Override
    public void connect(String dbName) {
        System.out.println("Connected to " + url + "/" + dbName);
    }
}
