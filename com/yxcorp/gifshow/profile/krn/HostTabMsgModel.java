package com.yxcorp.gifshow.profile.krn.HostTabMsgModel;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.profile.krn.TabModel;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class HostTabMsgModel implements Serializable	// class@00135e
{
    public TabModel mHostTab;
    public String mToken;

    public void HostTabMsgModel(){
       super();
       this.mToken = "";
    }
    public final TabModel getMHostTab(){
       return this.mHostTab;
    }
    public final String getMToken(){
       return this.mToken;
    }
    public final void setMHostTab(TabModel p0){
       this.mHostTab = p0;
    }
    public final void setMToken(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HostTabMsgModel.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mToken = p0;
       return;
    }
}
