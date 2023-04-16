package com.kuaishou.live.lite.player.biz.controller.LiveLiteRecoEnterActionLogController;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayerPlayController$b;
import msd.a;
import mq5.b;
import xp5.i;
import id3.h;
import e93.d;
import com.kwai.video.waynelive.LivePlayerController;
import e93.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.player.biz.controller.LiveLiteRecoEnterActionLogController$bizToken$2;
import qrd.p;
import qrd.s;
import y12.b;
import com.kuaishou.live.lite.player.biz.controller.LiveLiteRecoEnterActionLogController$b;
import com.kuaishou.live.lite.player.biz.controller.LiveLiteRecoEnterActionLogController$c;
import com.kuaishou.live.lite.player.biz.controller.LiveLiteRecoEnterActionLogController$d;
import com.kuaishou.live.lite.player.biz.controller.LiveLiteRecoEnterActionLogController$e;
import z1.k;
import com.kuaishou.live.lite.player.biz.controller.LiveLiteRecoEnterActionLogController$f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.lite.player.biz.controller.LiveLiteRecoEnterActionLogController$a;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import kc3.b;
import android.app.Activity;
import com.kuaishou.live.lite.slide.LiveLiteSlideStatus;

public final class LiveLiteRecoEnterActionLogController implements LiveLitePlayerPlayController$b	// class@000aa3
{
    public boolean a;
    public final p b;
    public b c;
    public LivePlayerStateChangeListener d;
    public final a e;
    public final b f;
    public final i g;
    public final h h;
    public final d i;
    public final LivePlayerController j;

    public void LiveLiteRecoEnterActionLogController(a p0,b p1,i p2,h p3,d p4,LivePlayerController p5,a p6){
       a.p(p0, "activityProvider");
       a.p(p1, "liveAudienceEndManager");
       a.p(p2, "liveLogPackageProvider");
       a.p(p3, "liveLiteSlideManager");
       a.p(p5, "livePlayerController");
       a.p(p6, "liveAudienceInfoManager");
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
       this.i = p4;
       this.j = p5;
       this.b = s.c(new LiveLiteRecoEnterActionLogController$bizToken$2(p6));
       this.c = new b(new LiveLiteRecoEnterActionLogController$b(this), new LiveLiteRecoEnterActionLogController$c(this), new LiveLiteRecoEnterActionLogController$d(this), new LiveLiteRecoEnterActionLogController$e(this));
       this.d = new LiveLiteRecoEnterActionLogController$f(this);
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, LiveLiteRecoEnterActionLogController.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = this.c.c();
       boolean b1 = this.c.b();
       boolean b2 = false;
       boolean b3 = (this.j.isPreparing() || this.j.isPlaying())? true: false;
       b.Z(LiveLiteRecoEnterActionLogController$a.b, "canStartCountDown, bizToken="+this.b()+", "+"isCountDowning="+b+", "+"hasUploadedForCurrentWatchPeriod="+b1+", "+"isPreparingOrPlaying="+b3);
       if (!b && (!b1 && b3)) {
          b2 = true;
       }
    label_007a :
       return b2;
    }
    public final String b(){
       Object obj = PatchProxy.apply(null, this, LiveLiteRecoEnterActionLogController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, LiveLiteRecoEnterActionLogController.class, "2")) {
          return;
       }
       this.j.addStateChangeListener(this.d);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveLiteRecoEnterActionLogController.class, "5")) {
          return;
       }
       this.c.a("onDestroy");
       this.j.removeStateChangeListener(this.d);
       return;
    }
    public void onPause(){
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LiveLiteRecoEnterActionLogController.class, "3")) {
          return;
       }
       if (this.a()) {
          this.c.d("onResume");
       }
       return;
    }
    public void onStart(){
    }
    public void onStop(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, LiveLiteRecoEnterActionLogController.class, "4")) {
          return;
       }
       b a = b.a;
       Activity uActivity = this.e.invoke();
       LiveLiteSlideStatus liveLiteSlid = this.h.b();
       LiveLiteRecoEnterActionLogController ti = this.i;
       b = true;
       if (ti == null || ti.W1() != b) {
          b = false;
       }
       boolean b1 = a.a(uActivity, liveLiteSlid, b, this.f.U0());
       this.a = b1;
       if (!b1) {
          this.c.a("onStop but not enter background");
       }
       return;
    }
}
