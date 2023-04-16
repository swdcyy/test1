package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$16;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import cd3.a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import crd.a;

public final class LiveLiteModelRegistry$registerModelItems$16 extends Lambda implements l	// class@00087d
{
    public static final LiveLiteModelRegistry$registerModelItems$16 INSTANCE;

    static {
       LiveLiteModelRegistry$registerModelItems$16.INSTANCE = new LiveLiteModelRegistry$registerModelItems$16();
    }
    public void LiveLiteModelRegistry$registerModelItems$16(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$16.class, "1")) {
          return;
       }
       a.p(p0, "it");
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoid(null, p0, a.class, "1")) {
          p0.d.dispose();
       }
       return;
    }
}
