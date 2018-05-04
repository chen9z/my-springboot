package com.yclooper.myspringboot.core.ret;

/**
 * Created by chen on 2018/5/4.
 */
public class Result<T> {

    private int code;

    private String msg;

    private T data;

    public int getCode() {
        return code;
    }

    public Result setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Result setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public Result setData(T data) {
        this.data = data;
        return this;
    }
}
