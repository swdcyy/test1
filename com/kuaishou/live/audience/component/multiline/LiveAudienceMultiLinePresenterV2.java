package com.kuaishou.live.audience.component.multiline.LiveAudienceMultiLinePresenterV2;
import c12.k;
import com.kuaishou.live.audience.component.multiline.LiveAudienceMultiLinePresenterV2$c;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.audience.component.multiline.LiveAudienceMultiLinePresenterV2$b;
import com.kuaishou.live.audience.component.multiline.LiveAudienceMultiLinePresenterV2$a;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.audience.component.multiline.LiveAudienceMultiLinePresenterV2$d;
import com.kuaishou.live.audience.component.multiline.LiveAudienceMultiLinePresenterV2$audienceUiPositionManagerLazy$1;
import msd.a;
import qrd.p;
import qrd.s;
import t02.a0;
import lp3.i;
import l02.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import mq5.h;
import mq5.b;
import g21.a;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.common.core.basic.livepresenter.LiveVCHostPresenter;
import f21.e;
import x61.c;
import f21.f;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import java.util.Objects;
import f21.b;
import f21.d;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveGuideGiftAnimationView;
import crd.b;
import lnc.b9;
import aq5.d;
import lp3.c;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import ekd.m1;
import android.view.ViewGroup;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kq5.b;
import hg2.e;
import om1.a;
import xp5.g;
import sz1.e;
import v51.a;
import n91.f;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import brd.t;
import ry1.b;
import e21.b;
import sfc.a;
import erd.g;
import android.content.Context;
import android.app.Activity;
import ok.x;
import mrd.c;
import z61.b;
import f21.b$c;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveGuideGiftAnimationView$b;
import java.lang.Runnable;
import f21.g;
import f21.b$d;
import android.view.View$OnClickListener;
import qrd.l1;
import hf3.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController;
import i81.g;
import xp5.i;
import jk1.f;
import gq1.o;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import sq1.a;

public final class LiveAudienceMultiLinePresenterV2 extends k	// class@000bb3
{
    public i N;
    public a0 O;
    public b P;
    public e Q;
    public b R;
    public j S;
    public f T;
    public a U;
    public final MutableLiveData U0;
    public e V;
    public LiveGiftGuideConfig V0;
    public g W;
    public String W0;
    public a X;
    public x X0;
    public e Y;
    public Gift Y0;
    public final h Z;
    public final x Z0;
    public final PublishSubject a1;
    public b b1;
    public b c1;
    public e d1;
    public LiveAudienceMultiLineEntryController e1;
    public ViewGroup f1;
    public View g1;
    public final LiveAudienceMultiLinePresenterV2$d h1;
    public final p i1;
    public final p j1;

