package com.example.arrays_strings.romans;

public enum Roman {
    I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

    private int value;
    private Roman(int value){
        this.value = value;
    }

    public int getInt(){
        return this.value;
    }

}
