package com.kuaishou.tachikoma.api.b;
import java.lang.Runnable;
import java.lang.String;
import com.tkruntime.v8.V8;
import tx4.f;
import tx4.w;
import com.tachikoma.core.bridge.a$b;
import java.lang.Object;
import tw4.a;
import java.lang.Boolean;
import qp8.d;
import com.tkruntime.v8.V8Value;
import tw4.i;
import iq8.x;
import com.tachikoma.core.bridge.a$a;
import tw4.b;
import java.lang.Throwable;
import com.kuaishou.tachikoma.b;
import tw4.h;

public final class b implements Runnable	// class@000f61
{
    public final String b;
    public final V8 c;
    public final f d;
    public final w e;
    public final String f;
    public final boolean g;
    public final a$b h;

    public void b(String p0,V8 p1,f p2,w p3,String p4,boolean p5,a$b p6){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
    }
    public final void run(){
       long l1;
       b uob = this;
       b b = uob.b;
       b c = uob.c;
       b d = uob.d;
       b e = uob.e;
       b f = uob.f;
       b g = uob.g;
       b h = uob.h;
       Boolean c1 = a.c;
       if (c1.booleanValue()) {
          d.p().i(b, "", "preCompile");
       }
       if (c.isReleased()) {
          x.f(new i(d, e));
       }else {
          long l = c.compileCodeCache(f, b, g);
          if (v16 = l) {
             a$a uoa = v7;
             a$a uoa1 = v7;
             l1 = l;
             uoa = new a$a(b, l, e.d, h, (long)f.getBytes().length);
             h.g(uoa1);
          }else {
             l1 = l;
          }
          if (c1.booleanValue()) {
             d.p().l(b, "", "preCompile");
          }
          if (d != null) {
             boolean b1 = (v16)? true: false;
             d.b(b1);
          }
          x.f(new b(l1, d, e));
       }
       return;
    }
}
