package com.kuaishou.live.core.show.activityredpacket.h;
import c12.f;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter$e;
import java.util.LinkedList;
import com.kuaishou.live.core.show.activityredpacket.h$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import uw1.g;
import uw1.m;
import java.util.List;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t02.a0;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketService;

public class h extends f	// class@000953
{
    public m K;
    public a0 L;
    public LiveActivityRedPacketService M;
    public List N;
    public g O;
    public LiveActivityRedPacketPresenter$e P;
    public static String sLivePresenterClassName = "LiveActivityRedPacketFragmentAudiencePresenter";

    public void h(LiveActivityRedPacketPresenter$e p0){
       super();
       this.N = new LinkedList();
       this.O = new h$a(this);
       this.P = p0;
    }
    public void Q(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "3")) {
          return;
       }
       h tK = this.K;
       if (tK != null) {
          tK.I2(this.O);
       }
       this.N.clear();
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       super.j8();
       this.K = this.s8(m.class);
       this.L = this.q8(a0.class);
       this.M = this.q8(LiveActivityRedPacketService.class);
       return;
    }
    public void x(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "2")) {
          return;
       }
       h tK = this.K;
       if (tK != null) {
          tK.A2(this.O);
       }
       return;
    }
}
