package org.example.Singleton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    // Приватное статическое поле для хранения единственного экземпляра класса
    private static Logger instance;

    // Приватный конструктор для предотвращения создания экземпляров класса извне
    private Logger() {}

    // Публичный статический метод для получения единственного экземпляра класса
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Метод для логирования информации
    public void classLog(Object obj, String info) {
        String className = obj.getClass().getSimpleName();
        String currentDate = new SimpleDateFormat("dd.MM.yy").format(new Date());
        System.out.println("Log info: " + currentDate + " - " + className + " - " + info);
    }

    public static void main(String[] args) {
        // Пример использования
        Logger logger = Logger.getInstance();
        logger.classLog(new TestClass(), "Some info");
    }
}

class TestClass {
    // Пример класса для тестирования
}
