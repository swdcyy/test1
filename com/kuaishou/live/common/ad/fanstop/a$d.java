package com.kuaishou.live.common.ad.fanstop.a$d;
import erd.g;
import com.kuaishou.live.common.ad.fanstop.a;
import h91.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.ad.fanstop.UpdateFansTopStatusListener$FansTopStatus;

public class a$d implements g	// class@000e66
{
    public final a b;
    public final boolean c;
    public final a d;

    public void a$d(a p0,a p1,boolean p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
       }else {
          a$d tb = this.b;
          if (tb != null) {
             tb.onError(p0);
          }
          if (this.c != null) {
             p0 = this.d;
             UpdateFansTopStatusListener$FansTopStatus oPEN_FLAME_U = UpdateFansTopStatusListener$FansTopStatus.OPEN_FLAME_UNSELECTED;
             p0.a = oPEN_FLAME_U;
             p0.k(oPEN_FLAME_U);
          }
       }
       return;
    }
}
