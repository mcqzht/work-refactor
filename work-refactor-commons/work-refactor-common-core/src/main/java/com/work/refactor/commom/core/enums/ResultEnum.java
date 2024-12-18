package com.work.refactor.commom.core.enums;

/**
 * ResultCodeEnum
 *
 * @author zhoug
 * @date 2024/12/11 23:01
 */

public enum ResultEnum implements BaseEnum {

    SUCCESS(1,"success"),
    FAIL(0,"fail"),
    ;

    private int code;
    private String msg;

    ResultEnum(int code, String msg) {
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
