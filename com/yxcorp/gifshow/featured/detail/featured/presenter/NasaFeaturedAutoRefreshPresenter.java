package com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedAutoRefreshPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedAutoRefreshPresenter$a;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedAutoRefreshPresenter$b;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedAutoRefreshPresenter$c;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedAutoRefreshPresenter$d;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedAutoRefreshPresenter$e;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedAutoRefreshPresenter$f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import com.kwai.component.uiconfig.visitor.VisitorModeManager$a;
import lnc.u1;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import qvb.q;
import androidx.viewpager.widget.ViewPager$i;
import vy6.a;
import jta.c;
import rf5.u;
import tkd.b;
import tkd.d;
import ayb.i;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import brd.t;
import t45.d;
import brd.z;
import zda.q;
import erd.g;
import crd.b;
import eda.n;
import zda.t;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import zda.u;
import zda.p;
import zca.p;
import zda.s;
import zca.m;
import zda.r;
import androidx.lifecycle.Lifecycle;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedAutoRefreshPresenter$7;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.framework.model.user.QCurrentUser;
import kda.e;
import q87.c;
import pv5.c;
import ov5.a;
import nna.c;
import zda.o;
import java.lang.Long;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import android.app.Activity;
import com.yxcorp.utility.n;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.util.concurrent.TimeUnit;
import java.lang.Number;
import q2b.h$b;
import k2b.e0;
import k2b.u1;
import bf5.s;
import brd.y;
import java.lang.Integer;
import m56.g;
import androidx.lifecycle.Lifecycle$State;

public class NasaFeaturedAutoRefreshPresenter extends PresenterV2	// class@000f5b
{
    public RefreshType A;
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;
    public long F;
    public int G;
    public final int H;
    public final int I;
    public boolean J;
    public int K;
    public boolean L;
    public final VisitorModeManager$a M;
    public final ViewPager$i N;
    public final q O;
    public final a P;
    public final c Q;
    public final a R;
    public BaseFragment p;
    public u q;
    public y r;
    public SlidePlayViewModel s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public long x;
    public long y;
    public boolean z;

