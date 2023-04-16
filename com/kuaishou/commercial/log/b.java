package com.kuaishou.commercial.log.b;
import erd.g;
import com.kuaishou.commercial.log.n;
import java.lang.Object;
import ujc.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m66.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import mxb.j0;
import yx.u;

public final class b implements g	// class@0014f6
{
    public final n b;

    public void b(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, n.class, "23")) {
       }else {
          a a = p0.a;
          if (a != null && (tb.b(a) && (p0.d != 5 || tb.c(p0.a)))) {
             tb.a().e(140, new QPhoto(p0.a).mEntity).d(new u(p0)).a();
          }
       }
       return;
    }
}
