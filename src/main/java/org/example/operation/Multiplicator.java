package org.example.operation;

import org.example.ComplexNumber;
import org.example.Operator;

/**
 * Класс Multiplicator реализует функцию умножения комплексных чисел.
 */
public class Multiplicator implements Operator {

    @Override
    public ComplexNumber make(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = new ComplexNumber();
        //Вещественная часть комплексного числа
        result.setActual(a.getActual() * b.getActual() - a.getImagin() * b.getImagin());
        //Мнимая часть комплексного числа
        result.setImagin(a.getActual() * b.getImagin() + a.getImagin() * b.getActual());
        return result;
    }
}
