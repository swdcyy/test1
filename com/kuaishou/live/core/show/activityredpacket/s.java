package com.kuaishou.live.core.show.activityredpacket.s;
import java.lang.Runnable;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import ok.x;
import java.lang.String;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import n22.b;
import uw1.m;
import p91.m;
import ng2.j;
import java.util.List;
import com.kuaishou.android.live.log.b;
import ekd.k1;
import h22.f0;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import io7.c;

public final class s implements Runnable	// class@000995
{
    public final LiveActivityRedPacketPresenter b;
    public final LiveTreasureBoxMessage$LiveTreasureBoxShow c;
    public final x d;
    public final String e;

    public void s(LiveActivityRedPacketPresenter p0,LiveTreasureBoxMessage$LiveTreasureBoxShow p1,x p2,String p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       s tb = this.b;
       s td = this.d;
       s te = this.e;
       if (tb.R8(this.c)) {
          Object[] objArray = null;
          f0 obj = PatchProxy.apply(objArray, tb, LiveActivityRedPacketPresenter.class, "17");
          boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): j.a(tb.q, tb.p, tb.getActivity(), tb.s.b());
          if (!b || (!td.get().booleanValue() && !PatchProxy.applyVoidOneRefs(te, tb, LiveActivityRedPacketPresenter.class, "12"))) {
             b.P(LiveActivityRedPacketPresenter.I, "tryAutoShowRedPacketContainer");
             Object k = LiveActivityRedPacketPresenter.K;
             k1.n(k);
             obj = new f0(tb, te);
             Object obj1 = PatchProxy.apply(objArray, tb, LiveActivityRedPacketPresenter.class, "13");
             long l = (obj1 != PatchProxyResult.class)? obj1.longValue(): a.t().u("SOURCE_LIVE").b("liveActivityLeeePackAutoShowInterval", 2000);
             k1.s(obj, k, l);
          }
       }
    label_0080 :
       return;
    }
}
