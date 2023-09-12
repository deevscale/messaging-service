package com.deevscale.messaging;

public class KafkaConsumer {

    //Two streams with equal ID's, different topics
    //each second a event comes on one and on other
    //0 1   2   3   4   5   6   7   8   9
    //A _   _   _   _   A1  D   B               == view
    //_ _   _   A   _   _   C   D,D1            == click
}
