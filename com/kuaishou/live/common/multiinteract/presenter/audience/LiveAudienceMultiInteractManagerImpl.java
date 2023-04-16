package com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl;
import sz1.m;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl$mDependenceProvider$1;
import crd.a;
import com.kwai.framework.activitycontext.ActivityContext;
import ee3.g$b$b;
import ee3.g$b$a;
import mrd.a;
import com.kuaishou.live.common.core.component.livestage.a;
import com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl$mLiveStageCamera$1;
import msd.l;
import com.kuaishou.live.common.core.component.livestage.a$a;
import com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl$c;
import com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl$f;
import com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl$g;
import com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl$b;
import com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl$d;
import com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl$e;
import com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl$a;
import ga1.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lp3.e;
import lp3.a;
import o91.c;
import lp3.c;
import sa1.b;
import rp5.a;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import xq5.c;
import mq5.b;
import mq5.h;
import lh3.b;
import xg3.a;
import com.kuaishou.live.multiinteract.rtc.b;
import lh3.i0;
import com.kwai.video.waynelive.LivePlayerController;
import com.kwai.video.waynelive.listeners.LivePlayerTypeChangeListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import lz1.g;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$LayoutConfig;
import sa1.b$a;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSeiInfoListener;
import lnc.u1;
import sz1.a;
import gh3.a;
import com.kwai.robust.PatchProxyResult;
import wz1.b;
import com.kuaishou.live.common.core.basic.heartbeat.b;
import y91.e;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import m56.f;
import m56.g;

public final class LiveAudienceMultiInteractManagerImpl extends m	// class@0017fd
{
    public e A;
    public a B;
    public LiveSlidePlayService C;
    public b D;
    public LivePlayerController E;
    public b F;
    public final a G;
    public final a H;
    public final a I;
    public final LiveAudienceMultiInteractManagerImpl$c J;
    public a K;
    public final c L;
    public final h M;
    public final i0 N;
    public final IKwaiMediaPlayer$OnLiveSeiInfoListener O;
    public final LiveAudienceMultiInteractManagerImpl$e P;
    public final LivePlayerTypeChangeListener Q;
    public final a R;
    public b y;
    public c z;

    public void LiveAudienceMultiInteractManagerImpl(a p0){
       g$b$b a;
       a.p(p0, "renderAreaSupplier");
       super();
       this.R = p0;
       this.y = new LiveAudienceMultiInteractManagerImpl$mDependenceProvider$1(this);
       this.G = new a();
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       a = (uActivityCon.h())? g$b$b.a: g$b$a.a;
       a = a.h(a);
       a.o(a, "BehaviorSubject.createDe¡­eStatus.AppBackground\n  \)");
       this.H = a;
       this.I = a.d.b(new LiveAudienceMultiInteractManagerImpl$mLiveStageCamera$1(this));
       this.J = new LiveAudienceMultiInteractManagerImpl$c(this);
       this.L = new LiveAudienceMultiInteractManagerImpl$f(this);
       this.M = new LiveAudienceMultiInteractManagerImpl$g(this);
       this.N = new LiveAudienceMultiInteractManagerImpl$b(this);
       this.O = new LiveAudienceMultiInteractManagerImpl$d(this);
       this.P = new LiveAudienceMultiInteractManagerImpl$e(this);
       this.Q = new LiveAudienceMultiInteractManagerImpl$a(this);
       return;
    }
    public void Qo(){
       LiveAudienceMultiInteractManagerImpl tF;
       e uoe = e.class;
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiInteractManagerImpl.class, "1")) {
          return;
       }
       super.Qo();
       c uoc = this.Po().a(c.class);
       a.o(uoc, "serviceManager.getServic¡­ameraService::class.java\)");
       this.z = uoc;
       uoc = this.Po().a(uoe);
       String str = "serviceManager.getServic¡­layerService::class.java\)";
       a.o(uoc, str);
       this.A = uoc;
       uoc = this.Po().a(b.class);
       a.o(uoc, "serviceManager.getServic¡­foDispatcher::class.java\)");
       this.F = uoc;
       uoc = this.Po().a(a.class);
       a.o(uoc, "serviceManager.getServic¡­ivityService::class.java\)");
       this.B = uoc;
       uoc = this.Po().a(LiveSlidePlayService.class);
       a.o(uoc, "serviceManager.getServic¡­ePlayService::class.java\)");
       this.C = uoc;
       if (uoc == null) {
          a.S("slideService");
       }
       uoc.P4(this.L);
       uoc = this.Po().a(b.class);
       a.o(uoc, "serviceManager.getServic¡­ceEndManager::class.java\)");
       this.D = uoc;
       if (uoc == null) {
          a.S("endService");
       }
       uoc.Km(this.M);
       m tk = this.k;
       a.o(tk, "liveInteractController");
       tk.d().m(this.N);
       c uoc1 = this.Po().a(uoe);
       a.o(uoc1, str);
       LivePlayerController livePlayerCo = uoc1.Vc();
       a.o(livePlayerCo, "livePlayerService.livePlayerController");
       this.E = livePlayerCo;
       String str1 = "livePlayerController";
       if (livePlayerCo == null) {
          a.S(str1);
       }
       livePlayerCo.addLivePlayerTypeChangeListener(this.Q);
       b.Z(LiveLogTag.LIVE_MULTI_INTERACT, "register sei listeners");
       if (g.a.c()) {
          tF = this.F;
          if (tF == null) {
             a.S("liveSeiInfoDispatcher");
          }
          tF.nk(1, LiveStageProto$LayoutConfig.class, this.P);
       }else {
          tF = this.E;
          if (tF == null) {
             a.S(str1);
          }
          tF.addLiveSeiListener(this.O);
       }
       u1.a(this);
       return;
    }
    public void Ro(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiInteractManagerImpl.class, "2")) {
          return;
       }
       super.Ro();
       this.G.dispose();
       this.gc().h(this.J);
       LiveAudienceMultiInteractManagerImpl tK = this.K;
       if (tK != null) {
          tK.g();
       }
       tK = this.E;
       String str = "livePlayerController";
       if (tK == null) {
          a.S(str);
       }
       tK.removeLivePlayerTypeChangeListener(this.Q);
       tK = this.D;
       if (tK == null) {
          a.S("endService");
       }
       tK.le(this.M);
       if (g.a.c()) {
          tK = this.F;
          if (tK == null) {
             a.S("liveSeiInfoDispatcher");
          }
          tK.ve(1, this.P);
       }else {
          tK = this.E;
          if (tK == null) {
             a.S(str);
          }
          tK.removeLiveSeiListener(this.O);
       }
       u1.b(this);
       return;
    }
    public a To(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiInteractManagerImpl.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(this.Po().a(b.class), this.Po().a(e.class));
    }
    public void Uo(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiInteractManagerImpl.class, "6")) {
          return;
       }
       this.gc().m(this.J);
       return;
    }
    public void Vo(){
       LiveAudienceMultiInteractManagerImpl liveAudience = LiveAudienceMultiInteractManagerImpl.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveAudience, "10")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, this, liveAudience, "11");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().u("SOURCE_LIVE").d("disableGuestDownscaleRtcResolution", false);
       if (!b) {
          super.Vo();
       }
       return;
    }
    public final void onAppBackground(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiInteractManagerImpl.class, "3")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_MULTI_INTERACT, "onAppBackground");
       this.H.onNext(g$b$a.a);
       return;
    }
    public final void onAppForeground(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiInteractManagerImpl.class, "4")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_MULTI_INTERACT, "onAppForeground");
       this.H.onNext(g$b$b.a);
       return;
    }
}
