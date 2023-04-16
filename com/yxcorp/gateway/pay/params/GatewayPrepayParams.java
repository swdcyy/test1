package com.yxcorp.gateway.pay.params.GatewayPrepayParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class GatewayPrepayParams implements Serializable	// class@00123d
{
    public String mCallback;
    public String mMerchantId;
    public String mOutTradeNo;
    public String mPayMethod;
    public String mProvider;
    public String mProviderConfig;
    public String mReferer;
    public static final long serialVersionUID = 0x5c4017ac6724946b;

    public void GatewayPrepayParams(){
       super();
    }
    public String toSimpleString(){
       Object obj = PatchProxy.apply(null, this, GatewayPrepayParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GatewayPrepayParams{, mProvider=\'"+this.mProvider+'''+", mPayMethod=\'"+this.mPayMethod+'''+", mMerchantId=\'"+this.mMerchantId+'''+", mOutTradeNo=\'"+this.mOutTradeNo+'''+'}';
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GatewayPrepayParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GatewayPrepayParams{mCallback=\'"+this.mCallback+'''+", mProvider=\'"+this.mProvider+'''+", mPayMethod=\'"+this.mPayMethod+'''+", mProviderConfig=\'"+this.mProviderConfig+'''+", mMerchantId=\'"+this.mMerchantId+'''+", mOutTradeNo=\'"+this.mOutTradeNo+'''+", mReferer=\'"+this.mReferer+'''+'}';
    }
}
