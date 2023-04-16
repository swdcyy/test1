package com.yxcorp.gifshow.log.v$b;
import hkd.d;
import com.yxcorp.gifshow.log.v;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.policy.LogPolicy$Save;
import com.yxcorp.gifshow.log.policy.LogPolicy;

public class v$b extends d	// class@001b58
{
    public final Runnable b;
    public final v c;

    public void v$b(v p0,Runnable p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, v$b.class, "1")) {
          return;
       }
       if (this.c.b.getSavePolicy() == LogPolicy$Save.DROP) {
          return;
       }
       this.b.run();
       v$b tc = this.c;
       if (tc.c != null) {
          tc.c = false;
          tc.g();
       }
       return;
    }
}
