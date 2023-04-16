package com.kuaishou.live.ad.social.e$a;
import java.lang.Runnable;
import com.kuaishou.live.ad.social.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zl0.a1;
import km9.a;
import zl0.l;
import z1.a;

public class e$a implements Runnable	// class@000a0d
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "1")) {
          return;
       }
       a1 uoa1 = this.b.r.pn();
       if (uoa1 != null) {
          this.b.r.h7(uoa1.b, 2, new l(this));
       }
       return;
    }
}
