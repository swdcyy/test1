package com.kuaishou.live.gameinteractive.web.a$l;
import erd.g;
import com.kuaishou.live.gameinteractive.web.a;
import v43.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.a;
import q87.c;
import java.lang.StringBuilder;

public class a$l implements g	// class@001c05
{
    public final c b;
    public final a c;

    public void a$l(a p0,c p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$l.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.C().t("GameInteractiveCommonBridgeImpl", p0.getMessage(), objArray);
          a$l tb = this.b;
          if (tb != null) {
             tb.onError(-1, "error: "+p0.getMessage());
          }
       }
       return;
    }
}
