package com.kuaishou.merchant.transaction.order.orderlist.search.result.viewbinder.OrderSearchResultHeaderViewBinder;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.b;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.order.orderlist.search.result.viewbinder.OrderSearchResultHeaderViewBinder$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import ml4.a;
import tl4.b;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import ok0.n;
import rk0.b;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import ul4.d;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.kuaishou.merchant.transaction.order.orderlist.list.model.ServiceEntryInfo;
import android.app.Activity;
import tkd.b;
import tkd.d;
import vs3.a;
import ekd.m1;
import com.kuaishou.merchant.transaction.order.orderlist.widget.OrderRedDotViewV2;
import com.kuaishou.merchant.transaction.order.orderlist.search.result.viewbinder.OrderSearchResultHeaderViewBinder$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.order.orderlist.search.result.viewbinder.OrderSearchResultHeaderViewBinder$b;
import com.kuaishou.merchant.transaction.order.orderlist.search.result.viewbinder.OrderSearchResultHeaderViewBinder$c;

public class OrderSearchResultHeaderViewBinder extends b	// class@0008b9
{
    public a A;
    public d B;
    public boolean C;
    public LifecycleObserver D;
    public OrderRedDotViewV2 x;
    public OrderRedDotViewV2 y;
    public OrderRedDotViewV2 z;

    public void OrderSearchResultHeaderViewBinder(Fragment p0){
       super(p0);
       this.C = true;
       this.D = new OrderSearchResultHeaderViewBinder$1(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, OrderSearchResultHeaderViewBinder.class, "3")) {
          return;
       }
       super.E8();
       this.x.setVisibility(8);
       this.y.setVisibility(8);
       this.z.setVisibility(8);
       this.J0(this.A.c, new b(this));
       this.R8().getLifecycle().addObserver(this.D);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, OrderSearchResultHeaderViewBinder.class, "1")) {
          return;
       }
       super.F8();
       this.A = ViewModelProviders.of(this.P8()).get(a.class);
       this.B = ViewModelProviders.of(this.R8()).get(d.class);
       this.t.setEnabled(false);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, OrderSearchResultHeaderViewBinder.class, "4")) {
          return;
       }
       super.J8();
       this.R8().getLifecycle().removeObserver(this.D);
       return;
    }
    public a S8(){
       Object obj = PatchProxy.apply(null, this, OrderSearchResultHeaderViewBinder.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ViewModelProviders.of(this.P8()).get(a.class);
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, OrderSearchResultHeaderViewBinder.class, "11")) {
          return;
       }
       this.A.p0("");
       this.c9();
       return;
    }
    public void Y8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderSearchResultHeaderViewBinder.class, "5")) {
          return;
       }
       this.A.b.setValue(Boolean.TRUE);
       this.c9();
       return;
    }
    public boolean b9(){
       return true;
    }
    public final void c9(){
       if (PatchProxy.applyVoid(null, this, OrderSearchResultHeaderViewBinder.class, "14")) {
          return;
       }
       c fragmentMana = this.R8().getFragmentManager();
       if (fragmentMana != null && !fragmentMana.popBackStackImmediate("MerchantOrderSearchResultFragment", 1)) {
          fragmentMana.beginTransaction().u(this.R8()).m();
       }
       return;
    }
    public final void d9(ServiceEntryInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderSearchResultHeaderViewBinder.class, "10")) {
          return;
       }
       if (!this.R8().isAdded()) {
          return;
       }
       if (this.R8().getActivity() != null && !this.R8().getActivity().isFinishing()) {
          d.a(0x7074b578).XZ(this.R8().getActivity(), p0.mUrl);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderSearchResultHeaderViewBinder.class, "2")) {
          return;
       }
       super.doBindView(p0);
       this.x = m1.f(p0, 0x7f0a2f14);
       this.y = m1.f(p0, 0x7f0a2f13);
       this.z = m1.f(p0, 0x7f0a2f16);
       m1.b(p0, new OrderSearchResultHeaderViewBinder$a(this), R.id.order_header_right_cs_view);
       m1.b(p0, new OrderSearchResultHeaderViewBinder$b(this), R.id.order_header_right_after_sale_view);
       m1.b(p0, new OrderSearchResultHeaderViewBinder$c(this), R.id.order_header_right_setting_view);
       return;
    }
}
