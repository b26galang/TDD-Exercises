package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathTest {

    static Math math;

    @BeforeClass
    public static void setUp() {
        math = new Math();
    }

    @Test
    public void testGCF() {
        Assert.assertEquals(20, math.GCF(80, 100));
    }


    @Test
    public void testAreaRectangle() {
        Assert.assertEquals(16, math.areaRectangle(4,4));
    }

    @Test
    public void testAreaTriangle() {
        Assert.assertEquals(6, math.areaTriangle(2,6), 1);
    }

    @Test
    public void testAreaCircle() {
        Assert.assertEquals(12.56637, math.areaCircle(2), 1);
    }

    @Test
    public void testFactorial() {
        Assert.assertEquals(120, math.factorial(5));
    }

}
