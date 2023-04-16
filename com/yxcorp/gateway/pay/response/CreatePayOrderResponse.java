package com.yxcorp.gateway.pay.response.CreatePayOrderResponse;
import com.yxcorp.gateway.pay.response.GatewayPayBaseResponse;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class CreatePayOrderResponse extends GatewayPayBaseResponse	// class@001267
{
    public CreatePayOrderResponse$a mGatewayPayParam;
    public boolean mNeedToH5;
    public String mPayResult;
    public CreatePayOrderResponse$b mProviderWaitingTime;
    public static final long serialVersionUID = 0x75674e1961aeabb;

    public void CreatePayOrderResponse(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CreatePayOrderResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CreatePayOrderResponse{mCode=\'"+this.mCode+'''+", mMsg=\'"+this.mMsg+'''+", mGatewayPayParam="+this.mGatewayPayParam+", mNeedToH5="+this.mNeedToH5+", mProviderWaitingTime="+this.mProviderWaitingTime+", mPayResult=\'"+this.mPayResult+'''+'}';
    }
}
