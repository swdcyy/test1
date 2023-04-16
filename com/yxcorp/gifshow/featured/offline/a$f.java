package com.yxcorp.gifshow.featured.offline.a$f;
import java.lang.Runnable;
import com.yxcorp.gifshow.featured.offline.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import lnc.a1;
import ekd.p0;
import xea.h;
import com.yxcorp.gifshow.featured.offline.a$f$a;
import wkd.b;
import yea.f;

public class a$f implements Runnable	// class@000fe3
{
    public final a b;

    public void a$f(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$f.class, "1")) {
          return;
       }
       if (!p0.C(a1.c())) {
          h.j();
          return;
       }else {
          boolean b = h.b();
          if (p0.A(a1.c()) && !b) {
             h.i(new a$f$a(this));
          }else {
             b.a(0x60e4a25a).f();
          }
          return;
       }
    }
}
