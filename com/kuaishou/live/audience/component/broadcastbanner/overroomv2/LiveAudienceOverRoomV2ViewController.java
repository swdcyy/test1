package com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2ViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2ViewController$a;
import nsd.u;
import hf3.a;
import ry1.b;
import oq5.a;
import qy1.a;
import or5.b;
import mq5.b;
import x67.j;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2ViewController$model$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2ViewController$viewModel$2;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2ViewController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import nx0.x;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2ViewController$$special$$inlined$viewModels$2;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2ViewController$b;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2ViewController$c;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.widget.FrameLayout;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import qrd.l1;
import android.view.View;
import com.kuaishou.live.common.core.component.turbomode.OptimizedElement;
import brd.t;
import t45.d;
import brd.z;
import nx0.w;
import erd.g;
import crd.b;
import oq5.c;
import mq5.h;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.a;
import nx0.v;
import nx0.a;
import java.util.Objects;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import nx0.e;
import androidx.lifecycle.Observer;
import nx0.f;
import nx0.g;
import lnc.b9;
import lf3.g;
import e93.f;
import kx0.a;
import java.util.HashSet;
import androidx.lifecycle.LiveData;

public final class LiveAudienceOverRoomV2ViewController extends ViewController	// class@000a57
{
    public final p j;
    public final p k;
    public b l;
    public final c m;
    public final h n;
    public g o;
    public final a p;
    public final b q;
    public final a r;
    public final a s;
    public final b t;
    public final b u;
    public final j v;
    public static final LiveAudienceOverRoomV2ViewController$a w;

    static {
       LiveAudienceOverRoomV2ViewController.w = new LiveAudienceOverRoomV2ViewController$a(null);
    }
    public void LiveAudienceOverRoomV2ViewController(a p0,b p1,a p2,a p3,b p4,b p5,j p6){
       a.p(p0, "liveLongConnection");
       a.p(p1, "liveAudienceStatusObtainService");
       a.p(p2, "liveConfigurationService");
       a.p(p3, "liveTurboModeService");
       a.p(p4, "feedService");
       a.p(p5, "liveAudienceEndService");
       super();
       this.p = p0;
       this.q = p1;
       this.r = p2;
       this.s = p3;
       this.t = p4;
       this.u = p5;
       this.v = p6;
       this.j = s.c(new LiveAudienceOverRoomV2ViewController$model$2(this));
       this.k = new ViewModelLazy(m0.d(x.class), new LiveAudienceOverRoomV2ViewController$$special$$inlined$viewModels$2(new LiveAudienceOverRoomV2ViewController$$special$$inlined$viewModels$1(this)), new LiveAudienceOverRoomV2ViewController$viewModel$2(this));
       this.m = new LiveAudienceOverRoomV2ViewController$b(this);
       this.n = new LiveAudienceOverRoomV2ViewController$c(this);
    }
    public void F2(){
       LiveAudienceOverRoomV2ViewController liveAudience = LiveAudienceOverRoomV2ViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveAudience, "3")) {
          return;
       }
       b.P(LiveLogTag.LIVE_OVER_ROOM_v2.appendTag("LiveAudienceOverRoomV2ViewController"), "onCreate");
       FrameLayout uFrameLayout = new FrameLayout(this.D2());
       uFrameLayout.setLayoutParams(new ConstraintLayout$LayoutParams(-1, -1));
       this.R2(uFrameLayout);
       if (!PatchProxy.applyVoid(objArray, this, liveAudience, "7")) {
          this.l = this.s.vo(OptimizedElement.GLOBAL_BROADCAST_NOTICE).observeOn(d.a).subscribe(new w(this));
          this.r.W0(this.m, true);
          this.u.Km(this.n);
          if (this.u.U0()) {
             this.V2().a(4);
          }
          if (this.v != null) {
             v ov = new v(this);
             this.o = ov;
             this.v.vh(ov);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, liveAudience, "9")) {
          View view = this.P2();
          Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
          a uoa = new a(this, view);
          x ox = PatchProxy.apply(objArray, this, liveAudience, "2");
          if (ox == PatchProxyResult.class) {
             ox = this.k.getValue();
          }
          if (!PatchProxy.applyVoidOneRefs(ox, uoa, a.class, "1")) {
             a.p(ox, "viewModel");
             ox.v0().observe(uoa.b, new e(uoa, ox));
             ox.d.observe(uoa.b, new f(uoa));
             ox.u0().observe(uoa.b, new g(uoa));
          }
       }
       return;
    }
    public void J2(){
       boolean b;
       LiveAudienceOverRoomV2ViewController liveAudience = LiveAudienceOverRoomV2ViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveAudience, "6")) {
          return;
       }
       LiveLogTag lIVE_OVER_RO = LiveLogTag.LIVE_OVER_ROOM_v2;
       lIVE_OVER_RO.appendTag("LiveAudienceOverRoomV2ViewController");
       b.P(lIVE_OVER_RO, "onDestroy");
       if (!PatchProxy.applyVoid(objArray, this, liveAudience, "8")) {
          b9.a(this.l);
          this.r.Q0(this.m);
          this.u.le(this.n);
          liveAudience = this.v;
          if (liveAudience != null) {
             liveAudience.ni(this.o);
          }
       }
       a uoa = this.V2();
       Objects.requireNonNull(uoa);
       a uoa1 = a.class;
       if (!PatchProxy.applyVoid(objArray, uoa, uoa1, "1")) {
          b.P(lIVE_OVER_RO.appendTag("LiveAudienceOverRoomV2Model"), "destroy");
          if (!PatchProxy.applyVoid(objArray, uoa, uoa1, "13")) {
             uoa.q.o(746, uoa.o);
          }
          b9.a(uoa.h);
          b9.a(uoa.f);
          b9.a(uoa.g);
          b9.a(uoa.i);
          b9.a(uoa.j);
          f.g(uoa);
          a k = uoa.k;
          Objects.requireNonNull(k);
          if (!PatchProxy.applyVoid(objArray, k, a.class, "5")) {
             b = false;
             k.a = b;
             k.b.clear();
             k.c = b;
          }
          uoa.m.removeObserver(uoa.p);
       }
       return;
    }
    public void K2(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceOverRoomV2ViewController.class, "5")) {
          return;
       }
       b.P(LiveLogTag.LIVE_OVER_ROOM_v2.appendTag("LiveAudienceOverRoomV2ViewController"), "onPause");
       this.V2().a(1);
       return;
    }
    public void L2(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceOverRoomV2ViewController.class, "4")) {
          return;
       }
       b.P(LiveLogTag.LIVE_OVER_ROOM_v2.appendTag("LiveAudienceOverRoomV2ViewController"), "onResume");
       this.V2().f(1);
       return;
    }
    public final a V2(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceOverRoomV2ViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
