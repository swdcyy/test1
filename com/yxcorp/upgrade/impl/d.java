package com.yxcorp.upgrade.impl.d;
import ckd.e;
import com.yxcorp.upgrade.impl.e;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import akd.u;
import java.lang.Runnable;
import android.os.Handler;
import java.lang.StringBuilder;
import bkd.b;
import java.util.Objects;
import bkd.b$a;
import akd.t;
import java.lang.Throwable;
import akd.s;
import java.lang.Integer;

public class d implements e	// class@000994
{
    public final File a;
    public final e b;

    public void d(e p0,File p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
    }
    public void onCanceled(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       this.b.h.post(new u(this));
       return;
    }
    public void onComplete(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       d tb = this.b;
       String str = this.a.getAbsolutePath()+File.separator+tb.c(tb.c.g);
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(str, tb, e.class, "14")) {
          b$a uoa = new b$a();
          uoa.b(tb.c.a);
          uoa.c(tb.c.b);
          e c = tb.c;
          uoa.g(c.d, c.e);
          c = tb.c;
          uoa.f(c.i, c.k, c.l);
          uoa.h(tb.c.j);
          c = tb.c;
          uoa.d(c.f, c.g);
          uoa.h = str;
          uoa.e(tb.c.o);
          tb.c = uoa.a();
       }
       this.b.h.post(new t(this));
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       p0.getMessage();
       this.b.h.post(new s(this));
       return;
    }
    public void onProgress(int p0){
       if (PatchProxy.isSupport(d.class)) {
          PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, d.class, "1");
       }
       return;
    }
}
