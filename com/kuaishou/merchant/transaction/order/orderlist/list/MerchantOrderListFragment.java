package com.kuaishou.merchant.transaction.order.orderlist.list.MerchantOrderListFragment;
import com.kuaishou.merchant.basic.fragment.MerchantBaseFragment;
import java.util.HashMap;
import mrd.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.net.Uri;
import android.view.View;
import android.os.Bundle;
import ekd.m1;
import com.kuaishou.merchant.transaction.order.orderlist.list.widget.WatchDispatchDrawOrderViewPager;
import rk0.b;
import androidx.fragment.app.Fragment;
import jl4.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.OrderListCommonViewBinder;
import com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.b;
import com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.c;
import com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.d;
import com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.OrderListRnPreloadViewBinder;
import java.lang.Boolean;
import brd.t;
import fl4.d;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import android.content.Context;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.Map;
import ot3.h0;
import k2b.j0;
import kl4.m;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import kl4.b;
import erd.g;
import crd.b;
import sk0.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import xm4.a;
import tk4.a;

public class MerchantOrderListFragment extends MerchantBaseFragment	// class@000887
{
    public Uri m;
    public HashMap n;
    public m o;
    public b p;
    public d q;
    public WatchDispatchDrawOrderViewPager r;
    public a s;
    public static final int t;

    public void MerchantOrderListFragment(){
       super();
       this.n = new HashMap();
       this.s = a.g();
    }
    public String C1(){
       return "MERCHANT_ORDER_LIST";
    }
    public String D1(){
       return "电商订单列表页";
    }
    public int M(){
       return 1;
    }
    public boolean Xg(){
       return false;
    }
    public boolean ch(){
       return true;
    }
    public String dh(){
       MerchantOrderListFragment obj = PatchProxy.apply(null, this, MerchantOrderListFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m;
       if (obj == null) {
          return "";
       }
       return obj.toString();
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantOrderListFragment.class, "4")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a2f20);
       if (!PatchProxy.applyVoid(null, this, MerchantOrderListFragment.class, "11")) {
          b uob = new b(this);
          this.p = uob;
          uob.U7(new f(this));
          this.p.U7(new OrderListCommonViewBinder(this));
          this.p.U7(new b(this));
          this.p.U7(new c(this));
          this.p.U7(new d(this));
          this.p.U7(new OrderListRnPreloadViewBinder(this));
       }
       this.p.f(p0);
       Object[] objArray = new Object[0];
       this.p.i(objArray);
       this.s.onNext(Boolean.TRUE);
       return;
    }
    public t getDispatchDrawObservable(){
       MerchantOrderListFragment obj = PatchProxy.apply(null, this, MerchantOrderListFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj != null) {
          return obj.getDispatchDrawObservable();
       }
       return null;
    }
    public String getPageParams(){
       MerchantOrderListFragment obj = PatchProxy.apply(null, this, MerchantOrderListFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj != null) {
          return TextUtils.k(obj.a);
       }
       return "";
    }
    public String o(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       MerchantOrderListFragment obj = PatchProxy.apply(objArray, this, MerchantOrderListFragment.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          return "MERCHANT_ORDER_LIST";
       }
       Objects.requireNonNull(obj);
       String str = PatchProxy.apply(objArray, obj, d.class, "3");
       if (str != patchProxyRe) {
       }else {
          str = TextUtils.k(obj.e);
       }
       return str;
    }
    public void onAttach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantOrderListFragment.class, "2")) {
          return;
       }
       super.onAttach(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, MerchantOrderListFragment.class, "12")) {
          h0.b(this.m, this.n);
       }
       MerchantOrderListFragment tm = this.m;
       String str = (tm == null)? "": tm.toString();
       this.q = new d(this, this, str);
       m om = m.class;
       if (!PatchProxy.applyVoid(objArray, this, MerchantOrderListFragment.class, "10")) {
          m om1 = ViewModelProviders.of(this.getActivity()).get(om);
          this.o = om1;
          om1.f = this.q;
          tm = this.s;
          if (!PatchProxy.applyVoidOneRefs(tm, om1, om, "2")) {
             om1.d = tm;
             om1.o0(tm.subscribe(new b(om1)));
          }
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantOrderListFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.d(p0, 0x7f0d0eff, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MerchantOrderListFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       MerchantOrderListFragment tp = this.p;
       if (tp != null) {
          tp.unbind();
          this.p.destroy();
       }
       a.b.b("");
       return;
    }
}
