package com.kuaishou.live.external.d;
import sfc.a;
import com.kuaishou.live.external.a$a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.external.a;

public class d extends a	// class@001b71
{
    public final a$a c;

    public void d(a$a p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       super.b(p0);
       d tc = this.c;
       tc.R8(tc.t.d);
       this.c.P8();
       return;
    }
}
