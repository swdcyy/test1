package com.kuaishou.live.audience.component.gift.gift.audience.v2.k;
import im8.g;
import k51.c;
import java.util.LinkedList;
import ql1.h;
import mk1.c;
import android.os.Handler;
import android.os.Looper;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.i;
import ez0.r;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.k$a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.k$b;
import ez0.t;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.k$c;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.k$d;
import ez0.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import oq5.c;
import jv1.b;
import ds5.c;
import ds5.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import ez0.m;
import erd.g;
import crd.b;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.a;
import t02.a0;
import ez0.g0;
import iw1.a;
import lp3.c;
import lp3.e;
import sz1.e;
import mk1.f;
import ez0.l;
import ry1.b;
import ez0.w;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.c;
import jk1.c;
import jk1.f;
import mq5.h;
import mq5.b;
import ez0.a0;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import mrd.a;
import com.trello.rxlifecycle3.components.support.RxFragment;
import ez0.n;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.d;
import ez0.u;
import vq5.b;
import vq5.d;
import ez0.p;
import java.lang.Runnable;
import kv1.a;
import com.kuaishou.android.live.model.QLivePlayConfig;
import wh1.a;
import java.lang.Long;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import rl1.i;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.common.core.component.gift.gift.righttopbanner.panel.ILiveDefaultSelectGiftIdInterceptor;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.o;
import java.util.Objects;
import p01.q;
import lf3.g;
import hf3.a;
import hm3.a;
import java.util.PriorityQueue;
import lnc.b9;
import e93.f;
import brd.y;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.LiveAudienceGiftBoxFragment;
import mk1.h;
import vk1.a;
import java.lang.Integer;
import km1.b;
import java.util.List;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import om1.a;
import com.kuaishou.live.common.core.component.trace.gift.bean.LiveSendGiftTraceInfo;
import mm1.c;
import mm1.e;
import mm1.g;
import java.util.Iterator;
import mk1.d0;
import mk1.b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.basic.activity.x;
import e17.i;
import wh5.c;
import tkd.b;
import tkd.d;
import ad5.b;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.user.QCurrentUser;
import android.app.Activity;
import com.kuaishou.live.core.basic.utils.e;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import qk1.a;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.l;
import ok.o;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.m;
import java.util.Comparator;
import com.google.common.collect.ImmutableList;
import mk1.a;
import z12.e;
import e92.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import qk1.c;
import mk1.d;
import qk1.d;
import com.kwai.framework.model.user.UserInfo;
import qk1.e;
import java.lang.Boolean;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAudienceGiftConfig;
import java.lang.reflect.Type;
import wg3.a;
import qk1.b;
import gy2.f;
import gy2.c;
import ez0.q;
import gy2.a;
import gy2.b$a;
import ez0.d0;
import java.util.Map;
import java.util.HashMap;
import ds5.e;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.bottombar.LiveAudienceGiftBottomBarEntryService;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import w91.a;
import mk1.a0;

public class k extends c implements g	// class@000b22
{
    public e A;
    public a B;
    public LiveAudienceGiftBottomBarEntryService C;
    public a D;
    public i E;
    public a F;
    public a0 G;
    public d H;
    public a I;
    public q J;
    public LiveBizParam K;
    public View L;
    public f M;
    public g0 N;
    public Handler O;
    public final Runnable P;
    public b Q;
    public boolean R;
    public Runnable S;
    public c T;
    public boolean U;
    public c U0;
    public ILiveDefaultSelectGiftIdInterceptor V;
    public h V0;
    public b W;
    public f X;
    public c Y;
    public c Z;
    public final List p;
    public final h q;
    public final List r;
    public o s;
    public final c t;
    public LiveAudienceGiftBoxFragment u;
    public BaseFragment v;
    public a0 w;
    public e x;
    public a y;
    public b z;
    public static final String W0 = "k";
    public static String sLivePresenterClassName = "LiveAudienceGiftBoxPresenter";

