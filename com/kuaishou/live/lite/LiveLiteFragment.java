package com.kuaishou.live.lite.LiveLiteFragment;
import eq3.d;
import ll0.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.lite.LiveLiteFragment$a;
import androidx.lifecycle.LifecycleOwner;
import mrd.a;
import com.kuaishou.live.lite.a;
import v63.d;
import android.view.ViewGroup;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.viewcontroller.ViewControllerManagerImpl;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.kwai.robust.PatchProxyResult;
import k2b.e0;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import android.app.Activity;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import v63.i;
import msd.a;
import ec3.r;
import v63.j;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.live.lite.LiveLiteParam;
import java.util.Objects;
import com.kuaishou.live.lite.performance.LiveLitePerformanceController;
import com.kwai.performance.stability.crash.monitor.util.e;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;
import n66.c;
import ec3.o;
import java.lang.Runnable;
import e93.f;
import ec3.p;
import ec3.q;
import com.kwai.performance.overhead.memory.monitor.MemoryMonitor;
import com.kwai.performance.monitor.base.Monitor;
import v63.k;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.view.View;
import ha1.b;
import android.widget.FrameLayout;
import com.kuaishou.live.viewcontroller.lifecycle.LifecyclesExt;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.live.viewcontroller.ViewHost;
import eq3.e;
import com.kuaishou.live.lite.player.basic.lifecycle.LiveLitePlayerLifecycleOwner;
import v63.h;
import v63.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import ekd.k1;
import android.os.Bundle;
import ec3.e;
import ec3.f;
import com.kuaishou.ax2c.PreloadParam$Builder;
import java.util.Iterator;
import java.util.Set;
import java.lang.StringBuilder;
import com.kuaishou.ax2c.PreLoader;
import com.kuaishou.ax2c.PreloadParam;
import ec3.h;
import ec3.g;
import t45.c;
import gc3.c;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import gc3.b;
import gc3.a;
import androidx.lifecycle.LifecycleRegistry;
import gq3.a;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.Lifecycle;
import v63.e;
import v63.c;
import android.view.LayoutInflater;
import com.trello.rxlifecycle3.components.support.RxFragment;
import java.util.List;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;

public class LiveLiteFragment extends BaseFragment implements d, a	// class@001d64
{
    public ViewController A;
    public d B;
    public ViewController C;
    public c D;
    public final a E;
    public boolean F;
    public final Runnable G;
    public boolean H;
    public final LifecycleEventObserver I;
    public LiveLiteParam j;
    public a k;
    public a l;
    public a m;
    public a n;
    public boolean o;
    public e0 p;
    public final LiveLiteFragment$a q;
    public LifecycleOwner r;
    public ViewControllerManagerImpl s;
    public LifecycleOwner t;
    public ViewControllerManagerImpl u;
    public LiveLitePerformanceController v;
    public FrameLayout w;
    public FrameLayout x;
    public FrameLayout y;
    public LiveLiteRootViewController z;
    public static final int J;

