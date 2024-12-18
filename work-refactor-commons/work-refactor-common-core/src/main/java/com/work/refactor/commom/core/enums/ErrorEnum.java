package com.work.refactor.commom.core.enums;

/**
 * ErrorEnum
 *
 * @author zhoug
 * @date 2024/12/11 22:55
 */


public enum ErrorEnum implements BaseEnum {

    ;


    private int code;
    private String msg;

    ErrorEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
