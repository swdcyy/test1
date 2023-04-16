package com.kuaishou.live.longconnection.connector.e$e;
import erd.g;
import com.kuaishou.live.longconnection.connector.e;
import com.kuaishou.live.longconnection.connector.l;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import mf3.b;
import lf3.a;
import com.kuaishou.live.longconnection.connector.b;

public class e$e implements g	// class@000c64
{
    public final l b;
    public final e c;

    public void e$e(e p0,l p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$e.class, "1")) {
       }else {
          Object[] objArray = new Object[]{"mRace:"+this.c.b};
          b.a(this.c.s(), "reconnect accept, liveStreamId: "+this.b.f()+", mIsRacing:"+this.c.e, objArray);
          p0 = this.c;
          if (p0.e == null) {
             p0.c.u(null);
             this.c.t(this.b);
          }
          p0.h = null;
       }
       return;
    }
}
