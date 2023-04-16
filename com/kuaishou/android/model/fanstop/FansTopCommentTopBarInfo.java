package com.kuaishou.android.model.fanstop.FansTopCommentTopBarInfo;
import java.io.Serializable;
import com.kuaishou.android.model.fanstop.FansTopCommentTopBarInfo$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class FansTopCommentTopBarInfo implements Serializable	// class@000aca
{
    public String mClickUrl;
    public String mDisplayPrefix;
    public String mDisplaySuffix;
    public static final FansTopCommentTopBarInfo$a Companion;
    public static final long serialVersionUID;

    static {
       FansTopCommentTopBarInfo.Companion = new FansTopCommentTopBarInfo$a(null);
    }
    public void FansTopCommentTopBarInfo(){
       super();
       this.mDisplayPrefix = "";
       this.mDisplaySuffix = "";
       this.mClickUrl = "";
    }
    public final String getMClickUrl(){
       return this.mClickUrl;
    }
    public final String getMDisplayPrefix(){
       return this.mDisplayPrefix;
    }
    public final String getMDisplaySuffix(){
       return this.mDisplaySuffix;
    }
    public final void setMClickUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FansTopCommentTopBarInfo.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mClickUrl = p0;
       return;
    }
    public final void setMDisplayPrefix(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FansTopCommentTopBarInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mDisplayPrefix = p0;
       return;
    }
    public final void setMDisplaySuffix(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FansTopCommentTopBarInfo.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mDisplaySuffix = p0;
       return;
    }
}
