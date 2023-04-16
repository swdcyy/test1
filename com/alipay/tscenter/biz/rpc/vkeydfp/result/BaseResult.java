package com.alipay.tscenter.biz.rpc.vkeydfp.result.BaseResult;
import java.io.Serializable;
import java.lang.Object;

public class BaseResult implements Serializable	// class@000ebc
{
    public String resultCode;
    public boolean success;

    public void BaseResult(){
       this.success = false;
    }
}
