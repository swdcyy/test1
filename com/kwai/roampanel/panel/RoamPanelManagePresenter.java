package com.kwai.roampanel.panel.RoamPanelManagePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import z1.a;
import mm7.r;
import io.reactivex.subjects.PublishSubject;
import xl8.b;
import java.lang.Object;
import com.kwai.roampanel.panel.RoamPanelManagePresenter$1;
import mm7.m;
import mm7.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t45.d;
import brd.z;
import brd.t;
import com.kwai.roampanel.panel.d;
import brd.w;
import mm7.p;
import com.kwai.roampanel.panel.f;
import erd.g;
import crd.b;
import java.util.concurrent.TimeUnit;
import com.kwai.roampanel.panel.e;
import mm7.o;
import io.reactivex.internal.functions.Functions;
import srb.b;
import lrb.a;
import tw5.d;
import mm7.q;
import com.yxcorp.gifshow.util.rx.RxBus;
import irb.a;
import mm7.n;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import androidx.fragment.app.DialogFragment;
import com.kwai.roampanel.panel.RoamPanelFragment;
import androidx.fragment.app.c;
import nm7.c;
import uw5.c;
import mrd.a;
import uw5.b;
import uw5.b$a;
import xa5.a;

public class RoamPanelManagePresenter extends PresenterV2	// class@0013d7
{
    public final PublishSubject A;
    public b B;
    public boolean C;
    public final LifecycleObserver D;
    public final b E;
    public d p;
    public a q;
    public b r;
    public a s;
    public Fragment t;
    public a u;
    public b v;
    public a w;
    public RoamPanelFragment x;
    public c y;
    public final r z;

    public void RoamPanelManagePresenter(a p0){
       super();
       this.z = new r();
       this.A = PublishSubject.g();
       this.B = new b(null);
       this.C = false;
       this.D = new RoamPanelManagePresenter$1(this);
       this.E = new m(this);
       this.w = new l(this, p0);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, RoamPanelManagePresenter.class, "3")) {
          return;
       }
       RoamPanelManagePresenter tz = this.z;
       tz.b = this.p;
       RoamPanelManagePresenter tq = this.q;
       tz.c = tq;
       tz.d = this.r;
       tz.e = this.s;
       tz.f = this.u;
       tz.g = this.v;
       tz.h = this.y;
       z a = d.a;
       this.X7(tq.subscribeOn(a).onErrorResumeNext(d.b).subscribe(new p(this), f.b));
       this.X7(this.A.throttleFirst(1000, TimeUnit.MILLISECONDS).onErrorResumeNext(e.b).subscribe(new o(this), Functions.d()));
       a.j(this.E);
       tq = this.p;
       if (tq != null) {
          this.X7(t.merge(tq.a().distinctUntilChanged(), this.B.b().distinctUntilChanged()).subscribe(new q(this), Functions.d()));
       }
       this.X7(RxBus.f.f(a.class).observeOn(a).subscribe(new n(this)));
       this.t.getLifecycle().addObserver(this.D);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, RoamPanelManagePresenter.class, "8")) {
          return;
       }
       a.m(this.E);
       this.t.getLifecycle().removeObserver(this.D);
       return;
    }
    public void P8(){
       RoamPanelManagePresenter roamPanelMan = RoamPanelManagePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, roamPanelMan, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, roamPanelMan, "4")) {
          roamPanelMan = this.x;
          if (roamPanelMan != null) {
             roamPanelMan.dismissAllowingStateLoss();
          }
          RoamPanelFragment roamPanelFra = new RoamPanelFragment();
          this.x = roamPanelFra;
          roamPanelFra.e = this.w;
          roamPanelFra.f = this.v;
          roamPanelFra.g = this.z;
          roamPanelFra.setCancelable(false);
       }
       this.x.show(this.t.getChildFragmentManager(), "roam_panel_dialog");
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, RoamPanelManagePresenter.class, "2")) {
          return;
       }
       c.d.a = this.y.a();
       c.d.b = this.y.b();
       c.d.c = this.y.c;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, RoamPanelManagePresenter.class, "1")) {
          return;
       }
       this.p = this.t8("local_current_city");
       this.q = this.r8("nearby_roam_panel_action_behavior");
       this.r = this.r8("nearby_roam_panel_status");
       this.s = this.r8("local_city_panel_element_picked");
       this.t = this.r8("FRAGMENT");
       this.u = this.r8("nearby_roam_panel_create_subject");
       b uob = this.t8("nearby_roam_panel_ROAM_PANEL_CONFIG");
       this.v = uob;
       if (uob == null) {
          b$a uoa = new b$a();
          uoa.a = a.g(this.t);
          this.v = uoa.a();
       }
       return;
    }
}
