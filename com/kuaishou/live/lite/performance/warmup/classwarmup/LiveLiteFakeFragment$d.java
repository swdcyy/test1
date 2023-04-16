package com.kuaishou.live.lite.performance.warmup.classwarmup.LiveLiteFakeFragment$d;
import erd.o;
import com.kuaishou.live.lite.performance.warmup.classwarmup.LiveLiteFakeFragment;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveLiteFakeFragment$d implements o	// class@000a55
{
    public final LiveLiteFakeFragment b;

    public void LiveLiteFakeFragment$d(LiveLiteFakeFragment p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFakeFragment$d.class, "1")) {
       }else {
          a.p(p0, "it");
          this.b.eh();
       }
       return l1.a;
    }
}
