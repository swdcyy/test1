package com.kuaishou.merchant.live.cart.onsale.audience.ultron.a$a;
import ks3.l$a;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.a;
import java.lang.Object;
import bs3.a;
import ks3.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;

public final class a$a implements l$a	// class@001980
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       k.d(this, p0);
    }
    public void b(a p0){
       k.e(this, p0);
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       this.a.a(p0, false);
       return;
    }
    public void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       this.a.a(p0, true);
       return;
    }
    public void e(a p0){
       k.f(this, p0);
    }
    public void f(Throwable p0){
       k.c(this, p0);
    }
}
