package com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketFragment;
import com.kuaishou.live.common.core.component.redpacket.container.LiveRedPacketContainerItemBaseFragment;
import java.lang.String;
import com.kuaishou.live.core.show.activityredpacket.g;
import o22.b;
import t02.r1;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketService;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketFragment$a;
import java.lang.Number;
import com.kuaishou.live.core.show.activityredpacket.e;
import com.kuaishou.live.core.show.activityredpacket.b;
import com.kuaishou.live.core.show.activityredpacket.f;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Integer;
import k2b.e0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import androidx.lifecycle.LiveData;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import fg6.a;
import com.google.gson.Gson;
import h22.h;
import com.kuaishou.live.core.show.activityredpacket.c;
import com.kuaishou.live.core.show.activityredpacket.d;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.StringBuilder;
import nt5.a;
import tw1.d;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import ag6.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketFragment$b;
import msd.a;
import h22.a;
import com.kuaishou.live.core.show.activityredpacket.o;
import com.kuaishou.live.core.show.activityredpacket.k;
import com.kuaishou.live.core.show.activityredpacket.a0;

public class LiveActivityRedPacketFragment extends LiveRedPacketContainerItemBaseFragment	// class@000930
{
    public m m;
    public r1 n;
    public a0 o;
    public LiveActivityRedPacketFragment$b p;
    public LiveActivityRedPacketService q;
    public LiveActivityRedPacketPresenter$e r;
    public a s;
    public b t;
    public static final int u;

    public void LiveActivityRedPacketFragment(String p0){
       super(p0);
       this.s = g.b;
    }
    public static LiveActivityRedPacketFragment mh(b p0,r1 p1,LiveActivityRedPacketService p2,String p3){
       LiveActivityRedPacketFragment obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, LiveActivityRedPacketFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveActivityRedPacketFragment(p3);
       obj.m = p1.v;
       obj.n = p1;
       obj.q = p2;
       obj.t = p0;
       obj.r = new LiveActivityRedPacketFragment$a();
       return obj;
    }
    public int ch(){
       Object obj = PatchProxy.apply(null, this, LiveActivityRedPacketFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return k0.c(this.t, e.a, b.a, f.a).or(Integer.valueOf(0)).intValue();
    }
    public e0 dh(){
       Object obj = PatchProxy.apply(null, this, LiveActivityRedPacketFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.b();
    }
    public ClientContent$LiveStreamPackage eh(){
       Object obj = PatchProxy.apply(null, this, LiveActivityRedPacketFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.a();
    }
    public ClientContent$LiveVoicePartyPackageV2 fh(){
       Object obj = PatchProxy.apply(null, this, LiveActivityRedPacketFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.y();
    }
    public String gh(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveActivityRedPacketFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.t.c.getValue() != null) {
          return h.b(this.t.c.getValue().bizType, this.t.c.getValue().boxType, a.a.q(this.t.c.getValue().extraMessage), this.j);
       }
       return this.gh(p0);
    }
    public String hh(){
       Object obj = PatchProxy.apply(null, this, LiveActivityRedPacketFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.c.getValue().treasureBoxId;
    }
    public int ih(){
       return 14;
    }
    public int jh(){
       return 14;
    }
    public long kh(){
       Object obj = PatchProxy.apply(null, this, LiveActivityRedPacketFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return k0.b(this.t, c.a, d.a).or(Long.valueOf(-1)).longValue();
    }
    public void lh(boolean p0){
       if (PatchProxy.isSupport(LiveActivityRedPacketFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveActivityRedPacketFragment.class, "1")) {
          return;
       }
       if (!p0) {
          return;
       }
       d.l(this.gh(this.j), this.dh(), this.eh(), this.fh(), this.t.c.getValue().treasureBoxId, 14, 0, 0, 3, this.t.a().a()+"");
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveActivityRedPacketFragment.class, "12");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.c(p0, 0x7f0d09a4, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveActivityRedPacketFragment.class, "14")) {
          return;
       }
       super.onDestroyView();
       LiveActivityRedPacketFragment tp = this.p;
       if (tp != null) {
          tp.unbind();
          this.p.destroy();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveActivityRedPacketFragment.class, "13")) {
          return;
       }
       super.onViewCreated(p0, p1);
       LiveActivityRedPacketFragment$b uob = new LiveActivityRedPacketFragment$b(this.s);
       if (!PatchProxy.applyVoidOneRefs(uob, this, LiveActivityRedPacketFragment.class, "15")) {
          a uoa = new a();
          uob.z = uoa;
          uoa.b = this.o;
          uoa.a = this.n;
          LiveActivityRedPacketFragment tt = this.t;
          uoa.c = tt;
          uoa.e = this.s;
          uoa.d = this.j;
          uob.A = this.m;
          uob.B = this.q;
          uob.C = this.r;
          uob.D = tt;
       }
       uob.U7(new o());
       uob.U7(new k());
       uob.U7(new a0());
       uob.f(p0);
       Object[] objArray = new Object[0];
       uob.i(objArray);
       this.p = uob;
       return;
    }
}
