package com.yxcorp.gateway.pay.params.result.JsErrorResult;
import com.yxcorp.gateway.pay.params.result.BaseResult;
import java.lang.String;

public final class JsErrorResult extends BaseResult	// class@001248
{
    public final String mErrorMsg;

    public void JsErrorResult(int p0,String p1){
       super();
       this.mResult = p0;
       this.mErrorMsg = p1;
    }
}
