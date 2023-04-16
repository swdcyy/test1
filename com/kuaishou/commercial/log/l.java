package com.kuaishou.commercial.log.l;
import erd.g;
import com.kuaishou.commercial.log.n;
import java.lang.Object;
import dda.l;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m66.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import mxb.j0;
import yx.r;

public final class l implements g	// class@001500
{
    public final n b;

    public void l(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, n.class, "15")) {
       }else if(!tb.b(p0.a)){
          j0 oj0 = (p0.a instanceof LiveStreamFeed)? tb.a().e(303, p0.a): tb.a().e(15, p0.a);
          oj0.d(new r(p0)).a();
       }
       return;
    }
}
