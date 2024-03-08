package org.example.operation;

import org.example.ComplexNumber;
import org.example.Operator;
import org.junit.Assert;
import org.junit.Test;

public class SummatorTest {

    @Test
    public void make() {
        ComplexNumber a = new ComplexNumber("3+i");
        ComplexNumber b = new ComplexNumber("5-2i");
        Operator summator = new Summator();
        Assert.assertEquals("8-i", summator.make(a,b).toString());
    }
}