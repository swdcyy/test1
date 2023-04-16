package com.yxcorp.gateway.pay.response.PrepareOrderResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class PrepareOrderResponse implements Serializable	// class@00126f
{
    public String mAppId;
    public String mNoncestr;
    public String mOrderId;
    public String mPrepayId;
    public String mSign;
    public String mStoreId;
    public String mTimestamp;
    public static final long serialVersionUID = 0xcfe190be6ca89d41;

    public void PrepareOrderResponse(){
       super();
    }
    public String getNoncestr(){
       return this.mNoncestr;
    }
    public String getOrderId(){
       return this.mOrderId;
    }
    public String getPrepayId(){
       return this.mPrepayId;
    }
    public String getSign(){
       return this.mSign;
    }
    public String getTimestamp(){
       return this.mTimestamp;
    }
    public String toSimpleString(){
       Object obj = PatchProxy.apply(null, this, PrepareOrderResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PrepareOrderResponse{mPrepayId=\'"+this.mPrepayId+'''+", mNoncestr=\'"+this.mNoncestr+'''+", mTimestamp=\'"+this.mTimestamp+'''+", mOrderId=\'"+this.mOrderId+'''+", mAppId=\'"+this.mAppId+'''+", mStoreId=\'"+this.mStoreId+'''+'}';
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PrepareOrderResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PrepareOrderResponse{mPrepayId=\'"+this.mPrepayId+'''+", mNoncestr=\'"+this.mNoncestr+'''+", mTimestamp=\'"+this.mTimestamp+'''+", mSign=\'"+this.mSign+'''+", mOrderId=\'"+this.mOrderId+'''+", mAppId=\'"+this.mAppId+'''+", mStoreId=\'"+this.mStoreId+'''+'}';
    }
}
