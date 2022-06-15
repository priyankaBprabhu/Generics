package com.bridgelabs.generics;

public class MaximumNumber {
    String num1,num2,num3;

    public MaximumNumber(String num1, String num2, String num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public String findMaximumNum() {
        if((num1.compareTo(num2)) >0 && (num1.compareTo(num3)) > 0) {
            return num1;
        }
        else if(num2.compareTo(num3) > 0) {
            return num2;
        }
        return num3;

    }
}
