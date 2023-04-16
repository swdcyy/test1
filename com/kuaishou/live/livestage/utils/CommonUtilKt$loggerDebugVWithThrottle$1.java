package com.kuaishou.live.livestage.utils.CommonUtilKt$loggerDebugVWithThrottle$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$LongRef;
import java.lang.Object;
import msd.a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.System;
import oe3.e;
import java.lang.Throwable;

public final class CommonUtilKt$loggerDebugVWithThrottle$1 extends Lambda implements l	// class@000bf7
{
    public final Ref$LongRef $lastLogTime;
    public final long $throttle;

    public void CommonUtilKt$loggerDebugVWithThrottle$1(long p0,Ref$LongRef p1){
       this.$throttle = p0;
       this.$lastLogTime = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonUtilKt$loggerDebugVWithThrottle$1.class, "1")) {
          return;
       }
       a.p(p0, "message");
       long l = System.currentTimeMillis();
       CommonUtilKt$loggerDebugVWithThrottle$1 t$lastLogTim = this.$lastLogTime;
       if ((l - t$lastLogTim.element) - this.$throttle > 0) {
          t$lastLogTim.element = l;
          e.d.c("LiveStage", p0.invoke(), null);
       }
       return;
    }
}
