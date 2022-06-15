package com.bridgelabs.generics;

import junit.framework.Assert;
import org.junit.Test;

public class  MaxTestGenerics <T extends Comparable>{

    @Test
    public void givenMaxNumInFirstPos_WhenMax_ShouldReturnNum() {
        MaximumNumber maximumNum = new MaximumNumber(99, 88, 77);
        T result = (T)maximumNum.findMaximumNum();
        Assert.assertEquals(99, result);
    }
    @Test
    public void givenMaxNumInSecondPos_WhenMax_ShouldReturnNum() {
        MaximumNumber maximumNum = new MaximumNumber(4.12f, 3.12f, 2.12f);
        T result = (T)maximumNum.findMaximumNum();
        Assert.assertEquals(4.12f, result);
    }
    @Test
    public void givenMaxNumInThirdPos_WhenMax_ShouldReturnNum() {
        MaximumNumber maximumNum = new MaximumNumber("AB", "HK", "ZY");
        T result = (T) maximumNum.findMaximumNum();
        Assert.assertEquals("ZY", result);
    }

}
