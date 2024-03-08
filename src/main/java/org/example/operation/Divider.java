package org.example.operation;

import org.example.ComplexNumber;
import org.example.Operator;

/**
 * Класс Divider реализует функцию деления комплексных чисел.
 */
public class Divider implements Operator {
    @Override
    public ComplexNumber make(ComplexNumber a, ComplexNumber b) throws ArithmeticException {
        ComplexNumber result = new ComplexNumber();
        //Знаминатель вещественной и мнимой части не может быть равен нулю
        double denum = Math.pow(b.getActual(),2) + Math.pow(b.getImagin(),2);
        if (denum == 0.0){
            throw new ArithmeticException("Деление на ноль");
        }
        //Вычисление вещественной части числа
        double actual = (a.getActual() * b.getActual() + a.getImagin() * b.getImagin()) / denum ;
        //Вычисление мнимой части числа
        double imagin = (a.getImagin() * b.getActual() - a.getActual()* b.getImagin()) / denum ;
        //Результат приводим к Int
        result.setActual( (int)actual );
        result.setImagin( (int)imagin );
        return result;
    }
}
