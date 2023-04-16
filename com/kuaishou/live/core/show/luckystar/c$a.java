package com.kuaishou.live.core.show.luckystar.c$a;
import com.kuaishou.live.core.show.luckystar.c$e;
import com.kuaishou.live.core.show.luckystar.c;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zb2.h;
import java.util.Collections;

public class c$a implements c$e	// class@000cba
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public Map a(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a.d9() && this.a.V8() == 5) {
          return Collections.singletonMap("subBiz", "LIVE_LUCKY");
       }
       return Collections.emptyMap();
    }
}
