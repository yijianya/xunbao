package com.yijianya.xunbao.controller.common;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ResultHelper {
    private static final String RESULT_CODE_KEY = "code";
    private static final String RESULT_MESSAGE_KEY = "message";
    private static final String RESULT_DATA_KEY = "data";

    private static final int RESULT_CODE_FAIL_VALUE = -1;
    private static final String RESULT_MESSAGE_FAIL_VALUE = "操作失败！";

    private static final int RESULT_CODE_UNKNOWN_VALUE = 0;
    private static final String RESULT_MESSAGE_UNKNOWN_VALUE = "系统繁忙请稍后再试！";

    private static final int RESULT_CODE_SUCCESS_VALUE = 1;
    private static final String RESULT_MESSAGE_SUCCESS_VALUE = "操作成功！";

    public <T> Map newResult(int code, String message, T data){
        Map<String, Object> result = new HashMap<>();
        result.put(RESULT_CODE_KEY, code);
        result.put(RESULT_MESSAGE_KEY, message);
        if(null != data) {
            result.put(RESULT_DATA_KEY, data);
        }

        return result;
    }

    public <T> Map newSuccessResult(){
        return newResult(RESULT_CODE_SUCCESS_VALUE, RESULT_MESSAGE_SUCCESS_VALUE, null);
    }

    public <T> Map newSuccessResult(T data){
        return newResult(RESULT_CODE_SUCCESS_VALUE, RESULT_MESSAGE_SUCCESS_VALUE, data);
    }

    public <T> Map newFailResult(){
        return newResult(RESULT_CODE_FAIL_VALUE, RESULT_MESSAGE_FAIL_VALUE, null);
    }

    public <T> Map newFailResult(String message){
        return newResult(RESULT_CODE_FAIL_VALUE, message, null);
    }

    public <T> Map newFailResult(int code, String message){
        return newResult(code, message, null);
    }

    public <T> Map newUnknownResult(){
        return newResult(RESULT_CODE_UNKNOWN_VALUE, RESULT_MESSAGE_UNKNOWN_VALUE, null);
    }

    public <T> Map newUnknownResult(String message){
        return newResult(RESULT_CODE_UNKNOWN_VALUE, message, null);
    }

    public <T> Map newUnknownResult(int code, String message){
        return newResult(code, message, null);
    }
}
