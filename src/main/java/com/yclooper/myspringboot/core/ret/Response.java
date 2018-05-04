package com.yclooper.myspringboot.core.ret;

/**
 * Created by chen on 2018/5/4.
 */
public class Response {

    private final static String SUCCESS = "success";

    public static <T> Result makeOKRsp() {
        return new Result<T>().setCode(RetCode.SUCCESS.code).setMsg(SUCCESS);
    }
    public static <T> Result makeOKRsp(T data) {
        return new Result<T>().setCode(RetCode.SUCCESS.code).setMsg(SUCCESS).setData(data);
    }

    public static <T> Result makeErrRsp(String message) {
        return new Result<T>().setCode(RetCode.FAIL.code).setMsg(message);
    }

    public static <T> Result<T> makeRsp(int code, String message) {
        return new Result<>().setCode(code).setMsg(message);
    }

    public static <T> Result<T> makeRsp(int code, String message, T data) {
        return new Result<>().setCode(code).setMsg(message).setData(data);
    }

}
