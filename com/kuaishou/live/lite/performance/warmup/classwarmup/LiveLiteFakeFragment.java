package com.kuaishou.live.lite.performance.warmup.classwarmup.LiveLiteFakeFragment;
import com.kuaishou.live.lite.LiveLiteFragment;
import com.kuaishou.live.lite.performance.warmup.classwarmup.LiveLiteFakeFragment$a;
import nsd.u;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.lite.performance.warmup.classwarmup.LiveLiteFakeRootViewController;
import kotlin.jvm.internal.a;
import na3.b;
import na3.c;
import na3.f;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.lite.LiveLiteParam;
import k2b.e0;
import mrd.a;
import android.widget.FrameLayout;
import nc3.d;
import com.kuaishou.live.viewcontroller.ViewController;
import android.os.Bundle;
import k2b.e0$a;
import java.lang.Boolean;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.live.lite.performance.warmup.classwarmup.LiveLiteFakeFragment$b;
import erd.o;
import com.kuaishou.live.lite.performance.warmup.classwarmup.LiveLiteFakeFragment$c;
import com.kuaishou.live.lite.performance.warmup.classwarmup.LiveLiteFakeFragment$d;
import com.kuaishou.live.lite.performance.warmup.classwarmup.LiveLiteFakeFragment$e;
import erd.g;
import crd.b;

public final class LiveLiteFakeFragment extends LiveLiteFragment	// class@000a57
{
    public final List K;
    public static final LiveLiteFakeFragment$a L;

    static {
       LiveLiteFakeFragment.L = new LiveLiteFakeFragment$a(null);
    }
    public void LiveLiteFakeFragment(){
       super();
       this.K = LiveLiteLogTag.LITE_CLASS_WARMUP.appendTag("LiveLiteFakeFragment");
    }
    public void eh(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFakeFragment.class, "2")) {
          return;
       }
       b.P(this.K, "addRootViewController");
       LiveLiteFragment tj = this.j;
       a.o(tj, "mLiveLiteParam");
       LiveLiteFragment tp = this.p;
       a.o(tp, "mLogPage");
       LiveLiteFragment tx = this.x;
       a.o(tx, "mExtensionContainer");
       LiveLiteFragment tB = this.B;
       a.o(tB, "mPlayerServiceProvider");
       LiveLiteFragment tE = this.E;
       a.o(tE, "stageLayoutState");
       LiveLiteFakeRootViewController liveLiteFake = new LiveLiteFakeRootViewController(this, tj, tp, this.m, this.n, this.D.x0(), tx, tB, tE, this.D.s0());
       this.z = v0;
       this.G8(R.id.live_lite_slide_container, v0);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFakeFragment.class, "1")) {
          return;
       }
       b.P(this.K, "onCreate");
       super.onCreate(p0);
       this.p = new e0$a();
       z c = d.c;
       t ot = t.just(Boolean.TRUE).observeOn(c).map(new LiveLiteFakeFragment$b(this)).observeOn(d.a).map(new LiveLiteFakeFragment$c(this)).observeOn(c);
       ot.map(new LiveLiteFakeFragment$d(this)).subscribe(LiveLiteFakeFragment$e.b);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFakeFragment.class, "3")) {
          return;
       }
       b.P(this.K, "onDestroy");
       super.onDestroy();
       this.jh();
       this.ih();
       this.hh();
       this.v = null;
       return;
    }
}
