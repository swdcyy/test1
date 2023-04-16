package com.kuaishou.live.core.show.clearscreen.d$e;
import a32.b;
import com.kuaishou.live.core.show.clearscreen.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.d2;
import com.kuaishou.live.core.show.clearscreen.c;

public class d$e implements b	// class@000a29
{
    public final d a;

    public void d$e(d p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d$e.class, "1")) {
          return;
       }
       d$e ta = this.a;
       if (ta.r != null) {
          ta.t = true;
       }else if(ta.p != null && (!d2.g() || !d2.k())){
          this.a.p.i();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d$e.class, "2")) {
          return;
       }
       d$e ta = this.a;
       if (ta.t == null) {
          d p = ta.p;
          if (p != null) {
             p.e();
          }
       }
       return;
    }
}
