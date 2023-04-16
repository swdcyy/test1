package com.kuaishou.growth.pendant.realtime.price.core.PrtpEveWrapper$activate$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import brd.t;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import we0.g;
import crd.b;
import erd.g;

public final class PrtpEveWrapper$activate$2 extends Lambda implements l	// class@00069c
{
    public static final PrtpEveWrapper$activate$2 INSTANCE;

    static {
       PrtpEveWrapper$activate$2.INSTANCE = new PrtpEveWrapper$activate$2();
    }
    public void PrtpEveWrapper$activate$2(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(t p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrtpEveWrapper$activate$2.class, "1")) {
          return;
       }
       a.p(p0, "observable");
       b d = g.d;
       if (d != null) {
          d.dispose();
       }
       g.d = p0.subscribe(g.f);
       return;
    }
}
