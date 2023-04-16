package com.kwai.component.payment.bridge.params.JsGatewayPayResultParams;
import com.yxcorp.gateway.pay.params.result.BaseResult;
import java.lang.String;

public class JsGatewayPayResultParams extends BaseResult	// class@0009f4
{
    public String mErrorCode;
    public String mErrorMsg;
    public String mMerchantId;
    public static final long serialVersionUID = 0xe59dedc358292145;

    public void JsGatewayPayResultParams(String p0,String p1,String p2){
       super();
       this.mErrorCode = p0;
       this.mErrorMsg = p1;
       this.mMerchantId = p2;
    }
    public JsGatewayPayResultParams setResult(int p0){
       this.mResult = p0;
       return this;
    }
}
