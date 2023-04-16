package com.yxcorp.gifshow.homepage.menu.redesign.e;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.homepage.menu.a;
import xl8.b;
import java.lang.Boolean;
import java.lang.Object;
import com.yxcorp.gifshow.homepage.menu.g;
import qta.f0;
import java.util.Objects;
import tta.s;
import com.yxcorp.gifshow.homepage.menu.redesign.e$a;
import com.yxcorp.gifshow.homepage.menu.e;
import com.yxcorp.gifshow.homepage.menu.redesign.g;
import com.yxcorp.gifshow.homepage.menu.redesign.h;
import tta.a;
import com.yxcorp.gifshow.homepage.menu.redesign.a;
import com.yxcorp.gifshow.homepage.menu.redesign.c;
import nc5.t;
import ok.x;
import com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.presenter.b;
import java.lang.String;
import com.yxcorp.utility.Log;
import uta.b;
import qta.y;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager;
import com.yxcorp.gifshow.homepage.menu.b;
import uta.a;
import java.util.List;
import tkd.b;
import tkd.d;
import pt5.a;
import st5.c;
import lnc.u1;
import android.view.View;
import mnc.a;
import ekd.i;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import crd.a;
import wkd.b;
import lnc.p5;
import java.lang.Runnable;
import android.app.Activity;
import tta.b0;
import java.util.Map;
import java.util.HashMap;
import b66.k$a;
import fo5.b;

public class e extends PresenterV2 implements g	// class@001785
{
    public final SlidingPaneLayout$d A;
    public a p;
    public b q;
    public g r;
    public View$OnClickListener s;
    public b t;
    public f0 u;
    public b v;
    public List w;
    public View x;
    public View y;
    public final c z;

    public void e(boolean p0){
       PresenterV2 presenterV2;
       super();
       this.p = new a();
       Boolean fALSE = Boolean.FALSE;
       this.q = new b(fALSE);
       this.r = new g();
       this.t = new b(fALSE);
       this.u = new f0(true);
       this.v = new b(fALSE);
       e tq = this.q;
       Objects.requireNonNull(tq);
       this.z = new s(tq);
       this.A = new e$a(this);
       this.U7(new e());
       this.U7(new g());
       this.U7(new h());
       this.U7(new a());
       this.U7(new a());
       this.U7(new c());
       if (!t.b.get().booleanValue()) {
          this.U7(new b());
          Log.g("HomeMenuRedesignPresenter", "Î´¿ªÆô²à±ßÀ¸ÀÁ¼ÓÔØ£¬×ßÀÏ²ßÂÔ");
       }
       this.U7(new b(this.u));
       if (PatchProxy.isSupport2(y.class, "3")) {
          presenterV2 = PatchProxy.applyOneRefsWithListener(Boolean.valueOf(p0), null, y.class, "3");
          if (presenterV2 != PatchProxyResult.class) {
          label_00d2 :
             if (presenterV2 != null) {
                this.U7(presenterV2);
             }
             return;
          }
       }
       presenterV2 = new PresenterV2();
       if (!HomeExperimentManager.a()) {
          presenterV2.U7(new b());
          presenterV2.U7(new a());
       }
       PatchProxy.onMethodExit(y.class, "3");
       goto label_00d2 ;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       this.w.add(this.A);
       d.a(0x60b9226c).eH(this.z);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       u1.a(this);
       a.a(this.x, false);
       if (i.c() && n.A(this.getContext()) > 0) {
          ViewGroup$LayoutParams layoutParams = this.y.getLayoutParams();
          layoutParams.height = n.A(this.getContext());
          this.y.setLayoutParams(layoutParams);
          this.y.setVisibility(false);
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, e.class, "8")) {
          return;
       }
       u1.b(this);
       e tr = this.r;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoid(null, tr, g.class, "11")) {
          tr.a.dispose();
       }
       tr = this.p;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoid(null, tr, a.class, "2")) {
          b.a(-87691847).c(tr.c);
          tr.b = null;
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "6")) {
          return;
       }
       this.w.remove(this.A);
       d.a(0x60b9226c).NY(this.z);
       return;
    }
    public void doBindView(View p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "2")) {
          return;
       }
       this.x = p0.findViewById(0x7f0a2adf);
       this.y = p0.findViewById(0x7f0a2ae6);
       if (!PatchProxy.applyVoid(null, this, uoe, "3")) {
          ViewGroup$LayoutParams layoutParams = this.x.getLayoutParams();
          layoutParams.width = this.u.f(this.getActivity());
          this.x.setLayoutParams(layoutParams);
       }
       this.p.a = p0;
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new b0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new b0());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.w = this.r8("HOME_PANEL_SLIDE_LISTENERS");
       return;
    }
    public void onEventMainThread(k$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "7")) {
          return;
       }
       if (p0.a == 2) {
          b.a(0xad3151d).reload();
          this.v.notifyChanged(Boolean.TRUE);
       }
       return;
    }
}
