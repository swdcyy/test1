package com.yxcorp.gifshow.profile.krn.TabModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class TabModel implements Serializable	// class@00136b
{
    public int mIndex;
    public String mTabId;
    public String mType;

    public void TabModel(){
       super();
       this.mType = "";
       this.mTabId = "";
    }
    public final int getMIndex(){
       return this.mIndex;
    }
    public final String getMTabId(){
       return this.mTabId;
    }
    public final String getMType(){
       return this.mType;
    }
    public final void setMIndex(int p0){
       this.mIndex = p0;
    }
    public final void setMTabId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TabModel.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mTabId = p0;
       return;
    }
    public final void setMType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TabModel.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mType = p0;
       return;
    }
}
