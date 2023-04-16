package com.kuaishou.live.livestage.LiveStageManagerImpl$start$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class LiveStageManagerImpl$start$2 extends Lambda implements l	// class@000bcf
{
    public static final LiveStageManagerImpl$start$2 INSTANCE;

    static {
       LiveStageManagerImpl$start$2.INSTANCE = new LiveStageManagerImpl$start$2();
    }
    public void LiveStageManagerImpl$start$2(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(Boolean p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveStageManagerImpl$start$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "isSelfInRtc changeTo: "+p0;
    }
}
