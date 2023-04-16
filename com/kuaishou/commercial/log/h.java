package com.kuaishou.commercial.log.h;
import erd.g;
import com.kuaishou.commercial.log.n;
import java.lang.Object;
import dda.h;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m66.a;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.j0;
import yx.n;

public final class h implements g	// class@0014fc
{
    public final n b;

    public void h(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, n.class, "31")) {
       }else if(!tb.b(p0.a)){
          tb.a().e(124, p0.a).d(new n(p0)).a();
       }
       return;
    }
}
