package com.kwai.component.homepage_interface.homeitemfragment.presenter.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.g;
import lnc.b5;
import cb5.f;
import z1.a;
import com.yxcorp.gifshow.util.MultiWindowLayoutUtil;
import java.lang.Integer;
import ekd.i;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public abstract class a extends PresenterV2	// class@001a2f
{
    public final g p;
    public View q;
    public int r;

    public void a(View p0,int p1){
       super();
       this.p = new a$a(this);
       this.q = p0;
       this.r = p1;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.P8();
       this.getActivity().k3(this.p);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.getActivity().t3(this.p);
       return;
    }
    public void P8(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "3")) {
          return;
       }
       if (!this.W8()) {
          return;
       }
       if (b5.a(this.getActivity())) {
          MultiWindowLayoutUtil.a(this.q, new f(this));
       }else {
          MultiWindowLayoutUtil.d(this.q);
          a tr = this.r;
          a tq = this.q;
          if (!PatchProxy.isSupport(uoa) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(tr), tq, this, uoa, "7") && tq != null)) {
             if (i.c()) {
                tr = tr + n.A(tq.getContext());
             }
             if (tq.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
                this.R8(tr, tq);
             }else {
                this.S8(tr, tq);
             }
          }
       }
       return;
    }
    public final void R8(int p0,View p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "5")) {
          return;
       }
       ViewGroup$MarginLayoutParams layoutParams = p1.getLayoutParams();
       if (layoutParams.topMargin != p0) {
          layoutParams.topMargin = p0;
          p1.setLayoutParams(layoutParams);
       }
       return;
    }
    public final void S8(int p0,View p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "6")) {
          return;
       }
       if (p1.getPaddingTop() != p0) {
          p1.setPadding(0, p0, 0, p1.getPaddingBottom());
       }
       return;
    }
    public final void V8(int p0,View p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "4")) {
          return;
       }
       if (p1 != null) {
          if (p1.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
             this.R8(p0, p1);
          }else {
             this.S8(p0, p1);
          }
       }
       return;
    }
    public abstract boolean W8();
}
