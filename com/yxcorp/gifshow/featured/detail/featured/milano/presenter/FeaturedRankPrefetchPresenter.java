package com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter$a;
import nsd.u;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter$weakNetRankConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter$enableInsertPrefecthAtLast$2;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter$c;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import ub6.a;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter$e;
import erd.g;
import crd.b;
import i50.a;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter$f;
import df5.b;
import hf5.b;
import df5.e;
import hf5.g;
import hf5.a;
import java.util.Objects;
import e50.m;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter$g;
import java.util.List;
import com.yxcorp.utility.NetworkUtilsCached;
import v40.a;
import java.lang.StringBuilder;
import com.kuaishou.aegon.netcheck.NetworkQualityEstimator;
import pf5.u;
import com.yxcorp.gifshow.entity.QPhoto;
import sy6.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter$b;
import java.lang.Runnable;
import nsd.r0;
import com.kuaishou.eve.kit.rerank.BizPage;
import java.util.Arrays;
import v40.b;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter$h;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter$startNetMonitor$2;
import vda.m;
import msd.l;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import m56.f;

public final class FeaturedRankPrefetchPresenter extends PresenterV2	// class@000f2f
{
    public boolean A;
    public boolean B;
    public int C;
    public b D;
    public boolean E;
    public final p F;
    public final p G;
    public final b H;
    public final e I;
    public a p;
    public g q;
    public b r;
    public a s;
    public MilanoContainerEventBus t;
    public m u;
    public QPhoto v;
    public QPhoto w;
    public final Handler x;
    public final List y;
    public boolean z;
    public static final FeaturedRankPrefetchPresenter$a J;

