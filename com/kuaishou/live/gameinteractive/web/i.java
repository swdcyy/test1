package com.kuaishou.live.gameinteractive.web.i;
import erd.g;
import com.kuaishou.live.gameinteractive.web.a$h;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.a;
import q87.c;
import v43.c;

public class i implements g	// class@001c14
{
    public final a$h b;

    public void i(a$h p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.C().t("GameInteractiveCommonBridgeImpl", p0.getMessage(), objArray);
          p0 = this.b.d;
          if (p0 != null) {
             p0.onError(-1, "request server failed");
          }
       }
       return;
    }
}
