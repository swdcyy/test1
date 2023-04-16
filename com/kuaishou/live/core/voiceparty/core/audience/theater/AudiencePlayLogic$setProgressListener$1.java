package com.kuaishou.live.core.voiceparty.core.audience.theater.AudiencePlayLogic$setProgressListener$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;

public final class AudiencePlayLogic$setProgressListener$1 extends Lambda implements p	// class@0013c4
{
    public final p $listener;

    public void AudiencePlayLogic$setProgressListener$1(p p0){
       this.$listener = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0.longValue(), p1.longValue());
       return l1.a;
    }
    public final void invoke(long p0,long p1){
       if (PatchProxy.isSupport(AudiencePlayLogic$setProgressListener$1.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, AudiencePlayLogic$setProgressListener$1.class, "1")) {
          return;
       }
       this.$listener.invoke(Long.valueOf(p0), Long.valueOf(p1));
       return;
    }
}
