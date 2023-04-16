package com.kuaishou.merchant.base.rmc.b;
import erd.g;
import com.kuaishou.merchant.base.rmc.e;
import java.lang.Object;
import java.lang.Integer;
import crd.b;
import lnc.b9;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import ys3.j;
import io.reactivex.internal.functions.Functions;

public final class b implements g	// class@001582
{
    public final e b;

    public void b(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       b9.a(tb.b);
       int i = p0.intValue();
       e uoe = e.class;
       if (!PatchProxy.isSupport(uoe) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, uoe, "2") && i > 0)) {
          b9.a(tb.c);
          tb.c = t.intervalRange(0, (long)i, 100, tb.d, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new j(tb), Functions.d());
       }
       return;
    }
}
