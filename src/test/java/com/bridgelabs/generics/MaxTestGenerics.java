package com.bridgelabs.generics;

import junit.framework.Assert;
import org.junit.Test;

public class MaxTestGenerics {

    @Test
    public void givenMaxNumInFirstPos_WhenMax_ShouldReturnNum() {
        MaximumNumber maximumNum = new MaximumNumber("ZY", "HK", "AB");
        String result = maximumNum.findMaximumNum();
        Assert.assertEquals("ZY", result);
    }
    @Test
    public void givenMaxNumInSecondPos_WhenMax_ShouldReturnNum() {
        MaximumNumber maximumNum = new MaximumNumber("HK", "ZY", "AB");
        String result = maximumNum.findMaximumNum();
        Assert.assertEquals("ZY", result);
    }
    @Test
    public void givenMaxNumInThirdPos_WhenMax_ShouldReturnNum() {
        MaximumNumber maximumNum = new MaximumNumber("AB", "HK", "ZY");
        String result = maximumNum.findMaximumNum();
        Assert.assertEquals("ZY", result);
    }

}
