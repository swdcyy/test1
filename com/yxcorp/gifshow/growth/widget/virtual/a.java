package com.yxcorp.gifshow.growth.widget.virtual.a;
import erd.g;
import com.yxcorp.gifshow.growth.widget.virtual.e;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import wkd.b;
import yma.a;
import yma.c;
import brd.t;
import cjd.e;
import erd.o;
import mra.g;
import mra.h;
import crd.b;
import cra.w;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.growth.widget.virtual.WidgetTheme;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.widget.virtual.b;
import java.lang.Runnable;
import ekd.k1;

public final class a implements g	// class@00160e
{
    public final e b;

    public void a(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       int i = e.l.decrementAndGet();
       if (i > 0) {
          b.a(-1257347683).a().e().map(new e()).subscribe(new g(i), new h(i));
       }else {
          Object[] objArray = new Object[0];
          w.C().w("GrowthSimulation", "widget start update status FAILURE ::"+i, objArray);
          e.i(WidgetTheme.FAILURE);
          if (!PatchProxy.applyVoid(null, tb, e.class, "4")) {
             k1.o(new b(tb));
          }
       }
       return;
    }
}
