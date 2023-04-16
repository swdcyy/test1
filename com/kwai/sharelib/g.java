package com.kwai.sharelib.g;
import java.lang.Runnable;
import com.kwai.sharelib.a$p;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.Ref$ObjectRef;
import crd.b;
import com.kwai.sharelib.a;
import uo7.f;
import uo7.b0;
import uo7.k;
import com.kwai.sharelib.KsShareApi;
import kotlin.jvm.internal.a;

public final class g implements Runnable	// class@0016c3
{
    public final a$p b;
    public final Throwable c;

    public void g(a$p p0,Throwable p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       g tb = this.b;
       tb.b.b(tb.c.element);
       b0 uob0 = this.b.b.g.d();
       if (uob0 == null) {
          uob0 = KsShareApi.s.c();
       }
       g tc = this.c;
       a.o(tc, "throwable");
       new f(uob0).a(this.b.b.g, tc);
       return;
    }
}
