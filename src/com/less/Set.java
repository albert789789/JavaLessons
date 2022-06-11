package com.less;

// {}, {10, 25}, {0, 15, 31}, {0,1,2,3,4,5,6,7,8,9,10}
public class Set {

    int value;

    public Set(int value) {
        this.value = value;
    }

    public Set union(Set s) {
        return new Set(this.value | s.value);
    }
}
