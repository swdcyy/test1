package com.kuaishou.live.gameinteractive.web.a$f;
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

public class a$f implements g	// class@001bff
{
    public final c b;
    public final a c;

    public void a$f(a p0,c p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$f.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.C().t("GameInteractiveCommonBridgeImpl", p0.getMessage(), objArray);
          this.b.onError(-1, p0.getMessage());
       }
       return;
    }
}
