package com.github.microwww.protocal;

import com.github.microwww.util.Assert;

public class RedisArgumentsException extends RuntimeException {
    public RedisArgumentsException(String message) {
        this(message, null);
    }

    public RedisArgumentsException(String message, Throwable cause) {
        super(message, cause);
        Assert.isNotNull(message, "Not null");
        if (message.contains("\r") || message.contains("\n")) {
            throw new RuntimeException("Not contains \r\n ");
        }
    }
}
