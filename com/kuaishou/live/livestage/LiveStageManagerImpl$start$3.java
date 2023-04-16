package com.kuaishou.live.livestage.LiveStageManagerImpl$start$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class LiveStageManagerImpl$start$3 extends Lambda implements l	// class@000bd0
{
    public static final LiveStageManagerImpl$start$3 INSTANCE;

    static {
       LiveStageManagerImpl$start$3.INSTANCE = new LiveStageManagerImpl$start$3();
    }
    public void LiveStageManagerImpl$start$3(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(LayoutConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveStageManagerImpl$start$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return "[SignalLayout]receive:"+p0;
    }
}
