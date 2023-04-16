package com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter$CloseClickInfo;
import java.io.Serializable;
import com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter$CloseClickInfo$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class MyProfilePostRecoTipsPresenter$CloseClickInfo implements Serializable	// class@001429
{
    public long clickTime;
    public String id;
    public String type;
    public static final MyProfilePostRecoTipsPresenter$CloseClickInfo$a Companion;
    public static final long serialVersionUID;

    static {
       MyProfilePostRecoTipsPresenter$CloseClickInfo.Companion = new MyProfilePostRecoTipsPresenter$CloseClickInfo$a(null);
    }
    public void MyProfilePostRecoTipsPresenter$CloseClickInfo(){
       super();
       this.id = "";
       this.type = "";
    }
    public final long getClickTime(){
       return this.clickTime;
    }
    public final String getId(){
       return this.id;
    }
    public final String getType(){
       return this.type;
    }
    public final void setClickTime(long p0){
       this.clickTime = p0;
    }
    public final void setId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfilePostRecoTipsPresenter$CloseClickInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.id = p0;
       return;
    }
    public final void setType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfilePostRecoTipsPresenter$CloseClickInfo.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.type = p0;
       return;
    }
}
