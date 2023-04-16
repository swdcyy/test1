package com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.e$a;
import i82.a;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.e;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.util.Objects;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.n;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.m;

public class e$a implements a	// class@000b32
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public int a(){
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.apply(null, this, e$a.class, "1");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = null;
       e u = this.a.U;
       if (u != null) {
          Objects.requireNonNull(u);
          Object obj1 = PatchProxy.apply(null, u, n.class, "4");
          int i = (obj1 != patchProxyRe)? obj1.intValue(): u.b.c();
          i1 = i;
       }
       return i1;
    }
}
