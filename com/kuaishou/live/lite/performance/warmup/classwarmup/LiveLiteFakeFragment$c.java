package com.kuaishou.live.lite.performance.warmup.classwarmup.LiveLiteFakeFragment$c;
import erd.o;
import com.kuaishou.live.lite.performance.warmup.classwarmup.LiveLiteFakeFragment;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.LiveLiteFragment;

public final class LiveLiteFakeFragment$c implements o	// class@000a54
{
    public final LiveLiteFakeFragment b;

    public void LiveLiteFakeFragment$c(LiveLiteFakeFragment p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFakeFragment$c.class, "1")) {
       }else {
          a.p(p0, "it");
          this.b.dh();
       }
       return l1.a;
    }
}
