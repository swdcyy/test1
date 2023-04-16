package com.kuaishou.live.common.core.component.pendant.pendantgroup.i$b;
import dw1.a$b;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.i;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class i$b implements a$b	// class@001720
{
    public final i a;

    public void i$b(i p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$b.class, "2")) {
          return;
       }
       this.a.ik(p0);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, i$b.class, "1")) {
          return;
       }
       this.a.q4(100, "pendantRequestHandler");
       return;
    }
}
