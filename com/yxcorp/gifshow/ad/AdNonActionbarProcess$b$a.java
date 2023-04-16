package com.yxcorp.gifshow.ad.AdNonActionbarProcess$b$a;
import com.yxcorp.gifshow.ad.AdProcess$c;
import com.yxcorp.gifshow.ad.AdNonActionbarProcess$b;
import java.lang.Object;
import nx8.q;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.AdNonActionbarProcess;
import mxb.j0;
import mxb.i0;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.ad.AdProcess;
import mxb.j;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import com.yxcorp.gifshow.ad.AdNonActionbarProcess$b$a$a;
import erd.g;

public final class AdNonActionbarProcess$b$a implements AdProcess$c	// class@0014d2
{
    public final AdNonActionbarProcess$b a;

    public void AdNonActionbarProcess$b$a(AdNonActionbarProcess$b p0){
       this.a = p0;
       super();
    }
    public void a(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdNonActionbarProcess$b$a.class, "1")) {
          return;
       }
       a.p(p0, "processAction");
       if (this.a.b.n != null) {
          i0.a().p(2, this.a.b.d().getAdLogWrapper()).f(this.a.b.l).d(new AdNonActionbarProcess$b$a$a(p0)).a();
       }
       return;
    }
}
