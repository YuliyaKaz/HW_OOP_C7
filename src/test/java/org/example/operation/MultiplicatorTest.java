package org.example.operation;

import org.example.ComplexNumber;
import org.example.Operator;
import org.junit.Assert;
import org.junit.Test;

public class MultiplicatorTest {

    @Test
    public void make() {
        ComplexNumber a = new ComplexNumber("1-i");
        ComplexNumber b = new ComplexNumber("3+6i");
        Operator multiplicator = new Multiplicator();
        Assert.assertEquals("9+3i", multiplicator.make(a,b).toString());
    }
}