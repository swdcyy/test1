package com.kuaishou.live.gzone.treasurebox.presenter.k;
import erd.g;
import com.kuaishou.live.gzone.treasurebox.presenter.l;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import r53.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.gzone.treasurebox.presenter.TreasureBoxCommonModel;
import r53.a;
import fq5.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import jp3.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import oe6.e;
import java.lang.System;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import m53.n;
import r53.c;
import crd.b;
import ok.h;
import lnc.b9;
import com.smile.gifmaker.mvps.presenter.a;
import p53.h0;
import com.kwai.feature.api.live.base.service.quitlive.AudienceQuitLiveCheckOrder;
import tq5.a;
import tq5.c;
import com.kuaishou.live.gzone.treasurebox.presenter.i;
import z12.e;

public final class k implements g	// class@001c8b
{
    public final l b;

    public void k(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j e;
       k tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          l a = tb.A;
          Objects.requireNonNull(a);
          String str = "1";
          if (!PatchProxy.applyVoid(null, a, j.class, str)) {
             e = a.e;
             j f = a.f;
             Objects.requireNonNull(e);
             if (!PatchProxy.applyVoidOneRefs(f, e, TreasureBoxCommonModel.class, str)) {
                e.v = true;
                e.F = f;
                e.A = f.a.getLiveStreamId();
                e.B = e.F.a.b();
                boolean b = (!a.b() && e.m())? true: false;
                e.x = b;
                Object obj = PatchProxy.apply(null, e, TreasureBoxCommonModel.class, "8");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else {
                   e.e("¡¾computeRoomEnterFeatureSupport¡¿disableLiveTreasure:"+a.b()+",  liveTreasureSwitchOn:"+e.t()+" treasureBoxNextShowTime:"+e.d(e.H())+", current:"+e.d(System.currentTimeMillis()));
                   b = (a.b() || (e.t() && e.H() - System.currentTimeMillis() <= 0))? true: false;
                }
                e.w = b;
                n.a = e.F.a.a();
             }
             a.g = b9.c(a.g, new c(a));
          }
          tb.P8(false);
          if (!PatchProxy.applyVoid(null, tb, l.class, "4")) {
             tb.w.Ci(new h0(tb), AudienceQuitLiveCheckOrder.TREASURE_BOX);
             tb.w.Ci(new i(tb), AudienceQuitLiveCheckOrder.TREASURE_BOX_TASK);
          }
       }
       String[] stringArray = new String[]{"showTreasureBox",p0.toString()};
       if (!PatchProxy.applyVoidTwoRefs("onBind", stringArray, tb, l.class, "10")) {
          e.b("LiveTreasureBoxV2", "onBind", stringArray);
       }
       return;
    }
}
