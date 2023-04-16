package com.kuaishou.live.core.show.activityredpacket.reward.b;
import z0.a;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonPresenter;
import com.kuaishou.live.core.show.activityredpacket.model.LiveActivityRedPacketGrabButtonInfo;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.String;
import com.kuaishou.live.core.show.activityredpacket.condition.LiveActivityRedPacketReserveQualificationManager;
import java.lang.Long;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import java.util.concurrent.TimeUnit;
import brd.t;
import j22.a;
import erd.o;
import j22.b;
import j22.c;
import t45.d;
import brd.z;
import j22.d;
import j22.e;
import erd.g;
import crd.b;
import k22.b;
import k22.a;
import u22.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k22.b$a;

public final class b implements a	// class@000992
{
    public final LiveActivityRedPacketGrabButtonPresenter a;
    public final LiveActivityRedPacketGrabButtonInfo b;

    public void b(LiveActivityRedPacketGrabButtonPresenter p0,LiveActivityRedPacketGrabButtonInfo p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Object apply(Object p0){
       b ta = this.a;
       b tb = this.b;
       Objects.requireNonNull(ta);
       String str = tb.b();
       LiveActivityRedPacketReserveQualificationManager d = LiveActivityRedPacketReserveQualificationManager.d;
       Boolean uBoolean = d.c(str);
       if (uBoolean == null) {
          Long longx = Long.valueOf(tb.z);
          if (!PatchProxy.applyVoidTwoRefs(str, longx, d, LiveActivityRedPacketReserveQualificationManager.class, "2") && (str != null && longx != null)) {
             longx.longValue();
             long l = 0;
             if (longx.longValue() - l > 0) {
                l = k1.k(longx.longValue());
             }
             t.timer(l, TimeUnit.MICROSECONDS).flatMap(new a(str)).map(b.b).map(c.b).subscribeOn(d.b).subscribe(new d(str), e.b);
          }
       }
       b uob = new b();
       ta.X7(uob.b().subscribe(new k(ta)));
       uob.e(tb, new b$a(p0.booleanValue(), uBoolean));
       ta.A = uob;
       return null;
    }
}
