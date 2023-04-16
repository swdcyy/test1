package com.kuaishou.commercial.log.c;
import erd.g;
import com.kuaishou.commercial.log.n;
import java.lang.Object;
import ujc.c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m66.a;
import tjc.b;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.j0;
import yx.v;

public final class c implements g	// class@0014f7
{
    public final n b;

    public void c(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, n.class, "24")) {
       }else {
          a a = p0.a;
          if (a != null) {
             b b = a.b;
             if (b != null && (tb.b(b) && (p0.d != 5 || tb.c(p0.a.b)))) {
                tb.a().e(140, p0.a.b).d(new v(p0)).a();
             }
          }
       }
       return;
    }
}
