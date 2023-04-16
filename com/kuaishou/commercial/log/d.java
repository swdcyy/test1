package com.kuaishou.commercial.log.d;
import erd.g;
import com.kuaishou.commercial.log.n;
import java.lang.Object;
import ujc.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m66.a;
import tjc.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import mxb.j0;
import yx.t;

public final class d implements g	// class@0014f8
{
    public final n b;

    public void d(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, n.class, "25")) {
       }else {
          a a = p0.a;
          if (a != null) {
             b b = a.b;
             if (b != null && (tb.b(b) && (p0.d != 5 || tb.c(p0.a.b)))) {
                tb.a().e(141, new QPhoto(p0.a.b).mEntity).d(new t(p0)).a();
             }
          }
       }
       return;
    }
}
