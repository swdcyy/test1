package com.kuaishou.merchant.home2.dynamic.microdetail.MerchantMicroDetailPagePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import mkc.b;
import android.view.View;
import mkc.c;
import androidx.lifecycle.MutableLiveData;
import dy3.c;
import android.app.Activity;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.merchant.home2.dynamic.microdetail.MerchantMicroDetailPagePresenter$onBind$1;
import dy3.a;
import msd.l;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import ekd.m1;
import android.view.ViewGroup;
import dy3.c$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import ax3.a;
import iv.a;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType;
import kx3.b;
import kx3.d;
import su.a;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.pagedy.a;

public final class MerchantMicroDetailPagePresenter extends PresenterV2	// class@00175f
{
    public c p;
    public ViewGroup q;
    public ViewGroup r;
    public BaseFragment s;
    public a t;

    public void MerchantMicroDetailPagePresenter(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MerchantMicroDetailPagePresenter.class, "4")) {
          return;
       }
       MerchantMicroDetailPagePresenter tq = this.q;
       if (tq == null) {
          a.S("mTipsContainer");
       }
       c.h(tq, b.d);
       tq = this.p;
       if (tq == null) {
          a.S("mDetailPageViewModel");
       }
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
       tq.q0().observe(activity, new a(new MerchantMicroDetailPagePresenter$onBind$1(this)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantMicroDetailPagePresenter.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a0c5c);
       this.q = m1.f(p0, 0x7f0a3f11);
       return;
    }
    public void j8(){
       MerchantMicroDetailPagePresenter merchantMicr = MerchantMicroDetailPagePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, merchantMicr, "3")) {
          return;
       }
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
       this.p = c.e.a(activity);
       BaseFragment uBaseFragmen = this.r8("FEED_FRAGMENT");
       this.s = uBaseFragmen;
       Objects.requireNonNull(uBaseFragmen, "null cannot be cast to non-null type com.kuaishou.merchant.home2.basic.CallerContextHolder");
       this.t = uBaseFragmen.h();
       if (!PatchProxy.applyVoid(objArray, this, merchantMicr, "8")) {
          b dynamicRegis = DynamicPageType.NEST_LIST.getDynamicRegisterModel();
          if (dynamicRegis != null && !PatchProxy.applyVoidOneRefs(dynamicRegis, this, merchantMicr, "9")) {
             merchantMicr = this.s;
             if (merchantMicr == null) {
                a.S("fragment");
             }
             a.g(merchantMicr, dynamicRegis.c(), dynamicRegis.b(), dynamicRegis.a());
          }
       }
       return;
    }
}
