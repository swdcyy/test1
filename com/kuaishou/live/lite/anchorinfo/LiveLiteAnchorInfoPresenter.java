package com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoPresenter;
import b93.d;
import o83.k;
import o83.i;
import o83.g;
import o83.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eq3.d;
import v83.h;
import kotlin.jvm.internal.a;
import or5.d;
import com.kuaishou.live.lite.sidebar.e;
import pg1.e;
import xp5.i;
import la3.a;
import xa3.a;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoPresenter$onCreate$1;
import msd.a;
import s83.f;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoPresenter$initAnchorInfoV2Controller$1;
import sc3.a;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService;
import msd.l;
import r83.l;
import o83.f;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveLiteElementsSwitch;
import com.kuaishou.live.lite.anchorinfo.recommendtag.b;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.live.model.LiveStreamModel;
import e93.b;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowController;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger;
import py1.a;
import td3.o;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoShrinkModeFollowController;
import com.kuaishou.live.lite.anchorinfo.b;
import tj3.e;
import ga1.d;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import vb3.p;
import vb3.n;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoPresenter$a;
import z1.a;
import vd3.c;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarService;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoPresenter$onCreate$3;
import java.util.Objects;
import sd3.b;
import crd.b;
import oh3.j;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger$UserAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collection;
import c93.b;
import vq5.d;
import d93.a;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;
import d93.b;
import ec3.f;
import com.kuaishou.live.lite.anchorinfo.LiteRecommendAnchorInfoController;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoPresenter$initLiteRecommendAnchorInfoController$1;
import java.util.concurrent.TimeUnit;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import sd3.a;
import erd.g;

public final class LiveLiteAnchorInfoPresenter extends d	// class@001e43
{
    public n A;
    public LiveLiteGestureService B;
    public a C;
    public LiveLiteBottomBarService D;
    public a E;
    public d F;
    public a G;
    public o H;
    public LiveLiteScatterLoadManager I;
    public b J;
    public LiteRecommendAnchorInfoController K;
    public LiveLiteRecommendSideBarService L;
    public d M;
    public a N;
    public final k O;
    public final f P;
    public a Q;
    public e v;
    public e w;
    public d x;
    public b y;
    public i z;

