package org.example.operation;

import org.example.ComplexNumber;
import org.example.Operator;

/**
 * Класс Substractor реализует функцию вычитания комплексных чисел
 */
public class Substractor implements Operator {
    @Override
    public ComplexNumber make(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = new ComplexNumber();
        //Вещественная часть числа
        result.setActual(a.getActual() - b.getActual());
        //Мнимая часть числа
        result.setImagin(a.getImagin() - b.getImagin());
        return result;
    }
}

