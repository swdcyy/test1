package com.kuaishou.live.lite.adapter.component.effect.LiveLiteEffectPresenter;
import py2.a;
import b93.d;
import com.kuaishou.live.lite.adapter.component.effect.LiveLiteEffectPresenter$a;
import nsd.u;
import bg1.a;
import d73.a;
import jz2.a;
import com.kuaishou.live.lite.adapter.component.effect.LiveLiteEffectPresenter$b;
import eg1.c;
import cp1.c;
import tz2.a;
import cp1.c$a;
import sa3.a;
import ta3.a;
import ok.x;
import or5.d;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.effect.resource.download.common.e;
import com.kuaishou.live.lite.adapter.component.effect.LiveLiteEffectPresenter$onCreate$initEngine$1;
import ec3.f;
import msd.a;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import com.kuaishou.live.lite.adapter.component.effect.LiveLiteEffectPresenter$d;
import brd.t;
import vb3.h;
import d73.g;
import sa3.b;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lz2.c;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import c93.b;
import v51.a;
import z1.k;
import xp5.i;
import qr5.b;
import id3.h;
import d93.a;
import vb3.n;
import d93.b;
import h03.a;
import com.kuaishou.live.lite.slide.LiveLiteSlideStatus;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.lite.adapter.component.effect.LiveLiteEffectPresenter$c;
import com.kuaishou.live.effect.engine.LiveEffectEngine;
import iy2.d;
import d73.c;
import ty2.a;
import dz2.a$a;
import fg1.a;
import dz2.a;
import az2.a;
import com.kuaishou.live.effect.resource.download.switc.LiveEffectDownloadSwitchInfo;
import xp5.g;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$MagicFaceConfig;
import java.lang.reflect.Type;
import s81.a;
import rz2.f$a;
import cg1.b;
import rz2.e;
import rz2.f;
import qy2.a;
import mi1.b;
import mi1.b$a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveLiteElementsSwitch;
import dz2.c$a;
import d73.e;
import hz2.a;
import d73.f;
import uy2.a$a;
import d73.d;
import hf3.a;
import androidx.lifecycle.LifecycleOwner;
import jy2.a;
import sz2.c;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAudienceGiftConfig;
import wg3.a;
import ky2.b;
import w51.a;

public final class LiveLiteEffectPresenter extends d implements a	// class@001d84
{
    public b A;
    public d B;
    public h C;
    public k D;
    public n E;
    public LiveLiteScatterLoadManager F;
    public a G;
    public final LiveLiteEffectPresenter$b H;
    public final c I;
    public final a J;
    public a K;
    public final a v;
    public final a w;
    public final a x;
    public a y;
    public i z;
    public static final LiveLiteEffectPresenter$a L;

