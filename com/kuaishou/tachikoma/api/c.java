package com.kuaishou.tachikoma.api.c;
import java.lang.Runnable;
import com.kuaishou.tachikoma.api.d$a;
import java.lang.Object;
import java.util.Objects;
import com.tkruntime.v8.V8Value;
import com.kuaishou.tachikoma.api.d;
import com.tachikoma.core.bridge.a$b;
import java.util.concurrent.atomic.AtomicBoolean;
import tw4.a;
import java.lang.Boolean;
import qp8.d;
import tx4.w;
import java.lang.String;
import com.tachikoma.core.bridge.c;
import com.tkruntime.v8.V8;
import com.tachikoma.core.bridge.a$a;
import java.lang.StringBuilder;
import zp8.a;
import tx4.f;
import tw4.j;
import iq8.x;
import java.lang.Throwable;
import com.kuaishou.tachikoma.b;
import tw4.k;

public final class c implements Runnable	// class@000f62
{
    public final d$a b;

    public void c(d$a p0){
       this.b = p0;
    }
    public final void run(){
       a$a this;
       c b = this.b;
       Objects.requireNonNull(b);
       long l = 2;
       boolean b1 = false;
       d$a b2 = b.b;
       if (b2 != null && b2.isReleased()) {
          d.d(l);
          b.a.g.set(b1);
       }else {
          Boolean c = a.c;
          if (c.booleanValue()) {
             d.p().i(b.c.b, "", "preCompile");
          }
          d$a uoa = null;
          d$a b3 = b.b;
          boolean b4 = true;
          if (b3 == null) {
             uoa = b.a.d();
             if (uoa == null) {
                uoa = c.c(b4, b.a, b.c.b);
             }else {
                uoa.m(b.c.b);
             }
             b3 = uoa.g();
          }
          d$a c1 = b.c;
          long l1 = b3.compileCodeCache(c1.a, c1.b, b.d);
          v9 = l1 - null;
          if (b3) {
             d$a c2 = b.c;
             a$a uoa1 = v15;
             this = v15;
             uoa1 = new a$a(c2.b, l1, c2.d, b.a, (long)(b.c.a).getBytes().length);
             b.a.g(this);
          }
          if (uoa != null) {
             b.a.a(uoa);
          }
          d.d(2);
          b.a.g.set(false);
          a.i("tachikoma", "compile success: "+b.c.b+", compileId: "+l1);
          if (c.booleanValue()) {
             d.p().l(b.c.b, "", "preCompile");
          }
          b2 = b.e;
          if (b2 != null) {
             b4 = (b3)? true: false;
             b2.b(b4);
          }
          x.f(new j(b, l1));
       }
       return;
    }
}
