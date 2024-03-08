package org.example;

import org.apache.commons.lang3.StringUtils;

/**
 * Класс ComplexNumber реализует представление комплексного числа в программе
 */
public class ComplexNumber {
    //Вещественная часть числа
    private int actual;
    //Мнимая часть числа
    private int imagin;

    //конструктор
    public ComplexNumber(String s) {
        setComplexNumber(s);
    }

    //конструктор
    public ComplexNumber() {
        this.actual = 0;
        this.imagin = 0;
    }

    //конструктор
    public ComplexNumber(int num) {
        this.actual = num;
        this.imagin = 0;
    }

    // Для введенного числа выделяем вещественную и мнимую часть часть
    public void setComplexNumber(String line) {
        String separatorChars = "";
        this.actual = 0;
        this.imagin = 0;
        //выбор разделителя строки для выделения вещественной и мнимой части в введенном числе
        //число с положительной мнимой частью
        if (line.contains("+")) {
            separatorChars = "+";
        }  // число с отрицательной мнимой частью
        else if (line.contains("-")) {
            separatorChars = "-";
        } //введена только мнимая часть
        else if (line.contains("i")) {
            this.actual = 0;
            if (line.contains("i")) {
                this.imagin = Integer.parseInt(line.replace("i", ""));
                if (this.imagin == 0) this.imagin = 1;
            }
            return;
        } else {
            //Введена только Вещественная часть числа
            this.actual = Integer.parseInt(line);
            return;
        }

        String[] strNum = StringUtils.split(line, separatorChars);
        this.actual = Integer.parseInt(strNum[0]);
        if (strNum[1].contains("i")) {
            String imagin = strNum[1].replace("i", "");
            if (imagin.equals("")) {
                this.imagin = 1;
            } else {
                this.imagin = Integer.parseInt(imagin);
            }
        }
        //введено число с отрицательной мнимой частью
        if (line.contains("-")) {
            this.imagin = this.imagin * -1;
        }
    }

    //setter-метод для вещественной части числа
    public void setActual(int line) {
        this.actual = line;
    }

    //setter-метод для мнимой части числа
    public void setImagin(int line) {
        this.imagin = line;
    }

    //getter-метод для вещественной части числа
    public int getActual() {
        return this.actual;
    }

    //getter-метод для мнимой части числа
    public int getImagin() {
        return this.imagin;
    }
    //Представление комплексного числа при выводе его на консоль
    @Override
    public String toString() {
        if (this.imagin > 1) {
            return (this.actual + "+" + this.imagin + "i");
        } else if (this.imagin == 1) {
            return (this.actual + "+i");
        } else if (this.imagin < -1) {
            return (this.actual + "-" + Math.abs(this.imagin) + "i");
        } else if (this.imagin == -1) {
            return (this.actual + "-i");
        } else if (this.imagin == 0) {
            return (this.actual + "");
        }
        return "";
    }
}