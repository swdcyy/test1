package com.kwai.feature.api.danmaku.model.PlatformDanmakuConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class PlatformDanmakuConfig implements Serializable	// class@000e89
{
    public int currentLimit;
    public String id;
    public int totalLimit;

    public void PlatformDanmakuConfig(){
       super();
       this.id = "";
    }
    public final int getCurrentLimit(){
       return this.currentLimit;
    }
    public final String getId(){
       return this.id;
    }
    public final int getTotalLimit(){
       return this.totalLimit;
    }
    public final void setCurrentLimit(int p0){
       this.currentLimit = p0;
    }
    public final void setId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlatformDanmakuConfig.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.id = p0;
       return;
    }
    public final void setTotalLimit(int p0){
       this.totalLimit = p0;
    }
}
