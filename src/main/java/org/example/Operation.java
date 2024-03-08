package org.example;

import org.example.operation.*;
/**
 * Класс Operation предназначен для вывода определенного класса действия в зависимости от того, какую команду введет пользователь
 */
public class Operation implements Operator {
    private Operator expression;
    private String operation;
    //Выбор соответствующей операции в зависимости от выбора пользователя
    public Operation(String s){
        this.operation = s;
        switch (this.operation){
            case ("+"):
                expression = new Summator();
                break;
            case "-":
                expression = new Substractor();
                break;
            case "*":
                expression = new Multiplicator();
                break;
            case "/":
                expression = new Divider();
                break;
            default:
                throw new UnsupportedOperationException ("Операция не существует ");
        }
    }
//Выполнение выбранной операции или извещение, что операция не может быть выполнена
    @Override
    public ComplexNumber make(ComplexNumber a, ComplexNumber b) {
        if (expression.equals(null)){
            return null;
        }
        return expression.make(a, b);
    }
    @Override
    public String toString(){
        switch (this.operation) {
            case "+":
                return "Сложение";
            case  "-":
                return "Вычитание";
            case "*":
                return "Умножение";
            case "/":
                return "Деление";
        }
        return "";
    }
}