    public void NasaFeaturedAutoRefreshPresenter(){
       super();
       this.t = -1;
       this.D = true;
       this.E = false;
       this.G = 0;
       this.H = 1;
       this.I = 2;
       this.J = false;
       this.K = -1;
       this.L = false;
       this.M = new NasaFeaturedAutoRefreshPresenter$a(this);
       this.N = new NasaFeaturedAutoRefreshPresenter$b(this);
       this.O = new NasaFeaturedAutoRefreshPresenter$c(this);
       this.P = new NasaFeaturedAutoRefreshPresenter$d(this);
       this.Q = new NasaFeaturedAutoRefreshPresenter$e(this);
       this.R = new NasaFeaturedAutoRefreshPresenter$f(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, NasaFeaturedAutoRefreshPresenter.class, "2")) {
          return;
       }
       if (VisitorModeManager.f()) {
          VisitorModeManager.a(this.M);
       }
       u1.a(this);
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.p);
       this.s = slidePlayVie;
       slidePlayVie.e(this.O);
       this.s.i(this.N);
       this.s.E(this.P);
       this.q.j(this.Q);
       this.G = d.a(0x4f878389).Ve();
       RxBus f = RxBus.f;
       z a = d.a;
       this.X7(f.f(l.class).observeOn(a).subscribe(new q(this)));
       this.X7(f.f(n.class).observeOn(a).subscribe(new t(this)));
       this.X7(this.p.Vg().j().subscribe(new u(this)));
       this.X7(this.p.Vg().i().subscribe(new p(this)));
       this.X7(f.f(p.class).observeOn(a).subscribe(new s(this)));
       if (this.G == 2) {
          this.X7(f.f(m.class).observeOn(a).subscribe(new r(this)));
       }
       this.p.getLifecycle().addObserver(new NasaFeaturedAutoRefreshPresenter$7(this));
       if (!QCurrentUser.me().isLogined() && this.C == null) {
          Object[] objArray = new Object[0];
          e.C().w("NasaFeaturedAutoRefresh", "launchLoginListener added", objArray);
          d.a(0x6154d94e).xI(this.R);
          this.C = true;
       }
       this.X7(f.f(c.class).subscribe(new o(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, NasaFeaturedAutoRefreshPresenter.class, "3")) {
          return;
       }
       u1.b(this);
       VisitorModeManager.h(this.M);
       NasaFeaturedAutoRefreshPresenter ts = this.s;
       if (ts == null) {
          return;
       }
       ts.b(this.O);
       this.s.g(this.N);
       this.s.g0(this.P);
       this.q.B(this.Q);
       d.a(0x6154d94e).wX(this.R);
       this.C = false;
       return;
    }
    public void P8(long p0){
       boolean b;
       NasaFeaturedAutoRefreshPresenter nasaFeatured = NasaFeaturedAutoRefreshPresenter.class;
       if (PatchProxy.isSupport(nasaFeatured) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, nasaFeatured, "10")) {
          return;
       }
       if (this.L != null) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       e.C().w("NasaFeaturedAutoRefresh", "在后台停留"+p0+"后刷新", objArray);
       QPhoto currentPhoto = this.s.getCurrentPhoto();
       if (NasaExperimentUtils.o() && (!n.I(this.getActivity()) && (currentPhoto != null && (!NasaExperimentUtils.T() || (!currentPhoto.isAd() && (!currentPhoto.isVideoType() && (currentPhoto.isImageType() || currentPhoto.isLiveStream()))))))) {
          this.V8(6);
          return;
       }else {
          i3 obj = PatchProxy.applyOneRefs(currentPhoto, this, nasaFeatured, "11");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             String str = 1;
             if (currentPhoto != null && (currentPhoto.isAd() && NasaExperimentUtils.T() == str)) {
                i = 1;
             }
          label_0098 :
             b = i;
          }
          if (b) {
             return;
          }else if(PatchProxy.isSupport(nasaFeatured) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, nasaFeatured, "12")){
             NasaFeaturedAutoRefreshPresenter ts = this.s;
             if (ts != null && (ts.n1() && (!this.s.o1() && this.s.x1()))) {
                if (this.s.V0() != null) {
                   this.t = this.s.V0().size() - 1;
                }
                RefreshType fOREGROUND2 = RefreshType.FOREGROUND2;
                this.A = fOREGROUND2;
                this.s.V1(fOREGROUND2);
                this.s.v1();
                if (!PatchProxy.isSupport(nasaFeatured) || !PatchProxy.applyVoidTwoRefs(Boolean.TRUE, Long.valueOf(p0), this, nasaFeatured, "16")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "FEATURED_LAUNCH_REFRESH_NEW";
                   obj = i3.f();
                   obj.d("refresh_type", "BACK_STAGE_REFRESH");
                   obj.d("launch_type", "HOT_LAUNCH");
                   obj.c("time_interval", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(p0)));
                   uElementPack.params = obj.e();
                   h$b uob = h$b.e(10, "FEATURED_LAUNCH_REFRESH_NEW");
                   uob.k(uElementPack);
                   u1.p0("", this.p, uob);
                }
             }
          }
       label_0143 :
          return;
       }
    }
    public void R8(){
       RefreshType lOGIN_REFRES;
       if (PatchProxy.applyVoid(null, this, NasaFeaturedAutoRefreshPresenter.class, "9")) {
          return;
       }
       if (this.L != null) {
          return;
       }
       if (this.B == 4) {
          lOGIN_REFRES = RefreshType.LOGIN_REFRESH;
          this.A = lOGIN_REFRES;
          this.s.V1(lOGIN_REFRES);
          this.r.onNext(new s(5));
          this.B = 0;
          return;
       }else {
          NasaFeaturedAutoRefreshPresenter ts = this.s;
          if (ts != null && (ts.n1() && (!this.s.o1() && this.s.x1()))) {
             if (this.s.V0() != null) {
                this.t = this.s.V0().size() - 1;
             }
             lOGIN_REFRES = RefreshType.LOGIN_REFRESH;
             this.A = lOGIN_REFRES;
             this.s.V1(lOGIN_REFRES);
             this.s.v1();
             this.z = true;
          }
       label_006e :
          return;
       }
    }
    public void S8(boolean p0){
       NasaFeaturedAutoRefreshPresenter nasaFeatured = NasaFeaturedAutoRefreshPresenter.class;
       if (PatchProxy.isSupport(nasaFeatured) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, nasaFeatured, "17")) {
          return;
       }
       if (this.z != null) {
          this.z = false;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SECOND_VIDEO_IS_REQUEST_RECO_API_AND_PUSH_NEW_VIDEO";
          i3 oi3 = i3.f();
          String str = (p0)? "1": "0";
          oi3.d("result", str);
          uElementPack.params = oi3.toString();
          h$b uob = h$b.d(false, false);
          uob.k(uElementPack);
          u1.r0(uob);
       }
       return;
    }
    public final void V8(int p0){
       NasaFeaturedAutoRefreshPresenter nasaFeatured = NasaFeaturedAutoRefreshPresenter.class;
       if (PatchProxy.isSupport(nasaFeatured) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, nasaFeatured, "7")) {
          return;
       }
       if (this.L != null) {
          return;
       }
       nasaFeatured = this.r;
       if (nasaFeatured != null) {
          nasaFeatured.onNext(new s(p0, true));
          this.K = p0;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, NasaFeaturedAutoRefreshPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.q8(u.class);
       this.r = this.r8("NASA_REFRESH_EMITTER");
       return;
    }
    public void onAppForeground(g p0){
       boolean b;
       NasaFeaturedAutoRefreshPresenter nasaFeatured = NasaFeaturedAutoRefreshPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, nasaFeatured, "19")) {
          return;
       }
       long l = p0.a();
       if (PatchProxy.isSupport(nasaFeatured)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(l), this, nasaFeatured, "20");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(NasaExperimentUtils.Q() > 0 && l - TimeUnit.MINUTES.toMillis((long)NasaExperimentUtils.Q()) >= 0){
             b = true;
          }else {
             b = false;
          }
       }else {
          goto label_002b ;
       }
       if (b) {
          this.x = p0.a();
          if (this.p.Vg().c() && this.p.getLifecycle().getCurrentState() == Lifecycle$State.RESUMED) {
             this.P8(this.x);
          }else {
             this.v = true;
          }
       }
       return;
    }
}
