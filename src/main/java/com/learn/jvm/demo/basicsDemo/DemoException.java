package com.learn.jvm.demo.basicsDemo;

/**
 * @Author RGD
 * @Date: 2022/8/23 13:51
 * @description:
 */
public class DemoException extends Exception {


    private int code;

    private String message;

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public DemoException(int code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }
}
