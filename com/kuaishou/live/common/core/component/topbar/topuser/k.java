package com.kuaishou.live.common.core.component.topbar.topuser.k;
import erd.o;
import com.kuaishou.live.common.core.component.topbar.topuser.i$c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import com.kuaishou.live.common.core.component.topbar.topuser.i;
import ub1.d;
import brd.t;
import com.kuaishou.live.basic.model.QLiveWatchingUsersBundle;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.concurrent.TimeUnit;

public class k implements o	// class@001794
{
    public final i$c b;

    public void k(i$c p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, k.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          i$c b = this.b.b;
          b.D = 5000;
          b.d9(p0);
          if (d.b(p0)) {
             ot = t.empty();
          }else {
             p0 = this.b.b.E;
             if (p0 != null && !TextUtils.x(p0.getKshp())) {
                this.b.b.E.setKshp("");
                p0 = this.b.b;
                if (p0.I != null) {
                   p0.S8();
                }
                ot = t.empty();
             }else {
                ot = t.timer(this.b.b.D, TimeUnit.MILLISECONDS).take(1);
             }
          }
       }
       return ot;
    }
}
