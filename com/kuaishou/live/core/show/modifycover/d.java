package com.kuaishou.live.core.show.modifycover.d;
import erd.g;
import com.kuaishou.live.core.show.modifycover.b;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveStartInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lc2.k;

public class d implements g	// class@000d1e
{
    public final b b;

    public void d(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          d tb = this.b;
          tb.c = p0;
          tb.e.b(p0);
       }
       return;
    }
}