    public void LiveLiteFragment(){
       super();
       this.o = false;
       this.q = new LiveLiteFragment$a(this, this);
       this.E = a.g();
       this.G = new a(this);
       this.H = false;
       this.I = new d(this);
    }
    public void E2(ViewGroup p0,ViewController p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteFragment.class, "37")) {
          return;
       }
       this.s.E2(p0, p1);
       return;
    }
    public void G8(int p0,ViewController p1){
       if (PatchProxy.isSupport(LiveLiteFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, LiveLiteFragment.class, "39")) {
          return;
       }
       this.s.G8(p0, p1);
       return;
    }
    public ClientEvent$ExpTagTrans I1(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.I1();
    }
    public ClientEvent$ExpTagTrans K5(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.K5();
    }
    public int Lb(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.p.Lb();
    }
    public int M(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.p.M();
    }
    public ClientContent$ContentPackage Nf(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.Nf();
    }
    public String P7(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.P7();
    }
    public ClientContent$ContentPackage Q3(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.Q3();
    }
    public boolean Xg(){
       return false;
    }
    public String a2(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.a2();
    }
    public Activity cd(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.cd();
    }
    public void ch(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFragment.class, "34")) {
          return;
       }
       if (this.C == null) {
          b.Z(LiveLiteLogTag.LIFECYCLE, "addCoverViewController");
          r.a("AddLiteCoverVC", new i(this));
       }
       return;
    }
    public void dh(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFragment.class, "32")) {
          return;
       }
       if (this.A == null) {
          b.Z(LiveLiteLogTag.LIFECYCLE, "addPlayerViewController");
          r.a("AddLitePlayerVC", new j(this));
       }
       return;
    }
    public void e8(e0 p0){
       this.p = p0;
    }
    public boolean eg(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.p.eg();
    }
    public void eh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteFragment.class, "29")) {
          return;
       }
       if (this.z == null) {
          b.c0(LiveLiteLogTag.LIFECYCLE, "before addRootViewController", "liveStreamId", this.j.getLiveStreamFeed().getId());
          LiveLiteFragment tv = this.v;
          Objects.requireNonNull(tv);
          if (!PatchProxy.applyVoid(objArray, tv, LiveLitePerformanceController.class, "1")) {
             e.v("live_style", "LITE");
             FpsMonitor.startSection("live_lite", tv.b);
             c.a("live_lite");
             FpsMonitor.startSection("live_lite_in_three_sec_section", tv.b);
             c.a("live_lite_in_three_sec_section");
             FpsMonitor.startSection("live_lite_in_one_sec_section", tv.b);
             c.a("live_lite_in_one_sec_section");
             FpsMonitor.startSection("live_lite_in_two_sec_section", tv.b);
             c.a("live_lite_in_two_sec_section");
             f.k("perf.3s.stop", new o(tv), tv, 3000);
             f.k("perf.2s.stop", new p(tv), tv, 2000);
             f.k("perf.1s.stop", new q(tv), tv, 1000);
             MemoryMonitor iNSTANCE = MemoryMonitor.INSTANCE;
             if (iNSTANCE.isInitialized()) {
                iNSTANCE.startSection("live_lite");
             }
          }
          r.a("AddLiteRootVC", new k(this));
       }
       return;
    }
    public void fh(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFragment.class, "25")) {
          return;
       }
       FrameLayout uFrameLayout = b.b(this.getContext(), R.layout.live_lite_container_layout);
       this.w = uFrameLayout;
       this.x = uFrameLayout.findViewById(0x7f0a20d3);
       this.y = this.w.findViewById(0x7f0a20f2);
       return;
    }
    public int getPage(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.p.getPage();
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.getPageParams();
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFragment.class, "26")) {
          return;
       }
       LifecycleOwner[] lifecycleOwn = new LifecycleOwner[]{this.k,this.l};
       this.r = LifecyclesExt.b(this, this.q.a, lifecycleOwn);
       this.v = new LiveLitePerformanceController(this.getActivity(), this.j, this.r);
       this.s = new ViewControllerManagerImpl(this.r, this.requireActivity(), this.requireContext(), e.a(this.y));
       LiveLitePlayerLifecycleOwner liveLitePlay = new LiveLitePlayerLifecycleOwner(this, this.r);
       this.t = liveLitePlay;
       this.u = new ViewControllerManagerImpl(liveLitePlay, this.requireActivity(), this.requireContext(), e.a(this.w));
       return;
    }
    public String h5(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.h5();
    }
    public void hh(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFragment.class, "35")) {
          return;
       }
       if (this.C != null) {
          b.Z(LiveLiteLogTag.LIFECYCLE, "removeCoverViewController");
          r.a("RmLiteCoverVC", new h(this));
       }
       this.C = null;
       this.D = null;
       return;
    }
    public void ih(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFragment.class, "33")) {
          return;
       }
       if (this.A != null) {
          b.Z(LiveLiteLogTag.LIFECYCLE, "removePlayerViewController");
          r.a("RmLitePlayerVC", new g(this));
       }
       this.A = null;
       this.B = null;
       return;
    }
    public ClientEvent$ElementPackage j4(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.j4();
    }
    public void jh(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFragment.class, "31")) {
          return;
       }
       b.Z(LiveLiteLogTag.LIFECYCLE, "removeRootViewControllerImmediately remove rootVc");
       k1.n(this);
       this.G.run();
       return;
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.o();
    }
    public void o1(ViewController p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFragment.class, "40")) {
          return;
       }
       this.s.o1(p0);
       return;
    }
    public void onCreate(Bundle p0){
       c b;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       if (this.o == null) {
          b.Z(LiveLiteLogTag.LIFECYCLE, "LiveLiteFragment.onCreate not success init - failed");
          return;
       }else {
          Context context = this.getContext();
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          String str = "1";
          if (!PatchProxy.applyVoidTwoRefs(context, this, null, uoe, str)) {
             b uob = b.class;
             String str1 = 1;
             if (!PatchProxy.applyVoidTwoRefs(context, this, null, uob, "4") && f.j()) {
                PreloadParam$Builder uBuilder = new PreloadParam$Builder(context.getApplicationContext());
                Iterator iterator = b.a.iterator();
                while (iterator.hasNext()) {
                   uBuilder.addLayoutId(iterator.next().intValue());
                }
                uBuilder.setUseMutableContext(str1);
                String str2 = PatchProxy.applyOneRefs(this, null, uob, "11");
                if (str2 != patchProxyRe) {
                }else {
                   str2 = "LiteFragment@"+this.hashCode();
                }
                uBuilder.setTag(str2);
                PreLoader.getInstance().preload(uBuilder.build());
             }
             if (!PatchProxy.applyVoid(null, null, h.class, str)) {
                if (f.g()) {
                   c.a(g.b);
                }
                b = c.b;
                Objects.requireNonNull(b);
                c uoc = c.class;
                if (!PatchProxy.applyVoid(null, b, uoc, str)) {
                   Object obj = PatchProxy.apply(null, null, f.class, "6");
                   boolean b1 = (obj != patchProxyRe)? obj.booleanValue(): a.t().u("SOURCE_LIVE").d("enableLiteKSwitchPreload", false);
                   if (b1) {
                      if (!c.a) {
                         c.a = str1;
                         if (!PatchProxy.applyVoid(null, b, uoc, "2")) {
                            c.a(b.b);
                         }
                      }
                      if (!PatchProxy.applyVoid(null, b, uoc, "3")) {
                         c.a(a.b);
                      }
                   }
                }
             }
          }
       label_00ff :
          b.e0(LiveLiteLogTag.LIFECYCLE, "LiveLiteFragment.onCreate "+this.j.getLiveStreamFeed().getId()+" "+this, "parent", this.getParentFragment(), "tabLifecycle", this.l.getLifecycle().getCurrentState(), "slideLifecycle", this.k.getLifecycle().getCurrentState());
          this.fh();
          this.gh();
          this.k.getLifecycle().addObserver(this.I);
          this.r.getLifecycle().addObserver(new e(this));
          this.t.getLifecycle().addObserver(new c(this));
          PatchProxy.applyVoid(null, null, uoe, "2");
          return;
       }
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveLiteFragment.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.onCreateView(p0, p1, p2);
       if (this.o != null) {
          return this.w;
       }
       b.Z(LiveLiteLogTag.LIFECYCLE, "LiveLiteFragment.onCreateView not success init - failed");
       return null;
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteFragment.class, "7")) {
          return;
       }
       super.onDestroy();
       if (this.o == null) {
          b.Z(LiveLiteLogTag.LIFECYCLE, "LiveLiteFragment.onDestroy not success init - failed");
          return;
       }else if(this.H != null){
          this.jh();
       }
       if (PatchProxy.applyVoid(objArray, objArray, e.class, "5") || (PatchProxy.applyVoid(objArray, objArray, b.class, "9") || (f.j() && b.c))) {
          Iterator iterator = b.d.iterator();
          while (iterator.hasNext()) {
             b.a(iterator.next().intValue());
          }
       }
    label_0061 :
       b.Z(LiveLiteLogTag.LIFECYCLE, "LiveLiteFragment.onDestroy "+this.j.getLiveStreamFeed().getId()+" "+this);
       this.ih();
       this.hh();
       this.v = objArray;
       this.k.getLifecycle().removeObserver(this.I);
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFragment.class, "5")) {
          return;
       }
       super.onPause();
       if (this.o == null) {
          b.Z(LiveLiteLogTag.LIFECYCLE, "LiveLiteFragment.onPause not success init - failed");
          return;
       }else {
          b.Z(LiveLiteLogTag.LIFECYCLE, "LiveLiteFragment.onPause "+this.j.getLiveStreamFeed().getId()+" "+this);
          return;
       }
    }
    public void onResume(){
       Object[] objArray = null;
       String str = "4";
       if (PatchProxy.applyVoid(objArray, this, LiveLiteFragment.class, str)) {
          return;
       }
       super.onResume();
       if (this.o == null) {
          b.Z(LiveLiteLogTag.LIFECYCLE, "LiveLiteFragment.onResume not success init - failed");
          return;
       }else {
          PatchProxy.applyVoid(objArray, objArray, e.class, str);
          b.Z(LiveLiteLogTag.LIFECYCLE, "LiveLiteFragment.onResume "+this.j.getLiveStreamFeed().getId()+" "+this);
          return;
       }
    }
    public void onStart(){
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, LiveLiteFragment.class, str)) {
          return;
       }
       super.onStart();
       if (this.o == null) {
          b.Z(LiveLiteLogTag.LIFECYCLE, "LiveLiteFragment.onStart not success init - failed");
          return;
       }else {
          PatchProxy.applyVoid(objArray, objArray, e.class, str);
          b.Z(LiveLiteLogTag.LIFECYCLE, "LiveLiteFragment.onStart "+this.j.getLiveStreamFeed().getId()+" "+this);
          return;
       }
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFragment.class, "6")) {
          return;
       }
       super.onStop();
       if (this.o == null) {
          b.Z(LiveLiteLogTag.LIFECYCLE, "LiveLiteFragment.onStop not success init - failed");
          return;
       }else {
          b.Z(LiveLiteLogTag.LIFECYCLE, "LiveLiteFragment.onStop "+this.j.getLiveStreamFeed().getId()+" "+this);
          return;
       }
    }
    public String pg(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.pg();
    }
    public void xg(ViewController p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFragment.class, "38")) {
          return;
       }
       this.s.xg(p0);
       return;
    }
    public ClientContentWrapper$ContentWrapper ye(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.ye();
    }
}
