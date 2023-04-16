package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService$startCleanSelectedRubbish$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import brd.v;
import java.lang.Object;
import fna.j;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import brd.g;
import fna.j$a;

public final class GrowthCleanerService$startCleanSelectedRubbish$1$1 extends Lambda implements l	// class@00133b
{
    public final v $emitter;

    public void GrowthCleanerService$startCleanSelectedRubbish$1$1(v p0){
       this.$emitter = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthCleanerService$startCleanSelectedRubbish$1$1.class, "1")) {
          return;
       }
       a.p(p0, "event");
       this.$emitter.onNext(p0);
       if (p0 instanceof j$a) {
          this.$emitter.onComplete();
       }
       return;
    }
}
