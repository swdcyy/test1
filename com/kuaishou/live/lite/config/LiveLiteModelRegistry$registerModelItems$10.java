package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$10;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import td3.o;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.userstatus.e;
import java.util.Objects;
import ds5.c;
import ds5.a;
import crd.a;
import java.util.List;
import com.kuaishou.live.lite.userstatus.k;

public final class LiveLiteModelRegistry$registerModelItems$10 extends Lambda implements l	// class@000877
{
    public static final LiveLiteModelRegistry$registerModelItems$10 INSTANCE;

    static {
       LiveLiteModelRegistry$registerModelItems$10.INSTANCE = new LiveLiteModelRegistry$registerModelItems$10();
    }
    public void LiveLiteModelRegistry$registerModelItems$10(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$10.class, "1")) {
          return;
       }
       a.p(p0, "it");
       Object[] objArray = null;
       if (p0 instanceof e) {
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(objArray, p0, e.class, "2")) {
             p0.c.fo(p0.m);
             p0.f.d();
             p0.d.clear();
             p0.e.clear();
             p0.i = objArray;
             p0.j = objArray;
          }
       }else if(p0 instanceof k){
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(objArray, p0, k.class, "9")) {
             p0.b.fo(p0.e);
             p0.f.d();
             p0.l.clear();
          }
       }
       return;
    }
}
