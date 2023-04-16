package com.kwai.component.payment.bridge.params.JsGatewayPayDepositParams;
import com.yxcorp.gateway.pay.params.result.BaseResult;
import java.lang.String;

public class JsGatewayPayDepositParams extends BaseResult	// class@0009f3
{
    public String mCompleteTime;
    public String mDepositAmount;
    public String mErrorCode;
    public String mErrorMsg;
    public String mIncentiveAmount;
    public static final long serialVersionUID = 0x384d21d334237edb;

    public void JsGatewayPayDepositParams(String p0,String p1,int p2){
       super();
       this.mErrorCode = p0;
       this.mResult = p2;
       this.mErrorMsg = p1;
    }
    public JsGatewayPayDepositParams setCompleteTime(String p0){
       this.mCompleteTime = p0;
       return this;
    }
    public JsGatewayPayDepositParams setDepositAmount(String p0){
       this.mDepositAmount = p0;
       return this;
    }
    public JsGatewayPayDepositParams setIncentiveAmount(String p0){
       this.mIncentiveAmount = p0;
       return this;
    }
}
