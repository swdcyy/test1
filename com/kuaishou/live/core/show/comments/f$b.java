package com.kuaishou.live.core.show.comments.f$b;
import n52.t;
import com.kuaishou.live.core.show.comments.f;
import java.lang.Object;
import java.lang.Class;
import bf1.j;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.comments.fluency.b;
import n52.n;
import java.util.List;
import df1.c;
import af1.x;
import java.util.LinkedList;

public class f$b implements t	// class@000a60
{
    public final f a;

    public void f$b(f p0){
       this.a = p0;
       super();
    }
    public void a(Class p0,j p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$b.class, "1")) {
          return;
       }
       f$b ta = this.a;
       f q = ta.Q;
       if (q != null) {
          q.c(p0, p1);
       }else {
          ta.S.add(new n(p0, p1));
       }
       return;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "2")) {
          return;
       }
       f q = this.a.Q;
       if (q != null && !PatchProxy.applyVoidOneRefs(p0, q, b.class, "4")) {
          b m = q.m;
          if (m != null && !PatchProxy.applyVoidOneRefs(p0, m, x.class, "7")) {
             m.d.add(p0);
             m.l(m.d);
             m.h();
          }
       }
       return;
    }
}
