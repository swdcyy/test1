package com.yxcorp.gateway.pay.params.GatewayOrderParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class GatewayOrderParams implements Serializable	// class@001237
{
    public String mCallback;
    public String mMerchantId;
    public String mPayMethod;
    public String mPrepayNo;
    public String mProvider;
    public String mProviderExtra;
    public static final long serialVersionUID = 0x6268d23b47ee87f;

    public void GatewayOrderParams(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GatewayOrderParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GatewayOrderParams{mCallback=\'"+this.mCallback+'''+", mProvider=\'"+this.mProvider+'''+", mPayMethod=\'"+this.mPayMethod+'''+", mMerchantId=\'"+this.mMerchantId+'''+", mPrepayNo=\'"+this.mPrepayNo+'''+", mProviderExtra=\'"+this.mProviderExtra+'''+'}';
    }
}
