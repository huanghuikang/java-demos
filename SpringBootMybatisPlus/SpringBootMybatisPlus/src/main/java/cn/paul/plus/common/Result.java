package cn.paul.plus.common;

import java.io.Serializable;

/**
 * @Author Paul Huang
 * @Purpose 目的
 * @Created 2023/12/19
 */
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private int resultCode;
    private String message;
    private T data;

    public Result(){}

    public Result(int resultCode,String message){
        this.resultCode = resultCode;
        this.message = message;
    }

    public int getResultCode(){
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Result failure(String code){
        return new Result(500,"服务器错误");
    }

    @Override
    public String toString() {
        return "Result{" +
                "resultCode=" + resultCode +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
