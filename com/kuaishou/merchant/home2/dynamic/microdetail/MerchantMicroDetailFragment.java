package com.kuaishou.merchant.home2.dynamic.microdetail.MerchantMicroDetailFragment;
import ax3.a;
import com.kuaishou.merchant.basic.fragment.MerchantBaseFragment;
import com.kuaishou.merchant.home2.dynamic.microdetail.MerchantMicroDetailFragment$a;
import nsd.u;
import android.os.SystemClock;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.home2.dynamic.microdetail.MerchantMicroDetailFragment$_callerContext$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import android.view.View;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.home2.main.widget.MerchantMallRootView;
import crd.b;
import lnc.b9;
import brd.t;
import com.kuaishou.merchant.home2.dynamic.microdetail.MerchantMicroDetailFragment$b;
import erd.g;
import com.kuaishou.merchant.home2.dynamic.microdetail.MerchantMicroDetailPagePresenter;
import iv.a;
import java.util.ArrayList;
import hx3.d;
import java.util.Collection;
import java.util.Objects;
import java.util.Arrays;
import rw3.b;
import androidx.fragment.app.Fragment;
import dy3.c;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import java.util.Set;
import java.util.Iterator;
import android.net.Uri;
import ekd.x0;
import java.util.Map;
import ot3.h0;
import androidx.fragment.app.FragmentActivity;
import dy3.c$a;
import androidx.lifecycle.MutableLiveData;
import xw3.e;
import com.kuaishou.merchant.home2.feed.FeedChannelInfo;
import xw3.c;
import k2b.e0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.lang.Long;
import wkd.b;
import ex3.c;
import android.content.Context;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class MerchantMicroDetailFragment extends MerchantBaseFragment implements a	// class@00175d
{
    public long m;
    public b n;
    public c o;
    public b p;
    public HashMap q;
    public PresenterV2 r;
    public final p s;
    public HashMap t;
    public static final MerchantMicroDetailFragment$a u;

    static {
       MerchantMicroDetailFragment.u = new MerchantMicroDetailFragment$a(null);
    }
    public void MerchantMicroDetailFragment(){
       super();
       this.m = SystemClock.elapsedRealtime();
       this.q = new HashMap();
       this.r = new PresenterV2();
       this.s = s.c(new MerchantMicroDetailFragment$_callerContext$2(this));
    }
    public String C1(){
       return "MERCHANT_MICRO_DETAIL";
    }
    public int M(){
       return 1;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantMicroDetailFragment.class, "4")) {
          return;
       }
       MerchantMicroDetailFragment$b uob = null;
       MerchantMallRootView merchantMall = (!p0 instanceof MerchantMallRootView)? uob: p0;
       b9.a(this.p);
       if (merchantMall) {
          t ot = merchantMall.L();
          if (ot != null) {
             uob = ot.subscribe(new MerchantMicroDetailFragment$b(this, merchantMall));
          }
       }
       this.p = uob;
       if (p0 != null && !PatchProxy.applyVoidOneRefs(p0, this, MerchantMicroDetailFragment.class, "5")) {
          this.r.U7(new MerchantMicroDetailPagePresenter());
          this.r.f(p0);
          Object[] objArray = new Object[0];
          Object[] objArray1 = d.a(this.h()).toArray(objArray);
          Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
          this.r.i(Arrays.copyOf(objArray1, objArray1.length));
       }
       MerchantMicroDetailFragment tn = this.n;
       if (tn != null) {
          tn.onEvent(6);
       }
       tn = this.o;
       if (tn != null) {
          tn.r0("MERCHANT_MICRO_DETAIL", this, p0, this.gh());
       }
       return;
    }
    public String getPageParams(){
       Object[] objArray;
       i3 obj = PatchProxy.apply(null, this, MerchantMicroDetailFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       Iterator iterator = this.q.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          String obj1 = this.q.get(str);
          obj1 = (obj1 != null)? obj1.toString(): null;
          obj.d(str, obj1);
       }
       return obj.e();
    }
    public final a gh(){
       Object obj = PatchProxy.apply(null, this, MerchantMicroDetailFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.getValue();
    }
    public a h(){
       Object obj = PatchProxy.apply(null, this, MerchantMicroDetailFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.gh();
    }
    public String h5(){
       return "MERCHANT_MICRO_DETAIL";
    }
    public String o(){
       return "MERCHANT_MICRO_DETAIL";
    }
    public void onCreate(Bundle p0){
       c c;
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantMicroDetailFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, MerchantMicroDetailFragment.class, "10")) {
          p0 = this.getArguments();
          if (p0 != null) {
             String str = p0.getString("pageUrl");
             if (str != null) {
                this.q.putAll(h0.a(x0.f(str)));
             }
          }
       }
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          objArray = c.e.a(activity);
       }
       this.o = objArray;
       if (objArray != null) {
          c = objArray.c;
          if (c != null) {
             c.setValue(this.q);
          }
       }
       this.n = b.s0(this.getActivity());
       e.q0(this.getActivity()).t0(this, e.s0(FeedChannelInfo.RecommendChannel));
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantMicroDetailFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       MerchantMicroDetailFragment tn = this.n;
       if (tn != null) {
          tn.onEvent(2, Long.valueOf(this.m));
       }
       tn = this.n;
       if (tn != null) {
          tn.onEvent(3);
       }
       View view = b.a(-343507015).a(p0.getContext(), p1, R.layout.arg_RES_7f0d04ef);
       if (view == null) {
          view = new FrameLayout(p0.getContext());
       }
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MerchantMicroDetailFragment.class, "8")) {
          return;
       }
       super.onDestroyView();
       if (!this.r.y8()) {
          this.r.destroy();
       }
       b9.a(this.p);
       if (!PatchProxy.applyVoid(null, this, MerchantMicroDetailFragment.class, "12")) {
          MerchantMicroDetailFragment tt = this.t;
          if (tt != null) {
             tt.clear();
          }
       }
       return;
    }
}
