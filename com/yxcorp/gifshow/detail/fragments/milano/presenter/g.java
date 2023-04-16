package com.yxcorp.gifshow.detail.fragments.milano.presenter.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import v0a.p0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.a;
import q87.c;
import android.view.View;
import joc.y;
import df5.c;
import hf5.g;
import java.lang.StringBuilder;
import java.lang.Boolean;
import v0a.q0;
import java.lang.Runnable;
import android.app.Activity;
import android.content.Context;
import com.yxcorp.utility.n;
import ekd.m1;

public class g extends PresenterV2	// class@001529
{
    public g p;
    public View q;
    public View r;
    public final c s;

    public void g(){
       super();
       this.s = new p0(this);
    }
    public void E8(){
       Object[] objArray1;
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.C().w("NasaMilanoLiveSquareSideBarPresenter", "onBindStart", objArray);
       if (this.r != null) {
          g tq = this.q;
          if (tq != null) {
             y.c(tq);
             this.r.setVisibility(i);
             this.P8(i);
             this.p.xb(this.s);
             objArray1 = new Object[i];
             a.C().w("NasaMilanoLiveSquareSideBarPresenter", "onBindEnd", objArray1);
             return;
          }
       }
       a uoa = a.C();
       StringBuilder str = "mSquareSideBarLayout == null ?";
       boolean b = true;
       boolean b1 = (this.q == null)? true: false;
       str = str+b1+"; mSquareSideBarContainerLayout == null ?";
       if (this.r != null) {
          b = false;
       }
       objArray1 = new Object[i];
       uoa.w("NasaMilanoLiveSquareSideBarPresenter", str+b, objArray1);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       this.p.i6(this.s);
       return;
    }
    public final void P8(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "5")) {
          return;
       }
       og = this.q;
       if (og == null) {
          return;
       }
       if (p0) {
          og.post(new q0(this));
       }else {
          float f = (float)n.z(this.getActivity());
          Object[] objArray = new Object[0];
          a.C().w("NasaMilanoLiveSquareSideBarPresenter", "setTranslationX for PORTRAIT, translation = "+f, objArray);
          this.q.setTranslationX(f);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a25ba);
       this.r = m1.f(p0, 0x7f0a25b9);
       Object[] objArray = new Object[0];
       a.C().w("NasaMilanoLiveSquareSideBarPresenter", "bindView, mSquareSideBarLayout = "+this.q+", mSquareSideBarContainerLayout = "+this.r, objArray);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.p = this.q8(g.class);
       return;
    }
}
