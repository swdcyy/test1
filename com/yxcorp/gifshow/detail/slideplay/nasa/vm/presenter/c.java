package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.BitSet;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.c$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.c$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y6a.j;
import erd.g;
import crd.b;
import xx9.a;
import y6a.i;
import brd.t;
import jta.c;
import r7a.f;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.lang.Float;
import oo5.a;
import java.lang.Integer;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import android.view.View;
import ekd.m1;
import ekd.i;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import rf5.u;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;

public class c extends PresenterV2	// class@001813
{
    public boolean A;
    public final BitSet B;
    public final c C;
    public final a D;
    public BaseFragment p;
    public a q;
    public PublishSubject r;
    public u s;
    public PhotoDetailParam t;
    public SlidePlayViewModel u;
    public f v;
    public t w;
    public View x;
    public float y;
    public boolean z;

    public void c(){
       super();
       this.y = 0x3f800000;
       this.B = new BitSet();
       this.C = new c$a(this);
       this.D = new c$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoidWithListener(null, this, c.class, "3")) {
          return;
       }
       this.X7(this.q.h(new j(this)));
       this.X7(this.w.subscribe(new i(this)));
       this.v.a(this.C);
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.p.getParentFragment());
       this.u = slidePlayVie;
       slidePlayVie.P(this.p, this.D);
       PatchProxy.onMethodExit(c.class, "3");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, c.class, "4")) {
          return;
       }
       this.v.c(this.C);
       this.u.D(this.p, this.D);
       PatchProxy.onMethodExit(c.class, "4");
       return;
    }
    public void P8(float p0){
       if (PatchProxy.isSupport2(c.class, "10") && PatchProxy.applyVoidOneRefsWithListener(Float.valueOf(p0), this, c.class, "10")) {
          return;
       }
       a.a(this.p, p0);
       PatchProxy.onMethodExit(c.class, "10");
       return;
    }
    public final void R8(int p0){
       if (PatchProxy.isSupport2(c.class, "6") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, c.class, "6")) {
          return;
       }
       this.B.set(p0);
       this.V8();
       PatchProxy.onMethodExit(c.class, "6");
       return;
    }
    public final void S8(int p0){
       if (PatchProxy.isSupport2(c.class, "7") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, c.class, "7")) {
          return;
       }
       this.B.clear(p0);
       this.V8();
       PatchProxy.onMethodExit(c.class, "7");
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoidWithListener(null, this, c.class, "8")) {
          return;
       }
       boolean b = false;
       if (this.B.cardinality() > 0) {
          this.r.onNext(Boolean.FALSE);
          a.e(this.p, b);
          if (this.z != null && this.A == null) {
             this.y = a.d(this.p);
             a.a(this.p, 0);
          }
          this.A = true;
       }else {
          this.r.onNext(Boolean.TRUE);
          a.j(this.p, b);
          if (this.z != null && this.A != null) {
             a.a(this.p, this.y);
          }
          this.A = b;
       }
       PatchProxy.onMethodExit(c.class, "8");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c.class, "2")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a04db);
       if (!PatchProxy.applyVoidWithListener(null, this, c.class, "11")) {
          if (this.x == null) {
             PatchProxy.onMethodExit(c.class, "11");
          }else if(i.c()){
             this.x.setBackground(a1.f(R.drawable.arg_RES_7f082082));
          }
          PatchProxy.onMethodExit(c.class, "11");
       }
       PatchProxy.onMethodExit(c.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, c.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_FRAGMENT");
       this.q = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       this.r = this.r8("DETAIL_NASA_BOTTOM_VISIBLE_EVENT");
       this.s = this.q8(u.class);
       this.t = this.q8(PhotoDetailParam.class);
       this.v = this.r8("NASA_SIDEBAR_STATUS");
       this.w = this.r8("NASA_SCALE_CLEAN_CONTROLLER_SHOW_OBSERVABLE");
       PatchProxy.onMethodExit(c.class, "1");
       return;
    }
}
