package com.yxcorp.gateway.pay.params.result.JsBiometricResult;
import com.yxcorp.gateway.pay.params.result.BaseResult;

public class JsBiometricResult extends BaseResult	// class@001245
{
    public int mSupport;

    public void JsBiometricResult(int p0,int p1){
       super();
       this.mResult = p0;
       this.mSupport = p1;
    }
}
