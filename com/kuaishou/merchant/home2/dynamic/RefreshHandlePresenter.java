package com.kuaishou.merchant.home2.dynamic.RefreshHandlePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import ekd.p1;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import b04.d;
import android.app.Activity;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.merchant.home2.dynamic.RefreshHandlePresenter$onBind$2;
import hx3.p;
import msd.l;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kuaishou.merchant.home2.dynamic.RefreshHandlePresenter$onUnbind$1;
import java.lang.Float;

public final class RefreshHandlePresenter extends PresenterV2	// class@001718
{
    public View p;
    public int q;
    public d r;

    public void RefreshHandlePresenter(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, RefreshHandlePresenter.class, "2")) {
          return;
       }
       RefreshHandlePresenter tp = this.p;
       if (tp != null) {
          this.q = p1.f(this.getContext()) + n.c(this.getContext(), 50.00f);
          ViewGroup$LayoutParams layoutParams = tp.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = this.q;
          }
       }
       tp = this.r;
       String str = "homePageViewModel";
       if (tp == null) {
          a.S(str);
       }
       if (tp.C0() != null) {
          tp = this.r;
          if (tp == null) {
             a.S(str);
          }
          Activity activity = this.getActivity();
          Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
          tp.C0().observe(activity, new p(new RefreshHandlePresenter$onBind$2(this)));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, RefreshHandlePresenter.class, "5")) {
          return;
       }
       RefreshHandlePresenter tr = this.r;
       if (tr == null) {
          a.S("homePageViewModel");
       }
       tr.C0().removeObserver(new p(new RefreshHandlePresenter$onUnbind$1(this)));
       return;
    }
    public final void P8(float p0){
       RefreshHandlePresenter refreshHandl = RefreshHandlePresenter.class;
       if (PatchProxy.isSupport(refreshHandl) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, refreshHandl, "4")) {
          return;
       }
       refreshHandl = this.p;
       if (refreshHandl != null) {
          ViewGroup$LayoutParams layoutParams = refreshHandl.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = this.q + (int)p0;
             refreshHandl.setBottom((refreshHandl.getTop() + layoutParams.height));
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RefreshHandlePresenter.class, "3")) {
          return;
       }
       this.p = p0.findViewById(0x7f0a332a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, RefreshHandlePresenter.class, "1")) {
          return;
       }
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
       this.r = d.J0(activity);
       return;
    }
}
