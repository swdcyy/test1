package com.yxcorp.gifshow.ad.response.InstreamAdResponse;
import com.yxcorp.gifshow.ad.response.InstreamAdResponse$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.ad.response.InstreamAdResponse$EApiData;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class InstreamAdResponse	// class@0017da
{
    public InstreamAdResponse$EApiData data;
    public String mErrorMsg;
    public int mInnerCode;
    public String mLlsid;
    public int mResult;
    public static final long a = 0x16e4d2f2b597732d;
    public static final InstreamAdResponse$a b;

    static {
       InstreamAdResponse.b = new InstreamAdResponse$a(null);
    }
    public void InstreamAdResponse(){
       super();
    }
    public final InstreamAdResponse$EApiData a(){
       return this.data;
    }
    public final int b(){
       return this.mInnerCode;
    }
    public final String c(){
       return this.mLlsid;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, InstreamAdResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EApiAdResponse\(mLlsid="+this.mLlsid+", mResult="+this.mResult+", mErrorMsg="+this.mErrorMsg+", data="+this.data+')';
    }
}
