package org.example;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Класс Калькулятор предназначен для управления данными
 */
public class Calculator {
    //Первое число
    private ComplexNumber a;
    //Второе число
    private ComplexNumber b;
    //Применимая операция
    private Operation op;
    private Scanner scanner;
    //Лог
    private static Logger logger;

    public Calculator(){
        scanner = new Scanner(System.in);
        //Создание объекта лога
        logger = Logger.getLogger("Log");
        FileHandler fh;
        try {
            // This block configure the logger with handler and formatter
            fh = new FileHandler("LogFile.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Ввод первого числа
     */
    public void setFirstNumber() {
        logger.info("Введите первое число в формате 'a+bi': ");
        a = new ComplexNumber(scanner.next());
        logger.info("Введено число " + a);
    }

    /**
     * Ввод второго числа
     */
    public void setSecondNumber() {
        logger.info("Введите второе число в формате 'a+bi': ");
        b = new ComplexNumber(scanner.next());
        logger.info("Введено число " + b);
    }

    /**
     * Ввод операции + вывод результата на экран
     */
    public void setOperation() {
        logger.info("Введите операцию: ");
        try {
            op = new Operation(scanner.next());
            logger.info("Введена операция " + op.toString() );
            logger.info("Результат: " + op.make(a, b).toString());
        } catch (ArithmeticException e) {
            logger.info("Возникла исключительная ситуация: Деление на ноль ");
        } catch (UnsupportedOperationException e) {
            logger.info(e.getMessage());
        }
    }

    /**
     * Обработка команд
     * @return Введена команда выхода из калькулятора
     */
    public boolean getCommand(){
        logger.info("Для выхода из программы введите 'q'");
        if (scanner.next().equalsIgnoreCase("q")) {
            logger.info("Выход из пограммы ");

            return false;
        }
        return true;
    }
}
