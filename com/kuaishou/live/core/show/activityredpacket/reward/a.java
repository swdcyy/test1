package com.kuaishou.live.core.show.activityredpacket.reward.a;
import z0.a;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonPresenter;
import com.kuaishou.live.core.show.activityredpacket.model.LiveActivityRedPacketGrabButtonInfo;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import k22.c;
import brd.t;
import k22.a;
import u22.k;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k22.c$a;

public final class a implements a	// class@000991
{
    public final LiveActivityRedPacketGrabButtonPresenter a;
    public final LiveActivityRedPacketGrabButtonInfo b;

    public void a(LiveActivityRedPacketGrabButtonPresenter p0,LiveActivityRedPacketGrabButtonInfo p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Object apply(Object p0){
       a ta = this.a;
       Objects.requireNonNull(ta);
       c uoc = new c();
       ta.X7(uoc.b().subscribe(new k(ta)));
       uoc.e(this.b, new c$a(p0.booleanValue()));
       ta.A = uoc;
       return null;
    }
}
