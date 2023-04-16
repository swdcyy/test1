package com.kuaishou.lite.presenter.LiveLiteAdLogPresenter;
import com.kuaishou.lite.presenter.LiveLiteBaseAdLogPresenter;
import com.kuaishou.lite.presenter.LiveLiteAdLogPresenter$mAdLiveWatchingMonitor$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.lite.presenter.LiveLiteAdLogPresenter$c;
import com.kuaishou.lite.presenter.LiveLiteAdLogPresenter$b;
import mxb.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import hn5.n;
import hn5.m;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wkd.b;
import mxb.f0;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import com.kwai.framework.model.feed.BaseFeed;
import ekd.y0;
import b93.d;
import mq5.h;
import mq5.b;
import c93.b;
import e93.a;
import d93.b;
import la3.a;
import com.kuaishou.lite.presenter.LiveLiteAdLogPresenter$a;
import z1.a;
import mxb.j0;
import yx.j0;
import z1.k;
import e93.d;
import java.lang.StringBuilder;
import mxb.i0;
import mxb.j;
import com.kuaishou.lite.presenter.LiveLiteAdLogPresenter$d;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.q;
import brd.t;
import t45.d;
import brd.z;
import il0.a;
import java.lang.Boolean;
import com.kuaishou.lite.presenter.LiveLiteAdLogPresenter$e;

public final class LiveLiteAdLogPresenter extends LiveLiteBaseAdLogPresenter	// class@00093a
{
    public b I;
    public a J;
    public b K;
    public final p L;
    public final h M;
    public final LiveLiteAdLogPresenter$b N;

    public void LiveLiteAdLogPresenter(){
       super();
       this.L = s.c(LiveLiteAdLogPresenter$mAdLiveWatchingMonitor$2.INSTANCE);
       this.M = new LiveLiteAdLogPresenter$c(this);
       this.N = new LiveLiteAdLogPresenter$b(this);
    }
    public final h C9(){
       Object obj = PatchProxy.apply(null, this, LiveLiteAdLogPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.L.getValue();
    }
    public final void D9(){
       if (PatchProxy.applyVoid(null, this, LiveLiteAdLogPresenter.class, "9")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = this.m9();
       if (slidePlayVie != null) {
          int i = slidePlayVie.c();
          int i1 = 2;
          if (i != 1) {
             if (i == i1) {
                i1 = 3;
             }else if(m.a().U3(this.getContext())){
                i1 = 5;
             }else {
                i1 = 1;
             }
          }
          QPhoto qPhoto = this.h9();
          a.m(qPhoto);
          b.a(-762347696).r1(qPhoto.mEntity, "key_enteraction", Integer.valueOf(i1));
       }
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteAdLogPresenter.class, "5")) {
          return;
       }
       super.E8();
       if (!this.n9()) {
          return;
       }
       QPhoto qPhoto = this.h9();
       a.m(qPhoto);
       b.a(-762347696).r1(qPhoto.mEntity, "key_ad_live_watching_monitor", this.C9());
       if (this.k9() == null) {
          this.c9();
       }
       this.D9();
       this.t9();
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteAdLogPresenter.class, "4")) {
          return;
       }
       super.F8();
       LiveLiteAdLogPresenter tI = this.I;
       if (tI == null) {
          a.S("mLiveLiteStopService");
       }
       tI.Km(this.M);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteAdLogPresenter.class, "8")) {
          return;
       }
       LiveLiteAdLogPresenter tI = this.I;
       if (tI == null) {
          a.S("mLiveLiteStopService");
       }
       tI.le(this.M);
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteAdLogPresenter.class, "2")) {
          return;
       }
       a.p(p0, "provider");
       super.X8(p0);
       this.I = p0.a(b.class);
       this.J = p0.a(a.class);
       return;
    }
    public void Z8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteAdLogPresenter.class, "3")) {
          return;
       }
       a.p(p0, "register");
       p0.d(a.class, this.N);
       return;
    }
    public void d9(){
       if (PatchProxy.applyVoid(null, this, LiveLiteAdLogPresenter.class, "10")) {
          return;
       }
       LiveLiteBaseAdLogPresenter.s9(this, 283, LiveLiteAdLogPresenter$a.a, null, 4, null);
       return;
    }
    public void o9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteAdLogPresenter.class, "11")) {
          return;
       }
       int[] a = j0.a;
       String str = "LiveLiteBaseAdLogPresenter";
       if (this.l9() >= a.length) {
          Object[] objArray1 = new Object[0];
          j0.a(str, "all play time has reported", objArray1);
          LiveLiteBaseAdLogPresenter.B9(this, 0, 0, 3, objArray);
          return;
       }else {
          k ok = this.e9();
          if (ok != null) {
             d uod = ok.get();
             if (uod != null && uod.W1() == true) {
                int i = a[this.l9()];
                if (this.j9() - (long)i >= 0 && this.h9() != null) {
                   Object[] objArray2 = new Object[0];
                   j0.a(str, "report:"+i, objArray2);
                   QPhoto qPhoto = this.h9();
                   a.m(qPhoto);
                   i0.a().u(i0.a().g(qPhoto.mEntity).a(LiveLiteAdLogPresenter$d.b), i);
                   this.u9((this.l9() + 1));
                }
             }
          }
          return;
       }
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, LiveLiteAdLogPresenter.class, "7")) {
          return;
       }
       LiveLiteAdLogPresenter tK = this.K;
       if (tK != null) {
          tK.dispose();
       }
       return;
    }
    public void onResume(){
       LiveLiteAdLogPresenter liveLiteAdLo = LiveLiteAdLogPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveLiteAdLo, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, liveLiteAdLo, "15")) {
          this.K = RxBus.f.f(q.class).observeOn(d.a).subscribe(new a(this));
       }
       return;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, LiveLiteAdLogPresenter.class, "14")) {
          return;
       }
       super.reset();
       this.C9().c();
       return;
    }
    public void x9(){
       if (PatchProxy.applyVoid(null, this, LiveLiteAdLogPresenter.class, "12")) {
          return;
       }
       y0 oy0 = this.k9();
       if (oy0 != null && !oy0.c()) {
          this.C9().d();
          oy0 = this.k9();
          if (oy0 != null) {
             oy0.d();
          }
       }
       return;
    }
    public void y9(boolean p0,boolean p1){
       LiveLiteAdLogPresenter liveLiteAdLo = LiveLiteAdLogPresenter.class;
       if (PatchProxy.isSupport(liveLiteAdLo) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, liveLiteAdLo, "13")) {
          return;
       }
       if (p1) {
          LiveLiteBaseAdLogPresenter.s9(this, 67, new LiveLiteAdLogPresenter$e(this.C9().b()), null, 4, null);
       }
       this.C9().e();
       y0 oy0 = this.k9();
       if (oy0 != null) {
          oy0.e();
       }
       return;
    }
}
