package org.example.operation;

import org.example.ComplexNumber;
import org.example.Operator;
import org.junit.Assert;
import org.junit.Test;

public class SubstractorTest {

    @Test
    public void make() {
        ComplexNumber a = new ComplexNumber("3+i");
        ComplexNumber b = new ComplexNumber("5-2i");
        Operator substractor = new Substractor();
        Assert.assertEquals("-2+3i", substractor.make(a,b).toString());
    }
}