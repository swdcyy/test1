package com.kuaishou.live.ad.social.e$b;
import mr5.a;
import com.kuaishou.live.ad.social.e;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;

public class e$b implements a	// class@000a0e
{
    public final e a;

    public void e$b(e p0){
       this.a = p0;
       super();
    }
    public void c(boolean p0){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "1")) {
          return;
       }
       uob = this.a;
       if (uob.u == p0) {
          return;
       }
       uob.u = p0;
       uob.R8();
       return;
    }
}
