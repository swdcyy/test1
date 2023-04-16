package com.kuaishou.commercial.log.i;
import erd.g;
import com.kuaishou.commercial.log.n;
import java.lang.Object;
import ujc.i;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m66.a;
import tjc.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import mxb.j0;
import tw.l;
import java.lang.Boolean;
import yx.y;

public final class i implements g	// class@0014fd
{
    public final n b;

    public void i(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, n.class, "32")) {
       }else {
          b b = p0.a.b;
          if (b == null || (tb.b(b) && tb.c(p0.a.b))) {
             tb.a().e(88, new QPhoto(p0.a.b).mEntity).q("change_splash_landscape", Boolean.valueOf(l.l(p0.a.b))).d(new y(p0)).a();
          }
       }
       return;
    }
}
