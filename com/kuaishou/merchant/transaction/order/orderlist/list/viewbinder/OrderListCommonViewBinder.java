package com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.OrderListCommonViewBinder;
import rk0.b;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.OrderListCommonViewBinder$1;
import jl4.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import jl4.e;
import java.lang.reflect.Type;
import el.a;
import ga0.a;
import android.content.SharedPreferences;
import km8.b;
import java.util.Collection;
import ekd.q;
import il4.a;
import kl4.m;
import com.kuaishou.ksmvvm.command.KSCommand;
import jl4.c;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import ok0.n;
import jl4.b;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.util.rx.RxBus;
import xk4.k;
import brd.t;
import t45.d;
import brd.z;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import il4.d;
import android.content.Context;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import com.yxcorp.gifshow.widget.viewpager.HomeViewPager;
import android.view.View;
import ekd.m1;

public class OrderListCommonViewBinder extends b	// class@00089c
{
    public PagerSlidingTabStrip s;
    public HomeViewPager t;
    public a u;
    public m v;
    public boolean w;
    public LifecycleObserver x;
    public g y;

    public void OrderListCommonViewBinder(Fragment p0){
       super(p0);
       this.w = true;
       this.x = new OrderListCommonViewBinder$1(this);
       this.y = new d(this);
    }
    public void E8(){
       OrderListCommonViewBinder orderListCom = OrderListCommonViewBinder.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, orderListCom, "3")) {
          return;
       }
       Object[] objArray1 = PatchProxy.apply(objArray, this, orderListCom, "6");
       if (objArray1 != PatchProxyResult.class) {
       }else {
          Type type = new e(this).getType();
          String str = a.a.getString("merchant_order_tab_info", "null");
          if (str != null && str != "") {
             objArray = b.a(str, type);
          }
          objArray1 = objArray;
       }
       if (!PatchProxy.applyVoidOneRefs(objArray1, this, orderListCom, "7") && !q.f(objArray1)) {
          this.u.O(objArray1, true);
       }
       this.J0(this.v.j.h, new c(this, objArray1));
       this.J0(this.v.l.h, new b(this));
       this.R8().getLifecycle().addObserver(this.x);
       this.X7(RxBus.f.f(k.class).observeOn(d.a).subscribe(this.y));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, OrderListCommonViewBinder.class, "2")) {
          return;
       }
       this.w = true;
       this.v = ViewModelProviders.of(this.P8()).get(m.class);
       d uod = new d(this.R8(), this.getContext(), this.s, this.t, this.v);
       this.u = v0;
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, OrderListCommonViewBinder.class, "5")) {
          return;
       }
       this.u.onDestroy();
       this.u = null;
       this.t = null;
       this.s = null;
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, OrderListCommonViewBinder.class, "4")) {
          return;
       }
       this.R8().getLifecycle().removeObserver(this.x);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderListCommonViewBinder.class, "1")) {
          return;
       }
       PagerSlidingTabStrip pagerSliding = m1.f(p0, R.id.order_list_tab);
       this.s = pagerSliding;
       pagerSliding.setAverageWidth(true);
       this.t = m1.f(p0, 0x7f0a2f20);
       this.s.setTabPadding(0);
       this.s.setTabGravity(3);
       return;
    }
}
