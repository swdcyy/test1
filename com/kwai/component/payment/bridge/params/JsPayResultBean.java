package com.kwai.component.payment.bridge.params.JsPayResultBean;
import com.yxcorp.gateway.pay.params.result.BaseResult;
import java.lang.String;

public class JsPayResultBean extends BaseResult	// class@0009f8
{
    public String mErrorMsg;
    public static final long serialVersionUID = 0x890231235eafc02a;

    public void JsPayResultBean(int p0,String p1){
       super();
       this.mResult = p0;
       this.mErrorMsg = p1;
    }
}
