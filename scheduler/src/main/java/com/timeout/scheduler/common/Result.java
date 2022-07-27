package com.timeout.scheduler.common;

public class Result<T> {
    private int code;
    private String errorTrace;
    private String errorMessage;
    private T content;

    public Result() {
    }

    public Result(int code, String errorTrace, String errorMessage, T content) {
        this.code = code;
        this.errorTrace = errorTrace;
        this.errorMessage = errorMessage;
        this.content = content;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrorTrace() {
        return errorTrace;
    }

    public void setErrorTrace(String errorTrace) {
        this.errorTrace = errorTrace;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