    static {
       LiveLiteEffectPresenter.L = new LiveLiteEffectPresenter$a(null);
    }
    public void LiveLiteEffectPresenter(){
       super();
       this.v = new a();
       this.w = new a();
       this.x = new a();
       this.H = new LiveLiteEffectPresenter$b(this);
       this.I = new c();
       this.J = c.a.a();
       this.K = new a(null, null, 3, null);
    }
    public static final d c9(LiveLiteEffectPresenter p0){
       p0 = p0.B;
       if (p0 == null) {
          a.S("audienceInfoManager");
       }
       return p0;
    }
    public void F8(){
       LiveLiteEffectPresenter tF;
       LiveLiteEffectPresenter liveLiteEffe = LiveLiteEffectPresenter.class;
       if (PatchProxy.applyVoid(null, this, liveLiteEffe, "4")) {
          return;
       }
       super.F8();
       e.b().lh(this.J);
       LiveLiteEffectPresenter$onCreate$initEngine$1 oonCreate$in = new LiveLiteEffectPresenter$onCreate$initEngine$1(this);
       if (f.h()) {
          tF = this.F;
          if (tF == null) {
             a.S("liveTaskQueue");
          }
          tF.W1("LiveLiteEffectPresenter::initEffectEngine", oonCreate$in);
       }else {
          oonCreate$in.invoke();
       }
       this.K.o = new LiveLiteEffectPresenter$d(this);
       LiveLiteEffectPresenter tC = this.C;
       if (tC == null) {
          a.S("playerLocationService");
       }
       tF = this.K;
       if (!PatchProxy.applyVoidTwoRefs(tC, tF, this, liveLiteEffe, "10")) {
          this.X7(tC.a().subscribe(new g(tF)));
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteEffectPresenter.class, "5")) {
          return;
       }
       this.H.g1(this.v);
       this.H.g1(this.w);
       this.H.b(this);
       return;
    }
    public boolean L3(LiveCommonEffectInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteEffectPresenter.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "commonEffectInfo");
       return p0.streamMerge;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEffectPresenter.class, "2")) {
          return;
       }
       a.p(p0, "provider");
       Object obj = p0.c(a.class).get();
       a.o(obj, "provider.lazyGet\(LiveLon¡­anager::class.java\).get\(\)");
       this.y = obj;
       obj = p0.c(i.class).get();
       a.o(obj, "provider.lazyGet\(LiveLog¡­ovider::class.java\).get\(\)");
       this.z = obj;
       obj = p0.c(b.class).get();
       a.o(obj, "provider.lazyGet\(LiveAud¡­Reader::class.java\).get\(\)");
       this.A = obj;
       obj = p0.c(d.class).get();
       a.o(obj, "provider.lazyGet\(LiveAud¡­anager::class.java\).get\(\)");
       this.B = obj;
       obj = p0.c(LiveLiteScatterLoadManager.class).get();
       a.o(obj, "provider.lazyGet\(LiveLit¡­anager::class.java\).get\(\)");
       this.F = obj;
       this.D = p0.c(h.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEffectPresenter.class, "3")) {
          return;
       }
       a.p(p0, "provider");
       this.C = p0.a(h.class);
       this.E = p0.a(n.class);
       return;
    }
    public void Z8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEffectPresenter.class, "1")) {
          return;
       }
       a.p(p0, "register");
       p0.d(a.class, this.H);
       p0.d(b.class, this.K);
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, LiveLiteEffectPresenter.class, "6")) {
          return;
       }
       this.H.j1((long)2048);
       return;
    }
    public void b9(){
       if (PatchProxy.applyVoid(null, this, LiveLiteEffectPresenter.class, "7")) {
          return;
       }
       int i = 2048;
       if (f.i()) {
          LiveLiteEffectPresenter tD = this.D;
          if (tD == null) {
             a.S("liveLiteSlideManager");
          }
          if (tD.get().b() != LiveLiteSlideStatus.DID_DISAPPEAR) {
             this.H.S0((long)i);
          }
       }else {
          this.H.S0((long)i);
       }
       return;
    }
    public final void d9(n p0,a p1,i p2,b p3,d p4){
       LiveLiteEffectPresenter$c uoc2;
       a uoa1;
       a obj2;
       a obj3;
       a uoa3;
       boolean b;
       boolean b1;
       a uoa = this;
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       int i = 0;
       int i1 = 1;
       if (PatchProxy.isSupport(LiveLiteEffectPresenter.class)) {
          Object[] objArray = new Object[]{oobject,p1,oobject1,p3,oobject2};
          if (PatchProxy.applyVoid(objArray, uoa, LiveLiteEffectPresenter.class, "8")) {
             return;
          }
       }
       if (!a.t().u("SOURCE_LIVE").d("enableLiteEffectEngine", i1)) {
          return;
       }else {
          LiveLiteEffectPresenter$c uoc = new LiveLiteEffectPresenter$c(oobject);
          c uoc1 = PatchProxy.apply(null, uoa, LiveLiteEffectPresenter.class, "12");
          if (uoc1 != patchProxyRe) {
          }else {
             uoc1 = new c();
          }
          Object obj = uoc1;
          LiveLiteEffectPresenter x = uoa.x;
          e obj1 = PatchProxy.applyOneRefs(oobject2, uoa, LiveLiteEffectPresenter.class, "16");
          if (obj1 != patchProxyRe) {
             uoc2 = uoc;
             uoa1 = obj1;
          }else {
             a$a uoa4 = new a$a();
             uoa4.a = a.d();
             uoa4.b = a.g();
             obj3 = PatchProxy.apply(null, uoa4, a$a.class, "2");
             if (obj3 != patchProxyRe) {
             }else {
                obj3 = new a(uoa4);
             }
             a uoa5 = new a(500, obj3);
             LiveEffectDownloadSwitchInfo liveEffectDo = PatchProxy.applyOneRefs(oobject2, uoa, LiveLiteEffectPresenter.class, "17");
             if (liveEffectDo != patchProxyRe) {
             }else {
                liveEffectDo = LiveEffectDownloadSwitchInfo.DEFAULT;
                if (!p4.e()) {
                   liveEffectDo = uoa.I.a(p4.getLiveStreamId());
                }
                a.o(liveEffectDo, "switchInfo");
             }
             LiveCommonConfigResponse$MagicFaceConfig magicFaceCon = a.x(LiveCommonConfigResponse$MagicFaceConfig.class);
             f$a uoa6 = new f$a();
             uoc2 = uoc;
             uoa6.e((long)magicFaceCon.surviveTimeoutMs);
             uoa6.c(magicFaceCon.maxSurvivePoolSize);
             uoa6.b(liveEffectDo.enableSurviveEffectTaskWhenDequeue);
             uoa6.d(b.b());
             f uof1 = uoa6.a();
             b = true;
             obj2 = new a(b.a.a(), b);
             liveEffectDo = liveEffectDo.enableFetchResourceWhenEnqueue;
             a.o(uof1, "surviveConfig");
             LiveStreamFeed liveStreamFe = p4.j0();
             if (liveStreamFe != null) {
                liveStreamFe = liveStreamFe.mLiveLiteElementsSwitch;
                if (liveStreamFe != null && liveStreamFe.mEnableGuestGiftEffect == b) {
                   b1 = false;
                label_0107 :
                   uoa3 = new a(liveEffectDo, uoa5, uof1, b1, obj2);
                }
             }
             b1 = true;
             goto label_0107 ;
          }
          obj1 = PatchProxy.applyOneRefs(oobject2, uoa, LiveLiteEffectPresenter.class, "13");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = new e(uoa, oobject2);
          }
          obj2 = obj1;
          f uof = PatchProxy.apply(null, uoa, LiveLiteEffectPresenter.class, "14");
          if (uof != patchProxyRe) {
          }else {
             uof = new f();
          }
          obj3 = uof;
          d uod = PatchProxy.applyOneRefs(oobject1, uoa, LiveLiteEffectPresenter.class, "15");
          if (uod != patchProxyRe) {
          }else {
             uod = new d(oobject1);
          }
          e uoe = e.b();
          a.o(uoe, "LiveEffectResourceLoader.getInstance\(\)");
          a uoa2 = p1.u();
          a.o(uoa2, "longConnectManager.liveLongConnection");
          uoa3 = uoa2;
          e uoe1 = uoe;
          LiveEffectEngine liveEffectEn = new LiveEffectEngine(this, obj, x, uoa1, uoc2, obj2, obj3, uoe1, uod, uoa3, p3);
          uoa.G = v14;
          if (!PatchProxy.applyVoid(null, uoa, LiveLiteEffectPresenter.class, "9")) {
             LiveConfigStartupResponse$LiveAudienceGiftConfig liveAudience = a.s(LiveConfigStartupResponse$LiveAudienceGiftConfig.class);
             if (liveAudience != null) {
                uoa.x.c("LiveLiteEffectPresenter LiveAudienceGiftConfig", Boolean.valueOf(liveAudience.mDisableGiftEffect));
             }
             if (a.E()) {
                uoa.x.c("LiveLiteEffectPresenter LiveTestConfig.CloseGiftEffect", Boolean.TRUE);
             }
          }
          uoa.H.B0(uoa.v);
          uoa.H.B0(uoa.w);
          uoa.H.a(uoa);
          return;
       }
    }
}
