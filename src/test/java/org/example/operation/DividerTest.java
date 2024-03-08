package org.example.operation;

import org.example.ComplexNumber;
import org.example.Operator;
import org.junit.Assert;
import org.junit.Test;

public class DividerTest {

    @Test
    public void make() {
        ComplexNumber a = new ComplexNumber("7-4i");
        ComplexNumber b = new ComplexNumber("3+2i");
        Operator divider = new Divider();
        Assert.assertEquals("1-2i", divider.make(a,b).toString());
    }
}