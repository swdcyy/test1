package com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.d;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.e;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeInfo;
import hm2.a$b;
import pm2.a;
import o02.e;
import p91.m;
import java.lang.Long;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.b;
import erd.g;
import b11.d;
import com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.g;
import crd.b;
import crd.a;

public final class d implements Runnable	// class@000b7f
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void run(){
       e e;
       d tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, e.class, "11")) {
       }else {
          LiveWealthGradeInfo liveWealthGr = tb.b.i2.yb();
          e = tb.e;
          a uoa = e.q();
          String liveStreamId = tb.b.Z2.getLiveStreamId();
          if (liveWealthGr != null) {
             objArray = Long.valueOf(liveWealthGr.mCurrentScore);
          }
          e.c(uoa.b(liveStreamId, objArray).map(new e()).observeOn(d.c).doOnNext(b.b).observeOn(d.a).subscribe(new d(tb), new g(tb)));
       }
       tb.e();
       return;
    }
}
