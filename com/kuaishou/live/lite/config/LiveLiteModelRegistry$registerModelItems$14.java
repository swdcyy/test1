package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$14;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import hd3.a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import crd.b;

public final class LiveLiteModelRegistry$registerModelItems$14 extends Lambda implements l	// class@00087b
{
    public static final LiveLiteModelRegistry$registerModelItems$14 INSTANCE;

    static {
       LiveLiteModelRegistry$registerModelItems$14.INSTANCE = new LiveLiteModelRegistry$registerModelItems$14();
    }
    public void LiveLiteModelRegistry$registerModelItems$14(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$14.class, "1")) {
          return;
       }
       a.p(p0, "it");
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoid(null, p0, a.class, "1")) {
          p0 = p0.c;
          if (p0 != null) {
             p0.dispose();
          }
       }
       return;
    }
}
