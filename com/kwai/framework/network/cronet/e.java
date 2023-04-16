package com.kwai.framework.network.cronet.e;
import java.lang.Runnable;
import com.kwai.framework.network.cronet.i;
import java.lang.Object;
import java.util.Objects;
import com.kwai.framework.network.cronet.j;
import com.kuaishou.aegon.Aegon;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fo.b;
import fo.a;
import bo.s$a;
import bo.s;

public final class e implements Runnable	// class@0017ab
{
    public final i b;

    public void e(i p0){
       this.b = p0;
    }
    public final void run(){
       e tb = this.b;
       Objects.requireNonNull(tb);
       j oj = new j(tb);
       if (PatchProxy.applyVoidOneRefs(oj, null, Aegon.class, "2")) {
       }else {
          b g = Aegon.g;
          Objects.requireNonNull(g);
          if (!PatchProxy.applyVoidOneRefs(oj, g, b.class, "1")) {
             g.e = oj;
             g.a();
             a uoa = new a(g);
             g.e.a("aegonNetlogConfig", uoa);
          }
       }
       return;
    }
}
