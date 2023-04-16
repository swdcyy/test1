package com.kuaishou.live.core.show.pk.k$a;
import com.kuaishou.live.core.show.pk.k$e;
import com.kuaishou.live.core.show.pk.k;
import java.lang.Object;
import com.kuaishou.live.core.show.pk.i$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.pk.i;

public class k$a implements k$e	// class@000d8d
{
    public final k a;

    public void k$a(k p0){
       this.a = p0;
       super();
    }
    public i$b b(){
       k obj = PatchProxy.apply(null, this, k$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.u;
       if (obj != null) {
          return obj.a();
       }
       return null;
    }
}
