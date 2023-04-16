package com.yxcorp.gifshow.ad.AdNonActionbarProcess$b;
import u07.u;
import com.yxcorp.gifshow.ad.AdNonActionbarProcess;
import com.yxcorp.gifshow.ad.AdMainProcess;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.AdNonActionbarProcess$b$a;
import com.yxcorp.gifshow.ad.AdProcess$c;
import com.yxcorp.gifshow.ad.AdProcess;
import nx8.q;
import java.lang.StringBuilder;
import yx.j0;

public final class AdNonActionbarProcess$b implements u	// class@0014d3
{
    public final AdNonActionbarProcess b;
    public final AdMainProcess c;

    public void AdNonActionbarProcess$b(AdNonActionbarProcess p0,AdMainProcess p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdNonActionbarProcess$b.class, "1")) {
          return;
       }
       this.c.q(new AdNonActionbarProcess$b$a(this));
       int i = this.c.C();
       if (i >= 0) {
          AdProcess$c uoc = this.c.f();
          if (uoc != null) {
             uoc.a(new q(i));
          }
       }else {
          Object[] objArray = new Object[0];
          j0.f("AdBaseNonActBarProcess", "do not call callback right now, processAction: "+i, objArray);
       }
       return;
    }
}
