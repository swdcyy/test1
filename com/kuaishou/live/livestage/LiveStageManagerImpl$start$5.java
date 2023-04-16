package com.kuaishou.live.livestage.LiveStageManagerImpl$start$5;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import oe3.h;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class LiveStageManagerImpl$start$5 extends Lambda implements l	// class@000bd1
{
    public static final LiveStageManagerImpl$start$5 INSTANCE;

    static {
       LiveStageManagerImpl$start$5.INSTANCE = new LiveStageManagerImpl$start$5();
    }
    public void LiveStageManagerImpl$start$5(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(h p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveStageManagerImpl$start$5.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "[StreamLayout]receive:"+p0;
    }
}
