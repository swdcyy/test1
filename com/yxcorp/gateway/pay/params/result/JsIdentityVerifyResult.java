package com.yxcorp.gateway.pay.params.result.JsIdentityVerifyResult;
import com.yxcorp.gateway.pay.params.result.BaseResult;
import java.lang.String;

public class JsIdentityVerifyResult extends BaseResult	// class@001249
{
    public final String mToken;
    public final String mType;
    public static final long serialVersionUID = 0x4f1ac06686633cae;

    public void JsIdentityVerifyResult(int p0,String p1,String p2){
       super();
       this.mResult = p0;
       this.mToken = p1;
       this.mType = p2;
    }
}
