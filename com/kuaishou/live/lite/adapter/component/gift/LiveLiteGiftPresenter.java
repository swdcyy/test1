package com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter;
import b93.d;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter$d;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import ni1.d;
import om1.e;
import mm1.h;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter$f;
import mm1.b;
import mm1.g;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter$a;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter$b;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter$c;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter$e;
import or5.d;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import xp5.i;
import c93.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import v51.a;
import aq5.d;
import td3.o;
import rd3.b;
import vq5.d;
import qx1.a;
import hx1.a;
import sz1.e;
import py1.a;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import z1.k;
import d93.a;
import vb3.n;
import vb3.g;
import vb3.d;
import e93.c;
import com.kuaishou.live.lite.sidebar.e;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;
import sc3.a;
import vb3.e;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import ic3.a;
import wd3.a;
import s93.s;
import ip3.a;
import h03.a;
import kg1.h;
import xa3.a;
import java.lang.System;
import android.os.Trace;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager;
import qrd.l1;
import ec3.f;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Long;
import kotlin.Pair;
import qrd.r0;
import d93.b;
import jm1.a;
import v63.b;
import jm1.b;
import jm1.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveLiteElementsSwitch;
import com.kuaishou.android.live.log.LiveLogTag;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger;
import m73.a;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter$g;
import ok.x;
import mi1.a;
import l73.n0;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter$tryInitGiftManager$2;
import androidx.lifecycle.LifecycleOwner;
import ug1.u0;
import fi1.a;
import msd.a;

public final class LiveLiteGiftPresenter extends d	// class@001db5
{
    public e A;
    public LiveLiteBottomBarService B;
    public a C;
    public a D;
    public a E;
    public a F;
    public i G;
    public d H;
    public o I;
    public b J;
    public d K;
    public e L;
    public a M;
    public LiveLiteGestureService N;
    public a O;
    public e P;
    public h Q;
    public a R;
    public a S;
    public k T;
    public a U;
    public final e U0;
    public LiveLiteScatterLoadManager V;
    public final LiveLiteGiftPresenter$a V0;
    public final LiveLiteGiftPresenter$d W;
    public final LiveLiteGiftPresenter$b W0;
    public final boolean X;
    public final LiveLiteGiftPresenter$c X0;
    public final d Y;
    public final LiveLiteGiftPresenter$e Y0;
    public LiveLiteGiftManager Z;
    public n v;
    public d w;
    public g x;
    public d y;
    public c z;

