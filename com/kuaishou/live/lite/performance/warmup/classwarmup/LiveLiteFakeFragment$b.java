package com.kuaishou.live.lite.performance.warmup.classwarmup.LiveLiteFakeFragment$b;
import erd.o;
import com.kuaishou.live.lite.performance.warmup.classwarmup.LiveLiteFakeFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.LiveLiteFragment;
import qrd.l1;

public final class LiveLiteFakeFragment$b implements o	// class@000a53
{
    public final LiveLiteFakeFragment b;

    public void LiveLiteFakeFragment$b(LiveLiteFakeFragment p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFakeFragment$b.class, "1")) {
       }else {
          a.p(p0, "it");
          this.b.fh();
          this.b.gh();
          this.b.ch();
       }
       return l1.a;
    }
}
