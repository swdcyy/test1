package com.kuaishou.live.core.basic.activity.j;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import t02.g;
import mrd.a;
import t02.a0;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import p91.m;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.kuaishou.live.core.basic.utils.e;
import xp5.a;
import y43.a;
import n51.a;
import com.kuaishou.live.core.basic.activity.LivePlayLoader;
import com.kuaishou.live.core.basic.activity.a;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import hf3.a;
import j12.d;
import brd.t;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;
import xj2.a;
import java.lang.System;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.core.basic.activity.w;
import com.kuaishou.live.core.basic.activity.u;
import f12.d;
import com.stage.LiveLoadingStage;
import com.kuaishou.live.core.basic.activity.g0;
import xs5.a;
import wj3.c;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$e;
import tj3.k;
import tj3.e;
import z12.n;
import kuaishou.perf.page.impl.b;
import android.content.Context;
import com.kuaishou.live.common.core.basic.arya.LiveSnowManager;
import lnc.y6;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a;
import lnc.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.f;
import com.kuaishou.live.core.basic.activity.f;
import com.kuaishou.live.core.basic.activity.g;
import erd.a;
import erd.g;
import crd.b;
import qs5.d;
import brd.x;
import com.kuaishou.live.core.basic.activity.i;
import com.kuaishou.live.core.basic.activity.h;
import bz2.a;

public final class j implements Runnable	// class@001840
{
    public final LivePlayFragment b;
    public final boolean c;

    public void j(LivePlayFragment p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       LivePlayFragment j1;
       j oj = this;
       j b = oj.b;
       j c = oj.c;
       Objects.requireNonNull(b);
       if (!PatchProxy.isSupport(LivePlayFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(c), b, LivePlayFragment.class, "36")) {
          b.Nh("runAfterBizLayoutInit");
          LivePlayFragment j = b.J;
          if (j != null) {
             j.D.onNext(Boolean.TRUE);
          }
          int i = 1;
          if (!PatchProxy.applyVoid(null, b, LivePlayFragment.class, "38")) {
             a0 uoa0 = new a0();
             b.K = uoa0;
             uoa0.n = b.getArguments();
             j = b.K;
             j1 = b.H;
             j.c = j1;
             j.Z2.D(j1);
             j = b.K;
             j.d = b.F.mPreInfo;
             j.e = b.S;
             j.g = b.gh();
             b.K.h = e.s(b.getActivity());
             b.K.r = b.d1.f();
             j = b.K;
             j1 = b.d1;
             j.t = j1;
             j.D.d1 = j1;
             boolean b1 = (j1.f() && b.d1.c())? true: false;
             j.s = b1;
             j = b.K;
             j.B = b.E;
             j1 = b.F;
             j.m = j1.mLiveSourceUrl;
             j.l = j1.mLiveSourceType;
             j1 = b.a1;
             j.x = j1;
             j.y = j1;
             j.z = b.y1.b();
             b.K.A = b.y1.c();
             j = b.K;
             j1 = b.F;
             j.k = j1.mLiveStreamContentType;
             j.o = j1;
             LivePlayFragment i4 = b.I;
             j.p = i4;
             LivePlayFragment w0 = b.W0;
             j.q = w0;
             j.G = b.Y;
             j.F = i4.mLiveAggregationSessionId;
             a0 z2 = j.Z2;
             boolean b2 = (b.R != null || b.O != null)? true: false;
             j.C = d.c(j1, z2, w0, b2);
             b.K.L = b.U0.hide();
             b.Jh();
          }
          j = b.K;
          j1 = b.J;
          Objects.requireNonNull(j);
          j.D2 = j1.i;
          j.L2 = j1.k;
          j.G2 = j1.q;
          j.C2 = j1.j;
          j.F2 = j1.n;
          j.E2 = j1.o;
          j.S = j1.E;
          j.T = j1.F;
          j.E = j1.c;
          j.H2 = j1.H;
          j.u2 = j1.C;
          j.J2 = j1.s;
          j.I2 = j1.r;
          j.M = j1.t;
          j.u = j1.d;
          j.v = j1.e;
          j.J = j1.u;
          j.K = j1.v;
          j.K2 = j1.y;
          j.M2 = j1.x;
          j.N = j1.w;
          j.T2 = j1.m;
          j.U2 = j1.z;
          b.G = (b.getActivity() instanceof LivePlayActivity)? b.getActivity().w3(): new a();
          b.G.d = b.H.mEntity;
          b.o1 = System.currentTimeMillis();
          b.wh();
          j = b.K;
          Object[] obj = PatchProxy.applyOneRefs(j, b, LivePlayFragment.class, "17");
          if (obj != PatchProxyResult.class) {
             obj.booleanValue();
          }else if(b.xh(j, "livePlayBizCallerContext is null") && (b.xh(j.Z2.getLiveStreamId(), "LiveStreamId is null") && (b.xh(j.Z2.d(), "AnchorUserId is null") && b.xh(j.Z2.a(), "LiveStreamPackage is null")))){
             b.xh(j.Z2.c(), "AryaSign is null");
          }
          LivePlayFragment y1 = b.y1;
          j1 = b.L;
          w ow = new w(b);
          u ou = new u(b);
          LivePlayFragment k = b.K;
          Object[] objArray = new Object[]{b.G,b.e1.H(),j,b.M,b.I,j.c,b.N};
          j = b.K;
          int i1 = 2;
          int i2 = 5;
          int i3 = 6;
          Objects.requireNonNull(y1);
          LivePlayLoader livePlayLoad = LivePlayLoader.class;
          if (PatchProxy.isSupport(livePlayLoad)) {
             Object[] objArray1 = new Object[i3];
             objArray1[0] = j1;
             objArray1[i] = ow;
             objArray1[i1] = Boolean.valueOf(c);
             objArray1[3] = ou;
             objArray1[4] = k;
             objArray1[i2] = objArray;
             if (PatchProxy.applyVoid(objArray1, y1, livePlayLoad, "4")) {
             label_0250 :
                long l = System.currentTimeMillis();
                long l1 = (b.h1 != null)? b.V.x().T(): b.F.getStartActivityTime();
                b.E1 = l - l1;
                if (b.h1 == null) {
                   obj = null;
                   if (!PatchProxy.applyVoid(obj, obj, n.class, "3")) {
                      b.d("live_click_to_destroy").h("ClickToPresenterFinishBindDuration");
                   }
                }else {
                   Context uContext = null;
                }
                LiveSnowManager.h(0, obj);
                FragmentEvent dESTROY = FragmentEvent.DESTROY;
                y6.e.h(LoadPolicy.SILENT_INIT).h(c.c(b.m(), dESTROY)).u(f.b, g.b);
                d.a("live_anchor_plugin", 30).compose(c.c(b.m(), dESTROY)).subscribe(i.b, h.b);
                a.d(30);
             }
          }
          g0 og0 = new g0(y1, j1, ow, c, ou, k, objArray);
          y1.f(LiveLoadingStage.Entered, y1.n, i2);
          goto label_0250 ;
       }
       return;
    }
}
