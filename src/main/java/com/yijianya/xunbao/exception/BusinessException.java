package com.yijianya.xunbao.exception;

/**
 *
 */
public class BusinessException extends RuntimeException {
    public static final BusinessException SYSTEM_BUSY_EXCEPTION
            = new BusinessException(ExceptionEnum.err_system_busy.name(),"系统繁忙，请稍后再试！");

    /**
     * 异常编码
     * @see ExceptionEnum
     */
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BusinessException(String code){
        super();
        this.code = code;
    }

    public BusinessException(String code, String message){
        super(message);
        this.code = code;
    }

    public BusinessException(String code, Throwable throwable){
        super(throwable);
        this.code = code;
    }

    public BusinessException(String code, String message, Throwable throwable){
        super(message, throwable);
        this.code = code;
    }
}
