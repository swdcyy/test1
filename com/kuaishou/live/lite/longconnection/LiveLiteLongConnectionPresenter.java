package com.kuaishou.live.lite.longconnection.LiveLiteLongConnectionPresenter;
import b93.d;
import com.kuaishou.live.lite.longconnection.LiveLiteLongConnectionPresenter$livePlayConfigListener$1;
import com.kuaishou.live.lite.longconnection.LiveLiteLongConnectionPresenter$a;
import com.kuaishou.live.lite.longconnection.LiveLiteLongConnectionPresenter$b;
import hf3.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.video.waynelive.LivePlayerController;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i51.d;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import zb3.b;
import i51.f;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.kuaishou.live.lite.longconnection.LiveLiteLongConnectionPresenter$c;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ds5.c;
import ds5.a;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import mq5.h;
import mq5.b;
import e93.b;
import com.kuaishou.live.lite.longconnection.LiveLiteLongConnectionPresenter$d;
import oh3.j;
import c93.b;
import e93.a;
import xp5.i;
import v51.a;
import or5.b;
import s91.g;
import z1.k;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import d93.a;
import rc3.d;
import ga1.e;
import ga1.d;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import tj3.e;

public final class LiveLiteLongConnectionPresenter extends d	// class@000a00
{
    public i A;
    public k B;
    public a C;
    public b D;
    public b E;
    public LivePlayerController F;
    public d G;
    public LiveLiteScatterLoadManager H;
    public boolean I;
    public b J;
    public final LiveLiteLongConnectionPresenter$livePlayConfigListener$1 K;
    public final LivePlayerStateChangeListener L;
    public final h M;
    public final String v;
    public a w;
    public d x;
    public LiveStreamFeedWrapper y;
    public a z;

    public void LiveLiteLongConnectionPresenter(){
       super();
       this.v = "LiveLiteLongConnectionPresenter";
       this.K = new LiveLiteLongConnectionPresenter$livePlayConfigListener$1(this);
       this.L = new LiveLiteLongConnectionPresenter$a(this);
       this.M = new LiveLiteLongConnectionPresenter$b(this);
    }
    public static final a c9(LiveLiteLongConnectionPresenter p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("liveLongConnection");
       }
       return p0;
    }
    public static final LivePlayerController d9(LiveLiteLongConnectionPresenter p0){
       p0 = p0.F;
       if (p0 == null) {
          a.S("livePlayerController");
       }
       return p0;
    }
    public void F8(){
       LiveLiteLongConnectionPresenter liveLiteLong = LiveLiteLongConnectionPresenter.class;
       if (PatchProxy.applyVoid(null, this, liveLiteLong, "3")) {
          return;
       }
       super.F8();
       LiveLiteLongConnectionPresenter tw = this.w;
       if (tw == null) {
          a.S("liveLongConnection");
       }
       LiveLiteLongConnectionPresenter ty = this.y;
       if (ty == null) {
          a.S("liveStreamFeedWrapper");
       }
       d uod = PatchProxy.applyTwoRefs(tw, ty, this, liveLiteLong, "9");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new d(tw, new b(this, ty.getLivePlayConfig(), ty));
       }
       this.x = uod;
       this.X7(RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new LiveLiteLongConnectionPresenter$c(this)));
       liveLiteLong = this.C;
       if (liveLiteLong == null) {
          a.S("liveBasePlayConfigManager");
       }
       liveLiteLong.gd(this.K);
       liveLiteLong = this.F;
       if (liveLiteLong == null) {
          a.S("livePlayerController");
       }
       liveLiteLong.addStateChangeListener(this.L);
       liveLiteLong = this.D;
       if (liveLiteLong == null) {
          a.S("mLiveAudienceEndManager");
       }
       liveLiteLong.Km(this.M);
       liveLiteLong = this.E;
       if (liveLiteLong == null) {
          a.S("liveLiteEnterService");
       }
       this.J = liveLiteLong.D9().subscribe(new LiveLiteLongConnectionPresenter$d(this));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteLongConnectionPresenter.class, "6")) {
          return;
       }
       j.a(this.J);
       LiveLiteLongConnectionPresenter tC = this.C;
       if (tC == null) {
          a.S("liveBasePlayConfigManager");
       }
       tC.fo(this.K);
       tC = this.F;
       if (tC == null) {
          a.S("livePlayerController");
       }
       tC.removeStateChangeListener(this.L);
       tC = this.D;
       if (tC == null) {
          a.S("mLiveAudienceEndManager");
       }
       tC.le(this.M);
       tC = this.w;
       if (tC == null) {
          a.S("liveLongConnection");
       }
       tC.clearAllListener();
       tC = this.x;
       if (tC == null) {
          a.S("liveLongConnectHelper");
       }
       tC.a();
       tC = this.w;
       if (tC == null) {
          a.S("liveLongConnection");
       }
       tC.a();
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteLongConnectionPresenter.class, "1")) {
          return;
       }
       a.p(p0, "provider");
       this.z = p0.a(a.class);
       this.A = p0.a(i.class);
       this.C = p0.a(a.class);
       this.D = p0.a(b.class);
       a uoa = p0.a(a.class).u();
       a.o(uoa, "provider.get\(LiveLongCon¡­.java\).liveLongConnection");
       this.w = uoa;
       LiveLiteLongConnectionPresenter tz = this.z;
       if (tz == null) {
          a.S("liveLiteAudienceInfoManager");
       }
       LiveStreamFeedWrapper liveStreamFe = tz.r5();
       a.o(liveStreamFe, "liveLiteAudienceInfoManager.liveStreamFeedWrapper");
       this.y = liveStreamFe;
       this.B = p0.c(g.class);
       this.H = p0.a(LiveLiteScatterLoadManager.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteLongConnectionPresenter.class, "2")) {
          return;
       }
       a.p(p0, "provider");
       LivePlayerController livePlayerCo = p0.a(d.class).Vc();
       a.o(livePlayerCo, "provider.get\(LiveLitePla¡­ava\).livePlayerController");
       this.F = livePlayerCo;
       this.E = p0.a(b.class);
       this.G = p0.a(d.class);
       return;
    }
    public void b9(){
       if (PatchProxy.applyVoid(null, this, LiveLiteLongConnectionPresenter.class, "5")) {
          return;
       }
       if (this.I == null) {
          LiveLiteLongConnectionPresenter tF = this.F;
          if (tF == null) {
             a.S("livePlayerController");
          }
          if (tF.isStop()) {
          label_001f :
             tF = this.w;
             if (tF == null) {
                a.S("liveLongConnection");
             }
             if (!tF.D0()) {
                b.P(LiveLogTag.LIVE_SOCKET.appendTag(this.v), "go to live detail page or player stop, exit longconnection");
                tF = this.w;
                if (tF == null) {
                   a.S("liveLongConnection");
                }
                tF.a();
             }
          }
       }else {
          goto label_001f ;
       }
       return;
    }
    public final void e9(){
       if (PatchProxy.applyVoid(null, this, LiveLiteLongConnectionPresenter.class, "7")) {
          return;
       }
       LiveLiteLongConnectionPresenter tw = this.w;
       if (tw == null) {
          a.S("liveLongConnection");
       }
       tw.resume();
       tw = this.G;
       if (tw == null) {
          a.S("logReporterService");
       }
       tw.a().l();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LiveLiteLongConnectionPresenter.class, "4")) {
          return;
       }
       LiveLiteLongConnectionPresenter tC = this.C;
       if (tC == null) {
          a.S("liveBasePlayConfigManager");
       }
       if (tC.Gb()) {
          this.e9();
       }
       this.I = false;
       return;
    }
}
