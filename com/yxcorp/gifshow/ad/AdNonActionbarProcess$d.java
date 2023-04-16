package com.yxcorp.gifshow.ad.AdNonActionbarProcess$d;
import com.yxcorp.gifshow.ad.AdProcess$c;
import com.yxcorp.gifshow.ad.AdNonActionbarProcess;
import java.lang.Object;
import nx8.q;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.AdProcess;

public final class AdNonActionbarProcess$d implements AdProcess$c	// class@0014d5
{
    public final AdNonActionbarProcess a;

    public void AdNonActionbarProcess$d(AdNonActionbarProcess p0){
       this.a = p0;
       super();
    }
    public void a(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdNonActionbarProcess$d.class, "1")) {
          return;
       }
       a.p(p0, "processAction");
       AdProcess$c uoc = this.a.f();
       if (uoc != null) {
          uoc.a(p0);
       }
       return;
    }
}
