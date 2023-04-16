package com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedEveWrapper$activate$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import brd.t;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ze0.f;
import crd.b;
import erd.g;

public final class PrtpSpeedEveWrapper$activate$2 extends Lambda implements l	// class@0006c1
{
    public static final PrtpSpeedEveWrapper$activate$2 INSTANCE;

    static {
       PrtpSpeedEveWrapper$activate$2.INSTANCE = new PrtpSpeedEveWrapper$activate$2();
    }
    public void PrtpSpeedEveWrapper$activate$2(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(t p0){
       b a;
       if (PatchProxy.applyVoidOneRefs(p0, this, PrtpSpeedEveWrapper$activate$2.class, "1")) {
          return;
       }
       a.p(p0, "observable");
       a = f.a;
       if (a != null) {
          a.dispose();
       }
       f.a = p0.subscribe(f.c);
       return;
    }
}
