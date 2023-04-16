package com.kuaishou.live.core.basic.useraction.LiveAudienceRecoEnterActionPresenter;
import k51.c;
import com.kuaishou.live.core.basic.useraction.LiveAudienceRecoEnterActionPresenter$bizToken$2;
import msd.a;
import qrd.p;
import qrd.s;
import y12.b;
import com.kuaishou.live.core.basic.useraction.LiveAudienceRecoEnterActionPresenter$b;
import com.kuaishou.live.core.basic.useraction.LiveAudienceRecoEnterActionPresenter$c;
import com.kuaishou.live.core.basic.useraction.LiveAudienceRecoEnterActionPresenter$d;
import com.kuaishou.live.core.basic.useraction.LiveAudienceRecoEnterActionPresenter$e;
import z1.k;
import com.kuaishou.live.core.basic.useraction.LiveAudienceRecoEnterActionPresenter$g;
import com.kuaishou.live.core.basic.useraction.LiveAudienceRecoEnterActionPresenter$f;
import xp5.i;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import xl8.b;
import og1.a;
import brd.t;
import com.kuaishou.live.core.basic.useraction.LiveAudienceRecoEnterActionPresenter$h;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.c$b;
import kq5.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.waynelive.LivePlayerController;
import com.kuaishou.live.core.basic.useraction.LiveAudienceRecoEnterActionPresenter$a;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import lp3.i;
import lp3.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;

public final class LiveAudienceRecoEnterActionPresenter extends c	// class@0008da
{
    public LivePlayerController p;
    public b q;
    public i r;
    public i s;
    public BaseFragment t;
    public LiveStreamFeedWrapper u;
    public final p v;
    public final b w;
    public final LivePlayerStateChangeListener x;
    public final LiveAudienceRecoEnterActionPresenter$f y;
    public static String sLivePresenterClassName = "LiveAudienceRecoEnterActionPresenter";

    public void LiveAudienceRecoEnterActionPresenter(){
       super();
       this.v = s.c(new LiveAudienceRecoEnterActionPresenter$bizToken$2(this));
       this.w = new b(new LiveAudienceRecoEnterActionPresenter$b(this), new LiveAudienceRecoEnterActionPresenter$c(this), new LiveAudienceRecoEnterActionPresenter$d(this), new LiveAudienceRecoEnterActionPresenter$e(this));
       this.x = new LiveAudienceRecoEnterActionPresenter$g(this);
       this.y = new LiveAudienceRecoEnterActionPresenter$f(this);
    }
    public static final i P8(LiveAudienceRecoEnterActionPresenter p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("liveLogPackageProvider");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceRecoEnterActionPresenter.class, "3")) {
          return;
       }
       LiveAudienceRecoEnterActionPresenter tp = this.p;
       if (tp == null) {
          a.S("livePlayerController");
       }
       tp.addStateChangeListener(this.x);
       this.X7(a.a().observable().distinctUntilChanged().subscribe(new LiveAudienceRecoEnterActionPresenter$h(this)));
       tp = this.q;
       if (tp == null) {
          a.S("fragmentLifeCycleService");
       }
       tp.c(this.y);
       if (this.R8()) {
          this.w.d("onBind");
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceRecoEnterActionPresenter.class, "4")) {
          return;
       }
       this.w.a("onUnbind");
       LiveAudienceRecoEnterActionPresenter tp = this.p;
       if (tp == null) {
          a.S("livePlayerController");
       }
       tp.removeStateChangeListener(this.x);
       tp = this.q;
       if (tp == null) {
          a.S("fragmentLifeCycleService");
       }
       tp.a(this.y);
       return;
    }
    public final boolean R8(){
       boolean b3;
       Object obj = PatchProxy.apply(null, this, LiveAudienceRecoEnterActionPresenter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = this.w.c();
       boolean b1 = this.w.b();
       LiveAudienceRecoEnterActionPresenter tp = this.p;
       String str = "livePlayerController";
       if (tp == null) {
          a.S(str);
       }
       boolean b2 = false;
       if (!tp.isPreparing()) {
          tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          if (!tp.isPlaying()) {
             b3 = false;
          label_0042 :
             b.Z(LiveAudienceRecoEnterActionPresenter$a.b, "canStartCountDown, bizToken="+this.S8()+", "+"isCountDowning="+b+", "+"hasUploadedForCurrentWatchPeriod="+b1+", "+"isPreparingOrPlaying="+b3+", "+"liveFloatingWindowShowing="+a.a().a());
             if (!b && (!b1 && (b3 && !a.a().a().booleanValue()))) {
                b2 = true;
             }
          label_00ab :
             return b2;
          }
       }
       b3 = true;
       goto label_0042 ;
    }
    public final String S8(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceRecoEnterActionPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.getValue();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceRecoEnterActionPresenter.class, "2")) {
          return;
       }
       c obj = this.r8("LIVE_PLAYER_CONTROLLER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_PLAYER_CONTROLLER\)");
       this.p = obj;
       obj = this.r8("LIVE_SERVICE_MANAGER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_SERVICE_MANAGER\)");
       this.r = obj;
       obj = obj.a(i.class);
       a.o(obj, "liveServiceManager.getSe¡­kageProvider::class.java\)");
       this.s = obj;
       Object obj1 = this.r8("FRAGMENT_LIFE_CYCLE_SERVICE");
       a.o(obj1, "inject\(LiveAccessIds.FRAGMENT_LIFE_CYCLE_SERVICE\)");
       this.q = obj1;
       obj1 = this.r8("LIVE_FRAGMENT");
       a.o(obj1, "inject\(LiveAccessIds.LIVE_FRAGMENT\)");
       this.t = obj1;
       obj1 = this.r8("LIVE_PHOTO");
       a.o(obj1, "inject\(LiveAccessIds.LIVE_PHOTO\)");
       this.u = obj1;
       return;
    }
}
