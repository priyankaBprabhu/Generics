package com.bridgelabs.generics;

import junit.framework.Assert;
import org.junit.Test;

public class  MaxTestGenerics{

    @Test
    public void givenMaxNumInFirstPos_WhenMax_ShouldReturnNum() {
        MaximumNumber<Integer> maximumNum = new MaximumNumber();
        int result = maximumNum.findMaximumNum(99, 88, 77);
        Assert.assertEquals(99, result);
    }
    @Test
    public void givenMaxNumInSecondPos_WhenMax_ShouldReturnNum() {
        MaximumNumber<Float> maximumNum = new MaximumNumber();
        float result = maximumNum.findMaximumNum(4.12f, 3.12f, 2.12f, 1.23f, 1.11f, 2.22f);
        Assert.assertEquals(4.12f, result);
    }
    @Test
    public void givenMaxNumInThirdPos_WhenMax_ShouldReturnNum() {
        MaximumNumber<String> maximumNum = new MaximumNumber();
        String result = maximumNum.findMaximumNum("AB", "AC","HK", "ZY");
        Assert.assertEquals("ZY", result);
    }

}
