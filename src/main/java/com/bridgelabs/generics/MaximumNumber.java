package com.bridgelabs.generics;

public class MaximumNumber<T extends Comparable> {
    T num1,num2,num3;

    public MaximumNumber(T num1, T num2, T num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public <T extends Comparable> T findMaximumNum() {
        if((num1.compareTo(num2)) >0 && (num1.compareTo(num3)) > 0) {
            return (T) num1;
        }
        else if(num2.compareTo(num3) > 0) {
            return (T) num2;
        }
        return (T) num3;

    }
}
