package com.work.refactor.commom.core.model.vo;

import com.work.refactor.commom.core.enums.BaseEnum;
import com.work.refactor.commom.core.enums.ResultEnum;

/**
 * BaseResult
 *
 * @author zhoug
 * @date 2024/12/11 22:41
 */


public class BaseResult<T> {
    private int code;
    private String message;
    private T data;

    public BaseResult() {
    }
    public BaseResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public BaseResult(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMsg();
    }
    public BaseResult(ResultEnum resultEnum, T data) {
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMsg();
        this.data = data;
    }
    public static <T> BaseResult<T> success(T data) {
        return new BaseResult<>(ResultEnum.SUCCESS,data);
    }
    public static <T> BaseResult<T> success() {
        return new BaseResult<>(ResultEnum.SUCCESS);
    }
    public static <T> BaseResult<T> success(String msg) {
        return new BaseResult<>(ResultEnum.SUCCESS.getCode(),msg,null);
    }
    public static <T> BaseResult<T> fail(BaseEnum baseEnum) {
        return new BaseResult<>(ResultEnum.FAIL);
    }


}
