package com.miaoshaproject.error;

public class BuinessException extends Exception implements CommonError{
    private CommonError commonError;

    //直接接收EmBuinessError的传参用于构造业务异常
    public BuinessException(CommonError commonError) {
        super();
        this.commonError = commonError;
    }

    public BuinessException(CommonError commonError, String errMsg) {
        super();
        this.commonError = commonError;
        this.commonError.setErrorMsg(errMsg);
    }

    @Override
    public int getErrorCode() {
        return this.commonError.getErrorCode();
    }

    @Override
    public String getErrorMsg() {
        return this.commonError.getErrorMsg();
    }

    @Override
    public CommonError setErrorMsg(String errorMsg) {
        this.commonError.setErrorMsg(errorMsg);
        return this;
    }
}
