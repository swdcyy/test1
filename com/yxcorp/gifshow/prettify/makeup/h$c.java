package com.yxcorp.gifshow.prettify.makeup.h$c;
import z3b.f;
import com.yxcorp.gifshow.prettify.makeup.h;
import java.lang.String;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import ui9.j;
import java.util.Collection;
import ekd.q;
import java.util.List;
import f1c.c2;
import java.util.Objects;
import j8c.a;
import q87.c;
import ng9.c;
import java.lang.Throwable;
import z3b.e;

public class h$c implements f	// class@00117e
{
    public final String a;
    public final a b;
    public final h c;

    public void h$c(h p0,String p1,a p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void b(MagicBaseConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$c.class, "1")) {
          return;
       }
       h$c tc = this.c;
       if (tc.g == null) {
          return;
       }
       a uoa = tc.i2();
       this.c.g.M(this.a);
       if (uoa != null && !q.f(uoa.c)) {
          tc = this.c;
          List list = c2.b(this.b);
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoidOneRefs(list, tc, h.class, "31") && !tc.C()) {
             Object[] objArray = new Object[0];
             a.D().w("MakeupController", "update", objArray);
             if (!q.f(list)) {
                tc.t2(list, tc.n2(), 0);
             }else {
                tc.t2(null, 0, 0);
             }
             h p = tc.p;
             if (p != null) {
                p.d0();
             }
          }
       }
    label_006d :
       return;
    }
    public void d(MagicBaseConfig p0,Throwable p1){
       e.c(this, p0, p1);
    }
    public void e(MagicBaseConfig p0){
       e.a(this, p0);
    }
    public void g(MagicBaseConfig p0,int p1,int p2){
       e.d(this, p0, p1, p2);
    }
}