    public void k(){
       super();
       this.p = new LinkedList();
       this.q = new h();
       this.r = new LinkedList();
       this.t = new c();
       this.O = new Handler(Looper.getMainLooper());
       this.P = new i(this);
       this.S = new r(this);
       this.U = false;
       this.V = new k$a(this);
       this.X = new k$b(this);
       this.Y = new t(this);
       this.Z = new k$c(this);
       this.U0 = new k$d(this);
       this.V0 = new s(this);
    }
    public void E8(){
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "4")) {
          return;
       }
       this.L = this.m8();
       this.z.H6(this.Y);
       this.A.gd(this.Z);
       this.X7(RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new m(this)));
       a uoa = new a(this.w);
       this.M = uoa;
       g0 og0 = new g0(this.w, uoa, this.x.a(a.class), this.x.a(e.class));
       this.N = og0;
       og0.c = new l(this);
       this.Q = this.w.b3.T3().subscribe(new w(this), c.b);
       this.X.fl(this.U0);
       this.w.D2.Km(this.V0);
       if (!PatchProxy.applyVoid(objArray, this, ok, "11")) {
          ok = this.w;
          if (ok.h != null) {
             ok.y2.P4(new a0(this));
          }
       }
       this.T = a.g();
       this.X7(this.v.m().subscribe(new n(this), d.b));
       this.H.t5("giftpanel", new u(this));
       this.B.a(new p(this));
       long giftComboBuf = this.w.e.getGiftComboBuffSeconds();
       a uoa1 = a.class;
       if (!PatchProxy.isSupport(uoa1) || (!PatchProxy.applyVoidOneRefs(Long.valueOf(giftComboBuf), objArray, uoa1, "2") && giftComboBuf - null >= 0)) {
          a.a().c = giftComboBuf;
       }
       LiveLogTag gIFT_BOX = LiveLogTag.GIFT_BOX;
       b.Z(gIFT_BOX, "[LiveAudienceGiftBoxPresenter][onBind]"+this.E.U7());
       this.U = a.t().u("SOURCE_LIVE").d("enableSelectLastGiftTab", false);
       b.Z(gIFT_BOX, "[LiveAudienceGiftBoxPresenter][enableSelectLastGiftTab]"+this.U);
       this.s.a(this.V);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, k.class, "9")) {
          return;
       }
       k tJ = this.J;
       Objects.requireNonNull(tJ);
       if (!PatchProxy.applyVoid(null, tJ, q.class, "10")) {
          tJ.g.o(1058, tJ.f);
          tJ.h.o(1058, tJ.f);
          tJ.b.clear();
          tJ.d = null;
          tJ.e = null;
          tJ.b();
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k.class, "8")) {
          return;
       }
       this.L = objArray;
       this.X.ii(this.U0);
       this.z.Q0(this.Y);
       this.A.fo(this.Z);
       k tN = this.N;
       if (tN != null) {
          Objects.requireNonNull(tN);
          if (!PatchProxy.applyVoid(objArray, tN, g0.class, "2")) {
             b9.a(tN.b);
             b9.a(tN.a);
             tN.f.C.o(797, tN.e);
             tN.c = objArray;
             tN.d = 0;
          }
       }
       tN = this.M;
       if (tN != null) {
          tN.clear();
       }
       tN = this.Q;
       if (tN != null && !tN.isDisposed()) {
          this.Q.dispose();
       }
       this.R = false;
       this.O.removeCallbacksAndMessages(objArray);
       f.f(this.S);
       f.g(this);
       this.w.D2.le(this.V0);
       this.T.onComplete();
       this.T = objArray;
       this.u = objArray;
       this.H.Z4("giftpanel");
       this.s.c(this.V);
       return;
    }
    public void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k.class, "14")) {
          return;
       }
       k tu = this.u;
       if (tu != null && tu.isAdded()) {
          tu = this.u;
          Objects.requireNonNull(tu);
          if (!PatchProxy.applyVoid(objArray, tu, LiveAudienceGiftBoxFragment.class, "21") && tu.ch()) {
             tu.z.z.dismiss();
          }
       }
       return;
    }
    public final void R8(String p0,String p1,int p2){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, k.class, "17")) {
          return;
       }
       if (this.x.b()) {
          b.P(b.a, "[LiveAudienceGiftBoxPresenter][logTraceInfo]service manager cleared");
          return;
       }else {
          this.D.yk(this.D.o6()).d(p0).f("PRE_SEND_GIFT").g(p2).e(p1).a();
          return;
       }
    }
    public final void S8(String p0,int p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ok, "16")) {
          return;
       }
       Iterator iterator = this.r.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1);
       }
       return;
    }
    public void V8(b p0){
       a0 c;
       k l;
       k k;
       LiveAudienceGiftBoxFragment liveAudience1;
       b a;
       boolean b;
       LiveAudienceGiftBoxFragment liveAudience = this;
       Object obj = p0;
       k ok = k.class;
       if (PatchProxy.applyVoidOneRefs(obj, liveAudience, ok, "12")) {
          return;
       }
       int i = 0x30ed4;
       String str = "CLIENT_GIFT_BOX_SHOW";
       if (!liveAudience.w.R().isAdded()) {
          liveAudience.R8(str, "[LiveAudienceGiftBoxPresenter][showGiftBox]fragment not added", i);
          return;
       }else if(liveAudience.L == null){
          liveAudience.R8(str, "[LiveAudienceGiftBoxPresenter][showGiftBox]viewRoot is null", i);
          return;
       }else {
          k m = liveAudience.M;
          int i1 = 0x7f11066a;
          if (m != null && m.f()) {
             i.a(i1, R.string.arg_RES_7f10060b);
             liveAudience.R8(str, "[LiveAudienceGiftBoxPresenter][showGiftBox]disableGiftBox£¬mGiftBoxDataSource:"+liveAudience.M, 0x30ed5);
             return;
          }else if(c.b()){
             i.a(i1, R.string.arg_RES_7f100540);
             liveAudience.R8(str, "[LiveAudienceGiftBoxPresenter][showGiftBox]child lock true", 0x30ed1);
             return;
          }else if(!d.a(0x630bc993).isAvailable()){
             liveAudience.R8(str, "[LiveAudienceGiftBoxPresenter][showGiftBox]PaymentPlugin not available", 0x30ed2);
             return;
          }else {
             c = liveAudience.w.c;
             if (c != null && (c.getUser() != null && (QCurrentUser.me() != null && (QCurrentUser.me().getId()).equals(liveAudience.w.c.getUser().getId())))) {
                liveAudience.R8(str, "[LiveAudienceGiftBoxPresenter][showGiftBox]anchor is self", 0x30ed3);
                return;
             }else if(e.s(this.getActivity()) && !liveAudience.w.R().a()){
                liveAudience.R8(str, "[LiveAudienceGiftBoxPresenter][showGiftBox]current fragment not on screen", i);
                return;
             }else {
                m = liveAudience.s;
                Objects.requireNonNull(m);
                String str1 = "3";
                int i2 = 0;
                if (!PatchProxy.applyVoidOneRefs(obj, m, o.class, str1)) {
                   GiftTab normalGift = GiftTab.NormalGift;
                   if (p0.d() == normalGift && !obj.a.g()) {
                      if (m.a.isEmpty()) {
                         obj.m(normalGift);
                      }else {
                         ImmutableList immutableLis = m.s(m.a).p(l.b).E(m.b);
                         if (immutableLis.size() > 0) {
                            obj.m(immutableLis.get(i2).c());
                         }else {
                            obj.m(normalGift);
                         }
                      }
                   }
                }
                m = liveAudience.t;
                a uoa = new a(m, liveAudience.p, liveAudience.M, liveAudience.q);
                String[] stringArray = new String[i2];
                e.c(k.W0, m.toString(), stringArray);
                k w = liveAudience.w;
                k t = liveAudience.t;
                if (!PatchProxy.applyVoidThreeRefs(w, p0, t, null, a.class, "13")) {
                   a = obj.a;
                   Objects.requireNonNull(a);
                   b uob = a;
                   b uob1 = a;
                   if (!PatchProxy.applyVoidThreeRefs(w.c.mEntity.mUser, p0, t, uob, c.class, "1") && (a.t().u("SOURCE_LIVE").d("enableSaveAndRecoverLastGiftWithAudience", i2) || p0.l())) {
                      uob1.i(t.e);
                   }
                   uob1 = obj.b;
                   Objects.requireNonNull(uob1);
                   if (!PatchProxy.applyVoidThreeRefs(w.c.mEntity.mUser, p0, t, uob1, d.class, "1")) {
                      uob1.h(p0.e());
                      uob1.i(t.f);
                   }
                   uob1 = obj.c;
                   LiveStreamFeed mUser = w.c.mEntity.mUser;
                   Objects.requireNonNull(uob1);
                   LiveStreamFeed liveStreamFe = mUser;
                   LiveStreamFeed liveStreamFe1 = mUser;
                   if (PatchProxy.applyVoidThreeRefs(liveStreamFe, p0, t, uob1, e.class, "1")) {
                      mUser = 0;
                   }else {
                      uob1.h(UserInfo.convertFromQUser(liveStreamFe1));
                      uob1.i(t.g);
                      LiveConfigStartupResponse$LiveAudienceGiftConfig obj1 = PatchProxy.apply(null, uob1, e.class, "2");
                      if (obj1 != PatchProxyResult.class) {
                         b = obj1.booleanValue();
                      }else {
                         obj1 = a.s(LiveConfigStartupResponse$LiveAudienceGiftConfig.class);
                         b = (obj1 != null && obj1.mDisablePrivilegeGiftTab == null)? true: false;
                      }
                      uob1.a = b;
                   }
                   uob1 = obj.d;
                   LiveStreamFeed mUser1 = w.c.mEntity.mUser;
                   Objects.requireNonNull(uob1);
                   if (!PatchProxy.applyVoidThreeRefs(mUser1, p0, t, uob1, b.class, "1")) {
                      uob1.h(UserInfo.convertFromQUser(mUser1));
                      uob1.i(t.h);
                   }
                }
                if (!PatchProxy.applyVoidTwoRefs(obj, uoa, liveAudience, ok, "13")) {
                   m = liveAudience.w;
                   k x = liveAudience.x;
                   l = liveAudience.L;
                   k = liveAudience.K;
                   k j = liveAudience.J;
                   k g = liveAudience.G;
                   ok = liveAudience.s;
                   if (PatchProxy.isSupport(LiveAudienceGiftBoxFragment.class)) {
                      Object[] objArray = new Object[9];
                      objArray[i2] = m;
                      objArray[1] = x;
                      objArray[2] = l;
                      objArray[3] = uoa;
                      objArray[4] = obj;
                      objArray[5] = k;
                      objArray[6] = j;
                      objArray[7] = g;
                      objArray[8] = ok;
                      liveAudience1 = PatchProxy.apply(objArray, null, LiveAudienceGiftBoxFragment.class, str1);
                      if (liveAudience1 != PatchProxyResult.class) {
                      label_02b0 :
                         liveAudience.u = liveAudience1;
                         c uoc = f.e.a(this.getActivity());
                         b.Z(LiveLogTag.GIFT, "[replaceGiftBoxFragment]dialogService:"+uoc);
                         uoc.b(liveAudience.u, new q(liveAudience, obj));
                      }
                   }
                   liveAudience1 = new LiveAudienceGiftBoxFragment();
                   liveAudience1.n = m;
                   liveAudience1.o = x;
                   liveAudience1.q = x.a(a.class);
                   liveAudience1.u = l;
                   liveAudience1.l = uoa;
                   liveAudience1.s = uoa.b;
                   liveAudience1.m = obj;
                   liveAudience1.p = k;
                   liveAudience1.t = j;
                   liveAudience1.r = g;
                   liveAudience1.F = ok;
                   goto label_02b0 ;
                }
                return;
             }
          }
       }
    }
    public void doBindView(View p0){
       PatchProxy.applyVoidOneRefs(p0, this, k.class, "2");
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, k.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(k.class, new d0());
       }else {
          obj.put(k.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.w = this.q8(a0.class);
       this.x = this.r8("LIVE_SERVICE_MANAGER");
       this.y = this.r8("LIVE_LONG_CONNECTION");
       this.D = this.x.a(a.class);
       this.E = this.x.a(i.class);
       this.z = this.q8(b.class);
       this.A = this.r8("LIVE_PLAY_CONFIG_SERVICE");
       this.B = this.q8(a.class);
       this.H = this.r8("LIVE_ROUTER_SERVICE");
       this.K = this.s8(LiveBizParam.class);
       this.C = this.q8(LiveAudienceGiftBottomBarEntryService.class);
       this.v = this.r8("LIVE_FRAGMENT");
       this.I = this.x.a(a.class);
       a uoa = this.x.a(a.class);
       this.F = uoa;
       this.J = new q(this.y, uoa);
       this.G = this.s8(a0.class);
       this.s = new o(this.x);
       return;
    }
}
