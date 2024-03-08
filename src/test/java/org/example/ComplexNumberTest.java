package org.example;

import org.junit.Assert;
import org.example.ComplexNumber;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexNumberTest {
    private ComplexNumber complexNumber;

    @org.junit.Test
    public void complexNumberInitial() {
        Assert.assertEquals(0, new ComplexNumber().getActual());
    }
    @Test
    public void complexNumberFullElement() {
        Assert.assertEquals(5, new ComplexNumber("5+2i").getActual());
    }
    @Test
    public void setComplexNumber(){
        Assert.assertEquals(5,new ComplexNumber(5).getActual());
    }
    @Test
    public void setComplexNumberImagin(){
        Assert.assertEquals(2,new ComplexNumber("5+2i").getImagin());
    }
}