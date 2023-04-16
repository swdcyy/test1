package com.yxcorp.gateway.pay.response.CreatePayOrderResponse$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class CreatePayOrderResponse$a	// class@001265
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;

    public String toString(){
       Object obj = PatchProxy.apply(null, this, CreatePayOrderResponse$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GatewayPayParam{mMerchantId=\'"+this.a+'''+", mGatewayPrepayNo=\'"+this.b+'''+", mOutOrderNo=\'"+this.c+'''+", mProvider=\'"+this.d+'''+", mPaymentMethod=\'"+this.e+'''+", mProviderChannelExtra=\'"+this.f+'''+", mProviderConfig=\'"+this.g+'''+", mReferer=\'"+this.h+'''+'}';
    }
}
