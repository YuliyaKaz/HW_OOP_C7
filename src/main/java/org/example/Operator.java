package org.example;

import org.example.ComplexNumber;
/**
 * Интерфейс Operator - Общий интерфейс для классов, реализующих математические действия
 */
public interface Operator {
    public ComplexNumber make(ComplexNumber a, ComplexNumber b);
}