    static {
       FeaturedRankPrefetchPresenter.J = new FeaturedRankPrefetchPresenter$a(null);
    }
    public void FeaturedRankPrefetchPresenter(){
       super();
       this.x = new Handler(Looper.getMainLooper());
       this.y = new ArrayList();
       this.F = s.c(FeaturedRankPrefetchPresenter$weakNetRankConfig$2.INSTANCE);
       this.G = s.c(FeaturedRankPrefetchPresenter$enableInsertPrefecthAtLast$2.INSTANCE);
       this.H = new FeaturedRankPrefetchPresenter$c(this);
       this.I = new FeaturedRankPrefetchPresenter$d(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, FeaturedRankPrefetchPresenter.class, "4")) {
          return;
       }
       this.z = true;
       RxBus f = RxBus.f;
       z a = d.a;
       this.X7(f.f(a.class).observeOn(a).subscribe(new FeaturedRankPrefetchPresenter$e(this)));
       this.X7(f.f(a.class).observeOn(a).subscribe(new FeaturedRankPrefetchPresenter$f(this)));
       FeaturedRankPrefetchPresenter tr = this.r;
       if (tr != null) {
          tr.De(this.H);
       }
       tr = this.q;
       if (tr != null) {
          tr.L5(this.I);
       }
       tr = this.s;
       if (tr != null) {
          Object obj = tr.J9();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.eve.kit.rerank.RankController");
          this.u = obj;
       }
       tr = this.q;
       a.m(tr);
       this.X7(tr.m().subscribe(new FeaturedRankPrefetchPresenter$g(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, FeaturedRankPrefetchPresenter.class, "5")) {
          return;
       }
       if (this.z != null) {
          FeaturedRankPrefetchPresenter tr = this.r;
          if (tr != null) {
             tr.c3(this.H);
          }
          tr = this.q;
          if (tr != null) {
             tr.p8(this.I);
          }
       }
       this.V8();
       return;
    }
    public final void P8(String p0){
       FeaturedRankPrefetchPresenter uFeaturedRan = FeaturedRankPrefetchPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uFeaturedRan, "7")) {
          return;
       }
       FeaturedRankPrefetchPresenter tv = this.v;
       if (tv != null) {
          if (this.y.contains(tv)) {
             return;
          }else {
             String str = ", count: ";
             if (!NetworkUtilsCached.k()) {
                this.C = this.C + 1;
                a.a.b("current net disconnection, reason: "+p0+str+this.C);
             }else {
                int i = NetworkQualityEstimator.b();
                if (i < this.R8().weakNetScoreThreshold) {
                   this.C = this.C + 1;
                   a.a.b("current net score: "+i+", reason: "+p0+str+this.C);
                }
             }
             FeaturedRankPrefetchPresenter uFeaturedRan1 = (this.C > this.R8().weakNetTriggerThreshold)? 1: null;
             if (uFeaturedRan1) {
                uFeaturedRan1 = this.p;
                Object[] objArray = null;
                QPhoto currentPhoto = (uFeaturedRan1 != null)? uFeaturedRan1.getCurrentPhoto(): objArray;
                this.w = currentPhoto;
                Boolean uBoolean = PatchProxy.apply(objArray, this, uFeaturedRan, "2");
                if (uBoolean == PatchProxyResult.class) {
                   uBoolean = this.G.getValue();
                }
                if (uBoolean.booleanValue()) {
                   uFeaturedRan1 = this.p;
                   Integer integer = (uFeaturedRan1 != null)? Integer.valueOf(uFeaturedRan1.j()): objArray;
                   uFeaturedRan = this.p;
                   if (uFeaturedRan != null) {
                      objArray = Integer.valueOf(uFeaturedRan.Z());
                   }
                   if (a.g(integer, objArray)) {
                      this.x.post(new FeaturedRankPrefetchPresenter$b(this, tv));
                      return;
                   }
                }
                this.y.add(tv);
                Object[] objArray1 = new Object[]{uFeaturedRan.b().getTaskId()};
                uFeaturedRan = this.u;
                a.m(uFeaturedRan);
                objArray1 = String.format("custom_infer_%s", Arrays.copyOf(objArray1, 1));
                a.o(objArray1, "java.lang.String.format\(format, *args\)");
                b.b(objArray1, "WEAK_NET");
             }
          }
       }
       return;
    }
    public final u R8(){
       Object obj = PatchProxy.apply(null, this, FeaturedRankPrefetchPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.F.getValue();
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, FeaturedRankPrefetchPresenter.class, "6")) {
          return;
       }
       if (this.E == null) {
          this.E = true;
          a.a.b("start poor net monitor");
          u netMonitorFo = this.R8().netMonitorForbiddenTimed;
          FeaturedRankPrefetchPresenter uFeaturedRan = null;
          if (netMonitorFo - uFeaturedRan < 0) {
             netMonitorFo = uFeaturedRan;
          }
          uFeaturedRan = this.D;
          if (uFeaturedRan != null) {
             a.m(uFeaturedRan);
             if (!uFeaturedRan.isDisposed()) {
             label_0063 :
                return;
             }
          }
          t ot = t.interval(netMonitorFo, this.R8().netMonitorTimerInterval, TimeUnit.MILLISECONDS).observeOn(d.a);
          FeaturedRankPrefetchPresenter$h oh = new FeaturedRankPrefetchPresenter$h(this);
          FeaturedRankPrefetchPresenter$startNetMonitor$2 iNSTANCE = FeaturedRankPrefetchPresenter$startNetMonitor$2.INSTANCE;
          if (iNSTANCE != null) {
             iNSTANCE = new m(iNSTANCE);
          }
          b uob = ot.subscribe(oh, iNSTANCE);
          this.D = uob;
          a.m(uob);
          this.X7(uob);
          goto label_0063 ;
       }else {
          goto label_0063 ;
       }
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, FeaturedRankPrefetchPresenter.class, "12")) {
          return;
       }
       a.a.b("stop poor net monitor");
       FeaturedRankPrefetchPresenter tD = this.D;
       if (tD != null) {
          if (!tD.isDisposed()) {
             tD.dispose();
          }
          this.E = false;
          this.D = null;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, FeaturedRankPrefetchPresenter.class, "3")) {
          return;
       }
       this.s = this.q8(a.class);
       this.p = this.q8(a.class);
       this.q = this.q8(g.class);
       this.r = this.q8(b.class);
       this.t = this.q8(MilanoContainerEventBus.class);
       return;
    }
    public final void onBackground(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeaturedRankPrefetchPresenter.class, "16")) {
          return;
       }
       a.a.b("background, stopNetMonitor");
       this.V8();
       return;
    }
}
