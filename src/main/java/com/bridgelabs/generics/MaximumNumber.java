package com.bridgelabs.generics;

public class MaximumNumber {
    Integer num1;
    Integer num2;
    Integer num3;
    public MaximumNumber(Integer num1, Integer num2, Integer num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int findMaximumNum() {
        if((num1.compareTo(num2)) >0 && (num1.compareTo(num3)) > 0) {
            return num1;
        }
        else if(num2.compareTo(num3) > 0) {
            return num2;
        }
        return num3;

    }
}