    public void LiveAudienceMultiLinePresenterV2(){
       super();
       this.Z = new LiveAudienceMultiLinePresenterV2$c(this);
       this.U0 = new MutableLiveData();
       this.X0 = new LiveAudienceMultiLinePresenterV2$b(this);
       this.Z0 = new LiveAudienceMultiLinePresenterV2$a(this);
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Li¡­nceGiftGuideSendResult>\(\)");
       this.a1 = publishSubje;
       this.h1 = new LiveAudienceMultiLinePresenterV2$d(this);
       p op = s.c(new LiveAudienceMultiLinePresenterV2$audienceUiPositionManagerLazy$1(this));
       this.i1 = op;
       this.j1 = op;
    }
    public static final a0 Y8(LiveAudienceMultiLinePresenterV2 p0){
       p0 = p0.O;
       if (p0 == null) {
          a.S("livePlayCallerContext");
       }
       return p0;
    }
    public static final i Z8(LiveAudienceMultiLinePresenterV2 p0){
       p0 = p0.N;
       if (p0 == null) {
          a.S("serviceManager");
       }
       return p0;
    }
    public static final e a9(LiveAudienceMultiLinePresenterV2 p0){
       p0 = p0.V;
       if (p0 == null) {
          a.S("userTagService");
       }
       return p0;
    }
    public void Q(boolean p0){
       b b;
       LiveAudienceMultiLinePresenterV2 liveAudience = LiveAudienceMultiLinePresenterV2.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "5")) {
          return;
       }
       LiveAudienceMultiLinePresenterV2 tP = this.P;
       a.m(tP);
       tP.le(this.Z);
       this.b9();
       if (this.i1.isInitialized()) {
          this.c9().b();
       }
       tP = this.e1;
       if (tP == null) {
          a.S("liveAudienceMultiLineEntryController");
       }
       this.o1(tP);
       tP = this.d1;
       if (tP != null && !PatchProxy.applyVoid(null, tP, e.class, "2")) {
          tP.d.O0(1046);
          tP.a();
          e c = tP.c;
          if (c != null) {
             f uof = f.class;
             if (!PatchProxy.applyVoid(null, c, uof, "3")) {
                c.d = 1;
                x.E(c.e);
                if (!PatchProxy.applyVoid(null, c, uof, "12")) {
                   f s = c.s;
                   Objects.requireNonNull(s);
                   if (!PatchProxy.applyVoid(null, s, b.class, "7")) {
                      b = s.b;
                      if (b != null && !PatchProxy.applyVoid(null, b, d.class, "12")) {
                         d o = b.o;
                         if (o == null) {
                            a.S("giftAnimationView");
                         }
                         o.a();
                      }
                   }
                }
             }
          }
       }
       b9.a(this.b1);
       b9.a(this.c1);
       return;
    }
    public final void b9(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiLinePresenterV2.class, "13")) {
          return;
       }
       LiveAudienceMultiLinePresenterV2 tN = this.N;
       if (tN == null) {
          a.S("serviceManager");
       }
       tN.a(d.class).yj(AudienceBizRelation.LIVE_MULTI_LINE);
       return;
    }
    public final a c9(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiLinePresenterV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j1.getValue();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLinePresenterV2.class, "3")) {
          return;
       }
       View view = m1.f(p0, R.id.live_multi_line_container_layout);
       a.o(view, "bindWidget\(rootView, R.i¡­ti_line_container_layout\)");
       this.f1 = view;
       p0 = m1.f(p0, R.id.live_multi_interact_container_background);
       a.o(p0, "bindWidget\(rootView, R.i¡­act_container_background\)");
       this.g1 = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiLinePresenterV2.class, "2")) {
          return;
       }
       super.j8();
       Object obj = this.r8("LIVE_SERVICE_MANAGER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_SERVICE_MANAGER\)");
       this.N = obj;
       obj = this.q8(a0.class);
       a.o(obj, "inject\(LivePlayCallerContext::class.java\)");
       this.O = obj;
       this.P = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.R = this.r8("FRAGMENT_LIFE_CYCLE_SERVICE");
       obj = this.r8("LIVE_AUDIENCE_SEND_GIFT_REAL_ACTION_SERVICE");
       a.o(obj, "inject\(LiveAccessIds.LIV¡­GIFT_REAL_ACTION_SERVICE\)");
       this.Y = obj;
       return;
    }
    public void x(boolean p0){
       boolean b;
       LiveAudienceMultiLinePresenterV2 u;
       LiveAudienceMultiLinePresenterV2 e1;
       LiveAudienceMultiLinePresenterV2 o;
       f g;
       e a;
       e uoe = this;
       a uoa = a.class;
       g og = g.class;
       LiveAudienceMultiLinePresenterV2 liveAudience = LiveAudienceMultiLinePresenterV2.class;
       String str = "4";
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uoe, liveAudience, str)) {
          return;
       }
       LiveAudienceMultiLinePresenterV2 n = uoe.N;
       if (n == null) {
          a.S("serviceManager");
       }
       c uoc = n.a(e.class);
       a.o(uoc, "serviceManager.getServic¡­eractManager::class.java\)");
       uoe.Q = uoc;
       n = uoe.N;
       if (n == null) {
          a.S("serviceManager");
       }
       uoc = n.a(a.class);
       a.o(uoc, "serviceManager.getServic¡­nnectManager::class.java\)");
       uoe.U = uoc;
       n = uoe.N;
       if (n == null) {
          a.S("serviceManager");
       }
       uoc = n.a(e.class);
       a.o(uoc, "serviceManager.getServic¡­erTagService::class.java\)");
       uoe.V = uoc;
       n = uoe.N;
       if (n == null) {
          a.S("serviceManager");
       }
       uoc = n.a(og);
       String str1 = "serviceManager.getServic¡­eInfoManager::class.java\)";
       a.o(uoc, str1);
       uoe.W = uoc;
       n = uoe.O;
       String str2 = "livePlayCallerContext";
       if (n == null) {
          a.S(str2);
       }
       uoe.S = n.f2;
       n = uoe.N;
       if (n == null) {
          a.S("serviceManager");
       }
       uoc = n.a(f.class);
       a.o(uoc, "serviceManager.getServic¡­TimeProvider::class.java\)");
       uoe.T = uoc;
       n = uoe.N;
       if (n == null) {
          a.S("serviceManager");
       }
       uoc = n.a(uoa);
       String str3 = "serviceManager.getServic¡­TraceService::class.java\)";
       a.o(uoc, str3);
       uoe.X = uoc;
       Object[] objArray = null;
       LiveAudienceMultiLinePresenterV2 obj = PatchProxy.apply(objArray, uoe, liveAudience, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          boolean b1 = true;
          b = a.t().u("SOURCE_LIVE").d("disableGiftBattleAttachGiftEntry", b1) ^ b1;
       }
       if (b) {
          if (!PatchProxy.applyVoid(objArray, uoe, liveAudience, "7")) {
             obj = uoe.O;
             if (obj == null) {
                a.S(str2);
             }
             a0 b3 = obj.b3;
             a.o(b3, "livePlayCallerContext.mL¡­dienceStatusObtainService");
             uoe.b1 = b3.W().subscribe(new b(uoe), new a());
          }
          if (!PatchProxy.applyVoid(objArray, uoe, liveAudience, "10")) {
             obj = uoe.N;
             if (obj == null) {
                a.S("serviceManager");
             }
             c uoc7 = obj.a(c.class);
             a.o(uoc7, "serviceManager.getServic¡­omBarService::class.java\)");
             c uoc8 = uoc7;
             Context context = this.getContext();
             Activity activity = this.getActivity();
             o = uoe.O;
             if (o == null) {
                a.S(str2);
             }
             LiveAudienceMultiLinePresenterV2 x0 = uoe.X0;
             LiveAudienceMultiLinePresenterV2 z0 = uoe.Z0;
             obj = uoe.a1;
             n = uoe.Y;
             if (n == null) {
                a.S("liveAudienceSendGiftRealActionService");
             }
             String str4 = str;
             LiveAudienceMultiLinePresenterV2 n1 = uoe.N;
             if (n1 == null) {
                a.S("serviceManager");
             }
             LiveAudienceMultiLinePresenterV2 liveAudience2 = obj;
             obj = uoe.N;
             if (obj == null) {
                a.S("serviceManager");
             }
             c uoc9 = obj.a(uoa);
             a.o(uoc9, str3);
             c uoc10 = uoc9;
             u = uoe.N;
             if (u == null) {
                a.S("serviceManager");
             }
             uoc9 = u.a(og);
             a.o(uoc9, str1);
             c uoc11 = uoc9;
             e uoe1 = new e(uoc8, context, activity, o, x0, z0, liveAudience2, n, n1, uoc10, uoc11);
             e uoe2 = e.class;
             objArray = null;
             if (!PatchProxy.applyVoid(objArray, liveAudience, uoe2, "1")) {
                if (!PatchProxy.applyVoid(objArray, liveAudience, uoe2, "3")) {
                   a = liveAudience.a;
                   a.mFeatureId = 1046;
                   a.mIsVisible = Boolean.FALSE;
                   liveAudience.b.setValue(a);
                   liveAudience.d.v1(liveAudience.b);
                }
                if (!PatchProxy.applyVoid(null, liveAudience, uoe2, str4)) {
                   f uof = new f(liveAudience.e, liveAudience.f, liveAudience.g, liveAudience.h, liveAudience.i, liveAudience.j, liveAudience.k, liveAudience.l, liveAudience.m, liveAudience.n, liveAudience.a);
                   f uof1 = f.class;
                   Object[] objArray1 = null;
                   if (!PatchProxy.applyVoid(objArray1, uoe2, uof1, "2")) {
                      b uob = b.class;
                      if (!PatchProxy.applyVoid(objArray1, uoe2, uof1, "11")) {
                         uof1 = uoe2.s;
                         g = uoe2.g;
                         Objects.requireNonNull(uof1);
                         if (!PatchProxy.applyVoidOneRefs(g, uof1, uob, "8")) {
                            uof1.a(new b$c(uof1, g));
                         }
                         uof1 = uoe2.s;
                         g og1 = new g(uoe2);
                         Objects.requireNonNull(uof1);
                         if (!PatchProxy.applyVoidOneRefs(og1, uof1, uob, "9")) {
                            uof1.a(new b$d(uof1, og1));
                         }
                      }
                   }
                   liveAudience.c = uoe2;
                }
             }
             uoe.d1 = liveAudience;
          }
       }
       obj = uoe.Q;
       if (obj == null) {
          a.S("liveMultiInteractManager");
       }
       u = uoe.U;
       if (u == null) {
          a.S("longConnectionManager");
       }
       a uoa1 = u.u();
       a.o(uoa1, "longConnectionManager.liveLongConnection");
       LiveAudienceMultiLinePresenterV2 h1 = uoe.h1;
       if (!PatchProxy.applyVoidThreeRefs(obj, uoa1, h1, this, LiveAudienceMultiLinePresenterV2.class, "11")) {
          LiveAudienceMultiLinePresenterV2 w = uoe.W;
          if (w == null) {
             a.S("infoManager");
          }
          e1 = uoe.N;
          if (e1 == null) {
             a.S("serviceManager");
          }
          c uoc1 = e1.a(g.class);
          a.o(uoc1, "serviceManager.getServic¡­nagerService::class.java\)");
          c uoc2 = uoc1;
          e1 = uoe.N;
          if (e1 == null) {
             a.S("serviceManager");
          }
          uoc1 = e1.a(i.class);
          a.o(uoc1, "serviceManager.getServic¡­kageProvider::class.java\)");
          c uoc3 = uoc1;
          e1 = uoe.N;
          if (e1 == null) {
             a.S("serviceManager");
          }
          uoc1 = e1.a(f.class);
          a.o(uoc1, "serviceManager.getServic¡­ftBoxService::class.java\)");
          c uoc4 = uoc1;
          e1 = uoe.N;
          if (e1 == null) {
             a.S("serviceManager");
          }
          uoc1 = e1.a(o.class);
          a.o(uoc1, "serviceManager.getServic¡­ineServiceV2::class.java\)");
          c uoc5 = uoc1;
          e1 = uoe.N;
          if (e1 == null) {
             a.S("serviceManager");
          }
          uoc1 = e1.a(b.class);
          a.o(uoc1, "serviceManager.getServic¡­ceEndManager::class.java\)");
          c uoc6 = uoc1;
          e1 = uoe.N;
          if (e1 == null) {
             a.S("serviceManager");
          }
          uoc1 = e1.a(LiveSlidePlayService.class);
          a.o(uoc1, "serviceManager.getServic¡­ePlayService::class.java\)");
          LiveAudienceMultiLineEntryController liveAudience1 = new LiveAudienceMultiLineEntryController(w, obj, uoa1, uoc2, h1, uoc3, uoc4, uoc5, uoc6, uoc1);
          uoe.e1 = u;
       }
       u = uoe.f1;
       if (u == null) {
          a.S("multiLineContainer");
       }
       e1 = uoe.e1;
       if (e1 == null) {
          a.S("liveAudienceMultiLineEntryController");
       }
       uoe.E2(u, e1);
       u = uoe.P;
       a.m(u);
       u.Km(uoe.Z);
       return;
    }
}
