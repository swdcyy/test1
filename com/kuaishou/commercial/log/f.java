package com.kuaishou.commercial.log.f;
import erd.g;
import com.kuaishou.commercial.log.n;
import java.lang.Object;
import ujc.j;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m66.a;
import tjc.b;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.j0;
import yx.z;

public final class f implements g	// class@0014fa
{
    public final n b;

    public void f(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, n.class, "27")) {
       }else {
          a a = p0.a;
          if (a != null) {
             b b = a.b;
             if (b != null && (tb.b(b) && tb.c(p0.a.b))) {
                tb.a().e(87, p0.a.b).d(new z(p0)).a();
             }
          }
       }
       return;
    }
}
