package com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule$a;
import sfc.a;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import hj3.c;
import u99.e;

public final class LiveAutoPlayModule$a extends a	// class@001bfe
{
    public final LiveAutoPlayModule c;

    public void LiveAutoPlayModule$a(LiveAutoPlayModule p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAutoPlayModule$a.class, "1")) {
          return;
       }
       a.p(p0, "throwable");
       super.b(p0);
       LiveAutoPlayModule k = this.c.K;
       if (k != null) {
          k.b(c.a(p0));
       }
       return;
    }
}
