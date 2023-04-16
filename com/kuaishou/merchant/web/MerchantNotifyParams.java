package com.kuaishou.merchant.web.MerchantNotifyParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class MerchantNotifyParams implements Serializable	// class@0009cd
{
    public String mCallback;
    public String mData;
    public int mType;
    public static final long serialVersionUID = 0xf394221be13179df;

    public void MerchantNotifyParams(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MerchantNotifyParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MerchantNotifyParams{mType="+this.mType+", mData=\'"+this.mData+'''+", mCallback=\'"+this.mCallback+'''+'}';
    }
}
