package com.kuaishou.commercial.splash.presenter.a;
import erd.g;
import com.kuaishou.commercial.splash.presenter.b;
import java.lang.Object;
import bz.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mxb.o;
import gz.a;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class a implements g	// class@0015dc
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, b.class, "9")) {
       }else if(p0 != null && p0.b != null){
          p0 = o.c;
          if (p0 != null) {
             tb.X7(p0.subscribe(new a(tb)));
          }
       }else {
          tb.R8(null);
       }
       return;
    }
}
