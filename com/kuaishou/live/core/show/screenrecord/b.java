package com.kuaishou.live.core.show.screenrecord.b;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordBottomBarPresenter;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ij2.n0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import crd.b;
import lnc.b9;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import brd.t;
import com.kuaishou.live.common.core.basic.arya.LiveSnowManager;
import r16.d;
import r16.f;
import ij2.m;
import com.kuaishou.live.core.show.screenrecord.c;
import erd.g;
import ke2.k;

public final class b implements View$OnClickListener	// class@000fdc
{
    public final LiveAudienceScreenRecordBottomBarPresenter b;

    public void b(LiveAudienceScreenRecordBottomBarPresenter p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LiveAudienceScreenRecordBottomBarPresenter.class, "6")) {
       }else {
          ClientContent$LiveStreamPackage liveStreamPa = tb.q.a();
          if (!PatchProxy.applyVoidOneRefs(liveStreamPa, null, n0.class, "2")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "RECORD_SCREEN_SUBCARD";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.v(true, uElementPack, uContentPack, null);
          }
          b9.a(tb.M);
          tb.M = k.b(tb.getActivity(), LiveSnowManager.h(true, tb.getActivity()), d.class, f.class, new m(tb), c.b);
       }
       return;
    }
}
