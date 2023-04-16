package com.yxcorp.gifshow.growth.mobileid.uaid.model.CMTokenResponse$Header;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class CMTokenResponse$Header implements Serializable	// class@00142b
{
    public String mAppId;
    public String mTimestamp;
    public String mTraceId;
    public static final long serialVersionUID = 0xeebaaab81538c884;

    public void CMTokenResponse$Header(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CMTokenResponse$Header.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Header{mTraceId=\'"+this.mTraceId+'''+", mTimestamp=\'"+this.mTimestamp+'''+", mAppId=\'"+this.mAppId+'''+'}';
    }
}
