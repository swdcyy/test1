package com.kuaishou.live.core.show.hourlytrank.c$c;
import com.kuaishou.live.core.show.hourlytrank.LiveFancyRankResultViewV2$e;
import com.kuaishou.live.core.show.hourlytrank.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ba2.r;

public class c$c implements LiveFancyRankResultViewV2$e	// class@000bfe
{
    public final c a;

    public void c$c(c p0){
       this.a = p0;
       super();
    }
    public int a(){
       c obj = PatchProxy.apply(null, this, c$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a.t;
       if (obj != null) {
          return obj.d();
       }
       return 0;
    }
}
