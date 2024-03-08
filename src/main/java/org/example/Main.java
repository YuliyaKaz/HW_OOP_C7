package org.example;

public class Main {
    public static void main(String[] args) {

        boolean isRunning = true;
        Calculator calc = new Calculator();
        while (isRunning){
            //Ввод первого числа
            calc.setFirstNumber();
            //Ввод второго числа
            calc.setSecondNumber();
            //Ввод операции
            calc.setOperation();
            //Ввод команды пользователя
            isRunning = calc.getCommand();
        }
    }
}