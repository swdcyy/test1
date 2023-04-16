package com.kuaishou.live.core.show.modifycover.b$c;
import erd.g;
import com.kuaishou.live.core.show.modifycover.b;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u07.t$a;
import android.app.Activity;
import lc2.j;
import u07.u;
import u07.t;
import u07.j;
import lc2.l;
import com.kuaishou.live.core.show.modifycover.a;

public class b$c implements g	// class@000d1b
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
       }else if(p0 == null || !p0.exists()){
          if (p0.length() - 5000 < 0) {
             p0 = new t$a(this.b.f);
             p0.W0(R.string.arg_RES_7f102028);
             p0.u0(new j(this));
             p0.S0(R.string.arg_RES_7f10071a);
             j.d(p0);
          }else {
             b$c tb = this.b;
             tb.n = true;
             tb.g.d(false);
             tb = this.b;
             tb.d = p0;
             tb.a.setLiveCover(p0);
             this.b.a.a();
          }
       }
       return;
    }
}
