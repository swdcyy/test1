package com.yxcorp.gifshow.featured.detail.featured.milano.presenter.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.a$a;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import aoc.a;
import android.view.View;
import android.content.Context;
import ekd.p1;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import df5.d;
import hf5.g;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import vda.a;
import erd.g;
import crd.b;
import brd.t;
import jta.c;
import hf5.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import lo5.a;
import ko5.c;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import java.lang.Integer;
import ekd.i;
import aoc.b;
import hf5.b;

public class a extends PresenterV2	// class@000f32
{
    public final c A;
    public final d B;
    public e p;
    public g q;
    public b r;
    public MilanoContainerEventBus s;
    public a t;
    public a u;
    public a v;
    public a w;
    public boolean x;
    public boolean y;
    public int z;

    public void a(){
       super();
       this.A = new a$a(this);
       this.B = new a$b(this);
    }
    public void a(boolean p0){
       super();
       this.A = new a$a(this);
       this.B = new a$b(this);
       this.y = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       boolean b = this.P8();
       this.x = b;
       if (b) {
          this.t.e(0);
          View view = this.t.b();
          this.R8(view, p1.f(this.getContext()));
          ViewGroup$MarginLayoutParams layoutParams = view.getLayoutParams();
          layoutParams.leftMargin = a1.e(76.00f);
          view.setLayoutParams(layoutParams);
          this.q.hb(this.B);
       }else {
          this.t.e(8);
       }
       this.X7(this.s.j.subscribe(new a(this)));
       this.p.D0(this.A);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       if (this.x != null) {
          this.q.P8(this.B);
       }
       this.p.w0(this.A);
       return;
    }
    public final boolean P8(){
       a obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.getActivity() == null) {
          return b;
       }
       obj = c.b(this.getActivity());
       if (this.y == null) {
          TabIdentifier f = b.f;
          if (!obj.i(f) || obj.p(f)) {
          label_0037 :
             return b;
          }
       }
       b = true;
       goto label_0037 ;
    }
    public void R8(View p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "4")) {
          return;
       }
       if (i.c()) {
          ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
          layoutParams.topMargin = this.z + p1;
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a uoa = b.a(p0, R.id.featured_search_layout);
       this.t = uoa;
       this.z = uoa.b().getLayoutParams().topMargin;
       this.u = b.a(p0, 0x7f0a2d43);
       this.v = b.a(p0, 0x7f0a0df9);
       this.w = b.a(p0, 0x7f0a0dfa);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(e.class);
       this.q = this.q8(g.class);
       this.r = this.q8(b.class);
       this.s = this.q8(MilanoContainerEventBus.class);
       return;
    }
}
