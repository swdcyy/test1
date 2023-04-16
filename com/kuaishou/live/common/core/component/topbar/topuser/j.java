package com.kuaishou.live.common.core.component.topbar.topuser.j;
import com.kuaishou.live.common.core.component.watchingcount.updater.a$a;
import com.kuaishou.live.common.core.component.topbar.topuser.i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.Set;
import com.kuaishou.live.common.core.component.topbar.topuser.l$a;

public class j implements a$a	// class@001793
{
    public final i a;

    public void j(i p0){
       this.a = p0;
       super();
    }
    public void a(long p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oj, "1")) {
          return;
       }
       if (!q.f(this.a.z)) {
          Iterator iterator = this.a.z.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p0);
          }
       }
       return;
    }
}
