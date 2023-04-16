package com.kuaishou.merchant.live.basic.startlive.RouterActionConfig;
import java.io.Serializable;
import mkd.a;
import com.kuaishou.merchant.live.basic.startlive.RouterActionConfig$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonElement;

public final class RouterActionConfig implements Serializable, a	// class@0018d0
{
    public boolean mIsAnchorShow;
    public boolean mNeedRandomCall;
    public JsonElement mParams;
    public long mRandomCallTime;
    public String mUrl;
    public String mUrlParams;
    public static final RouterActionConfig$a Companion;
    public static final long serialVersionUID;

    static {
       RouterActionConfig.Companion = new RouterActionConfig$a(null);
    }
    public void RouterActionConfig(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, RouterActionConfig.class, "1")) {
          return;
       }
       RouterActionConfig tmParams = this.mParams;
       if (tmParams != null) {
          this.mUrlParams = String.valueOf(tmParams);
       }
       return;
    }
    public final boolean getMIsAnchorShow(){
       return this.mIsAnchorShow;
    }
    public final boolean getMNeedRandomCall(){
       return this.mNeedRandomCall;
    }
    public final JsonElement getMParams(){
       return this.mParams;
    }
    public final long getMRandomCallTime(){
       return this.mRandomCallTime;
    }
    public final String getMUrl(){
       return this.mUrl;
    }
    public final String getMUrlParams(){
       return this.mUrlParams;
    }
    public final void setMIsAnchorShow(boolean p0){
       this.mIsAnchorShow = p0;
    }
    public final void setMNeedRandomCall(boolean p0){
       this.mNeedRandomCall = p0;
    }
    public final void setMParams(JsonElement p0){
       this.mParams = p0;
    }
    public final void setMRandomCallTime(long p0){
       this.mRandomCallTime = p0;
    }
    public final void setMUrl(String p0){
       this.mUrl = p0;
    }
    public final void setMUrlParams(String p0){
       this.mUrlParams = p0;
    }
}
