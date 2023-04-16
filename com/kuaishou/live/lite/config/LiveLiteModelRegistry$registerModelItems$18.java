package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$18;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import x83.b;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import y83.a;
import lf3.g;
import hf3.a;

public final class LiveLiteModelRegistry$registerModelItems$18 extends Lambda implements l	// class@00087f
{
    public static final LiveLiteModelRegistry$registerModelItems$18 INSTANCE;

    static {
       LiveLiteModelRegistry$registerModelItems$18.INSTANCE = new LiveLiteModelRegistry$registerModelItems$18();
    }
    public void LiveLiteModelRegistry$registerModelItems$18(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(b p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$18.class, str)) {
          return;
       }
       a.p(p0, "it");
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoid(null, p0, b.class, str)) {
          LiveLiteLogTag aNONYMITY = LiveLiteLogTag.ANONYMITY;
          b.Z(aNONYMITY, p0.a+" onDestroy");
          p0 = p0.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, a.class, str)) {
             b.Z(aNONYMITY, p0.a+" destroy");
             if (!PatchProxy.applyVoid(null, p0, a.class, "5")) {
                p0.e.o(310, p0.c);
             }
          }
       }
       return;
    }
}
