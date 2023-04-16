package com.kuaishou.live.lite.performance.warmup.classwarmup.LiveLiteFakeRootViewController;
import com.kuaishou.live.lite.framework.root.LiveLiteRootViewController;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.lite.LiveLiteParam;
import k2b.e0;
import mrd.a;
import na3.b;
import android.widget.FrameLayout;
import nc3.d;
import na3.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.live.lite.performance.warmup.classwarmup.FakeBizPresenterScatterLoader;
import rc3.d;
import com.kuaishou.live.lite.performance.warmup.classwarmup.LiveLiteFakeRootViewController$fakeLoader$1;
import com.kuaishou.live.lite.performance.warmup.classwarmup.LiveLiteFakeRootViewController$fakeLoader$2;
import msd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;
import eq3.d;
import com.kwai.video.waynelive.LivePlayerController;
import ga1.e;
import bb3.e;
import lc3.b;
import brd.t;
import androidx.lifecycle.LifecycleOwner;
import android.view.View;
import vb3.k;
import sj3.l;
import rc3.c;
import d93.c;
import hb3.f;
import com.kuaishou.live.lite.performance.warmup.classwarmup.LiveLiteFakeRootViewController$a;
import java.lang.Runnable;
import ekd.k1;

public final class LiveLiteFakeRootViewController extends LiveLiteRootViewController	// class@000a5b
{
    public final List D;
    public final FakeBizPresenterScatterLoader E;
    public a F;
    public final BaseFragment G;
    public final LiveLiteParam H;
    public final e0 I;
    public final a J;
    public final a K;
    public final b L;
    public final FrameLayout M;
    public final d N;
    public final a O;
    public final f P;

    public void LiveLiteFakeRootViewController(BaseFragment p0,LiveLiteParam p1,e0 p2,a p3,a p4,b p5,FrameLayout p6,d p7,a p8,f p9){
       a.p(p0, "hostFragment");
       a.p(p1, "liveLiteParam");
       a.p(p2, "logPage");
       a.p(p5, "liveLiteCoverService");
       a.p(p6, "extensionContainer");
       a.p(p7, "playerServiceProvider");
       a.p(p8, "stageLayoutState");
       a.p(p9, "preRenderVideoFrameService");
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
       this.G = p0;
       this.H = p1;
       this.I = p2;
       this.J = p3;
       this.K = p4;
       this.L = p5;
       this.M = p6;
       this.N = p7;
       this.O = p8;
       this.P = p9;
       this.D = LiveLiteLogTag.LITE_CLASS_WARMUP.appendTag("LiveLiteFakeRootViewController");
       this.E = new FakeBizPresenterScatterLoader(p7.l1(), new LiveLiteFakeRootViewController$fakeLoader$1(this), new LiveLiteFakeRootViewController$fakeLoader$2(this));
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create\(\)");
       this.F = uoa;
    }
    public void F2(){
       LiveLiteRootViewController liveLiteRoot = LiveLiteRootViewController.class;
       if (PatchProxy.applyVoid(null, this, LiveLiteFakeRootViewController.class, "1")) {
          return;
       }
       b.P(this.D, "onCreate");
       LivePlayerController livePlayerCo = this.N.l1().Vc();
       a.o(livePlayerCo, "playerServiceProvider.ge¡­ce\(\).livePlayerController");
       LiveLiteLayoutManager liveLiteLayo = new LiveLiteLayoutManager(this.H, this.B2(), this.E2(), livePlayerCo, this.W2().b(), this.W2().a(), this.M, this, this.N.j0(), this.O);
       if (!PatchProxy.applyVoidOneRefs(v1, this, liveLiteRoot, "6")) {
          a.p(v1, "<set-?>");
          this.l = v1;
       }
       this.R2(this.V2().d());
       c uoc = f.a(this.B2(), this.G, this.H, this.V2(), this.N.l1(), this.L, this.N.X(), this.N.t0(), this.N.r0(), this.F);
       a.o(uoc, "ServiceManagerInitLogic.¡­terDetailObservable\n    \)");
       if (!PatchProxy.applyVoidOneRefs(uoc, this, liveLiteRoot, "4")) {
          a.p(uoc, "<set-?>");
          this.k = uoc;
       }
       this.W2().c(this.V2(), this.Z2());
       k1.o(new LiveLiteFakeRootViewController$a(this));
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFakeRootViewController.class, "2")) {
          return;
       }
       b.P(this.D, "onDestroy");
       this.E.b();
       this.V2().b();
       return;
    }
    public void K2(){
    }
    public void N2(){
    }
}
