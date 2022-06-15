package com.bridgelabs.generics;

import junit.framework.Assert;
import org.junit.Test;

public class MaxTestGenerics {

    @Test
    public void givenMaxNumInFirstPos_WhenMax_ShouldReturnNum() {
        MaximumNumber maximumNum = new MaximumNumber(4.12f, 3.12f, 2.12f);
        Float result = maximumNum.findMaximumNum();
        Assert.assertEquals(4.12f, result);
    }
    @Test
    public void givenMaxNumInSecondPos_WhenMax_ShouldReturnNum() {
        MaximumNumber maximumNum = new MaximumNumber(2.12f, 4.12f, 3.12f);
        Float result = maximumNum.findMaximumNum();
        Assert.assertEquals(4.12f, result);
    }
    @Test
    public void givenMaxNumInThirdPos_WhenMax_ShouldReturnNum() {
        MaximumNumber maximumNum = new MaximumNumber(2.12f, 3.12f, 4.12f);
        Float result = maximumNum.findMaximumNum();
        Assert.assertEquals(4.12f, result);
    }

}
