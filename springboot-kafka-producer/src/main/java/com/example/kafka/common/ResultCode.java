package com.example.kafka.common;

/**
 * Created by leolius on 2018-3-26.
 */
public enum ResultCode {

    SUCCESS(1), EXCEPTION(2);
    private int value;

    ResultCode(int value) {
        this.value = value;
    }
}
