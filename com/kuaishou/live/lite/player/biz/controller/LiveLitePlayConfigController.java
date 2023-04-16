package com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController$b;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.live.lite.LiveLiteParam;
import z1.k;
import com.kwai.video.waynelive.LivePlayerController;
import sj3.l;
import t91.a;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import jc3.b;
import rd3.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController$a;
import erd.g;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController$b;
import java.lang.Throwable;
import qc3.e;
import com.yxcorp.retrofit.model.KwaiException;
import s91.g;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import d61.m;
import o51.a;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController$f;
import java.lang.Runnable;
import e93.f;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import java.lang.Integer;
import com.kuaishou.android.live.log.b;
import d61.g;
import com.kuaishou.android.live.model.j;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController$onStartPlayRequestSuccess$updateUrlToPlayer$1;
import ec3.f;
import msd.a;
import android.os.SystemClock;
import pc3.a;
import pc3.a$a;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import kp.r1;
import d61.d0;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController$g;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController$h;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController$d;
import vs5.k;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController$e;
import sj3.b;
import io.reactivex.internal.functions.Functions;
import qc3.f;
import lnc.b9;

public final class LiveLitePlayConfigController implements LiveLitePlayerPlayController$b	// class@000a8d
{
    public final String a;
    public final long b;
    public final int c;
    public QLivePlayConfig d;
    public int e;
    public b f;
    public b g;
    public b h;
    public boolean i;
    public final LiveLitePlayConfigController$c j;
    public final LiveStreamFeedWrapper k;
    public final LiveLiteParam l;
    public final k m;
    public final LivePlayerController n;
    public final l o;
    public final a p;
    public final LiveLiteScatterLoadManager q;
    public final b r;
    public final b s;

