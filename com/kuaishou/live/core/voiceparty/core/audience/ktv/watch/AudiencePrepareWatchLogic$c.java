package com.kuaishou.live.core.voiceparty.core.audience.ktv.watch.AudiencePrepareWatchLogic$c;
import erd.g;
import msd.l;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.c;
import hp2.b;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;

public final class AudiencePrepareWatchLogic$c implements g	// class@0013c1
{
    public final l b;

    public void AudiencePrepareWatchLogic$c(l p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudiencePrepareWatchLogic$c.class, "1")) {
       }else {
          b.k0(b.a(), "AudiencePrepareWatchLogic fail", p0);
          a.o(p0, "it");
          this.b.invoke(p0);
       }
       return;
    }
}
