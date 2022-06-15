package com.bridgelabs.generics;

import junit.framework.Assert;
import org.junit.Test;

public class MaxTestGenerics {

    @Test
    public void givenMaxNumInFirstPos_WhenMax_ShouldReturnNum() {
        MaximumNumber maximumNum = new MaximumNumber(99, 88, 77);
        int result = maximumNum.findMaximumNum();
        Assert.assertEquals(99, result);
    }
    @Test
    public void givenMaxNumInSecondPos_WhenMax_ShouldReturnNum() {
        MaximumNumber maximumNum = new MaximumNumber(88, 99, 77);
        int result = maximumNum.findMaximumNum();
        Assert.assertEquals(99, result);
    }
    @Test
    public void givenMaxNumInThirdPos_WhenMax_ShouldReturnNum() {
        MaximumNumber maximumNum = new MaximumNumber(88, 77, 99);
        int result = maximumNum.findMaximumNum();
        Assert.assertEquals(99, result);
    }

}
