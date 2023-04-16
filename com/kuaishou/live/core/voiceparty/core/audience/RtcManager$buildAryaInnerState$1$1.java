package com.kuaishou.live.core.voiceparty.core.audience.RtcManager$buildAryaInnerState$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class RtcManager$buildAryaInnerState$1$1 extends Lambda implements l	// class@00139c
{
    public static final RtcManager$buildAryaInnerState$1$1 INSTANCE;

    static {
       RtcManager$buildAryaInnerState$1$1.INSTANCE = new RtcManager$buildAryaInnerState$1$1();
    }
    public void RtcManager$buildAryaInnerState$1$1(){
       super(1);
    }
    public final RtcManager$b invoke(RtcManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RtcManager$buildAryaInnerState$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new RtcManager$b();
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
