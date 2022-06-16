package com.bridgelabs.generics;

public class MaximumNumber<T extends Comparable<T>> {

    public <T extends Comparable<T>>T findMaximumNum (T ...num){
        T temp;
        for (int i = 0; i < num.length; i++) {
            for(int j = i + 1; j < num.length; j++) {
                if (num[i].compareTo(num[j]) < 0) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        return num[0];
    }
}
