package com.kuaishou.live.gameinteractive.web.c;
import erd.g;
import com.kuaishou.live.gameinteractive.web.a$c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.a;
import java.lang.StringBuilder;
import q87.c;
import v43.c;

public class c implements g	// class@001c0e
{
    public final a$c b;

    public void c(a$c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.C().t("GameInteractiveCommonBridgeImpl", "call unfollow interface failed! ---- "+p0.getMessage(), objArray);
          this.b.c.onError(-1, "");
       }
       return;
    }
}