    public void LiveLiteAnchorInfoPresenter(){
       super();
       this.O = new k();
       g og = (i.a())? new g(): new h();
       this.P = og;
       return;
    }
    public void F8(){
       LiveLiteAnchorInfoPresenter i;
       LiveLiteAnchorInfoPresenter w1;
       boolean b;
       Object obj = this;
       LiveLiteAnchorInfoPresenter liveLiteAnch = LiveLiteAnchorInfoPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, liveLiteAnch, "5")) {
          return;
       }
       super.F8();
       d uod = this.P8();
       LiveLiteAnchorInfoPresenter x = obj.x;
       if (x == null) {
          a.S("infoService");
       }
       LiveLiteAnchorInfoPresenter v = obj.v;
       if (v == null) {
          a.S("sideBarService");
       }
       LiveLiteAnchorInfoPresenter w = obj.w;
       if (w == null) {
          a.S("followManager");
       }
       LiveLiteAnchorInfoPresenter z = obj.z;
       if (z == null) {
          a.S("logPackageProvider");
       }
       LiveLiteAnchorInfoPresenter c = obj.C;
       if (c == null) {
          a.S("liveLiteAdLogService");
       }
       LiveLiteAnchorInfoPresenter e = obj.E;
       String str = "fansGroupService";
       if (e == null) {
          a.S(str);
       }
       h oh = new h(x, v, w, z, c, e);
       uod.xg(v11);
       obj.c9("LiveLiteAnchorInfoPresenter::initBottomBarAvatarController", new LiveLiteAnchorInfoPresenter$onCreate$1(obj, uod));
       String str1 = "viewControllerManager";
       if (i.a()) {
          a.o(uod, str1);
          if (!PatchProxy.applyVoidOneRefs(uod, obj, liveLiteAnch, "6")) {
             i = obj.x;
             if (i == null) {
                a.S("infoService");
             }
             w1 = obj.w;
             if (w1 == null) {
                a.S("followManager");
             }
             v = obj.N;
             w = obj.z;
             if (w == null) {
                a.S("logPackageProvider");
             }
             z = obj.O;
             c = obj.E;
             if (c == null) {
                a.S(str);
             }
             f uof = new f(i, w1, v, w, z, c, new LiveLiteAnchorInfoPresenter$initAnchorInfoV2Controller$1(obj));
             uod.xg(liveLiteAnch);
          }
       }else {
          a.o(uod, str1);
          if (!PatchProxy.applyVoidOneRefs(uod, obj, liveLiteAnch, "7")) {
             w = obj.x;
             if (w == null) {
                a.S("infoService");
             }
             z = obj.O;
             c = obj.P;
             e = obj.N;
             LiveLiteAnchorInfoPresenter i1 = obj.I;
             if (i1 == null) {
                a.S("liteScatterLoadManager");
             }
             l ol = new l(w, z, c, e, i1);
             uod.xg(oh);
             w1 = obj.x;
             if (w1 == null) {
                a.S("infoService");
             }
             LiveStreamFeed liveStreamFe = w1.j0();
             LiveStreamFeed obj1 = PatchProxy.apply(objArray, obj, liveLiteAnch, "1");
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             }else {
                liveLiteAnch = obj.x;
                if (liveLiteAnch == null) {
                   a.S("infoService");
                }
                obj1 = liveLiteAnch.j0();
                if (obj1 != null) {
                   obj1 = obj1.mLiveLiteElementsSwitch;
                   if (obj1 != null && obj1.mEnableLiteRecommendLabel == null) {
                      b = false;
                   }
                }
                b = true;
             }
             if (b && liveStreamFe != null) {
                LiveStreamFeed mUser = liveStreamFe.mUser;
                LiveStreamFeed mLiveStreamM = liveStreamFe.mLiveStreamModel;
                w = obj.O;
                z = obj.y;
                if (z == null) {
                   a.S("liteEnterService");
                }
                c = obj.z;
                if (c == null) {
                   a.S("logPackageProvider");
                }
                e = obj.B;
                if (e == null) {
                   a.S("gestureService");
                }
                i1 = obj.I;
                if (i1 == null) {
                   a.S("liteScatterLoadManager");
                }
                b uob1 = new b(mUser, mLiveStreamM, liveStreamFe, w, z, c, e, i1);
                uod.xg(b);
             }else {
                b.Z(LiveLiteLogTag.LITE_ANCHOR_INFO, "isEnableRecommendLabel is false");
             }
             i = obj.x;
             if (i == null) {
                a.S("infoService");
             }
             w1 = obj.w;
             if (w1 == null) {
                a.S("followManager");
             }
             v = obj.H;
             if (v == null) {
                a.S("userStatusManager");
             }
             w = obj.G;
             if (w == null) {
                a.S("actionTriggerManager");
             }
             LiveActionTrigger liveActionTr = w.qe();
             w = obj.O;
             z = obj.z;
             if (z == null) {
                a.S("logPackageProvider");
             }
             LiteAnchorInfoFollowController liteAnchorIn = new LiteAnchorInfoFollowController(i, w1, v, liveActionTr, w, z);
             uod.xg(b);
             i = obj.x;
             if (i == null) {
                a.S("infoService");
             }
             w1 = obj.w;
             if (w1 == null) {
                a.S("followManager");
             }
             v = obj.P;
             w = obj.z;
             if (w == null) {
                a.S("logPackageProvider");
             }
             uod.xg(new LiteAnchorInfoShrinkModeFollowController(i, w1, v, w));
          }
       }
       i = obj.I;
       if (i == null) {
          a.S("liteScatterLoadManager");
       }
       LiveLiteAnchorInfoPresenter m = obj.M;
       if (m == null) {
          a.S("logReporterService");
       }
       b uob = new b(i, m.a());
       i = obj.A;
       if (i == null) {
          a.S("viewProviderService");
       }
       i.c(LayoutViewType.AnchorInfoBar, uob);
       obj.O.a.e(new LiveLiteAnchorInfoPresenter$a(uob));
       liveLiteAnch = obj.L;
       if (liveLiteAnch == null) {
          a.S("recommendSideBarService");
       }
       if (liveLiteAnch.C4()) {
          this.d9();
       }else {
          obj.c9("LiveLiteAnchorInfoPresenter::initLiteRecommendAnchorInfoController", new LiveLiteAnchorInfoPresenter$onCreate$3(obj));
       }
       return;
    }
    public void H8(){
       b b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteAnchorInfoPresenter.class, "13")) {
          return;
       }
       LiveLiteAnchorInfoPresenter tJ = this.J;
       if (tJ == null) {
          a.S("watchDurationTriggerController");
       }
       Objects.requireNonNull(tJ);
       if (!PatchProxy.applyVoid(objArray, tJ, b.class, "3")) {
          j.a(tJ.a);
          b = tJ.b;
          LiveActionTrigger$UserAction foregroundWa = LiveActionTrigger$UserAction.ForegroundWatchLite1Sec;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidOneRefs(foregroundWa, b, LiveActionTrigger.class, "2")) {
             a.p(foregroundWa, "action");
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = b.a.iterator();
             while (iterator.hasNext()) {
                Object obj = iterator.next();
                Object obj1 = (obj == foregroundWa)? 1: null;
                if (obj1) {
                   uArrayList.add(obj);
                }
             }
             b.a.removeAll(CollectionsKt___CollectionsKt.G5(uArrayList));
             b.a();
          }
       }
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteAnchorInfoPresenter.class, "3")) {
          return;
       }
       a.p(p0, "provider");
       this.w = p0.a(e.class);
       this.x = p0.a(d.class);
       this.z = p0.a(i.class);
       this.F = p0.a(d.class);
       this.G = p0.a(a.class);
       this.H = p0.a(o.class);
       this.I = p0.a(LiveLiteScatterLoadManager.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteAnchorInfoPresenter.class, "4")) {
          return;
       }
       a.p(p0, "provider");
       this.v = p0.a(e.class);
       this.y = p0.a(b.class);
       this.A = p0.a(n.class);
       this.B = p0.a(LiveLiteGestureService.class);
       this.N = p0.b(a.class);
       this.C = p0.a(a.class);
       this.D = p0.a(LiveLiteBottomBarService.class);
       this.E = p0.a(a.class);
       LiveLiteAnchorInfoPresenter tG = this.G;
       if (tG == null) {
          a.S("actionTriggerManager");
       }
       this.J = new b(tG.qe());
       this.L = p0.a(LiveLiteRecommendSideBarService.class);
       this.M = p0.a(d.class);
       return;
    }
    public void Z8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteAnchorInfoPresenter.class, "2")) {
          return;
       }
       a.p(p0, "register");
       p0.d(LiveLiteAnchorInfoAreaService.class, this.O);
       p0.d(f.class, this.P);
       return;
    }
    public void b9(){
       if (PatchProxy.applyVoid(null, this, LiveLiteAnchorInfoPresenter.class, "12")) {
          return;
       }
       LiveLiteAnchorInfoPresenter tJ = this.J;
       if (tJ == null) {
          a.S("watchDurationTriggerController");
       }
       tJ.a();
       return;
    }
    public final void c9(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteAnchorInfoPresenter.class, "8")) {
          return;
       }
       if (f.h()) {
          LiveLiteAnchorInfoPresenter tI = this.I;
          if (tI == null) {
             a.S("liteScatterLoadManager");
          }
          tI.W1(p0, p1);
       }else {
          p1.invoke();
       }
       return;
    }
    public final void d9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteAnchorInfoPresenter.class, "10")) {
          return;
       }
       LiveLiteAnchorInfoPresenter tL = this.L;
       if (tL == null) {
          a.S("recommendSideBarService");
       }
       LiveLiteAnchorInfoPresenter tP = (!i.a())? this.P: objArray;
       if (i.a()) {
          objArray = new LiveLiteAnchorInfoPresenter$initLiteRecommendAnchorInfoController$1(this);
       }
       LiveLiteAnchorInfoPresenter tx = this.x;
       if (tx == null) {
          a.S("infoService");
       }
       this.K = new LiteRecommendAnchorInfoController(tL, tP, objArray, tx);
       LiveLiteAnchorInfoPresenter tA = this.A;
       if (tA == null) {
          a.S("viewProviderService");
       }
       LayoutViewType recommendAnc = LayoutViewType.RecommendAnchorInfoBar;
       tL = this.K;
       if (tL == null) {
          a.S("recommendAnchorInfoController");
       }
       tA.c(recommendAnc, tL);
       return;
    }
    public void onResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteAnchorInfoPresenter.class, "11")) {
          return;
       }
       LiveLiteAnchorInfoPresenter tJ = this.J;
       if (tJ == null) {
          a.S("watchDurationTriggerController");
       }
       Objects.requireNonNull(tJ);
       if (!PatchProxy.applyVoid(objArray, tJ, b.class, "1")) {
          tJ.a();
          tJ.a = t.interval(1, TimeUnit.SECONDS).observeOn(a.c()).subscribe(new a(tJ));
       }
       return;
    }
}
