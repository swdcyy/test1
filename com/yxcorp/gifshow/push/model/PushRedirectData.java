package com.yxcorp.gifshow.push.model.PushRedirectData;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Long;

public class PushRedirectData implements Serializable	// class@001690
{
    public String mAction;
    public String mApiTimeoutMs;
    public String mDefaultUri;
    public String mRedEvlpExpireS;
    public String mTimestampMs;
    public static final long serialVersionUID = 0x842d4187ebf7fe53;

    public void PushRedirectData(){
       super();
    }
    public long getApiTimeoutMs(){
       Object obj = PatchProxy.apply(null, this, PushRedirectData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.parseLong(this.mApiTimeoutMs);
    }
    public long getRedEvlpExpireS(){
       Object obj = PatchProxy.apply(null, this, PushRedirectData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.parseLong(this.mRedEvlpExpireS);
    }
    public long getTimestampMs(){
       Object obj = PatchProxy.apply(null, this, PushRedirectData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.parseLong(this.mTimestampMs);
    }
    public final long parseLong(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PushRedirectData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       try{
          return Long.parseLong(p0);
       }catch(java.lang.NumberFormatException e0){
          return 0;
       }
    }
}
