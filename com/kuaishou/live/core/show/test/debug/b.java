package com.kuaishou.live.core.show.test.debug.b;
import k51.c;
import com.kuaishou.live.core.show.test.debug.b$a;
import com.kuaishou.live.core.show.test.debug.b$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import ds5.c;
import ds5.a;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.live.core.show.test.debug.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kuaishou.live.core.show.test.debug.b$c;
import android.view.View;
import ekd.m1;
import android.view.ViewStub;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.video.waynelive.LivePlayerController;
import tj3.e;
import ds5.e;
import mrd.c;
import com.kuaishou.android.live.model.QLivePlayConfig;

public class b extends c	// class@0011a3
{
    public b A;
    public c B;
    public LivePlayerStateChangeListener C;
    public b$c p;
    public ViewStub q;
    public IKwaiMediaPlayer r;
    public long s;
    public long t;
    public long u;
    public QLivePlayConfig v;
    public LivePlayerController w;
    public e x;
    public e y;
    public c z;
    public static String sLivePresenterClassName = "LiveDebugInfoAudiencePresenter";

    public void b(){
       super();
       this.B = new b$a(this);
       this.C = new b$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.w.addStateChangeListener(this.C);
       this.y.gd(this.B);
       this.A = t.interval(1, 1, TimeUnit.SECONDS).observeOn(d.a).subscribe(new a(this), Functions.d());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b tp = this.p;
       if (tp != null) {
          tp.b();
       }
       this.y.fo(this.B);
       this.w.removeStateChangeListener(this.C);
       tp = this.A;
       if (tp != null && !tp.isDisposed()) {
          this.A.dispose();
          this.A = null;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a1be8);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.w = this.r8("LIVE_PLAYER_CONTROLLER");
       this.x = this.r8("LIVE_LOG_REPORTER");
       this.y = this.r8("LIVE_PLAY_CONFIG_SERVICE");
       this.z = this.t8("LIVE_BIZ_LAYOUT_INIT_SUBJECT");
       this.v = this.r8("LIVE_PLAY_CONFIG");
       return;
    }
}
