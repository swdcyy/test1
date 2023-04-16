package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.d$c;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.tips.a$b;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import fq5.b;
import t02.a0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import n01.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import k2b.u1;
import cl1.c;

public class d$c implements a$b	// class@000b4c
{
    public final d a;

    public void d$c(d p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,int p1){
       d$c uoc = d$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uoc, "1")) {
          return;
       }
       BaseFragment uBaseFragmen = this.a.q.b().b();
       ClientContent$LiveStreamPackage liveStreamPa = this.a.q.b().a();
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(uBaseFragmen, liveStreamPa, Boolean.valueOf(p0), Integer.valueOf(p1), null, a.class, "1")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "GIFT_PANEL_A_KEY_SWITCH_CARD";
          i3 oi3 = i3.f();
          oi3.c("if_recode", Integer.valueOf(p0));
          oi3.c("style", Integer.valueOf(p1));
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.C0("", uBaseFragmen, 7, uElementPack, uContentPack);
       }
       return;
    }
    public void b(int p0,boolean p1){
       d$c uoc = d$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uoc, "2")) {
          return;
       }
       this.a.B.c(p0);
       BaseFragment uBaseFragmen = this.a.q.b().b();
       ClientContent$LiveStreamPackage liveStreamPa = this.a.q.b().a();
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(uBaseFragmen, liveStreamPa, Boolean.valueOf(p1), null, a.class, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "GIFT_PANEL_A_KEY_SWITCH_CARD";
          i3 oi3 = i3.f();
          oi3.c("if_recode", Integer.valueOf(p1));
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.L("", uBaseFragmen, 1, uElementPack, uContentPack);
       }
       return;
    }
    public void c(int p0){
       d$c uoc = d$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "3")) {
          return;
       }
       this.a.B.c(p0);
       return;
    }
}
