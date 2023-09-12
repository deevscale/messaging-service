package com.deevscale.processing;

import static org.junit.jupiter.api.Assertions.*;

class MessageProcessorTest {

    MessageProcessor principal  = new MessageProcessor();

    @org.junit.jupiter.api.Test
    void countArrays() {

        int[] arr1 = {10,31,522,54,77,89,22,443,234,6,4,3234,23,28};
        int[] arr2 = {2,3,1,2,1,2,1,2};

        int actual = principal.countArrays(arr1,arr2);

        System.out.println(actual);

    }

    @org.junit.jupiter.api.Test
    void inter() {

        System.out.println("The i is ");
        System.out.println(35/22*2 + 33);

    }
}