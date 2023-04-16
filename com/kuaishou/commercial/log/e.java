package com.kuaishou.commercial.log.e;
import erd.g;
import com.kuaishou.commercial.log.n;
import java.lang.Object;
import ujc.f;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m66.a;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.j0;
import yx.w;
import hy.e;

public final class e implements g	// class@0014f9
{
    public final n b;

    public void e(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, n.class, "26")) {
       }else {
          a a = p0.a;
          if (a != null && tb.b(a)) {
             tb.a().e(2, p0.a).d(new w(p0)).a();
             p0 = e.G();
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, e.class, "18") && p0.F()) {
                p0.y = 1;
             }
          }
       }
       return;
    }
}