    public void LiveLiteGiftPresenter(){
       super();
       this.W = new LiveLiteGiftPresenter$d(this);
       this.X = a.t().u("SOURCE_LIVE").d("enableGiftBoxEventHubOpt", false);
       this.Y = new d();
       this.U0 = new e(new h(new LiveLiteGiftPresenter$f(this)));
       this.V0 = new LiveLiteGiftPresenter$a(this);
       this.W0 = new LiveLiteGiftPresenter$b(this);
       this.X0 = new LiveLiteGiftPresenter$c(this);
       this.Y0 = new LiveLiteGiftPresenter$e(this);
    }
    public static final d c9(LiveLiteGiftPresenter p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("audienceInfoManager");
       }
       return p0;
    }
    public static final LiveLiteScatterLoadManager d9(LiveLiteGiftPresenter p0){
       p0 = p0.V;
       if (p0 == null) {
          a.S("liveTaskQueue");
       }
       return p0;
    }
    public static final i e9(LiveLiteGiftPresenter p0){
       p0 = p0.G;
       if (p0 == null) {
          a.S("logPackageProvider");
       }
       return p0;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGiftPresenter.class, "2")) {
          return;
       }
       a.p(p0, "provider");
       this.w = p0.a(d.class);
       this.C = p0.a(a.class);
       this.G = p0.a(i.class);
       this.H = p0.a(d.class);
       this.I = p0.a(o.class);
       this.J = p0.a(b.class);
       this.K = p0.a(d.class);
       this.F = p0.a(a.class);
       this.M = p0.a(a.class);
       this.P = p0.b(e.class);
       this.U = p0.a(a.class);
       this.V = p0.a(LiveLiteScatterLoadManager.class);
       this.T = p0.c(LiveLiteGuidanceMessageQueueManager.class);
       return;
    }
    public void Y8(a p0){
       l1 a;
       Object[] objArray;
       String str = "java.lang.String.format\(format, *args\)";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGiftPresenter.class, "3")) {
          return;
       }
       a.p(p0, "provider");
       this.v = p0.a(n.class);
       this.x = p0.a(g.class);
       this.y = p0.a(d.class);
       this.z = p0.a(c.class);
       this.A = p0.a(e.class);
       this.B = p0.a(LiveLiteBottomBarService.class);
       this.D = p0.a(a.class);
       this.L = p0.a(e.class);
       this.N = p0.a(LiveLiteGestureService.class);
       this.O = p0.b(a.class);
       this.E = p0.a(a.class);
       this.S = p0.e(s.class);
       this.Q = p0.a(h.class);
       this.R = p0.a(a.class);
       String str1 = "Gift::tryInitGiftManager";
       Trace.beginSection(str1);
       this.Z = this.k9(p0.a(a.class));
       a = l1.a;
       Trace.endSection();
       float f = (float)(System.nanoTime() - System.nanoTime()) / 1000000.00f;
       if (f.b()) {
          if (SystemUtil.K()) {
             objArray = new Object[]{str1,Float.valueOf(f)};
             str1 = String.format("%s - %.3fms", Arrays.copyOf(objArray, 2));
             a.o(str1, str);
             b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str1);
          }
       }else {
          objArray = new Object[]{str1,Float.valueOf(f)};
          str1 = String.format("%s - %.3fms", Arrays.copyOf(objArray, 2));
          a.o(str1, str);
          b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str1);
       }
       r0.a(Long.valueOf((long)f), a).getSecond();
       return;
    }
    public void Z8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGiftPresenter.class, "1")) {
          return;
       }
       a.p(p0, "register");
       p0.d(a.class, this.V0);
       p0.d(b.class, this.W0);
       p0.d(b.class, this.X0);
       p0.d(c.class, this.Y0);
       return;
    }
    public final boolean h9(){
       return this.X;
    }
    public final d j9(){
       return this.Y;
    }
    public final LiveLiteGiftManager k9(a p0){
       boolean b;
       a uoa1;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveLiteGiftPresenter liveLiteGift = LiveLiteGiftPresenter.class;
       Object[] obj1 = PatchProxy.applyOneRefs(p0, obj, liveLiteGift, "4");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = null;
       LiveLiteGiftPresenter obj2 = PatchProxy.apply(obj1, obj, liveLiteGift, "5");
       String str = "audienceInfoManager";
       if (obj2 != patchProxyRe) {
          b = obj2.booleanValue();
       }else {
          obj2 = obj.w;
          if (obj2 == null) {
             a.S(str);
          }
          LiveStreamFeed liveStreamFe = obj2.j0();
          boolean b1 = true;
          if (liveStreamFe != null) {
             liveStreamFe = liveStreamFe.mLiveLiteElementsSwitch;
             if (liveStreamFe != null && liveStreamFe.mEnableLiteSendAndShowGift == null) {
                uoa1 = 1;
             label_003f :
                if (!uoa1 && a.t().u("SOURCE_LIVE").d("enableLiveLiteGiftManager", b1)) {
                   b = true;
                }else {
                   b = false;
                }
             }
          }
          uoa1 = null;
          goto label_003f ;
       }
       if (!b) {
          b.Z(LiveLogTag.GIFT, "[LiveLiteGiftPresenter][initGiftManager]disableGiftManager");
          return obj1;
       }else {
          obj2 = obj.C;
          if (obj2 == null) {
             a.S("longConnectManager");
          }
          LiveLiteGiftPresenter w = obj.w;
          if (w == null) {
             a.S(str);
          }
          LiveLiteGiftPresenter m = obj.M;
          if (m == null) {
             a.S("liveAudienceRoleInfoManager");
          }
          LiveLiteGiftPresenter i = obj.I;
          if (i == null) {
             a.S("liteUserStatusManager");
          }
          LiveLiteGiftPresenter j = obj.J;
          if (j == null) {
             a.S("liteApiTrafficManager");
          }
          LiveLiteGiftPresenter h = obj.H;
          if (h == null) {
             a.S("bizManager");
          }
          LiveLiteGiftPresenter f = obj.F;
          if (f == null) {
             a.S("serverSignalBlockManager");
          }
          LiveLiteGiftPresenter g = obj.G;
          String str1 = "logPackageProvider";
          if (g == null) {
             a.S(str1);
          }
          LiveLiteGiftPresenter p = obj.P;
          LiveLiteGiftPresenter u = obj.U;
          if (u == null) {
             a.S("liveActionTriggerManager");
          }
          LiveActionTrigger liveActionTr = u.qe();
          u = obj.K;
          if (u == null) {
             a.S("liteRouterManager");
          }
          LiveLiteGiftPresenter v = obj.v;
          if (v == null) {
             a.S("viewProviderService");
          }
          LiveLiteGiftPresenter liveLiteGift1 = v;
          v = obj.x;
          if (v == null) {
             a.S("liteDialogService");
          }
          LiveLiteGiftPresenter liveLiteGift2 = v;
          v = obj.y;
          if (v == null) {
             a.S("dialogNotifyService");
          }
          LiveLiteGiftPresenter liveLiteGift3 = v;
          v = obj.z;
          if (v == null) {
             a.S("liteFragmentService");
          }
          LiveLiteGiftPresenter liveLiteGift4 = v;
          v = obj.T;
          if (v == null) {
             a.S("guideMessageManager");
          }
          LiveLiteGiftPresenter liveLiteGift5 = v;
          LiveLiteGiftPresenter liveLiteGift6 = obj.W;
          v = obj.A;
          if (v == null) {
             a.S("liteSideBarService");
          }
          LiveLiteGiftPresenter liveLiteGift7 = v;
          v = obj.B;
          if (v == null) {
             a.S("liteBottomBarService");
          }
          LiveLiteGiftPresenter liveLiteGift8 = v;
          v = obj.L;
          if (v == null) {
             a.S("liteBackPressedService");
          }
          LiveLiteGiftPresenter liveLiteGift9 = v;
          v = obj.N;
          if (v == null) {
             a.S("gestureService");
          }
          LiveLiteGiftPresenter liveLiteGift10 = v;
          LiveLiteGiftPresenter liveLiteGift11 = obj.O;
          v = obj.D;
          if (v == null) {
             a.S("liteProfileCardService");
          }
          LiveLiteGiftPresenter liveLiteGift12 = v;
          v = obj.S;
          if (v == null) {
             a.S("commentService");
          }
          LiveLiteGiftPresenter liveLiteGift13 = v;
          v = obj.Q;
          if (v == null) {
             a.S("fansGroupJoinService");
          }
          LiveLiteGiftPresenter liveLiteGift14 = v;
          v = obj.R;
          if (v == null) {
             a.S("liteFansGroupService");
          }
          LiveLiteGiftPresenter liveLiteGift15 = v;
          LiveLiteGiftPresenter liveLiteGift16 = obj.V0;
          LiveLiteGiftPresenter liveLiteGift17 = obj.U0;
          LiveLiteGiftPresenter liveLiteGift18 = u;
          u = obj.G;
          if (u == null) {
             a.S(str1);
          }
          LiveLiteGiftPresenter w1 = obj.w;
          if (w1 == null) {
             a.S(str);
          }
          a uoa = new a(u, w1, new LiveLiteGiftPresenter$g(obj));
          Object obj3 = PatchProxy.apply(null, obj, liveLiteGift, "6");
          n0 on0 = (obj3 != patchProxyRe)? obj3: new n0();
          LiveLiteGiftPresenter$tryInitGiftManager$2 otryInitGift = patchProxyRe;
          LiveLiteGiftPresenter$tryInitGiftManager$2 otryInitGift1 = new LiveLiteGiftPresenter$tryInitGiftManager$2(obj);
          LiveLiteGiftManager liveLiteGift19 = new LiveLiteGiftManager(this, obj2, w, m, i, j, h, f, g, p, liveActionTr, liveLiteGift18, liveLiteGift1, liveLiteGift2, liveLiteGift3, liveLiteGift4, liveLiteGift5, liveLiteGift6, liveLiteGift7, liveLiteGift8, liveLiteGift9, liveLiteGift10, liveLiteGift11, liveLiteGift12, liveLiteGift13, p0, liveLiteGift14, liveLiteGift15, liveLiteGift16, liveLiteGift17, uoa, on0, obj.Y, otryInitGift);
          return v35;
       }
    }
}
