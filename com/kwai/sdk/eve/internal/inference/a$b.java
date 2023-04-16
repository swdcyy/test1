package com.kwai.sdk.eve.internal.inference.a$b;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.inference.EveExecutableAtomic;
import com.kwai.sdk.eve.internal.inference.a;
import java.lang.String;
import ml5.a;
import brd.v;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import zn7.a;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import java.util.Objects;
import cn7.f;
import wn7.a;
import en7.j;
import com.kwai.sdk.eve.internal.common.utils.TimeRange;
import en7.v;
import sm7.k;
import java.lang.Throwable;
import com.kwai.sdk.eve.internal.common.models.InferenceCanceled;
import brd.g;

public final class a$b implements Runnable	// class@001567
{
    public final EveExecutableAtomic b;
    public final a c;
    public final String d;
    public final EveExecutableAtomic e;
    public final a f;
    public final v g;

    public void a$b(EveExecutableAtomic p0,a p1,String p2,EveExecutableAtomic p3,a p4,v p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, a$b.class, "1")) {
          return;
       }
       EveLog.i$default("EveInference#toRunnable begin "+this.c.k().n()+' '+this.c.h()+' '+this.b.b(), false, 2, null);
       a$b tc = this.c;
       a$b tb = this.b;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(tb, tc, a.class, "8")) {
          tc.m.b(tc, tb, tc.g(tb));
       }
       this.c.j().d("p_dispatchProcessorStart_"+this.d);
       a uoa = this.b.d(this.f, this.c.e);
       this.c.j().d("p_processor_complete_"+this.d);
       this.c.f(this.b, uoa, null);
       this.c.j().d("p_dispatchProcessorFinish_"+this.d);
       this.c.n(uoa, this.g);
       EveLog.i$default("EveInference#toRunnable finish "+this.c.k().n()+' '+this.c.h()+' '+this.b.b(), false, 2, null);
       PatchProxy.onMethodExit(a$b.class, "1");
       return;
    }
}