    public void LiveLitePlayConfigController(LiveStreamFeedWrapper p0,LiveLiteParam p1,k p2,LivePlayerController p3,l p4,a p5,LiveLiteScatterLoadManager p6,b p7,b p8){
       a.p(p0, "liveStreamFeedWrapper");
       a.p(p1, "liveLiteParam");
       a.p(p2, "serverExceptionService");
       a.p(p3, "livePlayerController");
       a.p(p4, "livePlayerReconnectService");
       a.p(p5, "liveExceptionInfoManager");
       a.p(p6, "liveTaskQueue");
       a.p(p7, "playConfigManager");
       a.p(p8, "liteApiTrafficManager");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.p = p5;
       this.q = p6;
       this.r = p7;
       this.s = p8;
       this.a = "LiveLitePlayConfigController";
       this.b = 5000;
       this.c = 3;
       QLivePlayConfig livePlayConf = p0.getLivePlayConfig();
       a.o(livePlayConf, "liveStreamFeedWrapper.livePlayConfig");
       this.d = livePlayConf;
       this.j = new LiveLitePlayConfigController$c(this);
    }
    public final void a(boolean p0){
       LiveLitePlayConfigController liveLitePlay = LiveLitePlayConfigController.class;
       if (PatchProxy.isSupport(liveLitePlay) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveLitePlay, "12")) {
          return;
       }
       this.r.fi(new LiveLitePlayConfigController$a(this, p0));
       return;
    }
    public final void b(QLivePlayConfig p0,boolean p1){
       LiveLitePlayConfigController liveLitePlay = LiveLitePlayConfigController.class;
       if (PatchProxy.isSupport(liveLitePlay) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, liveLitePlay, "11")) {
          return;
       }
       this.r.fi(new LiveLitePlayConfigController$b(this, p1, p0));
       return;
    }
    public final void c(Throwable p0){
       LiveLitePlayConfigController liveLitePlay = LiveLitePlayConfigController.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveLitePlay, "7")) {
          return;
       }
       String str = null;
       if (!PatchProxy.isSupport(liveLitePlay) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.FALSE, this, liveLitePlay, "13")) {
          this.r.fi(new e(str, p0));
       }
       if (p0 instanceof KwaiException && p0.getErrorCode() == 601) {
          this.m.get().C(p0);
       }else {
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          m.c(uoc.a(), p0);
       }
       if (a.a(p0) && this.e < this.c) {
          f.k("requestStartPlay", new LiveLitePlayConfigController$f(this), this, this.b);
       }else {
          b.S(LiveLiteLogTag.PLAYER.appendTag(this.a), "stop retry startPlay api", "startPlayRetryCount", Integer.valueOf(this.e));
       }
       return;
    }
    public final void d(QLivePlayConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitePlayConfigController.class, "6")) {
          return;
       }
       LiveLiteLogTag pLAYER = LiveLiteLogTag.PLAYER;
       pLAYER.appendTag(this.a);
       LiveLiteLogTag liveLiteLogT = pLAYER;
       b.T(liveLiteLogT, "onStartPlayRequestSuccess", "old mLiveStreamId", this.d.getLiveStreamId(), "new mLiveStreamId", p0.getLiveStreamId());
       this.i = true;
       int i = 0;
       this.e = i;
       g.l(this.k, p0);
       this.b(p0, i);
       j.a(this.d, p0);
       this.a(i);
       LiveLitePlayConfigController$onStartPlayRequestSuccess$updateUrlToPlayer$1 oonStartPlay = new LiveLitePlayConfigController$onStartPlayRequestSuccess$updateUrlToPlayer$1(this, (true ^ (this.d.getLiveStreamId()).equals(p0.getLiveStreamId())));
       if (f.h()) {
          this.q.W1("updateUrlToPlayer", oonStartPlay);
       }else {
          oonStartPlay.invoke();
       }
       return;
    }
    public final void e(){
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, LiveLitePlayConfigController.class, "5")) {
          return;
       }
       b.P(LiveLiteLogTag.PLAYER.appendTag(obj.a), "requestStartPlay");
       long l = SystemClock.elapsedRealtime();
       a uoa = a.a.a();
       String str = obj.s.a();
       String liveStreamId = obj.k.getLiveStreamId();
       a.o(liveStreamId, "liveStreamFeedWrapper.liveStreamId");
       String userId = obj.k.getUserId();
       String expTag = obj.k.getExpTag();
       String serverExpTag = obj.k.getServerExpTag();
       FeedLogCtx uFeedLogCtx = r1.O0(obj.k.mEntity);
       String str1 = (uFeedLogCtx != null)? uFeedLogCtx.toJsonString(): objArray;
       obj.f = uoa.b(str, liveStreamId, userId, expTag, serverExpTag, str1, null, obj.l.getStartPlaySourceType(), obj.l.getSourceUrl(), false, d0.a(objArray, objArray), 0, "").map(new e()).subscribe(new LiveLitePlayConfigController$g(obj, l), new LiveLitePlayConfigController$h(obj, l));
       return;
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, LiveLitePlayConfigController.class, "1")) {
          return;
       }
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.g = f.g(l.class, mAIN).subscribe(new LiveLitePlayConfigController$d(this));
       this.h = f.g(k.class, mAIN).subscribe(new LiveLitePlayConfigController$e(this));
       this.o.b(this.j);
       return;
    }
    public void onDestroy(){
       LiveLitePlayConfigController liveLitePlay = LiveLitePlayConfigController.class;
       if (PatchProxy.applyVoid(null, this, liveLitePlay, "4")) {
          return;
       }
       if (this.i != null && !PatchProxy.applyVoid(null, this, liveLitePlay, "8")) {
          a.a.a().a(this.s.a(), this.d.getLiveStreamId()).map(new e()).subscribe(Functions.d(), f.b);
       }
       this.o.c(this.j);
       f.g(this);
       b9.a(this.f);
       this.f = null;
       b9.a(this.g);
       this.g = null;
       b9.a(this.h);
       this.h = null;
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, LiveLitePlayConfigController.class, "3")) {
          return;
       }
       this.p.Ki("livePatternType");
       this.p.Ki("liveStyle");
       f.g(this);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LiveLitePlayConfigController.class, "2")) {
          return;
       }
       if (this.f == null) {
          this.e();
       }
       this.p.Oe("livePatternType", Integer.valueOf(this.d.mPatternType));
       this.p.Oe("liveStyle", "LITE");
       return;
    }
    public void onStart(){
    }
    public void onStop(){
    }
}
