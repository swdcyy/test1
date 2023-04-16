package com.kuaishou.live.effect.resource.download.track.LiveEffectResCleanManager$getDiskUsage$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$LongRef;
import java.lang.Object;
import java.io.File;
import b03.d;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import y56.a;

public final class LiveEffectResCleanManager$getDiskUsage$1 extends Lambda implements p	// class@001b51
{
    public final Ref$LongRef $ret;

    public void LiveEffectResCleanManager$getDiskUsage$1(Ref$LongRef p0){
       this.$ret = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(File p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveEffectResCleanManager$getDiskUsage$1.class, "1")) {
          return;
       }
       a.p(p0, "file");
       a.p(p1, "<anonymous parameter 1>");
       LiveEffectResCleanManager$getDiskUsage$1 t$ret = this.$ret;
       t$ret.element = t$ret.element + a.c(p0);
       return;
    }
}
