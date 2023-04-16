package com.kuaishou.merchant.home2.home.presenter.PageRefreshPresenter;
import androidx.lifecycle.LifecycleObserver;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kz3.h;
import com.kuaishou.merchant.home2.basic.model.HomePage;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import brd.t;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import kz3.j;
import erd.g;
import crd.b;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import kz3.f;
import androidx.lifecycle.Observer;
import b04.d;
import kz3.g;
import androidx.lifecycle.LiveData;
import com.kuaishou.merchant.home2.skin.f;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import kz3.i;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$NavigationStyle;
import com.yxcorp.utility.TextUtils;
import ekd.i;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.FragmentActivity;

public class PageRefreshPresenter extends PresenterV2 implements LifecycleObserver	// class@0017d9
{
    public BaseFragment p;
    public f q;
    public d r;
    public final Observer s;

    public void PageRefreshPresenter(){
       super();
       this.s = new h(this);
    }
    public static void P8(PageRefreshPresenter p0,HomePage p1){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, PageRefreshPresenter.class, "8")) {
       }else {
          p0.S8();
       }
       return;
    }
    public static void R8(PageRefreshPresenter p0,Throwable p1){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, PageRefreshPresenter.class, "9")) {
       }else {
          p0.S8();
       }
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, PageRefreshPresenter.class, "2")) {
          return;
       }
       this.X7(this.p.c7().subscribe(new j(this)));
       this.r.F0(this.getActivity(), new f(this));
       PageRefreshPresenter tr = this.r;
       LifecycleOwner activity = this.getActivity();
       g og = new g(this);
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoidTwoRefs(activity, og, tr, d.class, "8")) {
          tr.f.observe(activity, og);
       }
       this.q.c.observe(this.getActivity(), this.s);
       this.X7(RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new i(this)));
       this.p.getLifecycle().addObserver(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, PageRefreshPresenter.class, "3")) {
          return;
       }
       this.r.P0(new f(this));
       PageRefreshPresenter tr = this.r;
       g og = new g(this);
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoidOneRefs(og, tr, d.class, "9")) {
          tr.f.removeObserver(og);
       }
       this.q.c.removeObserver(this.s);
       this.p.getLifecycle().removeObserver(this);
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, PageRefreshPresenter.class, "5")) {
          return;
       }
       MerchantHomeSkin$NavigationStyle value = this.q.c.getValue();
       HomePage homePage = this.r.x0();
       int i = 0;
       boolean b = true;
       if (value == null || (homePage != null && homePage.mIsGuarantee == null)) {
          if (value.mPattern != b) {
             b = false;
          }
          i = TextUtils.J(value.mBackgroundColor, i);
       }
    label_0033 :
       i.h(this.getActivity(), i, b);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PageRefreshPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("FEED_FRAGMENT");
       this.q = f.p0(this.getActivity());
       this.r = d.J0(this.getActivity());
       return;
    }
}
