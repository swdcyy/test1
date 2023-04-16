package com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kwai.video.waynelive.LivePlayerController;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import e93.a;
import hf3.a;
import mq5.b;
import rc3.d;
import e93.d;
import e93.e;
import id3.h;
import sj3.l;
import t91.a;
import z1.k;
import e93.c;
import e93.b;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import rc3.c;
import xp5.i;
import jc3.b;
import rd3.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController$d;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController$c;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController$a;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController;
import com.kuaishou.live.lite.LiveLiteParam;
import qc3.d;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController$liveLiteLogReporterController$1;
import androidx.lifecycle.Lifecycle;
import msd.a;
import ds5.a;
import qc3.g;
import mq5.f;
import com.kuaishou.live.lite.player.biz.controller.LiveLiteRecoEnterActionLogController;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController$liveLiteRecoEnterActionLogController$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import lnc.u1;
import com.kuaishou.socket.nano.SocketMessages$SCInfo;
import lf3.g;
import ec3.f;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController$onCreate$1;
import msd.l;
import e93.f;
import java.lang.Runnable;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController$onDestroy$1;
import android.content.Context;
import java.util.Objects;
import android.app.ActivityManager;
import java.util.Collection;
import android.app.ActivityManager$RunningTaskInfo;
import android.content.ComponentName;
import android.app.Activity;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController$onResume$1;
import zca.s;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController$e;
import erd.g;
import crd.b;
import eoc.f;
import vs5.l;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController$f;
import kc3.b;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController$onStart$3;
import oh3.j;
import com.kuaishou.live.lite.slide.LiveLiteSlideStatus;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wkd.b;
import tjc.c;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController$onStop$1;
import android.os.Build$VERSION;
import java.lang.Integer;
import java.lang.System;
import android.os.Trace;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qrd.l1;
import com.yxcorp.utility.SystemUtil;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import java.lang.Long;
import kotlin.Pair;
import qrd.r0;
import java.util.Iterator;
import mq5.i;
import xp5.g;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController$b;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Iterable;
import m56.f;
import oe6.e;
import o56.a;
import w51.a;
import wa1.d;
import m56.g;
import vs5.d;

public final class LiveLitePlayerPlayController extends ViewController	// class@000a9b
{
    public final LiveStreamFeedWrapper A;
    public final a B;
    public final a C;
    public final b D;
    public final d E;
    public final d F;
    public final e G;
    public final h H;
    public final l I;
    public final a J;
    public final k K;
    public final c L;
    public final b M;
    public final LiveLiteScatterLoadManager N;
    public final c O;
    public final LiveLiteScatterLoadManager P;
    public final i Q;
    public final b R;
    public final b S;
    public final String j;
    public final QLivePlayConfig k;
    public b l;
    public b m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public final CopyOnWriteArrayList r;
    public final g s;
    public final f t;
    public final Runnable u;
    public final LiveLitePlayConfigController v;
    public final d w;
    public final g x;
    public final LiveLiteRecoEnterActionLogController y;
    public final LivePlayerController z;

