package com.kuaishou.live.lite.player.biz.LiveLiteBizPlayerPresenter;
import b93.d;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kuaishou.live.lite.player.biz.LiveLiteBizPlayerPresenter$a;
import com.kuaishou.live.lite.player.biz.LiveLiteBizPlayerPresenter$b;
import qc3.c;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.video.waynelive.LivePlayerController;
import z1.k;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import e93.a;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import or5.b;
import ga1.e;
import oc3.a;
import rc3.a;
import rc3.d;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController;
import v51.a;
import hf3.a;
import mq5.b;
import e93.d;
import t91.a;
import xp5.i;
import rd3.b;
import e93.e;
import id3.h;
import sj3.l;
import e93.c;
import e93.b;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import rc3.c;
import jc3.b;
import eq3.d;
import com.kuaishou.live.viewcontroller.ViewController;
import ec3.f;
import com.kuaishou.live.lite.player.biz.LiveLiteBizPlayerPresenter$initComponent$2;
import msd.a;
import oc3.b;
import java.lang.Runnable;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import c93.b;
import s91.g;
import d93.a;
import vb3.n;
import d93.b;
import mq5.f;
import ga1.d;
import qc3.d;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteBizPlayerPresenter extends d	// class@000a83
{
    public k A;
    public k B;
    public k C;
    public c D;
    public e E;
    public h F;
    public b G;
    public l H;
    public k I;
    public LiveLiteScatterLoadManager J;
    public b K;
    public k L;
    public k M;
    public c N;
    public LiveLitePlayerPlayController O;
    public c P;
    public LivePlayerController Q;
    public final CopyOnWriteArrayList R;
    public final LiveLiteBizPlayerPresenter$a S;
    public final LiveLiteBizPlayerPresenter$b T;
    public LiveStreamFeedWrapper v;
    public n w;
    public d x;
    public k y;
    public k z;

    public void LiveLiteBizPlayerPresenter(){
       super();
       this.R = new CopyOnWriteArrayList();
       this.S = new LiveLiteBizPlayerPresenter$a(this);
       this.T = new LiveLiteBizPlayerPresenter$b(this);
    }
    public static final c c9(LiveLiteBizPlayerPresenter p0){
       p0 = p0.P;
       if (p0 == null) {
          a.S("liveLiteAudioConflictController");
       }
       return p0;
    }
    public static final LivePlayerController d9(LiveLiteBizPlayerPresenter p0){
       p0 = p0.Q;
       if (p0 == null) {
          a.S("livePlayerController");
       }
       return p0;
    }
    public static final k e9(LiveLiteBizPlayerPresenter p0){
       p0 = p0.C;
       if (p0 == null) {
          a.S("mLiveAudienceEndManager");
       }
       return p0;
    }
    public void F8(){
       LiveStreamFeedWrapper liveStreamFe = this;
       LiveLiteBizPlayerPresenter liveLiteBizP = LiveLiteBizPlayerPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, liveStreamFe, liveLiteBizP, "5")) {
          return;
       }
       super.F8();
       LiveLiteBizPlayerPresenter y = liveStreamFe.y;
       String str = "liveLiteAudienceInfoManager";
       if (y == null) {
          a.S(str);
       }
       LiveStreamFeedWrapper obj = y.get();
       String str1 = "liveLiteAudienceInfoManager.get\(\)";
       a.o(obj, str1);
       obj = obj.r5();
       a.o(obj, "liveLiteAudienceInfoMana¡­t\(\).liveStreamFeedWrapper");
       liveStreamFe.v = obj;
       y = liveStreamFe.x;
       String str2 = "liveLitePlayerService";
       if (y == null) {
          a.S(str2);
       }
       LivePlayerController livePlayerCo = y.Vc();
       a.o(livePlayerCo, "liveLitePlayerService.livePlayerController");
       liveStreamFe.Q = livePlayerCo;
       if (!PatchProxy.applyVoid(objArray, liveStreamFe, liveLiteBizP, "6")) {
          liveLiteBizP = liveStreamFe.x;
          if (liveLiteBizP == null) {
             a.S(str2);
          }
          liveLiteBizP.Fk(new a(liveStreamFe));
          LiveLiteBizPlayerPresenter q = liveStreamFe.Q;
          if (q == null) {
             a.S("livePlayerController");
          }
          LiveLiteBizPlayerPresenter v = liveStreamFe.v;
          if (v == null) {
             a.S("liveStreamFeedWrapper");
          }
          y = liveStreamFe.y;
          if (y == null) {
             a.S(str);
          }
          Object obj1 = y.get();
          a.o(obj1, str1);
          Object obj2 = obj1;
          y = liveStreamFe.A;
          if (y == null) {
             a.S("liveLongConnectManager");
          }
          obj1 = y.get();
          a.o(obj1, "liveLongConnectManager.get\(\)");
          a uoa = obj1.u();
          a.o(uoa, "liveLongConnectManager.get\(\).liveLongConnection");
          y = liveStreamFe.C;
          if (y == null) {
             a.S("mLiveAudienceEndManager");
          }
          obj1 = y.get();
          a.o(obj1, "mLiveAudienceEndManager.get\(\)");
          Object obj3 = obj1;
          LiveLiteBizPlayerPresenter x = liveStreamFe.x;
          if (x == null) {
             a.S(str2);
          }
          y = liveStreamFe.B;
          if (y != null) {
             objArray = y.get();
          }
          Object[] objArray1 = objArray;
          LiveLiteBizPlayerPresenter e = liveStreamFe.E;
          if (e == null) {
             a.S("liveLiteSlidingPanelService");
          }
          LiveLiteBizPlayerPresenter f = liveStreamFe.F;
          if (f == null) {
             a.S("mLiveLiteSlideManager");
          }
          y = liveStreamFe.H;
          if (y == null) {
             a.S("livePlayerReconnectService");
          }
          LiveLiteBizPlayerPresenter i = liveStreamFe.I;
          if (i == null) {
             a.S("liveExceptionInfoManager");
          }
          Object obj4 = i.get();
          a.o(obj4, "liveExceptionInfoManager.get\(\)");
          Object obj5 = obj4;
          i = liveStreamFe.z;
          if (i == null) {
             a.S("mLiveServerExceptionManager");
          }
          LiveLiteBizPlayerPresenter d = liveStreamFe.D;
          if (d == null) {
             a.S("liveLiteFragmentService");
          }
          LiveLiteBizPlayerPresenter g = liveStreamFe.G;
          if (g == null) {
             a.S("liveLiteEnterService");
          }
          LiveLiteBizPlayerPresenter j = liveStreamFe.J;
          if (j == null) {
             a.S("mLiveLiteScatterLoadManager");
          }
          LiveLiteBizPlayerPresenter liveLiteBizP1 = g;
          g = liveStreamFe.N;
          if (g == null) {
             a.S("prePlayService");
          }
          LiveLiteBizPlayerPresenter liveLiteBizP2 = g;
          g = liveStreamFe.J;
          if (g == null) {
             a.S("mLiveLiteScatterLoadManager");
          }
          LiveLiteBizPlayerPresenter liveLiteBizP3 = j;
          j = liveStreamFe.L;
          if (j == null) {
             a.S("liveLogPackageProvider");
          }
          LiveLitePlayerPlayController obj6 = j.get();
          LiveLiteBizPlayerPresenter liveLiteBizP4 = g;
          a.o(obj6, "liveLogPackageProvider.get\(\)");
          Object obj7 = obj6;
          g = liveStreamFe.K;
          if (g == null) {
             a.S("playConfigManager");
          }
          j = liveStreamFe.M;
          if (j == null) {
             a.S("liteApiTrafficManager");
          }
          obj6 = j.get();
          a.o(obj6, "liteApiTrafficManager.get\(\)");
          Object obj8 = obj6;
          obj6 = new LiveLitePlayerPlayController(q, v, obj2, uoa, obj3, x, objArray1, e, f, y, obj5, i, d, liveLiteBizP1, liveLiteBizP3, liveLiteBizP2, liveLiteBizP4, obj7, g, obj8);
          LiveLiteBizPlayerPresenter liveLiteBizP5 = this;
          liveLiteBizP5.O = liveLiteBizP;
          f = liveLiteBizP5.O;
          a.m(f);
          this.P8().xg(f);
          if (f.h()) {
             liveLiteBizP = liveLiteBizP5.J;
             if (liveLiteBizP == null) {
                a.S("mLiveLiteScatterLoadManager");
             }
             liveLiteBizP.W1("AudioConflictController", new LiveLiteBizPlayerPresenter$initComponent$2(liveLiteBizP5));
          }else {
             liveLiteBizP = liveLiteBizP5.J;
             if (liveLiteBizP == null) {
                a.S("mLiveLiteScatterLoadManager");
             }
             liveLiteBizP5.X7(liveLiteBizP.ca(new b(liveLiteBizP5)));
          }
       }
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBizPlayerPresenter.class, "3")) {
          return;
       }
       a.p(p0, "provider");
       this.K = p0.a(b.class);
       this.y = p0.c(a.class);
       this.A = p0.c(a.class);
       this.C = p0.c(b.class);
       this.I = p0.c(a.class);
       this.L = p0.c(i.class);
       this.z = p0.c(g.class);
       this.J = p0.a(LiveLiteScatterLoadManager.class);
       this.B = p0.d(d.class);
       this.F = p0.a(h.class);
       this.M = p0.c(b.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBizPlayerPresenter.class, "4")) {
          return;
       }
       a.p(p0, "provider");
       this.x = p0.a(d.class);
       this.w = p0.a(n.class);
       this.D = p0.a(c.class);
       this.E = p0.a(e.class);
       this.G = p0.a(b.class);
       this.H = p0.a(l.class);
       this.N = p0.a(c.class);
       return;
    }
    public void Z8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBizPlayerPresenter.class, "2")) {
          return;
       }
       a.p(p0, "register");
       p0.d(f.class, this.S);
       p0.d(d.class, this.T);
       return;
    }
    public final d h9(){
       Object[] objArray = null;
       LiveLiteBizPlayerPresenter obj = PatchProxy.apply(objArray, this, LiveLiteBizPlayerPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.O;
       if (obj != null) {
          objArray = obj.w;
       }
       return objArray;
    }
}
