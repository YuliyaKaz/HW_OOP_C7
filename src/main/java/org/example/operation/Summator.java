package org.example.operation;

import org.example.ComplexNumber;
import org.example.Operator;

/**
 * Класс Summator реализует функцию сложения комплексных чисел
 */
public class Summator implements Operator {
    @Override
    public ComplexNumber make(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = new ComplexNumber();
        //Вещественная часть числа
        result.setActual(a.getActual() + b.getActual());
        //Мнимая часть числа
        result.setImagin(a.getImagin() + b.getImagin());
        return result;
    }
}