    public void LiveLitePlayerPlayController(LivePlayerController p0,LiveStreamFeedWrapper p1,a p2,a p3,b p4,d p5,d p6,e p7,h p8,l p9,a p10,k p11,c p12,b p13,LiveLiteScatterLoadManager p14,c p15,LiveLiteScatterLoadManager p16,i p17,b p18,b p19){
       Object obj = p0;
       Object obj1 = p1;
       LiveLitePlayerPlayController$liveLiteLogReporterController$1 obj2 = p2;
       LiveLitePlayerPlayController$c obj3 = p3;
       d obj4 = p4;
       LiveLiteParam obj5 = p5;
       Object obj6 = p7;
       Object obj7 = p8;
       Object obj8 = p9;
       Object obj9 = p10;
       Object obj10 = p11;
       ViewController obj11 = p12;
       Object obj12 = p13;
       Object obj13 = p14;
       a.p(obj, "livePlayerController");
       a.p(obj1, "liveStreamFeedWrapper");
       a.p(obj2, "liveAudienceInfoManager");
       a.p(obj3, "liveLongConnection");
       a.p(obj4, "liveAudienceEndManager");
       a.p(obj5, "liveLitePlayerService");
       a.p(obj6, "liveLiteSlidingPanelService");
       a.p(obj7, "liveLiteSlideManager");
       a.p(obj8, "liveLitePlayerReconnectService");
       a.p(obj9, "liveExceptionInfoManager");
       a.p(obj10, "liveServerExceptionManager");
       a.p(obj11, "liveLiteFragmentService");
       a.p(obj12, "liveLiteEnterService");
       a.p(obj13, "liveLiteScatterLoadManager");
       a.p(p15, "prePlayService");
       a.p(p16, "liveTaskQueue");
       a.p(p17, "liveLogPackageProvider");
       a.p(p18, "playConfigManager");
       a.p(p19, "liteApiTrafficManager");
       super();
       ViewController viewControll = this;
       viewControll.z = obj;
       viewControll.A = obj1;
       viewControll.B = obj2;
       viewControll.C = obj3;
       viewControll.D = obj4;
       viewControll.E = obj5;
       viewControll.F = p6;
       viewControll.G = obj6;
       viewControll.H = obj7;
       viewControll.I = obj8;
       viewControll.J = obj9;
       viewControll.K = obj10;
       viewControll.L = obj11;
       viewControll.M = obj12;
       viewControll.N = obj13;
       viewControll.O = p15;
       viewControll.P = p16;
       viewControll.Q = p17;
       viewControll.R = p18;
       viewControll.S = p19;
       viewControll.j = "LiveLitePlayerPlayController";
       viewControll.k = p1.getLivePlayConfig();
       viewControll.o = true;
       viewControll.r = new CopyOnWriteArrayList();
       viewControll.s = new LiveLitePlayerPlayController$d(viewControll);
       obj3 = new LiveLitePlayerPlayController$c(viewControll);
       viewControll.t = obj3;
       viewControll.u = new LiveLitePlayerPlayController$a(viewControll);
       obj5 = p2.ok();
       a.o(obj5, "liveAudienceInfoManager.liveLiteParam");
       LiveLitePlayerPlayController$c uoc = obj3;
       LiveLitePlayConfigController liveLitePlay = new LiveLitePlayConfigController(obj1, obj5, p11, p0, obj8, obj9, p16, p18, p19);
       viewControll.v = v0;
       obj2 = liveLitePlay;
       LiveLitePlayerPlayController$liveLiteLogReporterController$1 oliveLiteLog = new LiveLitePlayerPlayController$liveLiteLogReporterController$1(viewControll);
       LiveLiteParam liveLitePara = p2.ok();
       a.o(liveLitePara, "liveAudienceInfoManager.liveLiteParam");
       obj11 = viewControll;
       obj4 = new d(obj2, this.getLifecycle(), p0, p1, liveLitePara, p18, p3, p4, p5, p12, p7, p8, p13, p6, p14, p15);
       obj11.w = v0;
       g og = new g(p13, uoc, p4, p17, p8, p12, p2);
       obj11.x = v0;
       LiveLiteRecoEnterActionLogController liveLiteReco = new LiveLiteRecoEnterActionLogController(new LiveLitePlayerPlayController$liveLiteRecoEnterActionLogController$1(obj11), p4, p17, p8, p6, p0, p2);
       obj11.y = v0;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveLitePlayerPlayController.class, "1")) {
          return;
       }
       b.P(LiveLiteLogTag.PLAYER.appendTag(this.j), "onCreate");
       u1.a(this);
       this.C.u0(105, SocketMessages$SCInfo.class, this.s);
       this.Y2(true, null);
       if (f.a()) {
          this.w.onCreate();
       }
       this.Z2(LiveLitePlayerPlayController$onCreate$1.INSTANCE);
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveLitePlayerPlayController.class, "7")) {
          return;
       }
       b.P(LiveLiteLogTag.PLAYER.appendTag(this.j), "onDestroy");
       this.C.o(105, this.s);
       f.g(this);
       f.f(this.u);
       u1.b(this);
       if (f.a()) {
          this.w.onDestroy();
       }
       this.E.Rg();
       this.Z2(LiveLitePlayerPlayController$onDestroy$1.INSTANCE);
       if (f.a()) {
          this.w.k();
       }
       return;
    }
    public void K2(){
       if (PatchProxy.applyVoid(null, this, LiveLitePlayerPlayController.class, "4")) {
          return;
       }
       b.P(LiveLiteLogTag.PLAYER.appendTag(this.j), "onPause");
       return;
    }
    public void L2(){
       LiveLitePlayerPlayController liveLitePlay = LiveLitePlayerPlayController.class;
       if (PatchProxy.applyVoid(null, this, liveLitePlay, "3")) {
          return;
       }
       b.P(LiveLiteLogTag.PLAYER.appendTag(this.j), "onResume");
       if (this.o != null) {
          this.Y2(false, null);
       }else if(PatchProxy.applyVoid(null, this, liveLitePlay, "18")){
          if (this.W2()) {
             List systemServic = this.D2().getSystemService("activity");
             Objects.requireNonNull(systemServic, "null cannot be cast to non-null type android.app.ActivityManager");
             int i = 1;
             systemServic = systemServic.getRunningTasks(i);
             if (systemServic != null && (systemServic.isEmpty() ^ i) == i) {
                ActivityManager$RunningTaskInfo topActivity = systemServic.get(false).topActivity;
                String className = (topActivity != null)? topActivity.getClassName(): null;
                if (a.g(className, this.B2().getClass().getName())) {
                   this.Y2(false, null);
                }
             }
          }
          if (this.z.isPreparing() || (this.z.isPlaying() && this.z.isPlayerMute())) {
             this.z.unMute();
          }
       }
       this.q = false;
       this.o = false;
       if (f.a()) {
          this.w.onResume();
       }
       this.Z2(LiveLitePlayerPlayController$onResume$1.INSTANCE);
       return;
    }
    public void M2(){
       if (PatchProxy.applyVoid(null, this, LiveLitePlayerPlayController.class, "2")) {
          return;
       }
       b.P(LiveLiteLogTag.PLAYER.appendTag(this.j), "onStart");
       this.l = f.a(s.class, new LiveLitePlayerPlayController$e(this));
       this.m = f.a(l.class, new LiveLitePlayerPlayController$f(this));
       LiveLitePlayerPlayController liveLitePlay = (this.G.a() && b.b())? 1: null;
       if (!liveLitePlay && (this.o == null && (!this.W2() || this.q == null))) {
          this.Y2(false, null);
       }
    label_0058 :
       if (f.a()) {
          this.w.onStart();
       }
       this.Z2(LiveLitePlayerPlayController$onStart$3.INSTANCE);
       return;
    }
    public void N2(){
       boolean b;
       int b3;
       LiveLitePlayerPlayController liveLitePlay = LiveLitePlayerPlayController.class;
       if (PatchProxy.applyVoid(null, this, liveLitePlay, "5")) {
          return;
       }
       LiveLiteLogTag pLAYER = LiveLiteLogTag.PLAYER;
       pLAYER.appendTag(this.j);
       b.P(pLAYER, "onStop");
       j.a(this.l);
       j.a(this.m);
       this.z.removeStopPlayToken("SlidingPanel");
       b a = b.a;
       Activity uActivity = this.B2();
       LiveLiteSlideStatus liveLiteSlid = this.H.b();
       LiveLitePlayerPlayController tF = this.F;
       b = false;
       boolean b1 = (tF != null && tF.W1() == true)? true: false;
       boolean b2 = a.a(uActivity, liveLiteSlid, b1, this.D.U0());
       Object obj = PatchProxy.apply(null, this, liveLitePlay, "6");
       if (obj != PatchProxyResult.class) {
          b3 = obj.booleanValue();
       }else {
          obj = b.a(-1608526086);
          a.o(obj, "Singleton.get\(SplashDataManager::class.java\)");
          b3 = obj.getState();
          b3 = (b3 != 4 && b3 != 5)? true: false;
       }
       if (!b3) {
          liveLitePlay = this.F;
          if (liveLitePlay != null && (!liveLitePlay.W1() || (!b2 && (this.E.Xi() && (!b2 || !b.c()))))) {
          label_009a :
             if (f.a()) {
                this.w.l(b);
             }
             if (b) {
                pLAYER.appendTag(this.j);
                b.P(pLAYER, "user leave lite page, stop play");
                this.X2(1, null);
             }
             this.q = true;
             this.Z2(LiveLitePlayerPlayController$onStop$1.INSTANCE);
             return;
          }
       }
       b = true;
       goto label_009a ;
    }
    public final f V2(){
       return this.t;
    }
    public final boolean W2(){
       boolean b = (Build$VERSION.SDK_INT == 29)? true: false;
       return b;
    }
    public final void X2(int p0,String p1){
       l1 a;
       Object[] objArray;
       LiveLitePlayerPlayController liveLitePlay = LiveLitePlayerPlayController.class;
       if (PatchProxy.isSupport(liveLitePlay) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, liveLitePlay, "9")) {
          return;
       }
       if (this.n == null) {
          String str = "stopPlay";
          long l = System.nanoTime();
          Trace.beginSection(str);
          b.S(LiveLiteLogTag.PLAYER.appendTag(this.j), "playerOffline", "reason", Integer.valueOf(p0));
          this.z.setPlayerReleaseReason(p0);
          if (TextUtils.x(p1)) {
             this.z.stopPlay();
          }else {
             a.m(p1);
             this.z.stopPlay(p1);
          }
          a = l1.a;
          Trace.endSection();
          float f = (float)(System.nanoTime() - l) / 1000000.00f;
          if (f.b()) {
             if (SystemUtil.K()) {
                objArray = new Object[]{str,Float.valueOf(f)};
                str = String.format("%s - %.3fms", Arrays.copyOf(objArray, 2));
                a.o(str, "java.lang.String.format\(format, *args\)");
                b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str);
             }
          }else {
             objArray = new Object[]{str,Float.valueOf(f)};
             str = String.format("%s - %.3fms", Arrays.copyOf(objArray, 2));
             a.o(str, "java.lang.String.format\(format, *args\)");
             b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str);
          }
          r0.a(Long.valueOf((long)f), a).getSecond();
          if (f.a()) {
             this.w.k();
          }
          this.n = true;
          Iterator iterator = this.r.iterator();
          while (iterator.hasNext()) {
             iterator.next().a();
          }
       }
       return;
    }
    public final void Y2(boolean p0,String p1){
       float f1;
       Object[] objArray;
       LiveLitePlayerPlayController liveLitePlay = LiveLitePlayerPlayController.class;
       if (PatchProxy.isSupport(liveLitePlay) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, liveLitePlay, "8")) {
          return;
       }
       LiveLiteLogTag pLAYER = LiveLiteLogTag.PLAYER;
       pLAYER.appendTag(this.j);
       LiveLiteLogTag liveLiteLogT = pLAYER;
       b.V(liveLiteLogT, "resumePlayer", "liveStreamId", this.B.getLiveStreamId(), "anchorUserId", this.B.d(), "isMute", Boolean.valueOf(p0), "isLiveStopped", Boolean.valueOf(this.D.U0()));
       if (this.D.U0()) {
          return;
       }
       if (!this.z.isPreparing() && !this.z.isPlaying()) {
          float f = 1000000.00f;
          if (TextUtils.x(p1)) {
             p1 = "LitePlayerStartPlay";
             Trace.beginSection(p1);
             Boolean uBoolean = Boolean.valueOf(this.z.startPlay());
             Trace.endSection();
             f1 = (float)(System.nanoTime() - System.nanoTime()) / f;
             if (f.b()) {
                if (SystemUtil.K()) {
                   objArray = new Object[]{p1,Float.valueOf(f1)};
                   p1 = String.format("%s - %.3fms", Arrays.copyOf(objArray, 2));
                   a.o(p1, "java.lang.String.format\(format, *args\)");
                   b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, p1);
                }
             }else {
                objArray = new Object[]{p1,Float.valueOf(f1)};
                p1 = String.format("%s - %.3fms", Arrays.copyOf(objArray, 2));
                a.o(p1, "java.lang.String.format\(format, *args\)");
                b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, p1);
             }
             r0.a(Long.valueOf((long)f1), uBoolean).getSecond();
          }else {
             String str = "LitePlayerStartPlayToken";
             Trace.beginSection(str);
             a.m(p1);
             Boolean uBoolean1 = Boolean.valueOf(this.z.startPlay(p1));
             Trace.endSection();
             f1 = (float)(System.nanoTime() - System.nanoTime()) / f;
             if (f.b()) {
                if (SystemUtil.K()) {
                   objArray = new Object[]{str,Float.valueOf(f1)};
                   str = String.format("%s - %.3fms", Arrays.copyOf(objArray, 2));
                   a.o(str, "java.lang.String.format\(format, *args\)");
                   b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str);
                }
             }else {
                objArray = new Object[]{str,Float.valueOf(f1)};
                str = String.format("%s - %.3fms", Arrays.copyOf(objArray, 2));
                a.o(str, "java.lang.String.format\(format, *args\)");
                b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str);
             }
             r0.a(Long.valueOf((long)f1), uBoolean1).getSecond();
          }
       }
       if (p0) {
          this.z.mute();
       }else {
          this.z.unMute();
          RxBus.f.b(new l(this.z));
       }
       this.n = false;
       return;
    }
    public final void Z2(l p0){
       LiveLitePlayerPlayController$b[] uobArray;
       Iterator iterator;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitePlayerPlayController.class, "19")) {
          return;
       }
       int i = 3;
       int i1 = 2;
       int i2 = 1;
       int i3 = 0;
       if (f.a()) {
          uobArray = new LiveLitePlayerPlayController$b[i];
          uobArray[i3] = this.v;
          uobArray[i2] = this.x;
          uobArray[i1] = this.y;
          iterator = CollectionsKt__CollectionsKt.L(uobArray).iterator();
          while (iterator.hasNext()) {
             p0.invoke(iterator.next());
          }
       }else {
          uobArray = new LiveLitePlayerPlayController$b[]{this.v,this.w,this.x,this.y};
          iterator = CollectionsKt__CollectionsKt.L(uobArray).iterator();
          while (iterator.hasNext()) {
             p0.invoke(iterator.next());
          }
       }
       return;
    }
    public final void onEventMainThread(f p0){
       LiveLitePlayerPlayController liveLitePlay = LiveLitePlayerPlayController.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveLitePlay, "15")) {
          return;
       }
       a.p(p0, "e");
       LiveLitePlayerPlayController tk = this.k;
       a.o(tk, "livePlayConfig");
       b.S(LiveLiteLogTag.PLAYER.appendTag(this.j), "OnAppBackgroundEvent", "liveStreamId", tk.getLiveStreamId());
       if (b.c()) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, liveLitePlay, "17")) {
          f.f(this.u);
          LiveLitePlayerPlayController tu = this.u;
          long l = e.F();
          long l1 = (a.d() && a.Q())? 1000: 0xea60;
          f.k("handleTryDelayOffline", tu, this, (l * l1));
       }
       if (d.a(this.k)) {
          this.z.startAudioOnlyMode();
       }
       return;
    }
    public final void onEventMainThread(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitePlayerPlayController.class, "14")) {
          return;
       }
       a.p(p0, "e");
       LiveLitePlayerPlayController tk = this.k;
       a.o(tk, "livePlayConfig");
       b.S(LiveLiteLogTag.PLAYER.appendTag(this.j), "OnAppForegroundEvent", "liveStreamId", tk.getLiveStreamId());
       if (b.c()) {
          return;
       }
       f.f(this.u);
       if (d.a(this.k)) {
          this.z.stopAudioOnlyMode();
       }
       return;
    }
    public final void onEventMainThread(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitePlayerPlayController.class, "13")) {
          return;
       }
       a.p(p0, "e");
       if (this.z.isPlaying()) {
          LiveLitePlayerPlayController tk = this.k;
          a.o(tk, "livePlayConfig");
          b.S(LiveLiteLogTag.PLAYER.appendTag(this.j), "OnVideoPlayStartEvent mute", "liveStreamId", tk.getLiveStreamId());
          this.z.mute();
       }
       return;
    }
}
